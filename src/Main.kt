fun test(args: String) {
    val a = 1
    val b = 3
    println("Hello $args")
    println(a + b)
}

fun test2(args: Array<String>) {
    val userKotlin = UserKotlin("test@test.ru")
    println(userKotlin.email)
    println(test("test_param"))

    var name: String = "raz"
    val name2: String = "raz"
}

fun main(args: String) {

    val a: String = "rax1"
    var a1: Byte = 12
    var b2: Short = 11
    val b: Int = 3
    val c: Long = 3
    //
    val d: Double = 1.23
    val f: Float = 1.23F

}