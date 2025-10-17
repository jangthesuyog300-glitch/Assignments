package Day6;

import java.sql.Date;

class person
   {
	  static int count;
	  static {
		  int scount=0;
		  int ccount=0;
		  int vcount=0;
	  }
	  private String pid;
	  private String pname;
	  private Date bdate;
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public person(String pid, String pname, Date bdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.bdate = bdate;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		person.count = count;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	@Override
	public String toString() {
		return "person [pid=" + pid + ", pname=" + pname + ", bdate=" + bdate + "]";
	}
	  
   }


