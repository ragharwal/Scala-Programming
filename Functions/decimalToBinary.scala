// Convert decimal to binary using functions
package Functions
object decimalToBinary {
  def decimalToBinary(num:Int):Unit={
    if(num==0){
      println(0)
    } else {
      var binaryString:String = ""
      var n = num
      while(n>0) {
        val rem = n%2
        binaryString = rem + binaryString
        n=n/2
      }
      println("Binary form of "+num+ " is "+ binaryString)
    }
  }
  def main(args: Array[String]):Unit={
    decimalToBinary(112)
  }
}
