import java.util.Arrays;

public class Student {
    private String fullName;
    private long phoneNumber;
    private String address;
    private long bankAccount;



    void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    void setAddress(String address){
        this.address=address;
    }
    void setBankAccount(long bankAccount){
        this.bankAccount=bankAccount;
    }
    void setFullName(String fullName){this.fullName=fullName;}
    String getFullName(){
        return fullName;
    }
    long getPhoneNumber(){
        return phoneNumber;
    }
    String getAddress(){
        return address;
    }
    long getBankAccount(){
        return bankAccount;
    }
    public int liveIn2(int sum) {
        int a = (int) (getBankAccount() / sum);
        {
            if (getBankAccount() > sum) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Balance: =" +getBankAccount()+" som "+ getFullName() + " to live month: " + "[" + a + "]");
            } else if (getBankAccount() < sum) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Not enough funds: ="+getBankAccount()+" som  "+getFullName()+" to live month: "+"["+a+"]");

            } else {
                System.out.println("~~~~~~~");
            }
            return a;
        }
    }
    public void changeInfo(Student[] students) {

        for (Student change:students) {

            System.out.println("Address: "+change.address.replace("B1","B3").replace("B2","B1")+
                    "  student: "+change.fullName.replace("Rustam Mamytov","Emir Kahanov")+change.fullName.replace("Asel Yrakunova","Indira Osmonova").replace("Azamat Ibraimov","Ulan Ulanov"));



        }
    }
}

