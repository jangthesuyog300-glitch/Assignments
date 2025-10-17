package com.demo.beans;

public class Saving extends Account {
    private double balance;
    static double CheckBookNo = 100000;

    @Override
    public double RI() {
        return 0.04;
    }

    @Override
    public double minbal() {
        return 2000;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getCheckBookNo() {
        return CheckBookNo;
    }

	

	

	public Saving(String name, String lname, String m, String email,double b) {
		super(name, lname, m, email);
		this.balance = b;
		
	}

	public Saving(double balance) {
		super();
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Saving [balance=" + balance + " AccountNo :" + getAccountNo()  + super.toString()
				+ " Name :" + getName() + ", Lname :" + getLname() + ", Mobaile :" + getM() + ", Email :"
				+ getEmail() ;
	}



	

   
}