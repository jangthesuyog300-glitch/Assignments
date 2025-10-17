package Vehicle;

import java.util.Date;

public class Vehicle {
	private int Vid;
    private String Oname;
    private String Vtype;
    private Date PDate;
    
    
    public  Vehicle()
    {
    	Vid=0;
    	Oname=null;
    	Vtype=null;
    	PDate=null;
    }
    public  Vehicle(int id,String n,String v,Date D)
    {
    	this.Vid=id;
    	this.Oname=n;
    	this.Vtype=v;
    	this.PDate=D;
    }
    //Setter
    public void setId(int i)
    {
    	Vid=i;
    }
    public void setOname(String n)
    {
    	Oname=n;
    }
    public void setVtype(String v)
    {
    	Vtype=v;
    }
    public void setDate(Date D)
    {
    	PDate =D;
    }
    
    //getter
    public int getId()
    {
    	return Vid;
    }
    public String getOname()
    {
    	return Oname;
    }
    public String getVtype()
    {
    	return Vtype;
    }
    public Date getDate()
    {
    	return PDate;
    }
    
    public String toString()
    {
    	System.out.println("To string function ");
    	return "Vehicle ID : "+Vid+"Owner Name : "+Oname+"Vehicle Type : "+Vtype+"Date"+PDate;
    }
    

}
