// Check whether a number is Armstrong or not using functions
package Functions
object isArmstrong {
  def isArmstrong (num:Int):Unit={
    var number = num
    var temp = 0
    var total = 0
    while(number!=0) {
      temp=number%10
      total=total+temp*temp*temp
      number/=10
    }
    if(total==num) {
      println(num+" is an Armstrong Number")
    } else {
      println(num+" is not an Armstrong Number")
    }
  }
  def main(args: Array[String]):Unit={
    isArmstrong (370)
  }
}
