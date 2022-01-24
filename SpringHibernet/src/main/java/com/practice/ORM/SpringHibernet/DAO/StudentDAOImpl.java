package com.practice.ORM.SpringHibernet.DAO;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.practice.ORM.SpringHibernet.Entity.Student;

public class StudentDAOImpl implements StudentDAO {

	private HibernateTemplate template1;

	@Transactional
	public int insertStudent(Student std) {
		Integer x = (Integer)template1.save(std);
		return x;

	}

	public HibernateTemplate getTemplate1() {
		return template1;
	}

	public void setTemplate1(HibernateTemplate template1) {
		this.template1 = template1;
	}
	
	//Update Operation
	@Transactional
	public void updateStudent(Student std) {
		
		template1.update(std);
	
	}

	//Delete operation
	@Transactional
	public void deleteStudent(Student std) {
		template1.delete(std);
		
	}

	//select Student
	public Student selectStudent(int stdid) {
		
		Student student = template1.get(Student.class, stdid);
		return student;
	}
	//select AllStudent

	public List<Student> selectAllStudent() {
		
		List<Student> stdall = template1.loadAll(Student.class);
		return stdall;
	}

	
	

}
