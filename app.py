def atbash(word):
    word_array =  list(word)
    for i in range(len(word_array)):
        word_array[i] = ord(word_array[i])

        if 65<=word_array[i]<=90:
            word_array[i] = 90 - (word_array[i] - 65)
        elif 97<=word_array[i]<=122:
            word_array[i] = 122 - (word_array[i] - 97)
        
        word_array[i] = chr(word_array[i])
    result = ''
    for i in range(len(word_array)):
        result += word_array[i]
    return result

print(atbash('apple'))
print(atbash('Hello world'))
print(atbash('Christmas is the 25th of December'))

