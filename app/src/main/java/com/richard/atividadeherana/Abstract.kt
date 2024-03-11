package com.richard.atividadeherana

abstract class Abstract {
}
fun main() {
    var carro = CarroAbstract()
    var moto = MotoAbstract()
    println(carro.tipo)
    println(moto.tipo)
}

abstract class VeiculoAbstract{
    abstract var tipo: String
    abstract fun acceleration() : Int
}
class CarroAbstract: VeiculoAbstract() {
    override var tipo = "Carro: ${acceleration()}"
    override fun acceleration() = 0
}
class MotoAbstract: VeiculoAbstract() {
    override var tipo = "Moto: ${acceleration()}"
    override fun acceleration() = 5
    }
