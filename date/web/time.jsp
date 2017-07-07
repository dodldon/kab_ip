
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@ page import="javax.servlet.*,java.text.*" %>

<%
   Date dNow = new Date( );
   SimpleDateFormat ft = 
   new SimpleDateFormat ("E dd.MM.yyyy ':' hh:mm:ss zzz");
   out.print( "<h2 align=\"center\">" + ft.format(dNow) + "</h2>");
%>

   <%! private int count = 0; %>
    <%= ++count %>
