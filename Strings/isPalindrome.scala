//Write a scala program to check a given string is palindrome or not
package Strings

object isPalindrome {
  def main(args:Array[String]) {
    val str = "Dot saw i was Tod".toLowerCase
    val revStr = str.reverse
    if(str==revStr) {
      println("String is Palindrome")
    } else {
      println("String is not Palindrome")
    }
  }
}