class RoundUp {
  def roundUp(): String = {
    val roundedUp: Double = BigDecimal(2.7255).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    "You owe $"+roundedUp
  }
}