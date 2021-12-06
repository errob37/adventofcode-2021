package days

fun day6() : Long {
    val m: MutableMap<Long, Long> = mutableMapOf()
    for(i in 0..8) {m[i.toLong()] = 0}
    day6_input.split(",").map { it.toLong() }.forEach { m[it] = m[it]!! + 1L }

    for(i in 1..256){
        val newLanterfish = m[0]
        m[0] = m[1]!!
        m[1] = m[2]!!
        m[2] = m[3]!!
        m[3] = m[4]!!
        m[4] = m[5]!!
        m[5] = m[6]!!
        m[6] = m[7]!! + newLanterfish!!
        m[7] = m[8]!!
        m[8] = newLanterfish!!
    }

    return m.values.sum()
}