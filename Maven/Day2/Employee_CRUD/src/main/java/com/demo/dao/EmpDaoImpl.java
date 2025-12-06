package com.demo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public class EmpDaoImpl implements EmpDao {
    private static SessionFactory sf;
    
    static {
        sf = HibernateUtil.getMySession(); // Fixed method name
    }
    
    private Session getSession() {
        return sf.openSession();
    }

    @Override
    public boolean add(Employee e) {
       
    	 Session session = getSession();
    	 Transaction tr = session.beginTransaction();
            session.saveOrUpdate(e);
            tr.commit();
            session.close(); 
            return true;
        
        
    }

    @Override
    public boolean addPro(Project p) {
    	 Session session = getSession();
    	 Transaction tr = session.beginTransaction();
            session.saveOrUpdate(p);
            tr.commit();
            session.close();
            return true;
      
    }

    @Override
    public Employee FindEmp(int eid) {
    	 Session session = getSession();
    	 Transaction tr = session.beginTransaction();
    	 Employee e = session.get(Employee.class, eid);
            tr.commit();
            session.close();
            return e;
           
           
    }

    @Override
    public boolean assign(Employee e, Project p) {
    	 Session session = getSession();
    	 Transaction tr = session.beginTransaction();
            
      
            if (e != null && p != null) {
                Employee Emp = session.get(Employee.class, e.getEid());
                Project Proj = session.get(Project.class, p.getPid());
                
                if (Emp != null && Proj != null ) {
                   
                	Emp.getPlist().add(Proj);
                    Proj.getElist().add(Emp);
                    session.update(Emp);
                    tr.commit();
                    session.close();
                    return true;
                }
            }
            tr.commit();
            session.close();
            return false;
       
    }

	@Override
	public List<Employee> showAllEmp() {
		Session session =getSession();
		Transaction tr =session.beginTransaction();
		Criteria c=session.createCriteria(Employee.class);
		List<Employee> elist =c.list();
		tr.commit();
		session.close();
		
		return elist;
	}

	@Override
	public boolean update(int id, double sal) {
		Session session =getSession();
		Transaction tr =session.beginTransaction();
		Employee e = session.get(Employee.class, id);
		if(e!=null)
		{
			e.setSalary(sal);
			tr.commit();
			session.close();
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(int id) {
		Session session =getSession();
		Transaction tr =session.beginTransaction();
		Employee e = session.get(Employee.class, id);
		if(e!=null)
		{
			e.getPlist().clear();
			session.update(e);
			session.delete(e);
			tr.commit();
			session.close();
			return true;
		}
		return false;
	}
}
