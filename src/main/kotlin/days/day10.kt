package days

import java.util.*

val m = mutableMapOf(
    ')' to 0L,
    ']' to 0L,
    '}' to 0L,
    '>' to 0L,
)

val m1 = mapOf(
    ')' to '(',
    ']' to '[',
    '}' to '{',
    '>' to '<',
)

val startingChunkCharacters =  listOf('(', '[', '{', '<')
val terminatingChunkCharacters = listOf(')', ']', '}', '>')

fun day10PartOne(): Long{
    val lines = day10Input.split("\n")

    lines.forEach {
        val stack = Stack<Char>()
        var found = false
        it.forEach { c->
            if(c in startingChunkCharacters) stack.push(c)
            if(c in terminatingChunkCharacters){
                if(stack.isEmpty() || stack.peek() != m1[c]) {
                    if (!found){
                        val point = when(c){
                            ')' -> 3
                            ']' -> 57
                            '}' -> 1197
                            else -> 25137
                        }

                        m[c] = m[c]!! + point
                        found = true
                    }
                } else stack.pop()
            }
        }
    }

    return m.values.sum()
}