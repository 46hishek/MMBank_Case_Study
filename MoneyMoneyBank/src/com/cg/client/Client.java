package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf=new MMBankFactory();
		bf.toString();
		SavingAcc sa=new MMSavingAcc(941180484,"ABHISHEK RAI",9590,true);
		sa.withdraw(2000);
		sa.deposit(300);
		sa.toString();
		CurrentAcc ca=new MMCurrentAcc(356926510,"RAJENDRA SINGH",4336,20000);
		ca.withdraw(333);
		ca.deposit(810);
		ca.toString();
	
	}
}
