package fizzbuzz_when

fun fizzBuzz(i: Int): String {
    return when {
        i % 15 == 0 -> {
            "FizzBuzz"
        }
        i % 3 == 0 -> {
            "Fizz"
        }
        i % 5 == 0 -> {
            "Buzz"
        }
        else -> {
            "$i"
        }
    }
}

fun main(args: Array<String>) {
    val n: Int = 20
    for (i in 1..n) {
        println(fizzBuzz(i))
    }
}