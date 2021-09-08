//Write a program using scala to print a year is leap year or not
package Basics

object isLeapYear {
  def main(args: Array[String]):Unit={
    val year = 2002
    if(((year%4 == 0) && (year%100!= 0)) || (year%400 == 0)) {
      println("Leap Year")
    } else {
      println("Not a Leap Year")
    }
  }
}
