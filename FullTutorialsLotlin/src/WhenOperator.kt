fun main(){
    var timeforday = "hello"
    var result = when(timeforday){
        "Morning" ->println("poha milega ")
        "Afternoon" -> println("Rajma Milega")
        "Evening" ->println("Snax Milega")
        "Night" -> println("Panner Milega")
        else -> println("Kuch match nahi hua ")
    }
    println(result)
}