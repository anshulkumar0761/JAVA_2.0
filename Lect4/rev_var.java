package Lect4 ;

public class rev_var {
    public static void main (String[] args){
        String s = "Hello my love " ;
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse());
            result.append(" ");
        }
        System.out.println(result);
    }
}