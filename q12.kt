fun executeTwice(action: () -> Unit) {
    action()
    action()
}

fun main() {
    executeTwice {
        println("HELLO")
    }
}
