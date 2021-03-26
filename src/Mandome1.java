

public class Mandome1 {
    static String name = "消失";
    static int age = 19;

    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println(i);
        }
//        System.out.println("Hello World");
//        System.out.println("我是分支2");
//        System.out.println("我是分支3");
//        System.out.println("666");
//        Mandome1.test();

    }


    public static void test() {
        System.out.println("" + name + "..." + age);
    }
}
