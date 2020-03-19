def main():
    str = input("Enter the String :")
    palindrome(str)

def reverse(string):
    str = ""
    for i in string:
        str = i + str
    return str

def palindrome(string):
    str = reverse(string)
    if str == string:
        print("String is Palindrome.")
    else:
        print("String is not Palindrome.")

if __name__ == "__main__":
    main()
