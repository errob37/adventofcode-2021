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

val m2 = mapOf(
    '(' to 1L,
    '[' to 2L,
    '{' to 3L,
    '<' to 4L,
)

val startingChunkCharacters =  listOf('(', '[', '{', '<')
val terminatingChunkCharacters = listOf(')', ']', '}', '>')

val autcompleteScores = mutableListOf<Long>()

fun day10PartOne(): Pair<Long, Long>{
    val lines = day10Input.split("\n")

    lines.forEach {
        val stack = Stack<Char>()
        var malformed = false
        it.forEach { c->
            if(c in startingChunkCharacters) stack.push(c)
            if(c in terminatingChunkCharacters){
                if(stack.isEmpty() || stack.peek() != m1[c]) {
                    if (!malformed){
                        val point = when(c){
                            ')' -> 3
                            ']' -> 57
                            '}' -> 1197
                            else -> 25137
                        }

                        m[c] = m[c]!! + point
                        malformed = true
                    }
                } else stack.pop()
            }
        }

        if(!malformed) {
            var score = 0L;

            while(stack.isNotEmpty()) {
                val c = stack.pop()
                score = (score * 5L) + m2[c]!!
            }

            autcompleteScores.add(score)
        }


    }

    autcompleteScores.sort()
    return Pair(m.values.sum(), autcompleteScores[(autcompleteScores.size /2)])
}