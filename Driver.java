package com.hackercode.Driver;
import UserDefinedException.InsufficientFundsException;
import com.hackercode.utility.*;

public class Driver {
        public static void main(String arg[]) {
            CheckingAccount c = new CheckingAccount(101);
           System.out.println("Depositing Rs 5000");
         c.deposit(5000);
         try {
             System.out.println("Withdrawing Rs. 1000");
                c.withdraw(1000);
               System.out.println("Withdrawing Rs. 3000");
                c.withdraw(3000);

           } catch (InsufficientFundsException e) {
               System.out.println("Sorry Insufficient Balance, You are short of " + e.getAmount());
 }

        }
    }
