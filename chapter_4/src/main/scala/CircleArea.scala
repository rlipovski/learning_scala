import scala.math._

class CircleArea {
  def CalculateArea(radius: Int) = {
    Pi * pow(radius, 2)
  }

  def CalculateArea(radius: String) = {
    Pi * pow(radius.toInt, 2)
  }
}
