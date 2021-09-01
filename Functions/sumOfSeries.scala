// Sum of the series 1!/1+2!/2+3!/3+4!/4+5!/5 using functions
package Functions
object sumOfSeries {
  def fact(n:Int):Int={
    var num = 0
    var f = 1
    while(num<=n-1){
      f=f+f*num
      num+=1
    }
    f
  }
  def sum():Unit={
    var sum:Int=0
    sum=fact(1)/1+fact(2)/2+fact(3)/3+fact(4)/4+fact(5)/5
    println("The sum of the series is: "+sum+"\n")
  }
  def main(args: Array[String]):Unit={
    sum()
  }
}
