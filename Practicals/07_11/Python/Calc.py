
class Calc():
    def __init__(self):
        __answer = 0

    def setAnswer(self, x):
        self.__answer = x
    def getAnswer(self):
        return self.__answer

    def add(self, num1, num2):
        self.__answer = num1 + num2
    def sub(self,num1, num2):
        self.__answer = num1 - num2
    def mul(self, num1, num2):
        self.__answer = num1 * num2
    def div(self, num1, num2):
        self.__answer = num1 / num2

def main():
    num1 = int(input("Enter first number  : "))
    num2 = int(input("Enter second number : "))


    print("\t1. Addition \n\t2.Subtraction \n\t3.Multiplication \n\t4.Division")
    ch = input("Enter your choice : ")

    obj = Calc()

    if ch == '1':
        obj.add(num1, num2)
    elif ch == '2':
        obj.sub(num1, num2)
    elif ch == '3':
        obj.mul(num1, num2)
    elif ch == '4':
        obj.div(num1, num2)
    else:
        print("Invalid Choice.")

    print("answer is : ", obj.getAnswer())

if __name__ == "__main__":
    main()
