package workTest;


import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * 1、创建一个Product类，包含以下属性(id,name,price,info(产品说明),num(销量))   1分
 * 2、创建一个数组，保存8个Product对象存入数组中(数据模拟即可，无需键盘录入)  1分
 * 3、使用冒泡排序将数组中的Product对象按照价格进行降序排序     5分
 * 4、创建一个List集合，将刚才数组中的元素放入到集合中   2分
 * 5、将list集合中的数据使用三种方式输出在控制台 3分
 * 6、搜索整个d盘是否有product.txt文件(考虑子文件夹)，如果没有在D盘根目录下创建这个文件 5分
 * 7、使用随机数随机获取List集合中的5个对象。4分
 * 8、将上面的随机到的对象存入到product.txt中   4分
 */

public class ProductDemo {
    public static void main(String[] args) throws Exception {
        //创建一个数组，保存8个Product对象存入数组中
        Product[] arr = createArr();
        //使用冒泡排序将数组中的Product对象按照价格进行降序排序
        Product[] products = BubbleSort(arr);
        //创建一个List集合，将刚才数组中的元素放入到集合中
        ArrayList<Product> list = createList(products);
        //将list集合中的数据使用三种方式输出在控制台
        printList(list);
        //使用随机数随机获取List集合中的5个对象
        ArrayList<Product> indexProduct = getProductList(list);
        //搜索整个d盘是否有product.txt文件(考虑子文件夹)，如果没有在D盘根目录下创建这个文件5分
        FindFile.Read();
        //将上面的随机到的对象存入到product.txt中
        productStream(indexProduct);
    }

    //题目2. 创建一个数组，保存8个Product对象存入数组中
    public static Product[] createArr() {
        Product[] p = new Product[8];
        p[0] = new Product(1, 1000, 500, "product1", "nice1");
        p[1] = new Product(2, 2000, 200, "product2", "nice2");
        p[2] = new Product(3, 3000, 300, "product3", "nice3");
        p[3] = new Product(4, 4000, 400, "product4", "nice4");
        p[4] = new Product(5, 5000, 700, "product5", "nice5");
        p[5] = new Product(6, 6000, 600, "product6", "nice6");
        p[6] = new Product(7, 7000, 100, "product7", "nice7");
        p[7] = new Product(8, 8000, 800, "product8", "nice8");
        return p;
    }

    //题目3. 静态公开BubbleSort方法给数组按照价格排序
    public static Product[] BubbleSort(Product[] p) {
        Product temp = null;
        for (int j = 0; j < p.length - 1; j++) {
            for (int i = 0; i < p.length - 1 - j; i++) {
                if (p[i].price < p[i + 1].price) {   //按照价格排序
                    temp = p[i];
                    p[i] = p[i + 1];
                    p[i + 1] = temp;
                }
            }
        }
        return p;
    }

