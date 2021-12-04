class BingoCard(
    private var all: MutableSet<Int> = mutableSetOf(),
    private var bingoCandidates: MutableList<List<Int>> = mutableListOf()
) {
    constructor(rawCard: List<Int>) : this() {
        all = rawCard.toMutableSet()

        val rows = rawCard.chunked(5)

        // add rows
        rawCard.chunked(5).forEach { bingoCandidates.add(it) }

        // add column
        for (i in 0..4) {
            val column = mutableListOf<Int>()
            rows.forEach { row -> column.add(row[i]) }
            bingoCandidates.add(column)
        }
    }

    fun draw(number: Int) {
        all.remove(number)

        val l = mutableListOf<List<Int>>()
        bingoCandidates.forEach {
            val l1 = it.filter { i -> i != number }
            l.add(l1)
        }
        bingoCandidates = l
    }

    fun hasBingo(): Boolean = bingoCandidates.any { it.isEmpty() }
    fun score(lastDraw: Int): Int = if (hasBingo()) all.sum() * lastDraw else 0
}