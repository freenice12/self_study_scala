/**
  * Created by ljy on 2016. 6. 8..
  */
class Anagram(raw: String) {
  def matches(nominees: Seq[String]): Seq[String] = {
    val result = nominees.filter(nominee => {nominee.toLowerCase.sorted == raw.toLowerCase.sorted} )
    .filter(r => raw.toLowerCase != r.toLowerCase)
    result
  }
}
