fun main(){
    var objectclass = Student1();
    objectclass.Name="Rahul"
    objectclass.Rollno = 101

    objectclass.completehomework();
    objectclass.introduceStudent()
}


class Student1(){
    // data types
    var Name = ""
    var Rollno =0


    fun completehomework(){
        println("${Name} Rollno  ${Rollno} ne Apnea homeWok complete kar liya ")
    }

    fun introduceStudent(){
        println("my name is $Name and My roll No is $Rollno")
    }
}

