package days

fun toCoord(rawCoord: String): Pair<Pair<Int, Int>, Pair<Int, Int>> {
    val rawCoords = rawCoord.split(" -> ")
    val rawStart = rawCoords[0].split(",")
    val startX = rawStart[0].toInt()
    val startY = rawStart[1].toInt()

    val rawEnd = rawCoords[1].split(",")
    val endX = rawEnd[0].toInt()
    val endY = rawEnd[1].toInt()

    return Pair(Pair(startX, endX), Pair(startY, endY))
}

fun addLines(m: MutableMap<String, Int>, from: Int, to: Int, keyer: (Int) -> String) {
    for (i in IntRange(from, to)) {
        val k = keyer(i)
        m[k]?.let { m[k] = it + 1 } ?: run { m[k] = 1 }
    }
}
fun addRightDiag(m: MutableMap<String, Int>,from: Int, to: Int, yStart: Int) {
    var y = yStart
    for (i in IntRange(from, to)) {
        val k = "$i-$y"
        m[k]?.let { m[k] = it + 1 } ?: run { m[k] = 1 }
        y++
    }
}

fun addLeftDiag(m: MutableMap<String, Int>,from: Int, to: Int, yEnd: Int) {
    var y = yEnd
    for (i in IntRange(from, to)) {
        val k = "$i-$y"
        m[k]?.let { m[k] = it + 1 } ?: run { m[k] = 1 }
        y--
    }
}

fun getMinMax(a: Int, b: Int): Pair<Int, Int> {
    return if (a < b) Pair(a, b) else Pair(b, a)
}

fun day5() {
    val m = mutableMapOf<String, Int>()

    val rawCoords = day5.split("\n")
    rawCoords.map {
        val (start, end) = toCoord(it)
        if (start.first == end.first) {
            val (min, max) = getMinMax(start.second, end.second)
            addLines(m, min, max) { i: Int -> start.first.toString() + "-" + i.toString() }
        } else if (start.second == end.second) {
            val (min, max) = getMinMax(start.first, end.first)
            addLines(m, min, max) { i: Int -> i.toString() + "-" + start.second.toString() }
        } else {
            if (start.first < end.first && start.second < end.second) {
                addRightDiag(m, start.first, end.first, start.second)
            } else if (start.first > end.first && start.second < end.second) {
                addLeftDiag(m, end.first, start.first, end.second)
            } else if (start.first > end.first && start.second > end.second) {
                addRightDiag(m, end.first, start.first, end.second)
            } else if (start.first < end.first && start.second > end.second) {
                addLeftDiag(m, start.first, end.first, start.second)
            }
        }
    }

    println("count ${m.count { it.value >= 2 }}")
}