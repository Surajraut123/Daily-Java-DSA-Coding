import java.util.Scanner;

public class NumberConversions {

    public static void decimalToBinary(int number) {
        int ans = 0;
        int i=0;
        while(number != 0) {
            int bit = number & 1;
            ans = (bit * (int)Math.pow(10, i)) + ans;
            i++;
            number = number >>1;
        }
        System.out.println("Binary Number : " + ans);
    }
    public static void binaryToDecimal(int number) {
        int ans = 0;
        int i=0;
        while(number != 0) {
            int digit = number % 10;
            ans = (digit * (int)Math.pow(2, i)) + ans;
            i++;
            number = number / 10;
        }
        System.out.println("Decimal Number : " + ans);
    }
    public static void reverseNumber(int number) {
        int ans = 0;
        while(number != 0) {
            int digit = number %10;
            if((ans >Integer.MAX_VALUE/10) || (ans < Integer.MIN_VALUE/10)) {
                System.out.println("Out of Integer Range");
                return;
            }
            ans = digit + 10 * ans;
            number = number /10;
        }
        System.out.println("Reverse Number is : " + ans);
    }

    public static void getComplement(int number) {
        int temp = number;
        int mask=0;
        if(number == 0) {
            System.out.println("Given Number is 0");
            return;
        }
        while(temp != 0) {
            mask = (mask << 1) | 1;
            temp = temp >> 1;
        }

        int answer = (~number) & mask;
        System.out.println("Complement is : " + answer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Decimal to Binary Conversion");
        System.out.println("Enter Number : ");
        int decimalNumber = scanner.nextInt();

        decimalToBinary(decimalNumber);

        System.out.println("Binary to Decimal Conversion");
        System.out.println("Enter Number : ");
        int binaryNumber = scanner.nextInt();
        binaryToDecimal(binaryNumber);

        System.out.println("Reverse Integer");
        System.out.println("Enter the Number");

        int number = scanner.nextInt();
        reverseNumber(number);

        System.out.println("Enter the number to complement : ");
        int complement = scanner.nextInt();
        getComplement(complement);
    }
}
