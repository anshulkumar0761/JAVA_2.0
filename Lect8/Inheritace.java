
class Animal {
    void dance(){
        System.out.println(" tak dhina dhin ");
    }
}
class Girraf extends Animal {
    void vroom (){
        System.out.println(" vroom vroom ");
    }
}
class Dog extends Girraf{
    void eat (){
        System.out.println(" Burger ");
    }
}
public class Inheritace {
    public static void main (String[] args){
        Dog D1 = new Dog() ;
        D1.eat();
        D1.vroom();
        D1.dance();
    }
}
//