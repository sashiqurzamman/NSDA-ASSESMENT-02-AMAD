abstract class Appliance {
    abstract fun calcualtePowerUsages()
}

class Fan : Appliance() {
    override fun calcualtePowerUsages() {
        val power = 75
        val hour = 16
        val kwh = (power * hour) / 1000.0
        println("Fan power usage: $kwh kWh")
    }
}
class AirConditioner : Appliance() {
    override fun calcualtePowerUsages() {
        val power = 1500
        val hour = 11
        val kwh = (power * hour) / 1000.0
        println("Air conditioner power usage: $kwh kWh")
    }
}
class LightBulb : Appliance() {
    override fun calcualtePowerUsages() {
        val power = 10
        val hour = 13
        val kwh = (power * hour) / 1000.0
        println("Light bulb power usage: $kwh kWh")
    }
}