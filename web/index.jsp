<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="ca.sheridancollege.java3.mt.Subject" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <link rel="stylesheet" type="text/css" href="css/forms.css">
        <title>Book Sales</title>
    </head>
    <body>
        <h1>Sell Your Textbooks</h1>
        <form method="post" action="BookSales">
            
            <!--  Title Information -->
            <div>
            <p><label for="title">Textbook Title:<input type="text"
                id="title" name="title"></label>
            </p>
            <p>
            <label for="price">Asking Price:<input type="text" id="price" 
                name="price"></label>
            </p>
            </div>
            
            <!-- Subject Information -->
            <div>
            <label for="lstSubject">Select Subject:
            <select id="lstSubject" name="lstSubject">
                <!-- <option value="">** Choose a Subject **</option> -->
                    <c:forEach var="subject" items="${Subject.values()}">
                        <option value="${subject}">${subject.displayName}</option>
                    </c:forEach>
            </select></label>
            </div>
                
            <!-- Submit Button -->
            <p>
                <button type="submit" id="submit" class="buttons">Submit</button>
            </p>

        </form>
    </body>
</html>
