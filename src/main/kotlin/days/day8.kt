package days

fun day8(): Int {
    val displayPatterns = day8_input.split("\n")
        .map { str ->
            val x = str.split(" | ")
            Pair(
                x[0].trim(' ').split(" ")
                    .map { item -> item.toSortedSet().joinToString("") },
                x[1].trim(' ').split(" ")
                    .map { item -> item.toSortedSet().joinToString("") }
            )
        }

    var uniqueSegmentsFound = 0
    var outputSum = 0

    displayPatterns.forEach { pat ->
        val displayMap = mutableMapOf<Int, String>()

        // map known combos for 1, 4, 7, 8 in each patter
        pat.first.forEach {
            when (it.length) {
                2 -> displayMap[1] = it
                3 -> displayMap[7] = it
                4 -> displayMap[4] = it
                7 -> displayMap[8] = it
            }
        }

        pat.second.forEach {
            if (it in displayMap.values) uniqueSegmentsFound++
        }

        val fiveSegs = pat.first.filter { it.length == 5 } as MutableList
        val sixSegs = pat.first.filter { it.length == 6 } as MutableList

        displayMap[9] = sixSegs.first { displayMap[7]!!.isInside(it) && displayMap[4]!!.isInside(it) }
        sixSegs.remove(displayMap[9]!!)

        displayMap[0] = sixSegs.first { displayMap[7]!!.isInside(it) }
        sixSegs.remove(displayMap[0]!!)

        displayMap[6] = sixSegs.first()

        displayMap[3] = fiveSegs.first { displayMap[7]!!.isInside(it) }
        fiveSegs.remove(displayMap[3]!!)

        val fiveCheck = displayMap[3]!!.diff(displayMap[0]!!).diff(displayMap[6]!!)
        displayMap[5] = fiveSegs.first { fiveCheck.isInside(it) }
        fiveSegs.remove(displayMap[5]!!)

        displayMap[2] = fiveSegs.first()

        val flippedMap = displayMap.entries.associateBy({ it.value }) { it.key }
        outputSum += pat.second.fold("") { acc, s -> acc + flippedMap[s] }.toInt()

    }

   return outputSum
}

/**
 * Returns a String of all segments that are not shared
 * between the two given strings.
 */
fun String.diff(s2: String): String {
    val group = (this + s2).groupingBy { it }.eachCount()
    val minValue = group.minOf { it.value }
    return group.filter { it.value == minValue }.keys.joinToString("")
}

/**
 * Checks if each segment is shared by a given pattern
 */
fun String.isInside(s: String): Boolean {
    this.forEach {
        if (!s.contains(it))
            return false
    }
    return true
}