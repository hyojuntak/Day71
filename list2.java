package JC.Day71;
//날짜 관련된 날짜 문자를 저장하려면 문자열 배열을 사용한다.
//모든 동적배열 다시 초기화 가능하고 정적 배열은 다시 초기화가 불가능하다. 


public class Main {

    static void print(String [] tos){
        for (String ss : tos) {
            System.out.print(ss+"\t");
        }
    }
    public static void main(String[] args) {
        
        String [] mynum = new String[]{"2016-08-17","2016-09-17","2016-03-17"};
        String [] mynum2 = {"2016-08-17","2016-09-17","2016-03-17"};
        // System.out.println(mynum2[0]);

        print(mynum);
        System.out.println();
        print(mynum2);
        System.out.println();


        mynum = new String[]{"2016-08-17","2016-09-17","2016-03-17","2016-04-17"};

        print(mynum);
    }
}
