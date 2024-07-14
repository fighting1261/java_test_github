import java.util.Scanner;
public class test {
    public static void main(String[] args)
    {
        Scanner myscanner=new Scanner(System.in);
        int a=myscanner.nextInt();
        int arr [][]=new int[a][a];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0)
                    arr[i][j]=1;
                else
                {
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                }
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
