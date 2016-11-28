//Prime Numbers
//return boolean if number is prime
def prime (n : Int): Boolean = {
  n < 1 match {
    case false => primeFind(n, 2);
    case true => return false
  }
}
def primeFind (n: Int, divisor: Int): Boolean = {
  (divisor < n, n % divisor != 0) match {
    case (true, true) => primeFind(n, divisor + 1)
    case (true, false) => return false
    case (false, true) => return false
    case (false, false) => return true
    }
}
//Test
prime(5)
prime(44)

//Twin Primes
def twinprimes (x: Int, y: Int): Boolean = {
  (prime(x)== true, prime(y) == true, diff2(x, y) == true) match{
    case (true, true, true) => return true
    case _ => return false
  }
}
def diff2 (a: Int, b: Int): Boolean = {
  a - b == 2 || b - a == 2 match {
    case true => return true
    case false => return false
  }
}
//Test
twinprimes(3,5)
twinprimes(3, 11)
twinprimes(2, 4)
twinprimes(4, 12)

//Twin Primes List
def twinprimeslist (n: Int): List[Int]= {
  require(n>=2)
  val acc = 3 to n by 2 toList
  def primes(acc: List[Int], primel: List[Int]): List[Int] = acc match{
    case Nil => primel
    case _ if primel.exists(acc.head% _ == 0) => primes(acc.tail, primel)
    case _ => primes(acc.tail, acc.head ::primel)
  }
  primes(acc,List(2)).reverse
}
//Test
twinprimeslist(35)

//Goldbach's Conjecture
def goldbach (n: Int): Unit = {
  ((n > 2) && (n % 2 == 0)) match{
    case true => {
      var a: Int = 0
      var b: Int = n
      helper(n, a, b)
    }
    case false => println("Integer must be above 2 and positive")
  }
}
def helper(n: Int, a: Int, b: Int): Unit = {
  (((prime(b)) && (prime(a))), (!(a + b ==n ))) match {
    case (true, true) => {
      var one = a + 1
      var two = b - 1
      helper(n, one, two)
    }
    case (true, false) => println("Returns: "+ a +" + " + b +" = " + n)
    case (false, _ ) => {
      var one = a + 1
      var two = b - 1
      helper(n, one, two)
    }
  }
}
//Test
goldbach(28)
goldbach(50)
goldbach(2)