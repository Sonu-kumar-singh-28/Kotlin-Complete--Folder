fun main(){
    var Onbject1 = Circle(6)
    Onbject1.area();
    Onbject1.perimeter()
}


abstract class Shape{
    abstract fun area()
    abstract  fun perimeter()
}



class  Circle(var radius: Int):Shape(){
    override fun perimeter() {
       println( 2 * Math.PI * radius)
    }

    override fun area()=
         println(Math.PI * radius * radius)
}

