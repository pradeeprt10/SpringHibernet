package com.practice.ORM.SpringHibernet;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.ORM.SpringHibernet.DAO.StudentDAO;
import com.practice.ORM.SpringHibernet.DAO.StudentDAOImpl;
import com.practice.ORM.SpringHibernet.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext cont = new ClassPathXmlApplicationContext("StudentORM.xml");
    	StudentDAO stud1 = (StudentDAO) cont.getBean("stddao");
    	Student s = new Student();
    	//s.setFees(6000);
    	//s.setName("PKR2");
    	//s.setPancard("AAXX");
    	s.setStdid(555);
    	//s.setStdname("Test");
    	//Spring- Hibernate Insert
    	//stud1.insertStudent(s);
    	//Spring- Hibernate Update
    	//stud1.deleteStudent(s);
    	//Spring- Hibernate delete
    	//stud1.deleteStudent(s);
    	//Spring- Hibernate Select    	
    	//s=stud1.selectStudent(100);
    	//Spring- Hibernate Select All
    	List<Student> stdAll= stud1.selectAllStudent();
    	for(Student st:stdAll)
    	{
    	 System.out.print(st.getFees()+"  ");
    	 System.out.print(st.getName()+"  ");
    	 System.out.print(st.getPancard()+"  ");
    	 System.out.print(st.getStdid()+"  ");
    	 System.out.println(st.getStdname()+"  ");
    	     	 
    	}
		//System.out.println(s);
		
    	
    }
}
