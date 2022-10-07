This program is to convert the roman numbers into integer, in which we are taking roman numbers as string
and then convert each char(roman number) into integer.
There is also a concept in roman numbers like for example in roman numbers:
V=5
but 
IV=4
so for this i have also checked the condition that the next number is big or not if it is we have to subtract the previous roman number

TEST CASE 1:
INPUT:
Enter the Roman Numbers:
IVXL

OUTPUT:
The corresponding Integer value is: 34

TEST CASE 2:
INPUT:
Enter the Roman Numbers:
AB

OUTPUT:
The corresponding Integer value is: -2
IF TAKING STRINGS WHICH ARE NOT ROMAN NUMBERS WILL RETURN -1 SO IN THIS CASE AS WE TOOK A AND B , BOTH  ARE NOT ROMAN NUMBERS SO -2 WAS RETURNED.

TEST CASE 3:
INPUT:
Enter the Roman Numbers:


OUTPUT:
The corresponding Integer value is: 0
IF TAKING NULL INPUT IT WILL RETURN 0 AS INPUT AS WE HAVE NOT GIVEN CONDITION FOR NULL AS -1.
