/**
  * Created by ljy on 2016. 6. 8..
  */
class Phrase(val sentence: String) {
  val words = sentence.split("[^a-zA-Z1-9']+").map(_.toLowerCase)
  def wordCount = words
    .groupBy(identity)
    .mapValues(_.size)
}
