class Fiver {
  def GenerateRows: Unit ={
    for (x <- 1 to 100) {
      x match {
        case m if m%5 == 0 && m == 100 => print(s"$x")
        case m if m%5 == 0 => print(s"$x, \n")
        case _ => print(s"$x, ")
      }
    }
  }
}
