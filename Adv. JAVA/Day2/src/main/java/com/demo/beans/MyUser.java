package com.demo.beans;

import java.time.LocalDate;

public class MyUser {
	   private String uname;
	    private String pass;
	    private String role;
	    private LocalDate date;
	    private String email;
		public MyUser() {
			super();
			// TODO Auto-generated constructor stub
		}
		public MyUser(String uname, String pass, String role, LocalDate date, String email) {
			super();
			this.uname = uname;
			this.pass = pass;
			this.role = role;
			this.date = date;
			this.email = email;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate date) {
			this.date = date;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "MyUser [uname=" + uname + ", pass=" + pass + ", role=" + role + ", date=" + date + ", email="
					+ email + "]";
		}
		
	    

}
