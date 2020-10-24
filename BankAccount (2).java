/**
CSU Global -- ITS-320 Basic Programming 

Program7 - FinalExam
Simulates interaction with bank account

Programmed by: Kristopher Grano, Student 
Date:       May 30, 2015
*/

public class BankAccount
   {
   public String name;
   public double balance;
   public BankAccount(String name, double balance) 
      throws NegativeAmountException
         {
         this.name = name;
         this.balance = balance;
            if (balance < 0) // throws exception is starting balance is zero
               throw new NegativeAmountException("Your account cannot start with negative balance.");
         }
   }
   public BankAccount(String name) thows NegativeAmountException
      {
      this(name, 0); //sets account name and balance to zero
      }
   public void deposit(double amount)
      {
      if (amount > 0)
         {
         this.balance += amount;
         }
      else 
         {
         throw new NegativeAmountException("Deposit amount cannot be negative");
         }
         throws NegativeAmountException
                     
   public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException
      {
      if (amount > getBalance())
         {
         throw new InsufficientFundsException("Insufficient funds for this transaction");
         }
      else if (amount < 0)
         {
         throw new NegativeAmountException("Withdrawl amount cannot be negative");
         }
      else 
         {
         this.balance -= amount; 
         }
     }
   public double getBalance()
      {
      return this.balance;
      }
   public void printStatement()
      {
      System.out.println("Balance for " + this.name + ": " + getBalance());
      }
    }
                                               
                    
               