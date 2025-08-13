import car
import java.awt.Color
import kotlin.math.PI

fun main(){
    var car1 = car("maruti Swift")
    var car2 = car("maruti","Red")
    car2.horn();
}

class car{
    var model: String
    var color: String


    constructor(model: String){
        this.model = model;
        this.color = "No Color"
        println("Model Constructor")
    }

    constructor(model: String,color: String){
        this.model = model;
        this.color =color

        println("Model and Color Constructor")
    }



    fun horn(){
        println("$color $model")
    }
}
