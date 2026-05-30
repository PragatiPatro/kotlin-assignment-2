abstract class Animal {
   abstract fun makeSound() 
}

class Cat : Animal() {
    override fun makeSound() {
        println("MEOW!!")
    }
}

fun main() {
    val cat = Cat()
    cat.makeSound()
}
