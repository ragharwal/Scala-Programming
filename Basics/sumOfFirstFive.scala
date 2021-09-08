//Write a program using scala to print the sum of first 5 prime numbers
package Basics

object sumOfFirstFive {
  def main(args: Array[String]):Unit={
    var sum = 0
    for(i<-2 to 12){
      var prime=1
      for(j<-2 to i/2){
        if(i%j==0){
          prime = 0
        }
      }
      if (prime==1){
        sum=sum+i
      }
    }
    println("Sum is : "+sum)
  }
}
