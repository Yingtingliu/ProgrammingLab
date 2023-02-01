package ttest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import com.opencsv.CSVWriter;

public class csvWriter implements sqlCommand {

	public csvWriter(String filePath)
	{
	    // first create file object for file placed at location
	    // specified by filepath
		StringBuilder sb = new StringBuilder();
		DBConnection dbc = new DBConnection();
		ResultSet rs;
		File file = new File(filePath);
		
		//String Query = "SELECT TransNo, TTLPrice FROM Trans;";
		//https://youtu.be/b_KN2XAWtwQ minute 7:00
		try {
						
			PreparedStatement ps = dbc.getConn().prepareStatement(SQL_SELECT_ALLTRANS);
	        rs = ps.executeQuery();
			
	        // create FileWriter object with file as parameter
	        FileWriter outputfile = new FileWriter(file);
	        // create CSVWriter object filewriter object as parameter
	        PrintWriter writer = new PrintWriter(outputfile);
	        //Header
	        writer.write("TransNo,TTLPrice,House,District,Road");
	        writer.write("\r\n");
	     
	        
	        while (rs.next()) {
	        	
	        	sb.append(rs.getInt("TransNo"));
	        	sb.append(",");
	        	sb.append(rs.getInt("TTLPrice"));
	        	sb.append(",");
	        	sb.append(rs.getFloat("House"));
	        	sb.append(",");
	        	sb.append(rs.getString("District"));
	        	sb.append(",");
	        	sb.append(rs.getString("Road"));
	        	sb.append("\r\n");
	        	
			}
	        writer.write(sb.toString());
	        // closing writer connection
	        writer.close();
	    }
	    catch(SQLException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
