package com.cg.application;

import com.cg.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		System.out.println("_______________________________________________________________________________________________________________________");
		System.out.println("SAVING ACCOUNT:");
		System.out.println("_______________________________________________________________________________________________________________________");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Account Number:"+accNo+"/Name:"+accNm+"/Balance:"+accBal+"/Salary Account:"+isSalaried);
	}

	public void withdraw(float accBal) {
		if(accBal<getMinbal()) {
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			System.out.println("LOW BALANCE!");
			System.out.println(accBal+" cannot be withdrawn from your Saving Account");
		}
		else if(getAccBal()<getMinbal()) {
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
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
