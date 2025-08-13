import kotlin.time.Duration

fun main(){
    // hide the data and binding the data

    var object1 = BankAccount()
    object1.setAccountHolder("Rohit Sharma ")
    object1.SetBalanceAmount(10000.0)
    println("Account Holder :${object1.GetAccountHolder()} and Amount is :${object1.getBalanceAmount()}")

    println("Withdrawal Amount ${object1.getwithdrawAmount(500.0)} and Remaining Balance is ${object1.getBalanceAmount()}")
}


class BankAccount{
   private var balance : Double =0.0
   private var AccountHolder: String = ""

    // getter and setter method

    // setter
    fun setAccountHolder(name: String){
        if(name.isNotEmpty()){
            AccountHolder = name
        }else{
            println("Name are Not Empty")
        }
    }

    // getter
    fun GetAccountHolder(): String{
        return AccountHolder;
    }


    fun SetBalanceAmount(amount: Double){
        if(amount>0){
            balance = amount
        }else{
            println("not Amount be Deposited because yor amount is not valid")
        }
    }

    fun getBalanceAmount(): Double{
        return balance
    }


    fun getwithdrawAmount(amount: Double){
        if(amount>0 && amount<= balance){
            balance = balance-amount;
        }
    }

}

