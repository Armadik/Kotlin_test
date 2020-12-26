fun test(args: String) {
    val a = 1
    val b = 3
    println("Hello $args")
    println(a + b)
}

fun main(args: Array<String>) {
    val userKotlin = UserKotlin("test@test.ru")
    println(userKotlin.email)
    println(test("test_param"))
}
