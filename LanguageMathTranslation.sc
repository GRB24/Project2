//LanguageMathTranslation
//string numbers
val chinese: List[String] = List("ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "shi")
val english: List[String] = List("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")

//main
def go(aList: List[String]): Unit ={
  var out = List[Int]()
  out = valCheck(aList)
  var a = add(out)
  var t = times(out)
  println("Translation: "+ out)
  println("Addition: " + a)
  println("Multiplication: " + t)
}

//add list
def add(aList: List[Int]): Int = {
aList.foldLeft(0)(_+_)
}

//multiply list
def times(aList: List[Int]): Int ={
aList.foldLeft(1)(_*_)
}

//Checks if input in list is a numeral value
def valCheck(aList: List[String]): List[Int] = {
  aList match{
    case Nil => Nil
    case head :: tail => {
      (english.contains(head), chinese.contains(head))match{
        case (true, _) => english.indexOf(head) :: valCheck(tail)
        case (false, true) => chinese.indexOf(head) :: valCheck(tail)
        case (false, false) => valCheck(tail)
      }
    }
  }
}

//Test
go(List("yi", "nine","six", "ba"))
go(List("yi", "josh", "three", "si"))


