package lore;
public class ClaseTest {
    String b = "hola";
    static String a = "Lore";
    {
        a = "Leonardo";
        System.out.println(a);
    }

    public ClaseTest(){
        System.out.println(a);
    }

    //tipo acceso pkg, public private, default
     public static String test(){
        return "HOLA";
    }

   /* public static String test2 (){
        return test3();
    }*/

    public  String test3 (){
       return  test();
    }

    public static void main(String[] args) {
        ClaseTest t = new ClaseTest();
        System.out.println(t.test3());
    }

}


class Main {

    public static void main(String[] args) {
        String a = ClaseTest.a;
        System.out.println(a);
    }

}
