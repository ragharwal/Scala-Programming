//Write a program using scala to print celcius if you know the farenheit value
package Basics

object farenheitToCelcius {
  def main(args: Array[String]):Unit={
    val tempInF = 91.4
    val tempInC = (5*(tempInF-32))/9
    print("Temperature in Celcius is: "+tempInC)
  }
}
