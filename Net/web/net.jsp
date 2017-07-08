

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@ page import="javax.servlet.*,java.text.*" %>
<%@ page import="java.net.*" %>

<%!
public byte[] getHardwareAddress(NetworkInterface ni) throws SocketException {
	return ni.getHardwareAddress();
%>
<%! request.getQueryString() %>


