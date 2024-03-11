package com.richard.atividadeherana


fun main() {
    val factory = VehicleFactory()
    var vehicleList: MutableList<Veiculo> = mutableListOf()

    for (i in 1..20){

        val vehicle = factory.createAnVehicle(i % 2)
        vehicleList.add(vehicle)
    }

    vehicleList.forEach{
        vehicle ->
        println(vehicle)
        vehicle.acceleration()
        println(vehicle)
    }
}
class VehicleFactory{
    fun createAnVehicle (type: Int) : Veiculo{
        return when (type) {
            1 -> Carro()
            else -> Moto()

        }
    }
}

abstract class Veiculo{
    abstract val tipo: String
    abstract fun acceleration() : Int

    override fun toString() = "Veiculo: $tipo aceleração"
}
class Carro: Veiculo(){
    override val tipo = "Carro: ${acceleration()}"
    override fun acceleration() = 0
}
class Moto: Veiculo(){
    override val tipo = "Moto: ${acceleration()}"
    override fun acceleration() = 5
}