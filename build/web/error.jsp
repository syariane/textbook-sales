<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" 
  isErrorPage="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <link rel="stylesheet" type="text/css" href="css/forms.css">
        <title>Book Sales</title>
    </head>
    <body>
        <h1>Error</h1>
        <p>There was an error adding your textbook.</p>
        <p>${pageContext.exception.message}</p>
    </body>
</html>
