package JC.Day71;

//Math 클래스는 수학 연산에 관련된 매서드를 제공한다. 
//java.lang.* 모든 매서드는 static 
//메서드이기 때문에 객체 생성 없이 사용한다.

public class Main {
    public static void main(String[] args) {
    
        System.out.println("1 : 자연로그 E"+Math.E);
        System.out.println("2 : 원주율 PI"+Math.PI);
        System.out.println("3 : 절대값 "+Math.abs(-1));
        
        System.out.println("4 : 올림 "+Math.ceil(4.34));
        System.out.println("5 : 반올림 "+Math.round(4.5));
        System.out.println("6 : 버림 "+Math.floor(4.34));

        System.out.println("7 : 최대값 "+Math.max(3,4));
        System.out.println("8 : 최솟값 "+Math.min(3,4));
        
        System.out.println("9 : 승 "+Math.pow(2,2));
        System.out.println("10 : 로그 "+Math.log(30));

        System.out.println("11 : 제곱근 "+Math.sqrt(2));
        System.out.println("12 : 무작위수 "+Math.rint(10));
        






    }
}
