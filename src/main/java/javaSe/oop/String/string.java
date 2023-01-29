package javaSe.oop.String;

public class string {
    public static void main(String[] args) {
//        String str = "hello";
//        String str1;
//        str1 = str + "world";
//        System.out.println(str1);
        long startTime1 = System.currentTimeMillis();
        StringBuilder s1  = new StringBuilder();
        for (int i = 0; i <100000 ; i++) {
            s1.append("a");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1-startTime1);

        
        long startTime2 = System.currentTimeMillis();
        String s2  = "";
        for (int i = 0; i <100000 ; i++) {
            s2+="a";
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2-startTime2);
    }
}
