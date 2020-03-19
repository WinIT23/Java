def main():
    str = input("Enter your string : ")
    vowel = ""
    consonent = ""
    for ch in str:
        if ch in {'a','e','i','o','u','A','E','I','O','U'}:
            vowel = vowel + ch + " "
        elif ch == ' ':
            continue
        else:
            consonent = consonent + ch + " "

    print("Vowels     : ", vowel)
    print("Consonents : ", consonent)

if __name__ == '__main__':
    main()
