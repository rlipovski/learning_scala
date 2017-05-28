import org.scalatest.FunSuite

class StringCheckerSpec extends FunSuite {
  test("if name is not empty return name") {
    val stringChecker = new StringChecker()
    assert(stringChecker.checkName("Donald") == "Donald")
  }

  test("if name is empty return n/a") {
    val stringChecker = new StringChecker()
    assert(stringChecker.checkName("") == "n/a")
  }
}