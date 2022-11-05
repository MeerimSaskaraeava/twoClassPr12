import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input address: ");

        Apartment apartment1=new Apartment();
        apartment1.setTitle("Elita house");
        apartment1.setAddress("B1");
        apartment1.setPrice(10000);

        Apartment apartment2=new Apartment();
        apartment2.setTitle("Elizavetta");
        apartment2.setAddress("B2");
        apartment2.setPrice(20000);

        Student student=new Student();

        Student student1=new Student();
        student1.setFullName("Azamat Ibraimov");
        student1.setAddress("B1");
        student1.setPhoneNumber(700700111);
        student1.setBankAccount(6000);

        Student student2=new Student();
        student2.setFullName("Rustam Mamytov");
        student2.setAddress("B1");
        student2.setPhoneNumber(700700222);
        student2.setBankAccount(8000);

        Student student3=new Student();
        student3.setFullName("Asel Yrakunova");
        student3.setAddress("B1");
        student3.setPhoneNumber(700700444);
        student3.setBankAccount(10000);

        Student student4=new Student();
        student4.setFullName("Ulan Ulanov");
        student4.setAddress("B2");
        student4.setPhoneNumber(700700555);
        student4.setBankAccount(3000);

        Student student5=new Student();
        student5.setFullName("Emir Kahanov");
        student5.setAddress("B2");
        student5.setPhoneNumber(700700666);
        student5.setBankAccount(7000);

        Student student6=new Student();
        student6.setFullName("Indira Osmonova");
        student6.setAddress("B2");
        student6.setPhoneNumber(700700777);
        student6.setBankAccount(8500);

        Apartment[] apartments={apartment1,apartment2};
        Student[] students={student1,student2,student3,student4,student5,student6};


        String address= scanner.nextLine();

        double sum=liveWhere(address, students);
        double rent1=apartment1.payPerMonth((sum));
        double rent2=apartment2.payPerMonth((sum));

        if (students[0].getAddress().equals("B1")) {
            student1.liveIn2((int) rent1);
            System.out.println("To pay: "+apartment1.payPerMonth((sum)));
        } else if (students[0].getAddress().equals("B2")) {
            student1.liveIn2((int) rent2);
            System.out.println("To pay: "+apartment2.payPerMonth((sum)));
        }if (students[1].getAddress().equals("B1")) {
            student2.liveIn2((int) rent1);
            System.out.println("To pay: "+apartment1.payPerMonth((sum)));
        } else if (students[1].getAddress().equals("B2")) {
            student2.liveIn2((int) rent2);
            System.out.println("To pay: "+apartment2.payPerMonth((sum)));
        }if (students[2].getAddress().equals("B1")) {
            student3.liveIn2((int) rent1);
            System.out.println("To pay: "+apartment1.payPerMonth((sum)));
        } else if (students[2].getAddress().equals("B2")) {
            student3.liveIn2((int) rent2);
            System.out.println("To pay: "+apartment2.payPerMonth((sum)));
        }if (students[3].getAddress().equals("B1")) {
            student4.liveIn2((int) rent1);
            System.out.println("To pay: "+apartment1.payPerMonth((sum)));
        } else if (students[3].getAddress().equals("B2")) {
            student4.liveIn2((int) rent2);
            System.out.println("To pay: "+apartment2.payPerMonth((sum)));
        }if (students[4].getAddress().equals("B1")) {
            student5.liveIn2((int) rent1);
            System.out.println("To pay: "+apartment1.payPerMonth(((int)sum)));
        } else if (students[4].getAddress().equals("B2")) {
            student5.liveIn2((int) rent2);
            System.out.println("To pay: "+apartment2.payPerMonth(((int)sum)));
        }if (students[5].getAddress().equals("B1")) {
            student6.liveIn2((int) rent1);
            System.out.println("To pay: "+apartment1.payPerMonth(((int)sum)));
        } else if (students[5].getAddress().equals("B2")) {
            student6.liveIn2((int) rent2);
            System.out.println("To pay: "+apartment2.payPerMonth(((int)sum)));
        }

        student.changeInfo(new Student[]{student1, student2, student3, student4, student5, student6});


    }
    public static int liveWhere(String address, Student[]students) {
        int counter = 0;
        for (Student st : students) {
            if (st.getAddress().equals(address)) {
                System.out.println(Arrays.toString(new String[]{st.getFullName()}));
                counter++;


            }
        }
        System.out.println("[" + counter + "]--students live here");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    return counter;

}}



