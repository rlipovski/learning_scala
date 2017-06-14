import org.scalatest.FlatSpec

class PowerSpec extends FlatSpec {
  "calculate(2, 4)" should "be 16" in  {
    val p = new Power
    assert(p.calculate(2, 4) == 16)
    assert(p.calculateRec(2, 4) == 16)
  }

  "calculate(9, 9)" should "be 387420489" in  {
    val p = new Power
    assert(p.calculate(9, 9) == 387420489)
    assert(p.calculateRec(9, 9) == 387420489)
  }
}
