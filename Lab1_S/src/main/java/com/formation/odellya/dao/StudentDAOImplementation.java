package com.formation.odellya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.formation.odellya.model.Student;
import com.formation.odellya.util.DBUtil;

public class StudentDAOImplementation implements StudentDAO {
	
	private Connection conn;

	public StudentDAOImplementation() {
		conn = DBUtil.getConnection();
	}
	@Override
	public void addStudent( Student student ) {
		try {
			String query = "insert into student (firstName, lastName, course, year) values (?,?,?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			preparedStatement.setString( 1, student.getFirstName() );
			preparedStatement.setString( 2, student.getLastName() );
			preparedStatement.setString( 3, student.getCourse() );
			preparedStatement.setInt( 4, student.getYear() );
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void deleteStudent( int id ) {
		try {
			String query = "delete from student where id=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void updateStudent( Student student ) {
		try {
			String query = "update student set firstName=?, lastName=?, course=?, year=? where id=?";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			preparedStatement.setString( 1, student.getFirstName() );
			preparedStatement.setString( 2, student.getLastName() );
			preparedStatement.setString( 3, student.getCourse() );
			preparedStatement.setInt( 4, student.getYear() );
			preparedStatement.setInt(5, student.getStudentId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery( "select * from student" );
			while( resultSet.next() ) {
				Student student = new Student();
				student.setStudentId( resultSet.getInt( "id" ) );
				student.setFirstName( resultSet.getString( "firstName" ) );
				student.setLastName( resultSet.getString( "lastName" ) );
				student.setCourse( resultSet.getString( "course" ) );
				student.setYear( resultSet.getInt( "year" ) );
				System.out.println(student);
				students.add(student);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;
	}
	@Override
	public Student getStudentById(int id) {
		Student student = new Student();
		try {
			String query = "select * from student where id=?";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while( resultSet.next() ) {
				student.setStudentId( resultSet.getInt( "id" ) );
				student.setFirstName( resultSet.getString( "firstName" ) );
				student.setLastName( resultSet.getString( "LastName" ) );
				student.setCourse( resultSet.getString( "course" ) );
				student.setYear( resultSet.getInt( "year" ) );
			}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}

}