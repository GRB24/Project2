//Prime Numbers
//return boolean if number is prime

def prime (n : Int): Boolean = {
  if (n < 1)
    return false
  else{
    primeFind(n, 2)
  }
}

def primeFind (n: Int, divisor: Int): Boolean ={
  if(divisor > scala.math.sqrt(n))
    return true
  else if (n % divisor == 0 )
    return false
  else
    return primeFind(n,divisor + 1)
}
//test
prime(7)


//Twin Primes
def twinprimes (x: Int, y: Int): Boolean ={
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

twinprimes(5,7)

//Twin Primes List
def twinprimeslist (n: Int): List[Int]= {

}



//Goldbach's Conjecture


