class IDGenerator {
    companion object {
        var currentId = 0
        
        fun getnextId(): Int {
             currentId++
            return currentId
        }
    }
}

fun main() {
    println(IDGenerator.getnextId())
    println(IDGenerator.getnextId())
    println(IDGenerator.getnextId())
    println(IDGenerator.getnextId())
}
