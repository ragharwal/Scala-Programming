// Swap the numbers using functions
package Functions
object swap {
  def swap(a:Int, b:Int)={
    var x = a
    var y = b
    var temp = x
    x = y
    y = temp
    print("a= "+x+"\nb= "+y)
  }
  def main(args: Array[String]):Unit={
    swap(12,13)
  }
}
