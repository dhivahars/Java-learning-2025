package PracticeCodes.firstWeek.basics;

public class JavaBasics {
    int a;
    static int b;
    {
        a=1;
        b=10;
    }
    void ex(){
        int a=10;
        byte b=(byte)a;
        System.out.println(b);
        System.out.println(a);
    }
    public static void main(String[] args) {
        JavaBasics jb=new JavaBasics();
        System.out.println("hi");
        System.out.println((jb.a)<<1);
        System.out.println(b);
        System.out.println(jb.b);
        jb.ex();
    }
}
