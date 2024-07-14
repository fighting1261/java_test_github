import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int a = myscanner.nextInt();
        //空心金字塔
        for (int i = 1; i <=a;i++)
        {
            if(i==1||i==a)
            {
                for(int j=0;j<a-i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<2*i-1;j++)
                    System.out.print("*");
                System.out.println();
            }
            else {
                for (int j = 0; j < a - i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
