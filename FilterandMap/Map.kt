package FilterandMap

fun main(){
    val list = listOf<Int>(1,2,5,8,3)
    val newList = list.filter({
            a->a%2==0
    }).map({
        it*it
    }).forEach {
        println(it)
    }

}