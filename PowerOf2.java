import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        /*
        * As Given, The Given number range will the max integer value. And we know the range of integer value is
        * 2^31 = 2^31-1
        * So we will simply loop through till the 30 because last value is with -1 i.e. 2^31-1
        * time Complexity of the solution is : O(n^2)
        * */

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=0; i<=30; i++) {
            int value = (int) Math.pow(2, i);
            if (value == number){
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");

//        Optimized Approach
//        We will consider the previous calculated answer because 2^1 = 2, 2^2 = 2^1 * 2;
//        So here we already multiplied somewhere that value of 2^1 so here we will use that.
        int ans = 1;
        for(int i=0; i<=30; i++) {
            if(ans == number) {
                System.out.println("Found");
                return;
            }
            if(ans < Integer.MAX_VALUE / 2) {
                ans = ans * 2;
            }

        }
        System.out.println("Not Found");
    }
}
