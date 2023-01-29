package javaDemo;

public class demo {
    public static void main(String[] args) {
        m();
        hihi.aa();
        int i= (11+3*7)/4%3;
        System.out.println(i);
        String s1=new String("pido");
        String s2=new String("online");
        String s3=new String("0");
        System.out.println(s3=s1+s2);
//        System.out.println(s3=s1&s2);
//        System.out.println(s3=s1||s2);
//        System.out.println(s3=s1&&s2);
        StringBuffer sb = new StringBuffer("Hello");
        String t = " MY";
        t = t + " FRIEND";
        sb.append(t);
        System.out.println(sb.toString().toLowerCase());
        String s = new String("phenobarbital");
        String p = "java";
        String s24 = s1.substring(3, s1.indexOf("p"));
        System.out.println(s);
        System.out.println(p);
    }

    static void m(){
        System.out.println(";;;");
    }
    class X{
        public String toString(){
            return super.toString();
        }
    }
}


