package Chapter4;

import java.util.Scanner;

public class TheTwelveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("click 1 to 12 to select Day ");
/*
            int userInput = input.nextInt();
            switch (userInput) {
                case 1:

            }
            System.out.println("""
                    12 Days Of Christmas
                    1-> Day1    2-> Day2
                    3-> Day3    4-> Day4
                    5-> Day5    6-> Day6
                    7-> Day7    8-> Day8
                    9-> Day9    10-> Day10
                    11-> Day11  12-> Day12
                                            """);
            System.out.println(" select Day ");*/
            int userInput1 = input.nextInt();
            switch (userInput1) {
                case 1 -> System.out.println("""
                        Day One:
                        On the first day of Christmas
                        My true love gave to me
                        A partridge in a pear tree.
                        """);
                case 2 -> System.out.println("""
                        Day Two;
                        On the second day of Christmas
                        My true love gave to me
                        Two turtle doves
                        And a partridge in a pear tree.
                        """);
                case 3 -> System.out.println("""
                                              
                         Day Three:
                        On the third day of Christmas
                        My true love gave to me
                        Three French hens,
                        Two turtle doves
                        And a partridge in a pear tree.
                         """);
                case 4 -> System.out.println("""
                        Day Four:
                        On the fourth day of Christmas
                        My true love gave to me
                        Four calling birds,
                        Three French hens,
                        Two turtle doves
                        And a partridge in a pear tree.
                        """);
                case 5 -> System.out.println("""
                        Day Five:
                        On the fifth day of Christmas
                        My true love gave to me
                        Five golden rings,
                        Four calling birds,
                        Three French hens,
                        Two turtle doves
                        And a partridge in a pear tree.
                        """);
                case 6 -> System.out.println("""
                        Day Six:
                        On the sixth day of Christmas
                        My true love gave to me
                        Six geese a-laying,
                        Five golden rings,
                        Four calling birds,
                        Three French hens,
                        Two turtle doves
                        And a partridge in a pear tree.
                        """);
                case 7 -> System.out.println("""
                        Day Seven:
                        On the seventh day of Christmas
                        My true love gave to me
                        Seven swans a-swimming,
                        Six geese a-laying,
                        Five golden rings,
                        Four calling birds,
                        Three French hens,
                        Two turtle doves
                        And a partridge in a pear tree.
                        """);
                case 8 -> System.out.println("""
                        Day Eight:
                         On the eighth day of Christmas
                         My true love gave to me
                         Eight maids a-milking,
                         Seven swans a-swimming,
                         Six geese a-laying,
                         Five golden rings,
                         Four calling birds,
                         Three French hens,
                         Two turtle doves
                         And a partridge in a pear tree                 
                         """);
                case 9 -> System.out.println("""
                        Day Nine:
                        On the ninth day of Christmas
                        My true love gave to me
                        Nine ladies dancing,
                        Eight maids a-milking,
                        Seven swans a-swimming,
                        Six geese a-laying,
                        Five golden rings,
                        Four calling birds,
                        Three French hens,
                        Two turtle doves
                        And a partridge in a pear tree.
                                                
                        """);
                case 10 -> System.out.println("""
                        Day Ten:
                        On the tenth day of Christmas
                        My true love gave to me
                        Ten lords a-leaping,
                        Nine ladies dancing,
                        Eight maids a-milking,
                        Seven swans a-swimming,
                        Six geese a-laying,
                        Five golden rings,
                        Four calling birds,
                        Three French hens,
                        Two turtle doves
                        And a partridge in a pear tree.
                        """);
                case 11 -> System.out.println("""
                        Day Eleven:
                        On the eleventh day of Christmas
                        My true love gave to me
                        Eleven pipers piping,
                        Ten lords a-leaping,
                        Nine ladies dancing,
                        Eight maids a-milking,
                        Seven swans a-swimming,
                        Six geese a-laying,
                        Five golden rings,
                        Four calling birds,
                        Three French hens,
                        Two turtle doves
                        And a partridge in a pear tree.
                        """);
                case 12 -> System.out.println("""
                        Day Twelve:
                        On the twelfth day of Christmas
                        My true love gave to me
                                                
                        Twelve drummers drumming,
                        Eleven pipers piping,
                        Ten lords a-leaping,
                        Nine ladies dancing,
                        Eight maids a-milking,
                        Seven swans a-swimming,
                        Six geese a-laying,
                        Five golden rings,
                        Four calling birds,
                        Three French hens,
                        Two turtle doves
                        And a partridge in a pear tree.
                        """);
                default -> System.out.println(" sorry you entered a wrong command try again");
            }

        }
    }
}