package day8.interfaces.implementinginterfaces;

//import day8.interfaces.functionalinterfaces.Bank;

public class Account {
	
		 private int accNo;
		 private String name;
		 private double balance;
		 private Bank bank ;

		 public Account(int accNo, String name, double balance, Bank bank) {
		     this.accNo = accNo;
		     this.name = name;
		     this.balance = balance;
		     this.bank = bank;
		 }

		 public int getAccNo() {
		     return accNo;
		 }

		 public String getName() {
		     return name;
		 }

		 public double getBalance() {
		     return balance;
		 }



}
