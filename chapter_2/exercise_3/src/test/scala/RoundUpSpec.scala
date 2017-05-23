import org.scalatest._

class RoundUpSpec extends FunSuite {
  test("roundUp should round up the number 2.7255 to 2.73 and return message You owe $2.73") {
    val r = new RoundUp()
    assert(r.roundUp() == "You owe $2.73")
  }
}