    //题目4. 创建一个List集合，将刚才数组中的元素放入到集合中
    public static ArrayList<Product> createList(Product[] p) {
        ArrayList<Product> proList = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            proList.add(p[i]);
        }
        return proList;
    }

    //题目5. 将集合里面的数据使用三种方法打印出来
    public static void printList(ArrayList<Product> pro) {
        //方式1.for循环输出集合内容
        System.out.println("方式1：");
        for (int i = 0; i < pro.size(); i++) {
            System.out.println(pro.get(i));
        }
        System.out.println("=================================================================");
        System.out.println("方式2：");
        //方式2.forEach循环输出集合内容
        for (Object product : pro) {
            System.out.println(product.toString());
        }
        System.out.println("==================================================================");
        System.out.println("方式3：");
        //方式3.迭代器输出集合内容
        Iterator<Product> it = pro.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //方式4.
        System.out.println("==================================================================");
        System.out.println("方式4：");
        pro.forEach(System.out::println);
    }

    //题目7. 使用随机数获取集合的5个对象
    public static ArrayList<Product> getProductList(ArrayList<Product> pro) {
        System.out.println("==================================================================");
        ArrayList<Product> indexProduct = new ArrayList<>();
        Random ra = new Random();
        //count为记录输出了几个对象的值
        int count = 0;
        //设置一个初始值全部为0的长度为10的数组
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = 0;
        }
        while (count != 5) {
            int index = ra.nextInt(pro.size());
            if (arr[index] == 0) {
                indexProduct.add(pro.get(index));
                count++;
            }
            arr[index] = 1;   //每次输出了index位置的对象，就把对应的数组值改为1，以防下一次又输出同样的对象
        }
        System.out.println("查询的5个对象存入成功，下面输出验证一下：");
        for (int i = 0; i < 5; i++) {
            System.out.println(indexProduct.get(i));
        }
        return indexProduct;
    }

    //题目8. 将取到的对象存放在product.txt文件中
    public static void productStream(ArrayList<Product> proList) throws Exception {
        FileOutputStream fos = new FileOutputStream("d:\\product.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        int count = 0;
        while(count!=5){
            oos.writeObject(proList.get(count));
            count++;
        }
        count = 0;
        oos.close();
        fos.close();
        System.out.println("序列化对象存入成功，我们进行输出反序列化验证一下：");

        FileInputStream fis = new FileInputStream("d:\\product.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        while(count!=5){
            System.out.println(ois.readObject());
            count++;
        }
        System.out.println("文件中反序列化对象获取成功");
        ois.close();
        fos.close();
    }
}

//题目6. 搜索整个d盘是否有product.txt文件(考虑子文件夹)，如果没有在D盘根目录下创建这个文件 (5分)
class FindFile{
    private static int k = 0;//记录代码有没有启动，如果没有启动，就创建一个文件

    public static void Read() {
        //1.创建一个数组tempList，将获取D盘的一级目录的文件或者文件夹放进来
        File files = new File("d:\\");
        File[] tempList = files.listFiles();
        //2.循环tempList[i] 调用getFileName方法，将第一个文件或者文件夹的名字通过toString方法转化成一个字符串作为参数传入
        for (int i = 0; i < tempList.length; i++) {
            getFileName(tempList[i].toString());
        }
        if (k == 0) {                                      //如果k=0,就说明D盘没有product.txt文件
            File fil = new File("d:\\product.txt");
            try {
                fil.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("product.txt文件创建成功！");
        }
    }

    public static void getFileName(String str) {
        File file = new File(str);   //str其实就是tempL[i]相对应的 pathname 路径名
        if (file.isFile()) {  //如果file是一个标准文件就直接获取它的名称
            if (file.getName().equals("product.txt")) {
                System.out.println("D盘有product.txt文件,不需要创建");
                k = 1;   //当D盘有product.txt文件时，就令k=1
            }
        }else if (file.isDirectory()) { // file如果是文件夹，就继续查询它的下一级目录
            File[] tempList = file.listFiles(); // 获得子文件
            if (tempList != null) {
                for (File file2 : tempList) {      // 递归
                    if (!file2.isHidden()) {  // 判断是否是隐藏文件夹
                        getFileName(file2.toString());
                    }
                }
            }
        }
    }
}

class Product implements Serializable {
     private int id;
     private int sum;
     public int price;
     public String name;
     public String info;

     public Product(int id, int sum, int price, String name, String info) {
         this.id = id;
         this.sum = sum;
         this.price = price;
         this.name = name;
         this.info = info;
     }

     public Product() {}

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public int getSum() {
         return sum;
     }

     public void setSum(int sum) {
         this.sum = sum;
     }

     @Override
     public String toString() {
         return "Product{" +
                 "id=" + id +
                 ", sum=" + sum +
                 ", price=" + price +
                 ", name='" + name + '\'' +
                 ", info='" + info + '\'' +
                 '}';
     }
 }

