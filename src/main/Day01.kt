fun part1(input: List<String>): Int {
    val startPosition = 50
    var zeroCount = 0
    var currentPosition: Int  = startPosition
    input.forEach { move ->
        currentPosition = when(move.first()) {
            'L' -> (currentPosition - move.asInt()).mod(100)
            'R' -> (currentPosition + move.asInt()).mod(100)
            else -> currentPosition
        }
        println("for move $move new position: $currentPosition")
        if (currentPosition == 0) zeroCount += 1
    }

    return zeroCount
}

private fun String.asInt(): Int =
    this.drop(1).toInt()

fun main() {

    fun part2(input: List<String>): Int {
        return input.size
    }

    // Test if implementation meets criteria from the description, like:
//    check(part1(listOf("test_input")) == 1)

    // Or read a large test input from the `src/Day01_test.txt` file:
//    val testInput = readInput("Day01")
//    check(part1(testInput) == 1)

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}