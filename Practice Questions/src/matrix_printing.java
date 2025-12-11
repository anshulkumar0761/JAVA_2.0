import java.util.Scanner;
class B {
    public static void main(String[] args) {
        int arr[][] =new int[3][3] ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Matrix");
      for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                arr[i][j] = s.nextInt() ;
            }
        }
        for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
