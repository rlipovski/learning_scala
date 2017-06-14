object FiverRecursion {
  def generate(i: Int, acc: Int): Int = {
    println(i)
    i match {
      case 50 => acc
      case _ => generate(i+5, acc)
    }
  }
}
