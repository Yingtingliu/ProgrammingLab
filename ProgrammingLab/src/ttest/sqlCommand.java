package ttest;

public interface sqlCommand {
	
	//SQL command
			final String SQL_SELECT = "{call SelectAllTransaction(?,?,?,?,?,?)}";
			final String SQL_SELECT_ALLTRANS = 
					"SELECT A.TransNo, A.TTLPrice, A.House, B.District, B.Road  FROM Trans A JOIN dbo.[Location] B ON A.TransNo = B.TransNo;";
			final String SQL_DELETE = "DELETE Trans WHERE TransNo= ? ;";
			final String SQL_INSERT = "INSERT INTO Trans VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
			final String SQL_UPDATE ="UPDATE Trans SET TTLPrice=? WHERE TransNo=?";
			
			//Other String
			final String QUESTION = ( "Please type V = Select whole the table"+"\r\n" +
									"Please type S = Select a line"+"\r\n" +
									"Please type I = Insert new line "+"\r\n" +
									"Please type D = Delete a line "+"\r\n" +
									"Please type U = Update data for a line ");
			final String NEW_QUEST = ("Enter new request");
			final String EXIST = ("Please type EX = to exit our system");
			
}
