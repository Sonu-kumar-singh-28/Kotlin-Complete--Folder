import Result.Loading.processResult
import javax.sound.midi.MetaMessage
import javax.xml.crypto.Data

fun main(){
    val success = Result.Success("User Profile Fetched")
    val error  = Result.Error("Network Faliure")
    val  loading = Result.Loading


    processResult(success)
    processResult(error)
    processResult(loading)

}

sealed class Result{
    data class Success(val data: String): Result()
    data class  Error(val message: String):Result()


    object Loading :Result()

    fun processResult(result: Result){
        when(result){
            is Error -> println("Error ayya hai :${result.message}")
            Loading -> println("Data Load Ho raha hai")
            is Success -> println("data Mila ${result.data}")
        }
    }
}
