//Write a program using scala to print odd and even number
package Basics

object isNumberOddEven {
  def main(args: Array[String]):Unit={
    val num = 10
    if(num%2 == 0) {
      println("Even Number")
    } else {
      println("Odd Number")
    }
  }
}
