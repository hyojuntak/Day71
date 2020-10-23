package JC.Day71;


public class Main {
// new int[4][3] 4*3으로 12개의 저장 공간을 확보한다.
// new int[3][] 3행에 대한 열의 개수가 정해지지 않았다. 이런 형태의 배열을 지그재그 배열 
// 배열 a의 경우에는 처음 12개로 고정이 되어 결정이 되지만 b와 같은 지그재그 배열은 필요에 따라 결정할 수 있다.

    static void println(int [][] p){
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                System.out.print("["+p[i][j]+"]");
            }        
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] a = new int [4][3];
        a[0][0] = 1;
        a[0][1] = 2;
        println(a);

        int [][] b = new int [3][];
        b[0] = new int[4];
        b[1] = new int[5];
        b[2] = new int[6];
        System.out.println();
        println(b);
        int [][]c = new int[][]{{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,0}};
        System.out.println();
        println(c);

        int [][] d = {{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,10}};
        System.out.println();
        println(d);

        int[][] e = new int[c.length][c[0].length];
        for (int i = 0; i < c.length; i++) {
            System.arraycopy(c[i], 0, e[i], 0, e[i].length);
        }
        // 배열에 배열이므로 1차원 배열을 복사하는 System.arraycopy()를 이용해서 복사한다. 

        System.out.println();
        println(e);


    }
}
