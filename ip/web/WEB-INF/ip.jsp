<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@ page import="javax.servlet.*,java.text.*" %>
<%@ page import="java.net.*" %>

<div align="right"><%! private int count = 0;%>
    <%= ++count%></div>

<h1 align="center">Ваш IP адрес:<br>
    <mark><%= request.getRemoteHost()%></mark>
    <h1 align="center">Дата и время выполнения запроса:</h1>
    <%
        Date dNow = new Date();
        SimpleDateFormat ft
                = new SimpleDateFormat("E dd.MM.yyyy 'в' HH:mm:ss 'по' zzz  D 'день'  w 'недели года'");
        out.print("<h2 align=\"center\">" + ft.format(dNow) + "</h2>");
    %>
    <div align="center">
    <table border="1">
        <caption><th style="background-color:#FFC0CB;" >Историю валидности запроса можно сохранить и:</th></caption>    
            <tr>
                <td align="center" style="background-color: #AFEEEE;">Записать свой IP</td>
            </tr>
            <tr>
                <td align="center" style="background-color: #e6e6fa;">Распечатать свой IP, нажав в левом верхнем углу экрана [<strong>Файл</strong>]>[<strong>Печать</strong>]</td>
            </tr>
            <tr>
                <td align="center" style="background-color: #FFF8DC;">Отправить свой IP по <a href="mailto:?subject=Мой IP адрес&amp;body=Пожалуйста скопируйте сюда свой запрос по IP">
                        электронной</a> почте</dd></td>
            </tr>
    </table>
        </div>
    <h1  align="center" style="color: #ff0000;">Внимание!!!</h1>
    <h3 align="center" >Для того, чтобы закрепить за собой данный IP адрес<br> необходимо обращаться в подразделения ИТС</h3>

