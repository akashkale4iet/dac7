package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.beans.Myuser;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbc;

	public int insertUser(String fname, String lname, String cno, String email, String bdate, String city) {
		String sql="insert into referltab values(?,?,?,?,?,?)";
		jdbc.query(sql, new Object[] {fname,lname,cno,email,bdate,city},new RowMapper<Myuser>() {

			public Myuser mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Myuser u=new Myuser();
				u.setFname(rs.getString(1));
				u.setLname(rs.getString(2));
				u.setCno(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setBdate(rs.getString(5));
				u.setCity(rs.getString(6));
				
				
				
				return u;
			}
			
		});

		return 0;
	}

}
