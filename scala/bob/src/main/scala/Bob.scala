/**
  * Created by ljy on 2016. 5. 9..
  */
class Bob {
  def hey(sentence: String) = {
    sentence match {
      case Yelling() => "Whoa, chill out!"
      case Question() => "Sure."
      case _ => "Whatever."
    }
  }

  case object Yelling {
    def unapply(sentence: String): Boolean = {
      if (sentence.contains("\\w"))
        sentence.eq(sentence.toUpperCase)
      else
        false
    }
  }

  case object Question {
    def unapply(sentence: String): Boolean = sentence.endsWith("?")
  }
}
