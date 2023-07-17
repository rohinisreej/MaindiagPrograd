import java .util.Scanner;
class Maindig{
    public static void maindig(int[][] array,int N)
    {
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum+=array[i][i];
            //System.out.println(sum);
        }
        System.out.println(sum);
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=scanner.nextInt();

        System.out.println("Enter the values: ");
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        Maindig md=new Maindig();
        md.maindig(arr,n);

    }
}