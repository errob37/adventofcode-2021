package days

import kotlin.math.abs

fun day7(): Long {
    val input = day7_input.split(",").map { it.toLong() }.sorted()

    var min = Long.MAX_VALUE
    for(i in input.indices){
        val fuel = input.fold(0L){ acc, l ->
            val dist = abs(l - i)
            acc + (dist*(dist+1) /2)
        }

        if(fuel < min) min = fuel
    }

    return min;
}