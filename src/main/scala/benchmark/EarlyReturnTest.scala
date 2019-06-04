import scala.util.control.Breaks

object EaarlyReturnTest {
  val numSeq = Seq(1,2,3,4,5)

  val b = new Breaks

  def existsWithBreak(num: Int): Boolean = {
    var result = false
    b.breakable {
      for (x <- numSeq)
        if (x == num) { result = true; b.break }
    }
    result
  }

  def existsWithReturn(num: Int): Boolean = {
      for (x <- numSeq)
        if (x == num) { return true }
    false
  }
}
