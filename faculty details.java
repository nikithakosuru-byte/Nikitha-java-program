
import java.util.Scanner;
class Student{
    public static void main(String[] args){
        String studentname;
         String studentrollnumber;
         String studentfees;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student is  name");
        studentname =sc.nextLine();
        System.out.println("enter student is  roll number");
        studentrollnumber =sc.nextLine();
        System.out.println("enter student is  fees");
        studentfees =sc.nextLine();
        System.out.println("student name is " +studentname);
        System.out.println("student rollnumber is "+studentrollnumber);
        System.out.println("student rollnumber is "+studentfees);
        sc.close();
    }
}
class Faculity{
    public static void main(String[] args){
        String facultyname;
        String facultyexperience;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter faculty name ");
        facultyname=sc.nextLine();
        System.out.println("enter faculty experience ");
        facultyexperience=sc.nextLine();
    }
}