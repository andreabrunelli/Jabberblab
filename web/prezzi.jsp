<%-- 
    Document   : prezzi.jsp
    Created on : 25-mag-2015, 16.48.45
    Author     : Chiara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <link href='http://fonts.googleapis.com/css?family=Advent+Pro:400,500,600,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="styles.css">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <title>JB - Prezzi</title>
    </head>
    <body>
        <c:import url="header.jsp"></c:import>
        <div class="row">
            <div class="col-md-6 col-md-offset-3 col-xs-10 col-xs-offset-1 col-sm-10 col-xs-offset-1">
                <table class="table prezzi">
                    <tr>
                        <th></th>
                        <th>2D</th>
                        <th>3D</th>
                    </tr>
                    <tr>
                        <th>Intero</th>
                        <td>6,00€</td>
                        <td>8,00€</td>
                    </tr>
                    <tr>
                        <th>Bambini fino a 11 anni</th>
                        <td>3,00€</td>
                        <td>5,00€</td>
                    </tr>
                    <tr>
                        <th>Universitari</th>
                        <td>4,00€</td>
                        <td>6,00€</td>
                    </tr>
                </table>
                
            </div>   
        </div>
        <c:import url="footer.jsp"></c:import>
    </body>
</html>
