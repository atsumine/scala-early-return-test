
package benchmark

import org.scalatest._

class EarlyReturnTestSpec extends FlatSpec with DiagrammedAssertions {
  val t = new EarlyReturnTest
  "existWithBreak" should "return true" in {
      assert(t.existsWithBreak())
    }

  "existWithReturn" should "return true" in {
    assert(t.existsWithReturn())
  }
}