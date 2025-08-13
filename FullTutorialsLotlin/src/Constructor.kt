fun main(){
    val student1 = Student("Sonu Kumar Singh", 56)
    student1.introduce();

}


class Student(val name: String, val RollNo: Int){
    fun  introduce(){
        println("My name is $name and Roll no is : $RollNo")
    }
}