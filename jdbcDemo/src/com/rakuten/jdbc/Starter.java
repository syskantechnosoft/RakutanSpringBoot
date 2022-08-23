package com.rakuten.jdbc;

import java.sql.SQLException;

import com.rakuten.jdbc.dao.UsersDAO;
import com.rakuten.jdbc.enity.User;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Insert Operation (Create)
		UsersDAO usersDAO =new UsersDAO();
		
		User user1 = new User(100, "abcd", "abcd@gmail.com", "india");
		
		try {
			usersDAO.insertUser(user1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Read user by ID
		User user2 =  usersDAO.selectUser(1);
		System.out.println(user2);
		
		
		
		
		

	}

}
