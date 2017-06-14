import scala.math._

class Power {
  def calculate(number: Int, exp: Int): Double = {
    pow(number, exp)
  }

  def calculateRec(number: Int, exp: Int, acc: Int = 1): Double = {
    if(exp > 0) calculateRec(number, exp - 1, number * acc)
    else acc
  }
}
