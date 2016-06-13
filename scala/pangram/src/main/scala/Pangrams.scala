/**
  * Created by ljy on 2016. 6. 8..
  */
object Pangrams {
  def isPangram(s: String): Boolean = {
    if (s.isEmpty) {
      false
    } else {
      Range('a'.toInt, 'z'.toInt).forall(i => s.toLowerCase.contains(i.toChar))
    }
  }
}
