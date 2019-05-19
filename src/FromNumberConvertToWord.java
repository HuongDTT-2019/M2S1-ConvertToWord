import java.util.Scanner;

public class FromNumberConvertToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int hundred;
        int tens;
        int ones;
        hundred = number / 100;
        tens = (number - hundred * 100) / 10;
        ones = (number - hundred * 100) - (tens * 10);
        if (number >= 0 && number < 10) {
            String word = "";
            ones = number;
            switch (ones) {
                case 0:
                    word = "zero";
                    break;
                case 1:
                    word = "one";
                    break;
                case 2:
                    word = "two";
                    break;
                case 3:
                    word = "three";
                    break;
                case 4:
                    word = "four";
                    break;
                case 5:
                    word = "five";
                    break;
                case 6:
                    word = "six";
                    break;
                case 7:
                    word = "seven";
                    break;
                case 8:
                    word = "eight";
                    break;
                case 9:
                    word = "nine";
                    break;
            }
            System.out.println(number + " is " + word);
        } else if (number >= 10 && number < 20) {
            String word_ones = "";
            switch (ones) {
                case 0:
                    word_ones = "ten";
                    break;
                case 1:
                    word_ones = "eleven";
                    break;
                case 2:
                    word_ones = "twelve";
                    break;
                case 3:
                    word_ones = "thirteen";
                    break;
                case 4:
                    word_ones = "fourteen";
                    break;
                case 5:
                    word_ones = "fifteen";
                    break;
                case 6:
                    word_ones = "sixteen";
                    break;
                case 7:
                    word_ones = "seventeen";
                    break;
                case 8:
                    word_ones = "eighteen";
                    break;
                case 9:
                    word_ones = "nineteen";
                    break;
            }
            System.out.println(number + " is " + word_ones);

        } else if (number >= 20 && number < 100) {
            String word_tens = "";
            String word_ones = "";
            switch (tens) {
                case 2:
                    word_tens = "twenty";
                    break;
                case 3:
                    word_tens = "thirty";
                    break;
                case 4:
                    word_tens = "forty";
                    break;
                case 5:
                    word_tens = "fifty";
                    break;
                case 6:
                    word_tens = "sixty";
                    break;
                case 7:
                    word_tens = "seventy";
                    break;
                case 8:
                    word_tens = "eighty";
                    break;
                case 9:
                    word_tens = "ninety";
                    break;
            }
            switch (ones) {
                case 0:
                    word_ones = "";
                    break;
                case 1:
                    word_ones = "one";
                    break;
                case 2:
                    word_ones = "two";
                    break;
                case 3:
                    word_ones = "three";
                    break;
                case 4:
                    word_ones = "four";
                    break;
                case 5:
                    word_ones = "five";
                    break;
                case 6:
                    word_ones = "six";
                    break;
                case 7:
                    word_ones = "seven";
                    break;
                case 8:
                    word_ones = "eight";
                    break;
                case 9:
                    word_ones = "nine";
                    break;
            }
            System.out.printf("%d is %s %s", number, word_tens, word_ones);
        } else if (number >= 100 && number <= 999) {
            String word_hundred = "";
            String word_tens = "";
            String word_ones = "";
            switch (hundred) {
                case 1:
                    word_hundred = "one hundred ";
                    break;
                case 2:
                    word_hundred = "two hundred";
                    break;
                case 3:
                    word_hundred = "three hundred";
                    break;
                case 4:
                    word_hundred = "four hundred";
                    break;
                case 5:
                    word_hundred = "five hundred";
                    break;
                case 6:
                    word_hundred = "six hundred";
                    break;
                case 7:
                    word_hundred = "seven hundred";
                    break;
                case 8:
                    word_hundred = "eight hundred";
                    break;
                case 9:
                    word_hundred = "nine hundred";
                    break;
            }
            if (tens == 0 && ones == 0) {
                System.out.printf("%d is %s", number, word_hundred);
            }
            if (tens == 0 && ones > 0 && ones <= 9) {
                switch (ones) {
                    case 1:
                        word_ones = "one";
                        break;
                    case 2:
                        word_ones = "two";
                        break;
                    case 3:
                        word_ones = "three";
                        break;
                    case 4:
                        word_ones = "four";
                        break;
                    case 5:
                        word_ones = "five";
                        break;
                    case 6:
                        word_ones = "six";
                        break;
                    case 7:
                        word_ones = "seven";
                        break;
                    case 8:
                        word_ones = "eight";
                        break;
                    case 9:
                        word_ones = "nine";
                        break;
                }
                System.out.printf("%d is %s and %s", number, word_hundred, word_ones);
            }
            if (tens == 1 && ones >= 0 && ones <= 9) {
                switch (ones) {
                    case 0:
                        word_ones = "ten";
                        break;
                    case 1:
                        word_ones = "eleven";
                        break;
                    case 2:
                        word_ones = "twelve";
                        break;
                    case 3:
                        word_ones = "thirteen";
                        break;
                    case 4:
                        word_ones = "fourteen";
                        break;
                    case 5:
                        word_ones = "fifteen";
                        break;
                    case 6:
                        word_ones = "sixteen";
                        break;
                    case 7:
                        word_ones = "seventeen";
                        break;
                    case 8:
                        word_ones = "eighteen";
                        break;
                    case 9:
                        word_ones = "nineteen";
                        break;
                }
                System.out.printf("%d is %s %s", number, word_hundred, word_ones);
            }
            if (tens >= 2 && tens <= 9 && ones >= 0 && ones <= 9) {
                switch (tens) {
                    case 2:
                        word_tens = "twenty";
                        break;
                    case 3:
                        word_tens = "thirty";
                        break;
                    case 4:
                        word_tens = "forty";
                        break;
                    case 5:
                        word_tens = "fifty";
                        break;
                    case 6:
                        word_tens = "sixty";
                        break;
                    case 7:
                        word_tens = "seventy";
                        break;
                    case 8:
                        word_tens = "eighty";
                        break;
                    case 9:
                        word_tens = "ninety";
                        break;
                }
                switch (ones) {
                    case 1:
                        word_ones = "one";
                        break;
                    case 2:
                        word_ones = "two";
                        break;
                    case 3:
                        word_ones = "three";
                        break;
                    case 4:
                        word_ones = "four";
                        break;
                    case 5:
                        word_ones = "five";
                        break;
                    case 6:
                        word_ones = "six";
                        break;
                    case 7:
                        word_ones = "seven";
                        break;
                    case 8:
                        word_ones = "eight";
                        break;
                    case 9:
                        word_ones = "nine";
                        break;
                }
                System.out.printf("%d is %s %s %s", number, word_hundred, word_tens, word_ones);

            }
        }
    }
}
