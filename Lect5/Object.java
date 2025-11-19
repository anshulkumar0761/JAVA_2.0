public class Object {
    int a = 5;
    //                                      instant variable
    static int c = 4 ;
    //                                      static variable
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println("Value of a : " + obj.a);
        int b = 8 ;
//                                           local variable
        System.out.println("value of b : " +  b);
        System.out.println("Value of c : " + c);
    }
}