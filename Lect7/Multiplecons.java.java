package Lect7 ;
//                           MULTIPLE CONSTRUCTOR
class Bus {
    public Bus(){
        this(5);
        System.out.println("1st constructor called :: Hello!!!");
    }
    public Bus(int a){
        this(3,2);
        System.out.println("2nd constructor called :: " + a);
    }
    public Bus(int a , int b){
        System.out.println("3rd constructor called :: " + "Lalu" + " Bus " + a);
    }

}
public class Hello {
    public static void main(String[] args){
        Bus B1 = new Bus();
//        Bus B2 = new Bus(5);
//        Bus B3 = new Bus(5,3);
    }
}
