import java.util.Locale

fun main(){
    greeting()
    greeting("sonu singh sengar")
    greeting("Rahul" , "Andehri east")
    
}


fun greeting(){
    println("Hello, Student")
}

fun greeting(name: String){
    println("Hello $name")
}


fun greeting(name: String,  Location: String){
    println("Hello $name and its Location is $Location")
}

