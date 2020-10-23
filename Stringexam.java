package JC.Day71;



public class Main {
    public static void main(String[] args) {
    
        String text = " Hello Java ";
        String com = "Hello Java";

        System.out.println(text.charAt(2));
        System.out.println(text.concat("e"));
        System.out.println(text.contains("Jav"));
        System.out.println(text.contains("ee"));
        System.out.println(text.equals(com));
        System.out.println(text.indexOf("a"));
        System.out.println(text.indexOf("b"));
        System.out.println(text.lastIndexOf("e"));
        System.out.println(text.length());
        System.out.println(text =text.trim());
        System.out.println(text.length());
        System.out.println(text.replace(" ", "*"));
        System.out.println(text.strip());
        System.out.println(text.length());
        System.out.println(text.substring(5));
        System.out.println(text = text.toUpperCase());
        System.out.println(text = text.toLowerCase());
        System.out.println();
        
        String [] sp = text.split(" ");
        for (int i = 0; i < sp.length; i++) {
            System.out.println(sp[i]);
        }
        StringBuffer sd1 = new StringBuffer();
        sd1.append("안녕하세요").append(" 또 만나요!").append(" 안녕 ");
        System.out.println(sd1.toString()+sd1.hashCode());

        sd1.replace(0, 1, "나보기가 역겨워");
        System.out.println(sd1.toString()+sd1.hashCode());
        
        sd1.reverse();
        System.out.println(sd1.toString()+sd1.hashCode());

        StringBuffer sbu = new StringBuffer();
        sbu.append("I").append(" go").append(" to school.");
        System.out.println(sbu);
        sbu.replace(7, 10, "");
        System.out.println(sbu);
        sbu.reverse();
        System.out.println(sbu);
        sbu.deleteCharAt(3);
        System.out.println(sbu);
        sbu.delete(1, 3);
        System.out.println(sbu);
        String ss = sbu.substring(0);
        
        System.out.println(ss);
        System.out.println(sbu);
        String st = sbu.substring(0,4);
        System.out.println(st.hashCode());
        System.out.println(ss.hashCode());
        System.out.println(sbu.hashCode());
        System.out.println(st);
        System.out.println(sbu);


    }
}
