package com.cg.framework;

public class BankAcc {
	 private int accNo;
	 private String accNm;
	 private float accBal;
	 
	 public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	 public void withdraw(float accBal) {
			if(accBal<1000) {
				System.out.println("-----------------------------------------------------------------------------------------------------------------------");
				System.out.println("LOW BALANCE!");
				System.out.println(accBal+" cannot be withdrawn from your Account");
			}
			else
			{
				System.out.println("-----------------------------------------------------------------------------------------------------------------------");
				System.out.println("TRANSACTION SUCCESSFUL!");
				System.out.println("Amount "+accBal+" Rupees are withdrawn from your account and Your Account Balance is :"+(getAccBal()-accBal));
			}
		}
	 public void deposit(float accBal) {
		 		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
				System.out.println("TRANSACTION SUCCESSFUL!");
				System.out.println("Amount "+accBal+" Rupees are added to your account and Your Account Balance is: "+(getAccBal()+accBal));
				System.out.println();
				System.out.println("+------------------------------+----------------------------+-------------------------------+--------------------------+");
			}
	
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public float getAccBal() {
		return accBal;
	}
	
}
