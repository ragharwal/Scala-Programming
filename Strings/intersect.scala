/*Let us assume that you have two shopping baskets with a bunch of
items in each one. The first contains elements: "Cake", "Milk", "Cheese", "Toilet Paper",
and the second one has the following items: "Bread", "Water", "Juice", "Milk", "Cheese".
Write a scala program to find the common items between the two shopping baskets.
*/
package Strings

object intersect {
  def main(args:Array[String])
  {
    val s1 = Set("Cake", "Milk", "Cheese", "Toilet Paper")
    val s2 = Set("Bread", "Water", "Juice", "Milk", "Cheese")
    val s3 = s1.intersect(s2)
    s3.foreach(x => println(x))
  }
}