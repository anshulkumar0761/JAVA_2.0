public class studentlist {
    String name ;
    int Rollno ;
    double marks ;
//    studentlist(String name, int Rollno, double marks) {
//        this.name = name;
//        this.Rollno = Rollno;
//        this.marks = marks;
//    }
    void displaydetails (){
        System.out.println("Name - " + name);
        System.out.println("Rollno - " + Rollno);
        System.out.println("Marks - " + marks);
        System.out.println("-----------------");
    }

    public static void main (String[] args){
        studentlist s1 = new studentlist();
        s1.name = "Tanjiro" ;
        s1.Rollno = 67 ;
        s1.marks = 37.6 ;
        studentlist s2 = new studentlist();
        s2.name = "Zenitsu" ;
        s2.Rollno = 63 ;
        s2.marks = 37.6 ;
        studentlist s3 = new studentlist();
        s3.name = "Inosuke" ;
        s3.Rollno = 34 ;
        s3.marks = 98.0 ;

        s1.displaydetails();
        s2.displaydetails();
        s3.displaydetails();

    }
}
