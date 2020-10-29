//Sanakirjatiedostolistat english ja finnish 
//ja niiden vertailu smojen sanojen etsiminen
from time import time

english_words = open("english.txt").readlines()
finnish_words = set(open("finnish.txt").readlines())

counter = 0
startTime = time()
for word in english_words:
    if word in finnish_words:
        print(word.strip())
        counter += 1
endTime = time()

print("Sanoja yhteensä:", counter)
print("Aikaa kului:", endTime-startTime/1e9, "s.")
