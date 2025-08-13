import java.lang.classfile.ClassModel

fun  main(){
    var car1 = car2("Bugati", "Red")
}

class car2(var model: String, var Color: String){

    var FormattedModel = ""

    init {
        FormattedModel= model.uppercase()
        println(FormattedModel)
    }
}