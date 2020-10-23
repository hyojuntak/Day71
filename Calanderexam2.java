package JC.Day71;
//배열은 같은 타입의 나열이다. 배열은 new로 생성하는 동적 배열이 있고 new 없이 사용하는 정적배열이 있다. 

// 사용 방법은 동일하나 선언 방법 다르다. 동적 배열은 필요할때마다 다시 초기화 할 수 있고 정적은 초기화 할 수 없다. 

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {

    // static void printint(int [] a){
    //     for (int i = 0; i < a.length; i++) {
    //         System.out.print(a[i]+"\t");
    //     }
    // }
    public static void main(String[] args) {
    
        // int [] a;
        // a = new int[5];
        // a[0] = 2;
        // a[1] = 5;
        // a[2] = 3;
        // a[3] = 9;
        // a[4] = 8;

        // //동적
        // int [] b= new int[]{2,5,4,9,8};
        // //정적, 다시 대입 불가 
        // int [] c= {2,5,4,9,8};
        // int [] e = new int[5];

        // // for (int i : b) {
        // //     System.out.println(i);
            
        // // }
        // Arrays.fill(e, -1);
        // System.arraycopy(c,0,e,0,c.length);
        // Arrays.sort(e);
        // System.out.print(e);

        Date today = new Date();
        System.out.println(today);

        DateFormat format1 = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(format1.format(today));
       
        DateFormat format2 = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(format2.format(today));
        
        DateFormat format3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(format3.format(today));
        
        DateFormat format4 = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(format4.format(today));

        SimpleDateFormat dateform = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(dateform.format(today));

        SimpleDateFormat dateform1 = new SimpleDateFormat("MM월 dd일");
        System.out.println(dateform1.format(today));

        SimpleDateFormat dateform2 = new SimpleDateFormat("MM월 dd일 hh시 mm분 ss초");
        System.out.println(dateform2.format(today));
        
        SimpleDateFormat dateform3 = new SimpleDateFormat("yy -- mm - dd");
        System.out.println(dateform3.format(today));

    }
}
