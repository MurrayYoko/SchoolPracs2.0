/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectsAndClasses;

import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
 
public class Client {
    
  private String clientName; 
  private int accountNumber; 
  private double balance; 
            
  public Client(String inputName, int inputAccNo, double inputBalance ){
      
      clientName = "John Collin"; 
      accountNumber = 34; 
      balance = 95.00; 
  }

  public String getName(){
    return clientName; 
  }
  
  public int getAccNo(){
      return accountNumber; 
  }
  
  public double getBalance(){
      return balance; 
  }
  
  public String setName(String newName){
      return newName; 
  }
  
  public int setAccNo(int newAccNo){
      return newAccNo; 
  }
  
  public double setBalance(double newBalance){
      return newBalance; 
  }
  
  public String changeName(){
      String clientName = getName(); 
      String firstName = clientName.substring(0, clientName.indexOf(" ") - 1); 
      String lastName = clientName.substring(clientName.lastIndexOf(" ") + 1, clientName.length() ); 
      String initials = "" + firstName.charAt(0) + lastName.charAt(0); 
      return lastName + initials; 
  }
  
  public void display(){
      System.out.println(changeName()); 
      System.out.println(getAccNo());
      System.out.println(getBalance());
  }
}
