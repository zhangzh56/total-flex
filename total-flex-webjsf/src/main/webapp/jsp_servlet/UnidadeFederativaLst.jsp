<%-- 
    Document   : UnidadeFederativaLst
    Created on : 17/07/2010, 06:00:10
    Author     : clayton.kendy
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Unidade Federativa</h1>
        <%
            out.print(request.getAttribute("findAll"));
        %>
    </body>
</html>
