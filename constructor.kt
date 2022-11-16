class Person(nameParam: String, ageParam: Int){
    var name: String = nameParam
    var age : Int = ageParam
        get() {    // This is the getter . Getter of the property is written  just bellow the declared  property.
            println("the getter is called")
            return field // the value assigned in field of age is returned
        }
        set(value) {  // This is the setter gor the property age . If the getter and setter is called below
        //The name property than getter and setter of the name is called  .
            if (value>0){
                field = value // field is like variable  that  holds the value assigned in age.
            }
            else{
                println("The age cannot be negative i.e $value is not the age")
            }
        }
    fun add(a: Int, b:Int): Int{
         return a+b
     }
        fun mul(a: Int, b: Int): Int    {
        return a*b
    }
}
fun main(){
    var person = Person("bikram", 23)
    println(person.name.toUpperCase())
    person.age = 21
    println(person.age)
    print("the sum  is ")
    println(person.add(3,6))
    print("The multiplication  is  ")
    println(person.mul(3,6))
}