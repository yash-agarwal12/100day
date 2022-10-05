Keep on iterating outer for loop and set the flag to 0
In the inner for loop iterate through string2
If any element of string2 matches the corresponding character of string1 then set the flag to 1
After completion of the inner for loop, if the flag is not equal to 1 
that means string1 character is not present in string2 then add that character to the resulting string.
Return the resulting string after the iteration of loops is completed.

Test Case1:
Input: String stri1 = "abcdef"
       String stri2 = "cefz"
Output: abd
Explanation: The common characters in both strings are c, e, f.
So after removing these characters from string 1 we get string resulting string as abd.


Test Case2:
Input: String stri1 = "xyzpw"
       String stri2 = "lmno"
Output: xyzpw
Explanation: As there is no common character in both the strings, string 1 remains unchanged.


Test Case3:
Input: String stri1 = "AbCdEfacefB"
        String stri2 = "Abcd"
Output : Efef
Explanation: Used multiple upper case characters and lower case characters,
but used the function of string to convert all the characters of both strings in lowercase
so the common characters are a, b, c, d. Doesn't matter the case in which it is written.
So after removing these characters from string 1 we get string resulting string as Efef.
