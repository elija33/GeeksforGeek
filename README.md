# GeeksforGeek

                            Palindrom a Number
        Revers = Remainder# * 10 + Remainder#
Giving a N number find find out if the giving number is a palindrom or not.
    Giving number mod 10 ==>> 121 % 10 = 12 remainder 1
    Take the modanswer "not the remainder" and do the first step againg ===>> 12 % 10 = 1 remainder 2
    Repeat Step the fist step on the modalanswer  ===>> 1 % 10 = 0 remainder 1
    The remaindersare your final answer in this casw 121 which means yes the given number is a pailidrom.

    

                                Example 1
    GiverNumber         WorkingNumber             Remainder                        ReversNumber (ReverseNumber * 10 + R)
    121                 121 % 10 = 12 r 1              1                                (0 * 10) + 1 = 1
    12                  12 % 10 = 1 r 2                2                                (1 * 10) + 2 = 12
    1                   1 % 10 = 0 r 1                 1                                (12 * 10) + 1 = 121 


                        Idea: Traverse Digits From Right To Left to find the reverse of given number
                                Example 2
            Given number is 777
            reverseNumber * 10 + r
            (0 * 10) + 7 = 7
            (7 * 10) + 7 = 77
            (77 * 10) + 7 = 77


                    Pseudo code for Palindrom Numbers 
number = "the giving number"        //you fist initialize the given #s
Temp = "number"                     //you create a temp valu to hold the give # becaause do't want to change the original#
while(Temp != 0){                   //loop to check if the temporary valuable is noent equal to 0 
Remainder = Temp % 10;              //Take the Temp valuable mod it by 10.
Revere = Reverse*10 + Remainder#    //(ReverseNumber * 10) + RemainderNumber
Temp = Temp / 10;                   // Excluding the last number from the temp valuable.
}
If(Number == Reverse){              // Checking if the given number is equal to the reverse number.
    Palinrome
}


                                    Fatorial
When a n number is given, you ask to find the fatorial of the giving number.
Take the number
            
                Factorial of n
n! = n(n-1)*(n-2) * ...... * 1

                            Example of Fatorial
find the fatorial of 5 and 8
5! = 5 * 4 * 3 * 2 * 1
5! = 20 * 3 * 2 * 1
5! = 60 * 2 * 1
5! = 120 *1
5! = 120


8! = 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
8! = 56 * 6 * 5 * 4 * 3 * 2 * 1
8! = 336 * 5 * 4 * 3 * 2 * 1
8! = 1680 * 4 * 3 * 2 * 1
8! = 6720 * 3 * 2 * 1
8! = 20160 * 2 * 1
8! = 40320 * 1
8! = 40320


fcat = fact * i
where i is the given number
Let i = 5
 
 i        Fact = fact * i           fact
 5          1 * 5                       5
 4          5 * 4                       20
 3          20 * 3                      60
 2          60 * 2                      120
 1          120 * 1                     120

 Therefore the factorail of 5 is 120


                Trailing Zeros in factorial of N
Given an integer n, return the number of trailing zeroes in n!..

Note: Your solution should be in logarithmic time complexity.

Problem Constrains
1 <= n <= Intmax

Example Output
n = 5.

Example Output
1

Example Explanation
n! = 120
Number of trailing zeros = 1
so , return 1.


            Pseudo code for Trailing Zeros in Factorial
create a valuable and set it equla to 0;
int fact = 0;
Scanner num = new Scanner(SYstem.in)
int fat = num.nextInt();
for loop for(int i = 5; i<=fat; i=i*5){
    fact = fact + (fat / i);
}
    return fat;



                                HCF or GCD of two Numbers
 Using the Euclidean Algorithm, to find the HCF or GCD of two Number
let 'b' be smaller than 'a'.... gcd(a, b) = gcd(a - b, b)
you take the biggest number and divided it by the smallest number than you takes remainder
which will now be the samllest number now you divided the remainder into the bigest number.
                   
                    Example of HCF or GCD Using the Euclidea Algorithm
Given (1701, 3768)
 gcd = 3768 / 1701 = 2 r 366      ---->>>>  which r is the remainder 
 gcd = 1701 / 366 = 4 r 237
 gcd = 366 / 237 = 1 r 129
 gcd = 237 / 129 = 1 r 108
 gcd = 129 / 108 = 1 r 21
 gcd = 108 / 21 =  5 r 3
 gcd = 21 / 3 = 7 r 0
 gcd = 3
          
