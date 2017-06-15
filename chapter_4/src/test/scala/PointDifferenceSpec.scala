import org.scalatest.FlatSpec

class PointDifferenceSpec extends FlatSpec{
  "calculateDifference(3, 4, 2, 2)" should "return (1, 2)" in  {
    val p = new PointDifference
    assert(p.calculateDifference(3, 4)(2, 2) == (1, 2))
  }

  "calculateDifference(-5, 4, 10, 1)" should "return (-15, 3)" in  {
    val p = new PointDifference
    assert(p.calculateDifference(-5, 4)(10, 1) == (-15, 3))
  }

  "convertFirstItem" should "convert first item to Int and return a tuple" in {
    val p = new PointDifference
    assert(p.convertFirstItem[Int, Int](1, 2) == (1, 2))
    assert(p.convertFirstItem[String, String]("5", "3") == (5, "3"))
  }
}
