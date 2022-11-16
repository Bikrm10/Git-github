open class Vehicle(){
    init {
        println("This is the parent constrictor")
    }
    fun run(){}
   fun brake(){}
}
class Car(): Vehicle(){
    init {
        println("This is the child constructor")
    }
   val name: String = ""
    val speed : Double = 0.0

}
fun main(){
    val v1 = Car()
}