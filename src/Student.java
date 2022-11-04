public class Student {
    private String fullName;
    private long phoneNumber;
    private String address;
    private long bankAccount;

    Student setFullName(String fullName){
        this.fullName=fullName;
        return null;
    }
    void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    void setAddress(String address){
        this.address=address;
    }
    void setBankAccount(long bankAccount){
        this.bankAccount=bankAccount;
    }
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
    public void liveIn(int sum) {
        if (getBankAccount() > sum) {
            int a= (int) (getBankAccount()/sum);
            System.out.println("Balance: "+ getFullName()+" month: "+"["+a+"]");
        } else if (getBankAccount() < sum){
            int a= (int) (getBankAccount()/sum);
            System.out.println("Not enough funds: "+getFullName()+" month: "+"["+a+"]");


        }else {
            System.out.println("~~~~~~~");
        }


    }
    public void changeInfo(){
        getFullName().replace(fullName,fullName).replace(address,address);
        getAddress().replace(address,address);
        System.out.println(getFullName()+getAddress());

    }

}
