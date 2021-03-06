
class PointDifference {
  def calculateDifference(x1: Int, y1: Int)(x2: Int, y2: Int): (Int, Int) = {
    (x1 - x2, y1 - y2)
  }

  def convertFirstItem[A, B](x: A, y: B) = {
    if(x.isInstanceOf[Int]) x -> y
    else x.toString.toInt -> y
  }
}
