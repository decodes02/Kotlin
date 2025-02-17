package OOPs
import java.util.Random

class LuckDispatcher{
    fun getNumber(){
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

object DatabaseConnection {
    init {
        println("Database connection established.")
    }

    fun connect() {
        println("Connecting to the database...")
    }

    fun disconnect() {
        println("Disconnecting from the database...")
    }
}



fun main(){
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()
    d1.getNumber()
    d2.getNumber()

    // Both calls refer to the same instance of DatabaseConnection
    DatabaseConnection.connect()
    DatabaseConnection.disconnect()
}