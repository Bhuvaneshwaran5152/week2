package com.full.secondMonthProject.database;

public class UserDataBase {

	private static UsersTable table;
	private UserDataBase()
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
