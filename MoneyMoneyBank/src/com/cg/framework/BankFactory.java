package com.cg.framework;

public interface BankFactory {
	 SavingAcc getNewSavingAccount(int AccNo,String accNm,float accBal,boolean isSalaried);
	 CurrentAcc getNewCurrentAccount(int AccNo,String accNm,float accBal,float creditLimit);
}
