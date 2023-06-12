package com.secondmonth.database;

public class DataBase {

	private static UsersTable table;
	private DataBase()
	{
		
	}
	
	public static UsersTable getUsersTable()
	{
		if(table==null)
		{
			table =new UsersTable();
		}
		return table;
	}
}
