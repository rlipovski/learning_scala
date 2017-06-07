import org.scalatest.FlatSpec

class NumberCheckerSpec extends FlatSpec {
  val checker = new NumberChecker()
  "numberchecker" should "return greater if number is greater than 0" in {
    assert(checker.check(2) == "greater")
    assert(checker.check(1000) == "greater")
  }

  "numberchecker" should "return less if number is less than 0" in {
    assert(checker.check(-2) == "less")
    assert(checker.check(-1000) == "less")
  }

  "numberchecker" should "return equals if number is equals to 0" in {
    assert(checker.check(0) == "equals")
  }
}
