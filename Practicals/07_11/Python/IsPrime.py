import math


def main():
    number = int(input("Enter number : "))
    result  = IsPrime(number)

    if result:
        print(number, "is Prime.")
    else:
        print(number, " is not Prime number")

def IsPrime(number):
    isPrime = True
    for i in range(2, math.ceil(math.sqrt(number))):
        if(number % i) == 0:
            isPrime = False
    return isPrime

if __name__ == "__main__":
    main()
