/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10;

/**
 *
 * @author pc
 */
public class Customer {
    private Account acct[];
    private int numOfAccount;
    private String firstName;
    private String lastName;
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new Account[5];
    }
    public Customer(){
        this("", "");
    }
    public Account getAccount(int index){
        return (acct[index]);
    }
    public void addAccount(Account acct){
        for (int i = 0; i < 5 ; i++){
            if (this.acct[i] == null){
                this.acct[i] = acct;
                numOfAccount = numOfAccount + 1;
                return;
            }
        }
    }
    public int getNumOfAccount(){
        return (this.numOfAccount);
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public boolean equals(Customer c){
        return c.getFirstName().equals(this.getFirstName()) && c.getLastName().equals(this.getLastName());
    }
    public String toString(){
        if (numOfAccount == 0)
            return (firstName + " " + lastName + " doesn’t have account.");
        else
            return ("The " + firstName + " " + lastName + " accout has " + numOfAccount + " accounts.");
    }
}

