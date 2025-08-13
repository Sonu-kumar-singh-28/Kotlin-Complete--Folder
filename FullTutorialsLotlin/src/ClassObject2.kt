fun main(){
    var car1 = car1()
    car1.name = "Buggati"
    car1.model = "2025 Model"
    car1.color ="Red"
    car1.engine = "4X4"

    car1.horn("2025");
}


class car1(){
    var name =""
    var model = ""
    var color = ""
    var engine =""


    fun horn(model: String){
        println("$model are sound as beep beep")
    }

    fun carcolor(color: String, name: String){
        println("name of the car is $name and its color is ${color}")
    }

}
