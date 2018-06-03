package com.sbi.bankingsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ZensarBankingSystemArrayImpl implements BankingRepositoryService
{
	
	private Connection con = null;
	private PreparedStatement preparedStatement = null;
	private Statement statement= null;
	
	ResultSet resultSet = null;
	
	public ZensarBankingSystemArrayImpl()
	{
		
	}
	public int count(String sql)
	{
		
	}
	
}
