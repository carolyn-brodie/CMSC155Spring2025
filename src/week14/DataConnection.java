package week14;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class DataConnection {
	
	private Connection con = null;
	
	//Initialize the connection
	public DataConnection() throws Exception {
	  
		SimpleDataSource.init("database.properties");
		 
	    con = SimpleDataSource.getConnection();
	   
		 
		 
	}

	
	//Get data from the database
    public ResultSet runQuery(String query) throws SQLException {
		System.out.println("Version 1");
		Statement stat = null;
		ResultSet result = null;
	
		if (con == null) 
			con = SimpleDataSource.getConnection();
		stat = con.createStatement();
	
		result = stat.executeQuery(query);
	
		return result;
    }

	//Get data from the database
	public ResultSet runQuery(String query, String bindvalue ) throws SQLException {
		System.out.println("Version 2 " + query + " " + bindvalue );
		Statement stat = null;
		ResultSet result = null;

		if (con == null)
			con = SimpleDataSource.getConnection();
//		stat = con.createStatement();
		final PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setString(1, bindvalue);

		result = preparedStatement.executeQuery();

		return result;
	}
    
 
     
    
    
    //Use for Insert Data, Update, and Delete data
    public void updateData(String query) throws SQLException {
    	Statement stat = null;
		if (con == null) 
			con = SimpleDataSource.getConnection();
		stat = con.createStatement();
		stat.execute(query);
		stat.close();
    }
    
    
     

    
    
    //Close everything when done
    public void closeConnection () throws SQLException {
    	con.close();
    }
	
}
