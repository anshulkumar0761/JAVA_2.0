class Car{
    static String name = "hello";
     void sum (){
        System.out.println(name);
    }
}
class bmw {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.sum();;
    }
}