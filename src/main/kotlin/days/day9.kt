package days

fun day9Partone(): Long {
    return getLowPoints().sumOf { it.height + 1 }
}

fun day9PartTwo(): Long {
    val heightMaps = day9_input.split("\n")
    val graph = Array(heightMaps.size) { Array(heightMaps[0].length) { false } }
    val bassinCounts = getLowPoints().map { getBassinCount(it.i, it.j, graph, heightMaps) }

    return bassinCounts
        .sortedDescending()
        .take(3)
        .fold(1) { acc, i -> acc * i }
}

fun getBassinCount(i: Int, j: Int, graph: Array<Array<Boolean>>, heightMaps: List<String>): Int {
    if (graph[i][j]) return 0

    graph[i][j] = true

    if (heightMaps[i][j] == '9') return 0

    var bassinSize = 1

    val above = tryGetAdjacent(i - 1, j, heightMaps)
    if (above != null) bassinSize += getBassinCount(i - 1, j, graph, heightMaps)

    val below = tryGetAdjacent(i + 1, j, heightMaps)
    if (below != null) bassinSize += getBassinCount(i + 1, j, graph, heightMaps)

    val left = tryGetAdjacent(i, j - 1, heightMaps)
    if (left != null) bassinSize += getBassinCount(i, j - 1, graph, heightMaps)

    val right = tryGetAdjacent(i, j + 1, heightMaps)
    if (right != null) bassinSize += getBassinCount(i, j + 1, graph, heightMaps)

    return bassinSize
}

fun getLowPoints(): List<Point> {
    val heightMaps = day9_input.split("\n")
    val points = mutableListOf<Point>()


    for (i in heightMaps.indices) {
        for (j in 0 until heightMaps[i].length) {
            val adjacents = listOfNotNull(
                tryGetAdjacent(i - 1, j, heightMaps),
                tryGetAdjacent(i + 1, j, heightMaps),
                tryGetAdjacent(i, j - 1, heightMaps),
                tryGetAdjacent(i, j + 1, heightMaps)
            )

            points.add(Point(i, j, heightMaps[i][j].digitToInt().toLong(), adjacents))
        }
    }

    return points.filter { it.isLowPoint() }
}


fun tryGetAdjacent(i: Int, j: Int, heightMaps: List<String>): Int? {
    if (i < 0 || j < 0) return null
    if (i >= heightMaps.size || j >= heightMaps[i].length) return null
    return heightMaps[i][j].digitToInt()
}

class Point(val i: Int, val j: Int, val height: Long, val adjacents: List<Int> = listOf())
fun Point.isLowPoint(): Boolean = !this.adjacents.any { it <= this.height }