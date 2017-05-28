class StringChecker {
  def checkName(name: String): String = {
    name match {
      case n if n != "" => n
      case n => "n/a"
     }
  }
}