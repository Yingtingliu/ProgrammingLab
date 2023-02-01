package ttest;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.*;



public class Testtest extends DBConnection implements sqlCommand {

	public static void main(String[] args) {
		
		DBConnection dbc = new DBConnection();
		
		
		
		//welcome to this system
		System.out.println("Welcome to Actual Selling Price of Real Estate system!");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//start the process
		try (	CallableStatement cstmt = dbc.getConn().prepareCall(SQL_SELECT);//for stored procedure
				Statement stmt = dbc.getConn().createStatement();//for select process
				PreparedStatement dtpstmt = dbc.getConn().prepareStatement(SQL_DELETE);
				PreparedStatement ispstmt = dbc.getConn().prepareStatement(SQL_INSERT);
				PreparedStatement uppstmt = dbc.getConn().prepareStatement(SQL_UPDATE);	){
			
			//Decide what to do
			Scanner guiCrud = new Scanner(System.in);  // Create a Scanner object
			System.out.println(QUESTION);

		    // Read user input
		    String CrudProcess = guiCrud.nextLine();
		    
		    do {//do while for continue the question
		    	
		    //Select process	
		    ResultSet rs;
			if (CrudProcess.equals("V")) {
				rs = stmt.executeQuery(SQL_SELECT_ALLTRANS);
				while (rs.next()) {
					System.out.print("no. = " + rs.getInt("TransNo"));
					System.out.print(", totalprice = " + rs.getInt("TTLPrice"));
					System.out.print(", House = " + rs.getFloat("House"));
					System.out.print(", District = " + rs.getString("District"));
					System.out.println(", Road = " + rs.getString("Road"));
				}
				
				System.out.println("Need an Output file? Y / N");
				String output = guiCrud.nextLine();
				if (output.equals("Y")) {
					System.out.println( "Please Name your file!");
					String filename = guiCrud.nextLine();
					String filePath = "D:\\JavaWork\\Export\\"+ filename + ".csv" ;
					new csvWriter ( filePath );
					System.out.println("Done!");
					
				}
			rs.close();//close for select
			} else	
			
			//Stored Procedure
			if (CrudProcess.equals("S")) {	
			//select which row to view	
				Scanner guiSelect = new Scanner(System.in);  // Create a Scanner object
			    System.out.println("Which item do you want to select? Please enter a number. EX: 1");
			    String selectProcess = guiSelect.nextLine();  // Read user input
			    
				cstmt.setString(1, selectProcess);
			    cstmt.registerOutParameter(2, Types.DATE);
				cstmt.registerOutParameter(3, Types.INTEGER);
				cstmt.registerOutParameter(4, Types.FLOAT);
				cstmt.registerOutParameter(5, Types.VARCHAR);
				cstmt.registerOutParameter(6, Types.VARCHAR);
			    //System.out.print("No = " + cstmt.getInt("TransNo"));
				cstmt.execute(); 
				System.out.print("交易日期 = " + cstmt.getDate(2));
				System.out.print(", 房屋交易價格 = " + cstmt.getInt(3));
				System.out.print(", 坪數 = " + cstmt.getInt(4));
				System.out.print(", 區 = " + cstmt.getString(5));
				System.out.println(", 地段 = " + cstmt.getString(6));
				
				cstmt.close();
			
			}else 
			
			//Delete process
			if (CrudProcess.equals("D")) {
				Scanner guiDelete = new Scanner(System.in);  // Create a Scanner object
			    System.out.println("Which line do you want to delete? Please enter a number.");
			    String deleteProcess = guiDelete.nextLine();  // Read user input
				dtpstmt.setString(1, deleteProcess);
				
				int count = dtpstmt.executeUpdate();
				System.out.println("delete count = " + count +"\r\n"+ "Successful delete line " + deleteProcess );
			}else
				
			//Insert Process
			if 	(CrudProcess.equals("I")) {
			
				Scanner guiInsert = new Scanner(System.in); 	
				System.out.println("Enter number of transaction, ex: 25");
				ispstmt.setString(1, guiInsert.nextLine());
			    System.out.println("Enter Date of transaction ex: 2011/3/5");
			    ispstmt.setString(2, guiInsert.nextLine());
			    System.out.println("Enter TotalPrice of transaction");
			    ispstmt.setString(3,  guiInsert.nextLine()); 
			    System.out.println("Enter LandPrice of transaction");
			    ispstmt.setString(4, guiInsert.nextLine()); 
			    System.out.println("Enter BuildingPrice of transaction");
			    ispstmt.setString(5, guiInsert.nextLine()); 
			    System.out.println("Enter ParkingSpacePrice of transaction");
			    ispstmt.setString(6, guiInsert.nextLine()); 
			    System.out.println("Enter squaremeter of the LandArea ex: 25.56 ");
			    ispstmt.setFloat(7, guiInsert.nextFloat()); 
			    System.out.println("Enter squaremeter of the BuildingArea ex: 800.56 ");
			    ispstmt.setFloat(8, guiInsert.nextFloat()); 
			    System.out.println("Enter squaremeter of the ParkingSpaceArea ex: 2.98 ");
			    ispstmt.setFloat(9, guiInsert.nextFloat()); 
			    System.out.println("When did this Building established? ");
			    ispstmt.setString(10, guiInsert.next());
			    System.out.println("What's the age of the house at that point?");
			    ispstmt.setInt(11, guiInsert.nextInt()); 
	
			    int count = ispstmt.executeUpdate();
			    System.out.println("successful insert count = " + count);
			}else
			
			//Update
			if 	(CrudProcess.equals("U")) {
				Scanner guiUpdate = new Scanner(System.in); 	
				System.out.println("Enter number of transaction, ex: 10");
			    int TransNo = guiUpdate.nextInt(); 
			    System.out.println("Enter TotalPrice of transaction");
			    int TTLPrice = guiUpdate.nextInt(); 
				uppstmt.setInt(1, TTLPrice);
				uppstmt.setInt(2, TransNo);
				
				int count = uppstmt.executeUpdate();
				System.out.println("successful update count = " + count);
			}
			
			//do while for continue the question
			try {
				Thread.sleep(550);
				System.out.println();
				System.out.println(NEW_QUEST);
				Thread.sleep(700);
				System.out.println(QUESTION);
				System.out.println(EXIST);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
			CrudProcess = guiCrud.nextLine();
		    }
		    while(!CrudProcess.equals("EX"));//do while to end the question
			    System.out.println("Thanks for your visit. Have a nice day!");
			    guiCrud.close();
			stmt.close(); //¸òµÛtry Ãö±¼
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
