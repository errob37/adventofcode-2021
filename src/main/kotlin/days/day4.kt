package days

import model.BingoCard

fun day4() {
    val draws = day4_draw.split(",").map { it.toInt() }
    val forceSquidToWin = false

    val cards = mutableListOf<List<Int>>()
    val rawCards = day4_bingoCard.split("#")
    rawCards.forEach { card ->
        val rows = card.split(";")
        cards.add(rows.map { it.split(",").map { it1 -> it1.toInt() } }.flatten())
    }

    val bingoCards = cards.map { BingoCard(it) }.toMutableList()

    for (draw in draws) {
        bingoCards.forEach { it.draw(draw) }

        val winnerCards = bingoCards.filter { it.hasBingo() }
        if (winnerCards.isNotEmpty()) {
            if (forceSquidToWin) {
                bingoCards.removeAll(winnerCards)
                println("${winnerCards.size} winning card(s). ${bingoCards.size} left.")
                winnerCards.forEach { printScore(it, draw) }
            } else {
                printScore(winnerCards.first(), draw)
                break
            }
        }
    }
}


fun printScore(winningBingoCard: BingoCard, lastDraw: Int) {
    println("Winning card score ${winningBingoCard.score(lastDraw)}")
}
