
package benchmark

import scala.util.control.Breaks
import org.openjdk.jmh.annotations.{Benchmark, Scope, State}

@State(Scope.Thread)
class EaarlyReturnTest {
  val numSeq = Seq(1,2,3,4,5)

  val b = new Breaks

  @Benchmark
  def existsWithBreak(): Boolean = {
    var result = false
    b.breakable {
      for (x <- numSeq)
        if (x == 5) { result = true; b.break }
    }
    result
  }

  @Benchmark
  def existsWithReturn(): Boolean = {
      for (x <- numSeq)
        if (x == 5) { return true }
    false
  }
}
