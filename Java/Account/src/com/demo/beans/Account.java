package com.demo.beans;

abstract public class Account extends Person {
    private static int nextAccountNo = 100000;
    private int accountNo;

    public Account() {
        super();
        this.accountNo = nextAccountNo++;
    }

    public Account(String name, String lname, String m, String email) {
        super(name, lname, m, email);
        this.accountNo = nextAccountNo++;
    }

    public int getAccountNo() {
        return accountNo;
    }

    abstract public double RI();
    abstract public double minbal();
    @Override
    public String toString() {
    	return "" ;
    }
}