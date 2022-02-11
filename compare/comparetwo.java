package compare;

import java.util.Scanner;

public class comparetwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(compare(n,n2));
    }

    public static int compare(int n,int m) {
        if(n>m)
            return n;
        else
            return m;
    }
}
