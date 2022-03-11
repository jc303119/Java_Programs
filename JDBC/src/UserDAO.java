import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.Scanner;

public class UserDAO {
     static Connection createConnection() throws ClassNotFoundException, SQLException
     {
    	 ResourceBundle rb = ResourceBundle.getBundle("dbconfig");          //to read the file dbconfig
    	 String driverName = rb.getString("driver");
    	 //String driverName = "com.mysql.jdbc.Driver";
   	     Class.forName(driverName);
   	  
    	// Step - 2 Create Connection
        // jdbc:oracle:thin:@localhost:1521:SID //thin is protocol of oracle
    	//jdbc:mysql://localhost:3306/quizdb
    	//String url ="jdbc:mysql://localhost:3306/quizdb";
   	     String url = rb.getString("url");
   	     String userid = rb.getString("userid");
   	     String pwd = rb.getString("password");
    	Connection connection = DriverManager.getConnection(url,userid,pwd);
   	  
		return connection;
    	  
     }
     
     static void insert() throws ClassNotFoundException, SQLException{
    	 final String SQL = "insert into user_mst (id,userid,password)"
    			 +"values(?,?,?)";
    	 Connection connection = createConnection();
    	 PreparedStatement pstmt = connection.prepareStatement(SQL);
    	 pstmt.setString(2, "Rim");
    	 pstmt.setInt(1, 40);
    	 pstmt.setString(3, "123");
    	 int insertedRow = pstmt.executeUpdate();     //executeUpdate returns count of the row
    	 System.out.println(insertedRow>0?"Record Added":"Record not Added");
    	 pstmt.close();
    	 connection.close();
     }
	
//     static void delete() throws SQLException, ClassNotFoundException{
//    	 final String Sql = "delete from user_mst(id,userid,password)"
//    			 +"values(?,?,?)";
//    	 Connection connection = createConnection();
//    	 PreparedStatement pstmt = connection.prepareStatement(Sql);
//    	 pstmt.setInt(1, 40);
//    	 pstmt.setString(2, "Rim");
//    	 pstmt.setString(3, "123");
//    	 //pstmt.clearBatch();
//    	 
//    	 int deletedRow = pstmt.executeUpdate();
//    	 System.out.println(deletedRow>0?"Record deleted":"Not deleted");
//    	 pstmt.close();
//    	 connection.close();
//    	 
//    	  
//     }
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
    	 boolean isFound = false;
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the Userid");
    	 String userid = sc.nextLine();
    	 System.out.println("Enter the password");
    	 String pwd = sc.nextLine();
    	 System.out.println("Enter the id");
    	 String id = sc.nextLine();
    	 System.out.println("id "+ id); 
    	 //Step 1 Load the DB Driver
    	//Oracle.jdbc.driver.OracleDriver
        
//    	  String driverName = "com.mysql.jdbc.Driver";
//    	  Class.forName(driverName);
    	  
    	// Step - 2 Create Connection
        // jdbc:oracle:thin:@localhost:1521:SID //thin is protocol of oracle
    	//jdbc:mysql://localhost:3306/quizdb
     	//  String url ="jdbc:mysql://localhost:3306/quizdb";
     	 // Connection connection = DriverManager.getConnection(url,"root","apple");
    	  
//    	  Statement stmt = connection.createStatement();       //sql injection incase of statement class use. this is done for the INT parse to STRING.
//    	
//    	 
//    	  ResultSet rs = stmt.executeQuery("select id,userid,"
//    			  +"password from user_mst where "
//    			  +"userid = '"+userid+"' and password ='"+pwd+"'"
//    			  +" and id = "+id);
    	  
    	  Connection connection = createConnection();
    	  
    	  PreparedStatement pstmt = connection.prepareStatement("select id,userid"         //prepare query before  //preparestatement helps from hacking(no sql injection)
  				+ ",password from user_mst where userid=?"   //? means unknown
  				+ " and password=? and id=?");
    	  pstmt.setString(1, userid);
    	  pstmt.setString(2, pwd);
    	 // pstmt.setInt(3, id);
    	  pstmt.setInt(3, Integer.parseInt(id));
    	  ResultSet rs = pstmt.executeQuery("select id, userid, "   //ResultSet give2d table and is used with select query.  //executeQuery returns result of statement  
				+ "password from user_mst where   "
						+ " userid='"+userid+"' and password='"+pwd+"'"
						+" and id="+id);
    	  
    	  while(rs.next()){
    		  isFound = true;
    		  System.out.println(rs.getString("userid")
  					+" "+rs.getString("password")
  					+" "+rs.getInt("id"));
    	  }
    	  if(!isFound){
    		  System.out.println("Record not found...");
    	  }
    	 connection.close();
    	 pstmt.close();
    	 rs.close();
    	 insert();
    	// delete();

//    	  if(connection!=null){
//    		  System.out.println("Connection created");
//    		  connection.close();
//    	  }
	}
}
