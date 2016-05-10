/**
  * Created by ljy on 2016. 5. 9..
  */
class Bob {
  def hey(sentence: String) = {
    sentence.trim match {
      case Yelling() => "Whoa, chill out!"
      case Question() => "Sure."
      case "" => "Fine. Be that way!"
      case _ => "Whatever."
    }
  }

  case object Yelling {
    def unapply(sentence: String): Boolean = {
      if ("[a-zA-Z]".r.findFirstIn(sentence).nonEmpty)
        sentence.eq(sentence.toUpperCase)
      else
        false
    }
  }

  case object Question {
    def unapply(sentence: String): Boolean = sentence.endsWith("?")
  }
}
