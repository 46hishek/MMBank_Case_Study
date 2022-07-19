package com.cg.framework;

public class CurrentAcc extends BankAcc{
	private final float creditLimit=20000;
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		
	}
	public void withdraw(float creditLimit) {
		if (getAccBal()<=creditLimit) {
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			System.out.println("INSUFFICIENT FUNDS!");
			System.out.println("Your Account Balance is Lower than Rupees:"+creditLimit);
		}
		else if(creditLimit>=20000) {
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Money cannot be withdrawn from your Account,You cannot exceed Daily Withdrawing Limit");
		System.out.println("As Today,You can withdraw only upto Rupees:"+20000);
	}
	else
	{
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("TRANSACTION SUCCESSFUL!");
		System.out.println("Amount "+creditLimit+" Rupees are withdrawn from your account and Your remaining Account Balance is: "+(getAccBal()-creditLimit));
	}
}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public float getCreditLimit() {
		return creditLimit;
	}
	
}
