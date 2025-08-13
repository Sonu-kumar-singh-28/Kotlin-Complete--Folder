import kotlin.math.acos

fun main(){
    val red = TrafficLight.RED
    val yellow = TrafficLight.YELLOW
    val green = TrafficLight.GREEN

    ProcessTrafficLight(red)
    ProcessTrafficLight(yellow)
    ProcessTrafficLight(green)


}


enum class TrafficLight(val action: String) {
    RED("RUKO"),
    YELLOW("Tayar HO Jao"),
    GREEN("CHALLO");

    fun getInstruction(): String {
        return "Traffic Light Says $action"
    }
}


fun ProcessTrafficLight(Light:TrafficLight){
    when(Light){
        TrafficLight.RED -> println(Light.getInstruction())
        TrafficLight.YELLOW ->println(Light.getInstruction())
        TrafficLight.GREEN -> println(Light.getInstruction())
    }
}
