//Write a program using scala to print where the value is multiplied by 4 until 30 value reached
package Basics

object mutiple {
  def main(args: Array[String]):Unit={
    var a = 1;
    while(a<30){
      println("Value of a is: "+a);
      a = a*4;
    }
  }
}

