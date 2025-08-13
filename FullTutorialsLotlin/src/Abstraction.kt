fun main(){
    var object1 = Bike()
    object1.Engine()

    var objectx = Cars()
    objectx.Engine()
}



abstract class Vehicle{
    abstract fun Engine()

    fun Horn(){
        println("Peep Peep")
    }
}


open class Cars:Vehicle(){
    override fun Engine() {
        println("Car Model Engine are CT100")
    }
}

class  Bike: Cars(){
    override fun Engine() {
        println("Bike Model Engine Are BT1-111")
    }
}