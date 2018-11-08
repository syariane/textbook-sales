<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <link rel="stylesheet" type="text/css" href="css/forms.css">
        <title>Book Sales</title>
    </head>
    <body>
        <h1>Book Added</h1>
        
        <p>Your textbook is now for sale. Here is your information:</p>
        <table>
            <tr>
                <th>Your Books For Sale<th>
            </tr>
            <tr>
                <th>Title</th>
                <td>${textbook.title}</td>
                <td>${order.cookie.price}</td>
                
            </tr>
            <tr>
                <th>Asking Price</th>
                <td><fmt:formatNumber value="${textbook.price}" 
                                  type="currency"/></td>
            </tr>
            <tr>
                <th>Subject</th>
                <td>${textbook.subject.displayName}</td>
            </tr>
        </table>
    </body>
</html>
