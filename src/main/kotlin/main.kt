interface carPrototype {
    fun clone(): carPrototype
}

class car : carPrototype {
    var name: String? = null
    var maxSpeed: String? = null

    override fun clone(): carPrototype {
        return this
    }
}

class carFactory{
    val cars: MutableMap<String,carPrototype> = mutableMapOf()

    init{

    }
}

fun main() {

}
