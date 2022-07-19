package com.cg.framework;

public class SavingAcc extends BankAcc{
	private boolean isSalaried;
	private static final float MINBAL=1000;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	
	public void withdraw(float accBal) {
		if(accBal<MINBAL) {
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			System.out.println("LOW BALANCE!");
			System.out.println(accBal+" cannot be withdrawn from your Saving Account");
		}
		else
		{
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			System.out.println("TRANSACTION SUCCESSFUL!");
			System.out.println("Amount "+accBal+" Rupees are withdrawn from your account and Your Account Balance is :"+(getAccBal()-accBal));
		}
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public static float getMinbal() {
		return MINBAL;
	}
	
}
