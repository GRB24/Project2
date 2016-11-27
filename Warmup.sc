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
//test
prime(5)
//Twin Primes
/*
def twinprimes (x: Int, y: Int): Boolean = {
  if (x == prime(x) && y== prime(y))
    return true
    if (diff2(x,y) == true)
      {
        return true
      }
  else
    return false
}
def diff2 (a: Int, b: Int): Boolean = {
  if (a-b==2 | b-a==2){
    return true
  }
  else {
    return false
  }
}
 */

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
twinprimes(3,5)

//Twin Primes List
def twinprimeslist (n: Int): List[Int]= {
//something
  print ("hi")
}



//Goldbach's Conjecture


