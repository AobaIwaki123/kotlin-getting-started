package fizzbuzz_if

fun fizzBuzz(i: Int): String {
    return if( i % 15 == 0 ){
        "FizzBuzz"
    } else if (i % 3 == 0 ){
        "Fizz"
    } else if(i % 5 == 0 ){
        "Buzz"
    } else {
        "$i"
    }
}

fun main(args: Array<String>) {
    val n: Int = 20
    for (i in 1..n) {
        println(fizzBuzz(i))
    }
}