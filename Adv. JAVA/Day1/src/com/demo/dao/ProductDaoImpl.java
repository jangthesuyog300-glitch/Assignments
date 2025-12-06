package com.demo.dao;
import java.util.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao
{
	static Connection conn;
	static PreparedStatement insProd;
	static PreparedStatement delete;
	static PreparedStatement update,findbyid,findAll,sort;
    static {
    	
    	try {
    		conn=DBUtil.getMyConnection();
			insProd=conn.prepareStatement("insert into myproduct values(?,?,?,?,?)");
			delete=conn.prepareStatement("delete from myproduct where pid=(?)");
			update=conn.prepareStatement("update myproduct set qty=?,price=? where pid=?");
			findbyid=conn.prepareStatement("select * from myproduct where pid=?");
			findAll=conn.prepareStatement("select * from myproduct");
			sort=conn.prepareStatement("select * from myproduct order by price");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	@Override
	public boolean save(Product p) {
		try {
			insProd.setInt(1, p.getPid());
			insProd.setString(2, p.getPname());
			insProd.setInt(3, p.getQty());
			insProd.setDouble(4, p.getPrice());
			insProd.setDate(5, java.sql.Date.valueOf(p.getLdt()));
			int n=insProd.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean remove(int pid) {
		try {
			delete.setInt(1,pid);
			int n=delete.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean update(int pid, int qty, double price) {
		

		try {
			update.setInt(3, pid);
			update.setInt(1, qty);
			update.setDouble(2, price);
			
			int n=update.executeUpdate();
			if(n>0) return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Product findbyId(int pid) {
		Product p=null;
		try {
			findbyid.setInt(1, pid);
	        ResultSet rs=findbyid.executeQuery();
	        if(rs.next())
	        {
	        	if(rs.getDate(5)!=null)
	        	{
	        		p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate());
	        	}
	        	else
	        	{
	        		p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),null);
	        	}
	        	return p;
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> findAll() {
		List<Product>lst=new ArrayList<>();
		
		try {
			ResultSet rs= findAll.executeQuery();
			while(rs.next())
			{
				if(rs.getDate(5) != null)
				{
					lst.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate()));
				}
				else
	        	{
					lst.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),null));
	        	}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(lst.size()>0)
		{
			return lst;
		}
		
		return null;
	}

	@Override
	public List<Product> sortP() {
List<Product>lst=new ArrayList<>();
		
		try {
			ResultSet rs= sort.executeQuery();
			while(rs.next())
			{
				if(rs.getDate(5) != null)
				{
					lst.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate()));
				}
				else
	        	{
					lst.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),null));
	        	}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(lst.size()>0)
		{
			return lst;
		}
		
		return null;
		
	}

	@Override
	public void CloseConnection() {
		DBUtil.closeConnection();
		
	}


}
