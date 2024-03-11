package com.richard.atividadeherana

fun main() {
    var carro = CarroInterface()
    var moto = MotoInterface()
    println(carro.tipo)
    println(moto.tipo)
}

 interface VeiculoInterface{
     var tipo: String
    fun acceleration() : Int
}
class CarroInterface: VeiculoInterface{
    override var tipo = "Carro: ${acceleration()}"
    override fun acceleration() = 0
}
class MotoInterface: VeiculoInterface{
    override var tipo = "Moto: ${acceleration()}"
    override fun acceleration() = 5
}