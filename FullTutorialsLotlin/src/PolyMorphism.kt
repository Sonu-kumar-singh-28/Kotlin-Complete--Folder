fun main(){
    var animal1:Animal = Dog()
    var animal2 :Animal = Cat()
    animal2.makeSound();
    animal1.makeSound();


    var animal3 =Animal()
    animal3.makeSound()

}

open class Animal{
    open fun makeSound(){
        println("Not Sound For Animal")
    }
}


class Dog:Animal(){
    override fun makeSound() {
        println("Woff Woff")
    }
}

class Cat:Animal(){
    override fun makeSound() {
        println("Meow Meow ")
    }
}



