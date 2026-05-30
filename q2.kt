class Thermostat {
    var temperature: Double = 20.0
    private set
    
    fun changetemp(value: Double) {
        temperature = value
    }
}

fun main() {
    val room = Thermostat()
    
    room.changetemp(35.0)
    
    println("Temperature = ${room.temperature}")
}
