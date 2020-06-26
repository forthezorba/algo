import java.util.Scanner;

public class ArraySwap {

    static void swap(final int[] a,final int x,final int y){
        final int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }
    static void reverse(final int[] a){
        for(int i=0; i< a.length/2; i++){
            swap(a,i,a.length-i-1);
        }
    }


    public static void main(final String[] agrs){
        final Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수 : ");
        final int num = stdIn.nextInt();

        final int[] x = new int[num];

        for(int i=0; i<num; i++){
            System.out.print("x["+i+"] : ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);
        for(int i=0; i<num; i++){
            System.out.print("x[" +i+ "] = "+x[i]+" ");
        }
    }
}