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