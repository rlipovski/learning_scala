class TimeConverter {
  def convert(miliseconds: Long): String = {
    def toDays(m: Long): Double = m / (24 * 60 * 60 * 1000)
    def toHours(m: Long): Double = (m / (60 * 60 * 1000)) % 24
    def toMinutes(m: Long): Double = (m / (60 * 1000)) % 60
    def toSeconds(m: Long): Double = (m / 1000 ) % 60

    s"days: ${toDays(miliseconds).toInt}, hours: ${toHours(miliseconds).toInt}, minutes: ${toMinutes(miliseconds).toInt}, seconds: ${toSeconds(miliseconds).toInt}"
  }
}
