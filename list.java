package JC.Day71;
//배열은 같은 타입의 나열이다. 배열은 new로 생성하는 동적 배열이 있고 new 없이 사용하는 정적배열이 있다. 
// 사용 방법은 동일하나 선언 방법 다르다. 동적 배열은 필요할때마다 다시 초기화 할 수 있고 정적은 초기화 할 수 없다. 

import java.util.Arrays;


public class Main {

    static void prtint(int [] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }
    public static void main(String[] args) {
    
        int [] a;
        a = new int[5];
        a[0] = 2;
        a[1] = 5;
        a[2] = 3;
        a[3] = 9;
        a[4] = 8;

        //동적
        int [] b= new int[]{2,5,4,9,8};
        //정적, 다시 대입 불가 
        int [] c= {2,5,4,9,8};
        int [] e = new int[5];

        // for (int i : b) {
        //     System.out.println(i);
            
        // }
        Arrays.fill(e, -1);
        System.arraycopy(c,0,e,0,c.length);
        Arrays.sort(e);
        System.out.print(e);

        


    }
}
