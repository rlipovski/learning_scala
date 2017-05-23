object CentrigradeToFahrenheit {
  def main(args: Array[String]): Unit = {
    println("Enter a centrigrade value: ")
    val centigrade: Double = readLine().toDouble

    val fahrenheit = (centigrade * 9/5) + 32

    println("Fahrenheit: " + fahrenheit)
  }
}