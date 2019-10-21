import java.util.*;
 class TestClass {
     static int gcd(int x,int y)
     {
        if(x==0||y==0)
        {
            return 0;
        }
        else if(y == x)
        {
            return x;
        }
        else if(x>y)
            return gcd(x-y,y);
        else 
            return gcd(x,y-x);

     }
     public static void main(String args[] ) throws Exception {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int arr[] = new int[n];
         int m = 1000000007;
         long f = 1;
         for(int i = 0;i<n;i++)
         {
            arr[i] = in.nextInt();
            f = f*arr[i];
            if (f>m)
            {
                f = f%m;
            }

         }
         //System.out.println(f);
         int g = arr[0];
         for(int i = 1;i<n;i++)
         {
           g = gcd(g,arr[i]);

         }

         //System.out.println(g);
         int ans =(int) Math.pow(f, g);
         //System.out.println(ans);
         //System.out.println(m);
         System.out.println((long)ans%m);
