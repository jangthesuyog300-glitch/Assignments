package com.demo.beans;

import java.time.LocalDate;
import java.util.Date;

public class Salemp extends Employee {

    private double sal;
    private double bonus;

    public Salemp(double sal, double bonus) {
        super();
        this.sal = sal;
        this.bonus = bonus; 
    }

    public Salemp(int id, String name, LocalDate localDate, String dept, String desg,
                  double sal) {
        super(id, name, localDate, dept, desg);
        this.sal = sal;
        this.bonus = sal*0.10;
    }

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double CalculateBonus(float persent)
	{
		bonus=sal*persent;
		return bonus;
	}
	
	public double CalculateSal() {
	return sal+bonus;
	}

	@Override
	public String toString() {
		return "Salemp [sal=" + sal + ", bonus=" + bonus + "]";
	}
    
    
}
 