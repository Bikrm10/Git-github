import java.lang.StringBuilder

class Truck():Vehicle(){ // inheritance syntax - class A():B() B() is the parent class and A is inherited class
    val size: String =""
    val name :String =""
}
fun main(){
    val truck = Truck()
    truck.brake()
}