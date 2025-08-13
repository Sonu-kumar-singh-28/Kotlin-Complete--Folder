import java.sql.Types

fun main(){
    var grandparenthouse1 = grandparentHouse()
    grandparenthouse1.describe()


    var childclassobject = chiildHouse("Modern")
    childclassobject.describe()

}


open class grandparentHouse{
    var room =1;
    var material = "Mud"

      open fun  describe(){
        println(" Yeh ek $material  ka ghar hai jisme $room hai ")
    }
}


open class parentHouse:grandparentHouse(){

    init{
        room = 3;
        material = "Concrete"
    }

    override fun describe() {
        println(" Yeh ek $material  ka ghar hai jisme $room hai ")
    }
}


class chiildHouse(var types: String) :parentHouse(){
    var Type = types

    init{
        room = 6
    }

    override fun describe() {
        super.describe()
        println("Yeh ek $types  ghar  hai jisme $room  hai ")
    }
}



