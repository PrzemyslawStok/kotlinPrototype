interface carPrototype {
    fun clone(): carPrototype
    fun print()
}

class car : carPrototype {
    var name: String? = null
    var maxSpeed: Int? = null

    constructor(){
    }

    constructor(baseCar: car){
        this.name = baseCar.name
        this.maxSpeed = baseCar.maxSpeed
    }

    override fun clone(): carPrototype {
        return car(this)
    }

    override fun print(){
        println("name: ${name}")
        println("maxSpeed: ${maxSpeed}")
    }
}

class truck(var name : String, var maxLoadCapacity: Int): carPrototype{

    constructor(baseTruck: truck):this(baseTruck.name, baseTruck.maxLoadCapacity){

    }

    override fun clone(): carPrototype {
        return truck(this)
    }

    override fun print() {
        println("name: ${name}")
        println("maxLoadCapacity: ${maxLoadCapacity}")
    }

}

class carFactory{
    val cars: MutableMap<String,carPrototype> = mutableMapOf()

    fun getCar(name: String): carPrototype? {
        return cars[name]
    }

    init{
        val bmw_1 = car()
        bmw_1.name = "BMW"
        bmw_1.maxSpeed = 200

        cars["BMW_1"] = bmw_1

        val bmw_2 = car()
        bmw_2.name = "BMW"
        bmw_2.maxSpeed = 250

        cars["BMW_2"] = bmw_2

        cars["MAN"] = truck("MAN",24*1000)
    }

}

fun main() {
    val carFactory = carFactory()

    val bmw1 = carFactory.getCar("BMW_1")
    val bmw2 = carFactory.getCar("BMW_2")

    val man1 = carFactory.getCar("MAN")

    bmw1?.print()
    bmw2?.print()

    man1?.print()
}
