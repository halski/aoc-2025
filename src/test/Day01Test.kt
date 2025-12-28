import org.assertj.core.api.Assertions.assertThat

import org.junit.jupiter.api.Test

class Day01Test {

    @Test
    fun `going to 0 once`() {
        assertThat(part1(listOf("L50"))).isEqualTo(1)
    }

    @Test
    fun `going across 0 simple`() {
        assertThat(part1(listOf("L65","R15"))).isEqualTo(1)
    }

    @Test
    fun `going across 0 - move over 200`() {
        assertThat(part1(listOf("L200","R50"))).isEqualTo(1)
    }

    @Test
    fun `test sample solution from task`() {
        val input = readInput("d1-sample")

        assertThat(part1(input)).isEqualTo(3)
    }
}