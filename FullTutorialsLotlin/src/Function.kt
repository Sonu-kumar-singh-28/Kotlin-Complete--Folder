fun main(){
    var result = calculatemarks(80,98,87)
    println("Apka Total marks hai $result")

    orderFood("pizza", 3)
    orderFood("Burger", 3)

    var ans = calculatepercentage(245,300)
    println(ans)
}


fun calculatemarks(math: Int, Science: Int, english: Int): Int{
    var totalmarks = math+Science+english
    return totalmarks;
}




fun orderFood(item: String, quantity: Int){
    println("Apka item hai $item, aur Quantity hai $quantity")
}


fun calculatepercentage(marks: Int, totalmarks: Int): Float{
    return (marks.toFloat() /totalmarks) *100
}