import scala.annotation.tailrec

/**
  * Created by ljy on 2016. 5. 20..
  */
object Hamming {

//  def compute(first: String, second: String): Int = {
//    if (first.size != second.size) throw new IllegalArgumentException
//    compute(first, second, 0, 0);
//  }
//
//  @tailrec
//  def compute(first: String, second: String, index: Int, acc: Int): Int = {
//    if (first.size <= index) return acc
//    if (!first.charAt(index).equals(second.charAt(index))) compute(first, second, index + 1, acc + 1)
//    else compute(first, second, index + 1, acc)
//  }

  def compute(first: String, second: String): Int = {
    if (first.size != second.size) throw new IllegalArgumentException
    var diff = 0;
    def addDiff = {diff += 1}
    first.zip(second).foreach((x)=>{ if (x._1 != x._2) {addDiff}})
    diff
  }
}
