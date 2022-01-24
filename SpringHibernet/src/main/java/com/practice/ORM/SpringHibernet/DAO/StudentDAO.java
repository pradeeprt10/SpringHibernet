package com.practice.ORM.SpringHibernet.DAO;

import java.util.List;

import com.practice.ORM.SpringHibernet.Entity.Student;

public interface StudentDAO {
	public int insertStudent(Student std);
	public void updateStudent(Student std);
	public void deleteStudent(Student std);
	public Student selectStudent(int stdid);
	public List<Student> selectAllStudent();
	
}
