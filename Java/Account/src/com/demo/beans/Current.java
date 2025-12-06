package com.demo.beans;

public class Current extends Account {
    private double balance;
    static int transaction = 1;

    @Override
    public double RI() {
        return 0.01;
    }

    @Override
    public double minbal() {
        return 1000;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static int getTransaction() {
        return transaction;
    }

    public Current() {
        super();
    }

    public Current(String name, String lname, String m, String email, double balance) {
        super(name, lname, m, email);
        this.balance = balance;
    }

    @Override
    public String toString() {
		return "Current [balance=" + balance + " AccountNo :" + getAccountNo()  + super.toString()
				+ " Name :" + getName() + ", Lname :" + getLname() + ", Mobaile :" + getM() + ", Email :"
				+ getEmail() ;
	}
}