/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank_account;

/**
 *
 * @author PC
 */
public class Bank_account {
 private String name;
 private int age;
 private int accNum;
 private double balance;
 
    public String getName() {
        return name; 
    }
    
    public int getAge() {
        return age;  
    }
    
    public long getaccNum() {
        return accNum;   
    }
    
    public double getBalance() {
        return balance;     
    }
    
    public void setName(String n) {
        this.name = n;    
    }
    
    public void setAge(int a){
        this.age = a;
    }
    
    public void setAccNum(int acc) {
        this.accNum = acc;
        
    }
    
    public void setBalance( double b, double c) {
        this.balance = b + c;
        
    }
    
  }
   
  class main {
      
      public static void main (String [] args) {
          
         Bank_account j = new Bank_account ();
             j.setName("Carmelito Clarido Jr");
             j.setAge(21);
             j.setAccNum(2002);
            j.setBalance(10000.04, 3379.69);
            
            System.out.println("BANGKOCENTRAL" + "\n" + "Name:" + j.getName() + "\n" + "Age:" + j.getAge() + "\n" + "Account Number:" + j.getaccNum() + "\n" + "Balance:" + j.getBalance());
  }
  }
  
