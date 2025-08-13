fun main(){
    var battery = 5;
    // while Loop
    while(battery>0){
        println("Scrolling Instagram battery left $battery")
        battery--;
        if(battery ==0){
            println("Mobile are Switch Off")
        }
    }


    // do while Loop
    var attempt = 1;
    do {
        println("Exam given $attempt")
        attempt++;
    }while (attempt<=3)



    // for loops

    for(i in 1..10){
        println("Welcome to the Kotlin World $i")
    }


    for(j in 1 until 12){
        println("Hello World !!!!! $j")
    }
}