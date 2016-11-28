//LanguageMathTranslation


val chinese: List[String] = List("ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "shi")
val english: List[String] = List("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")

val x = toInt("10") x: Option[Int] = Some(10)

def toInt (s: String): Option[Int] = {
  try{
    Some(s.toInt)
  } catch(s.toInt){
    case e: Exception => None
  }

}

