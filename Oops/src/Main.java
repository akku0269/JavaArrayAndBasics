
    class Student{
        int rollNo;
        String StudentName;
        }
    public class Main {

        public static void main(String args[]){
        Student obj1=new Student();
        Student obj2=new Student();
        obj1.rollNo =100;
        obj1.StudentName="Ram";
        obj2.rollNo=200;
        obj2.StudentName="Shyam";
        System.out.println(obj1.rollNo+" "+obj1.StudentName);
        System.out.println(obj2.rollNo+" "+obj2.StudentName);
        }
        }