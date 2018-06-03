<%-- 
    Document   : adduserform
    Created on : Nov 22, 2017, 2:51:20 PM
    Author     : JK
--%>
<%@page import="conn.connect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%

String uname=request.getParameter("name");
String pass=request.getParameter("pass");

Connection c=connect.m1();
String sql="insert into students(name)values(?)";
PreparedStatement ps=c.prepareStatement(sql);
ps.setString(1,uname);
ps.execute();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add User Form</title>
    </head>
    <body>
       
    </body>
</html>
