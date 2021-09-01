// Check whether a number is prime or not using functions
package Functions
object isPrime {
  def isPrime(num: Int): Boolean = {
    var n = 2
    val check = math.sqrt(num)
    while (n <= check) {
      if (num % n == 0) {
        return false
      }
      n += 1
    }
    return true
  }
  def main(args: Array[String]):Unit={
    for (n <- 1 to 10 if isPrime(n)) {
      println(n+" is prime")
    }
  }

}
