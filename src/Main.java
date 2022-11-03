import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write address: ");

        Apartment apartment1=new Apartment();
        apartment1.setTitle("Elita house");
        apartment1.setAddress("B1");
        apartment1.setPrice(10000);

        Apartment apartment2=new Apartment();
        apartment2.setTitle("Elizavetta");
        apartment2.setAddress("B2");
        apartment2.setPrice(20000);


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
        student5.setBankAccount(2000);

        Student student6=new Student();
        student6.setFullName("Indira Osmonova");
        student6.setAddress("B2");
        student6.setPhoneNumber(700700777);
        student6.setBankAccount(8500);

        Apartment[] apartments={apartment1,apartment2};
        Student[] students={student1,student2,student3,student4,student5,student6};


        String address= scanner.nextLine();

        for (Student bill:students) {
            if (address.equals("B1")) {
                System.out.println("Each student pays : " + apartment1.payPerMonth(liveWhere(address, students)));
                bill.liveIn((int) apartment1.payPerMonth(liveWhere(address, students)));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

            }else {System.out.println("Each student pays : "+apartment2.payPerMonth(liveWhere(address, students)));
                bill.liveIn((int) apartment2.payPerMonth(liveWhere(address, students)));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        }




    }}
    public static int liveWhere(String address, Student[]students){
        int counter=0;
        for (Student st:students) {
            if (st.getAddress().equals(address)){
                System.out.println(Arrays.toString(new String[]{st.getFullName()}));
                counter++;

            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return counter;
    }
}



