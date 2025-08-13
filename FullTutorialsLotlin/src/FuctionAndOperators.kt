fun main(){
    var result = inputnumber();
    println("The Result of the Values  is : $result")



    val action = "CodeQuestStudio"
    var name = "Subscribe"
    println("$action $name")

}


fun inputnumber(): Int{
    println("Enter the First Number")
    var a = readln().toInt();

    println("Enter the Second Number")
    var b = readln().toInt();

    //var ans = addition(a,b)
    //return ans;

    println("Value of a is $a and Values Of b is $b")

    var ans2 = substraction(a,b)
    return  ans2
}



//fun addition(a: Int, b: Int): Int{
//    var result = a+b;
//    return result;
//}


fun substraction(a: Int,b: Int): Int{
    var result = b-a;
    return result
}