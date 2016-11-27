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
def twinprimeslist (n: Int): List[Int]= ???



//Goldbach's Conjecture
def goldbach = ???

