interface carPrototype {
    fun clone(): carPrototype
}

class car : carPrototype {
    var name: String? = null
    var maxSpeed: String? = null

    constructor(baseCar: car){
        this.name = baseCar.name
        this.maxSpeed = baseCar.maxSpeed
    }

    override fun clone(): carPrototype {
        return car(this)
    }
}

class carFactory{
    val cars: MutableMap<String,carPrototype> = mutableMapOf()

    init{

    }
}

fun main() {

}
