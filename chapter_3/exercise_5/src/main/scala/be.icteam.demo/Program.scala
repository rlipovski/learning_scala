package be.icteam.demo

object Program {
    def main(args: Array[String]) : Unit = {
      for (x <- 1 to 100) {
        x match {
          case y if y%3 == 0 && y%5 == 0 => println("typesafe")
          case y if y%3 == 0 => println("type")
          case y if y%5 == 0 => println("safe")
          case _ =>
        }
      }
    }
}
