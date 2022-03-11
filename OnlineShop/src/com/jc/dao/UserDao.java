package com.jc.dao;
//dao is for data from DB
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.jc.dto.UserDTO;

public class UserDao {
   
	 public Connection getConnection() throws ClassNotFoundException, SQLException{
		 ResourceBundle rb = ResourceBundle.getBundle("dbconfig");
		 Class.forName(rb.getString("driver"));
		 Connection connection = DriverManager.getConnection(rb.getString("dburl"),rb.getString("userid"),"apple");
		 
		 return connection;
	 }
	 public boolean isUserExist(UserDTO userDTO) throws ClassNotFoundException, SQLException{
		 boolean isExist = false;
		 Connection con = null;
		 PreparedStatement pstmt = null;
		 ResultSet rs = null;
		 
		 try{
		 con = getConnection();
		 pstmt = con.prepareStatement("select userid,password from user_mst where userid=? and password=?");
		 pstmt.setString(1, userDTO.getUserid());
		 pstmt.setString(2, userDTO.getPassword());
		 rs = pstmt.executeQuery();
		 if(rs.next()){
			 isExist = true;
		    }
	      }
		 finally{
			 
			 if(rs!=null){
					rs.close();
				}
				if(pstmt!=null){
					pstmt.close();
				}
				if(con!=null){
					con.close();
				}
		 }
		 return isExist;
	 }
}
