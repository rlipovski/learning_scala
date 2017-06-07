
class NumberChecker {
  def check(number: Double): String = {
    number match {
      case n if n > 0 => "greater"
      case n if n == 0 => "equals"
      case n if n < 0 => "less"
    }
  }
}
