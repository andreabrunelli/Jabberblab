<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href='http://fonts.googleapis.com/css?family=Advent+Pro:400,500,600,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="styles.css">
        
        <title>JB - Login</title>
    </head>
    <body>
    <div class="col-md-4 col-md-offset-4 col-sm-8 col-sm-offset-2 col-xs-8 col-xs-offset-2">
        <center>
            <div class="logo"><a href="home.jsp"><img src="imgs/jabberblab.jpg"/></a></div>
        </center>
        <form>   
            <div class="form-group">
                <label for="id_Utente">Nome utente</label>
                <input type="text" class="form-control" id="id_Utente" placeholder="Nome utente">
            </div>
            <div class="form-group">
                <label for="password">Password</label><span class="pass_dimenticata">Password dimenticata?</span> <!--manca link-->
                <input type="password" class="form-control" id="password" placeholder="Password">
            </div>
            <div class="form-group row">
                <div class="checkbox col-md-4">
                    <label>
                        <input type="checkbox" id="ricordami">Ricordami
                    </label>
                </div>
                <div class="col-md-4 col-md-offset-4">
                    <button type="submit" id="sub_login" class="btn btn-default"><b>Login</b></button>            
                </div>
            </div>
            <div class="form-group">
                <center><button type="submit" id="registrati" class="btn btn-success"><b>Registrati</b></button></center>
            </div>
        </form>
        <center>
            <a class="ritorna" href="home.jsp"><span class="glyphicon glyphicon-menu-left" aria-hidden="true"></span>Ritorna al sito</a>
        </center>
    </div>
    
    
    
    
    
    
    
    </body>
</html>
