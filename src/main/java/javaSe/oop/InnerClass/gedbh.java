package javaSe.oop.InnerClass;

public class gedbh {
    public static void main(String[] args) {
        gedbh(14, new gdbh() {
            @Override
            public boolean iszs(int num) {
                for (int i = 2; i <num ; i++) {
                    if(num%i==0){
                        return false;
                    }
                }
                return true;
            }
        });
    }

    public static void gedbh(int num, gdbh gdbh){
        if(num<6||num%2!=0){
            System.out.println("传入参数不合法");
            return;
        }
        for (int i = 2; i <=num/2 ; i++) {
            if(gdbh.iszs(i)&& gdbh.iszs(num-i)){
                System.out.println(num+"="+i+"+"+(num-i) );
            }
        }
    }
}
