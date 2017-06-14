import org.scalatest.FlatSpec

class CircleAreaSpec extends FlatSpec {
  "a circle with radius of 4" should "have an area equal to 50.26548245743669" in {
    val circle = new CircleArea
    assert(circle.CalculateArea(4) == 50.26548245743669)
    assert(circle.CalculateArea("4") == 50.26548245743669)
  }

  "a circle with radius of -4" should "have an area equal to 50.26548245743669" in {
    val circle = new CircleArea
    assert(circle.CalculateArea(-4) == 50.26548245743669)
    assert(circle.CalculateArea("-4") == 50.26548245743669)
  }

  "a circle with radius of 0" should "have an area equal to 0.0" in {
    val circle = new CircleArea
    assert(circle.CalculateArea(0) == 0.0)
    assert(circle.CalculateArea("0") == 0.0)
  }
}
