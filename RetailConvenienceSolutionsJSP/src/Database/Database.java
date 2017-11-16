package Database;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alan
 *
 */
public class Database {
	static Database db = null;
	final String dbPath = "~/db/RCS.db";
	
	/**
	 * gets the instance of the database for the user so that it can control the singleton
	 * @return database object that the user wants to work with
	 */
	public Database GetInstance() {
		if(db == null)
		{
			db = new Database();
		}
		return db;
	}
	
	/**
	 * constructor for the class
	 * private so that the user must call the get instance
	 */
	private Database() {
		CreateDatabaseFile();
		
		ConnectDb();
		
		//This is in here for our building purposes 
		//would not be present in a production setting
		SetupTestDb();
	}
	
	/**
	 * call some files that hold the scripts for creating a sample DB
	 */
	public void SetupTestDb() {
		
	}
	
	/** 
	 * Test the connection to the DB
	 */
	private void ConnectDb() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:" + dbPath;
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to database has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
	}

	/**
	 * handles the test and/or creation of the database File
	 */
	private void CreateDatabaseFile() {
		File dbFile = new File(dbPath);
		if(!dbFile.exists()) {
			try {
				dbFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("File Already Existed");
		}
	}
	
}
