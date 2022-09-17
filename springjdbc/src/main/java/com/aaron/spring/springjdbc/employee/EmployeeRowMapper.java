package com.aaron.spring.springjdbc.employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.aaron.spring.springjdbc.employee.dto.Employee;

public class EmployeeRowMapper implements org.springframework.jdbc.core.RowMapper<Employee> {
	
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee= new Employee();
		employee.setId(rs.getInt(1));
		employee.setFirstname(rs.getString(2));
		employee.setLastname(rs.getString(3));
		return employee;
	}

}
