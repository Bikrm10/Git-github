class Automobile( name: String, var tyre: Int = 4, var maxSeat: Int = 5) {
    val nameParam = name

    fun drive(){
        println(nameParam)
        println(tyre)
        println(maxSeat)
    }
    init {
        println("This is the  first initializer")
    }
    fun gear(){}
    init {
        println("This is the second initializer")
    }
}
fun main(){
    var car = Automobile("ford")
    var car2 = Automobile("Toyota",8,7)
    car.drive()
    car2.drive()



}