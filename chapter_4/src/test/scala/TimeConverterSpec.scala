import org.scalatest.FlatSpec

class TimeConverterSpec extends FlatSpec {
  "88400000 miliseconds" should "be" in {
    val converter = new TimeConverter
    assert(converter.convert(88400000) == "days: 1, hours: 0, minutes: 33, seconds: 20")
  }
}
