public class StringBuild {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("ello") ;
        str.insert(2,"Hi");
        System.out.println(str);
//       append
        str.append("world");
        System.out.println(str);
//       replace
        str.replace(1,4,"llo");
        System.out.println(str);
//        delete
        str.delete(0,1);
        System.out.println(str);
//        reverse
        str.reverse();
        System.out.println(str);
    }
}
