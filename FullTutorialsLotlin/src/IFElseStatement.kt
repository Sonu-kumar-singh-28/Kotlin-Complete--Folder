fun main(){
    var rahulhegight = readln().toDouble()
    var sigmaHeight =readln().toDouble()
    if(rahulhegight>sigmaHeight){
        println("Rahul are Taller")
    }
    else{
        println("sigma Taller")
    }



    println("How Old are You")
    val age = readln().toInt()
    println("Your age is $age")

    if(age>18){
        println("Eligible To Vote")
    }else if(age<14){
        println("Existed to Vote")
    } else if(age>18&&age<40){
        println("You can Vote Now ARE You Exited to Vote ")
    }else{
        println("Not Eligible For Vote ")
    }
}