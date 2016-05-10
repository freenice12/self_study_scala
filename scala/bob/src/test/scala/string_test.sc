object string_test {
  val a = "az?"
  a.toCharArray.foreach(c => println(c.toInt))


  def isCharacter(con: String) = {
    val size = con.toCharArray.filter(c => {c.toInt > 96 && c.toInt < 123})
    println(size.size+ " / " + con.size)
    size.size == con.size
  }

  def filterCharacter(con: String) = {
    val notChar = con.toCharArray.toStream.filter(c => {println(c + " / " + c.toInt); c.toInt < 96 || c.toInt > 123})
    val chars = con.filter(c => {!notChar.contains(c)})
    chars.length > 0
  }

  def hey(con: String) = {
    if (con.trim == "") {
      "Fine. Be that way!"
    } else {
      val isYelling = con.toUpperCase == con
      if (isYelling)
        "Whoa, chill out!"
      else if (con.endsWith("?"))
        "Sure."
      else
        "Whatever."
    }
  }

  isCharacter(a)
  filterCharacter(a)
}