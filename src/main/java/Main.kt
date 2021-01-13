fun test(args: String) {
    println("Hello $args")
}

fun main() {
    val args_build_docker = """
        --build-arg DOCKER_REGISTRY=%DOCKER_PULL% 
    """.trimIndent()
    println(args_build_docker + Constants.FOO)
}

class Constants {
    companion object {
        const val FOO = "foo"
    }
}