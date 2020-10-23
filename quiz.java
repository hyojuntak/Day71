package JC.Day71;


import java.util.Scanner;

public class algorism {

    // 1.ArrayList, D.P. 을이용해서(java),
    // 2.n번째피보나치수열값: ?
    // 3.n번째까지의피보나치수열개수: ?
    // 4.n번째까지의모든피보나치수열나열: [     ?      ]
    // 5.n번째까지의모든피보나치수열합계:

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("x을 입력하세요 : ");
        int x = sc.nextInt();
        
        int[]d = new int [x+1];
        
        d[0]=0;d[1]=1;d[2]=1;

        for (int i = 3; i <=x; i++) {
            d[i] = d[i-1] + d[i-2];
            
        }

        System.out.print("1. n번째 피보나치 수열의 값 : "+d[x-1]);
        System.out.println();
        
        System.out.print("2. n번째 피보나치 수열의 개수 : "+ x);
        System.out.println();
        
        System.out.print("3. n번째까지의모든피보나치수열나열 : ");
        
        for (int i = 0; i < x; i++) {
            System.out.print("d["+i+"]="+d[i]+" ");
        }
        System.out.println();
        
        
        System.out.print("4. n번째까지의모든피보나치수열합계:");
        int numsum = 0;
        for (int i = 0; i < x; i++) {numsum+=d[i];}
        System.out.print(numsum);
        

    }
}
