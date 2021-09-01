// Find the square of any number using functions
package Functions
object square {
  def sq(a:Int):Int={
    return a*a
  }
  def main(args: Array[String]):Unit={
    println("Square is "+sq(5))
  }
}
