public class constructor {
    int a ;
    String name ;
    constructor(int a ,String name){
        this.a=a;
        this.name=name;
        System.out.println("Name ="+" " + name);
        System.out.println("A ="+" " + a);
//        System.out.println(  a +". IDEA HAI MERE PASS ");
    }
}
class Cons{
    public static void main (String[] args){
//        constructor c1 = new constructor(1);
//        constructor c2 = new constructor(2);
//        constructor c3 = new constructor(3);
        constructor c4 = new constructor(112,"ZENITSU");

    }
}
