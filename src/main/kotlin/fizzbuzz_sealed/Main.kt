package fizzbuzz_sealed

enum class Division {
    DIVISIBLE_BOTH_THREE_AND_FIVE,
    DIVISIBLE_THREE_AND_NOT_DIVISIBLE_FIVE,
    NOT_DIVISIBLE_THREE_AND_DIVISIBLE_FIVE,
    NOT_DIVISIBLE_THREE_AND_FIVE,
}

fun c() {
    val x = Division.DIVISIBLE_BOTH_THREE_AND_FIVE
    when (x) {
        Division.DIVISIBLE_BOTH_THREE_AND_FIVE -> println("FizzBuzz")
    }
}