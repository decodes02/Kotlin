package OOPs

fun main(){
    val p1 = Person("Deepak")
    print(p1.name)
}

//class Person(name: String){
//    val name: String
//    init{
//        this.name = name
//    }
//}

// OR

class Person(val name: String)