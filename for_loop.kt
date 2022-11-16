              fun main(){
                val  fruits = listOf<String>("kiwi", "dragon fruit", "Orange")
                  for (items in fruits.indices){
                      println("the fruit at $items is ${fruits[items]}")
                  }
                  val shape = Shape()
                  fun sum(a: Int, b: Int ) =  a+b
                  println("the sum is ${sum(6,8)}")
              }
             open class Shape(){
                  fun Shape()
                  {
                      println("this is the constructor of the class shape")
                  }
              }
              class Rectangle(var a : Int, var b: Int): Shape(){
                fun Rectangle(){
                    println("This is the class in rectangle")
                }
              }
