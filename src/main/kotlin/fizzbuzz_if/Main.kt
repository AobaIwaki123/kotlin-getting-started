package fizzbuzz_if

fun fizzBuzz(i: Int): String {
    if( i % 15 == 0 ){
        return "FizzBuzz"
    } else if (i % 3 == 0 ){
        return "Fizz"
    } else if(i % 5 == 0 ){
        return "Buzz"
    } else {
        return "$i"
    }
}

fun main(args: Array<String>) {
    val n: Int = 20
    for (i in 1..n) {
        println(fizzBuzz(i))
    }
}