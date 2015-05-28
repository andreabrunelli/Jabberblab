<%-- 
    Document   : contatti.jsp
    Created on : 25-mag-2015, 16.48.55
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

        <title>JB - Contatti</title>
    </head>
    <body>
        <c:import url="header.jsp"></c:import>
        <div class="row">
            <div class="col-md-3 col-md-offset-2 col-xs-10 col-xs-offset-1 dovesiamo"> <!--mancano misure tablet-->
                
                <h3>Dove siamo</h3>
                <center>
                    <iframe width="400" height="280" frameborder="0" src="http://www.bing.com/maps/embed/viewer.aspx?v=3&cp=46.424305~11.155004&lvl=15&w=400&h=280&sty=h&typ=d&pp=JabberBlab~Via%20Roen%2032%2C%20Ronzone~46.424305~11.155004&ps=&dir=0&mkt=it-it&src=O365&form=BMEMJS"></iframe>
                </center>
                <br>
                <p><b>JabberBlab Cinema</b><br>
                    Via Roen 32<br>
                    38010 Ronzone (TN)<br>
                Tel: 123456789
                </p>
            </div>
            <div class="col-md-3 col-md-offset-2 col-xs-10 col-xs-offset-1">
                
                <form class="form-horizontal">
                    
                    <div class="form-group">
                        <h3>Contattaci</h3>
                        <div>
                            <input type="text" class="form-control" id="contactus_nome" placeholder="Nome">
                        </div>
                    </div>
                    <div class="form-group">
                        <input type="email" class="form-control" id="contactus_email" placeholder="Email">                        
                    </div>
                    <div class="form-group">
                        <textarea class="form-control col-md-12 col-xs-12" rows="6" id="contactus_mess" placeholder="Messaggio"></textarea>
                    </div>
                    <div class="form-group">
                        <div>
                            <button type="submit" id="sub_contactus" class="btn btn-default">Invia</button>
                        </div>    
                    </div>
                </form>
            </div>
        </div>
        <c:import url="footer.jsp"></c:import>
    </body>
</html>
