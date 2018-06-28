<%-- 
    Document   : Perfil
    Created on : 11/06/2018, 20:10:20
    Author     : Rian Alves
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/WEB-INF/jspf/bootstrap.jspf" %>
        <title>Perfil do Usuário</title>
    </head>
    <body>
        <%@include file="/WEB-INF/jspf/cabecalho.jspf" %>
    <center><h3>Altere seu Perfil para disponibilizar melhores informações para seus companheiros</h3></center>
    
    <div class="row">
            <div class="col"></div>
            <div class="col"><br/>
               
                <form method="post">
                    
                    <div class="form-group">
                    <label>Fale um pouco sobre você e seus Projetos: </label>    
                        <input class="form-control" type="text" placeholder="Insira aqui o seu Facebook para vocês se aproximarem" name="minimo"/><br/>
                    </div>
                    
                    <div class="form-group">
                    <label>Vincular conta Google:</label>
                        <input class="form-control" type="text" placeholder="Insira aqui uma conta Google " name="titulo"/><br/>
                    </div>
                    <div class="form-group">
                    <label>Vincular Facebook: </label>    
                        <input class="form-control" type="text" placeholder="Insira aqui o seu Facebbok para vocês se aproximarem" name="minimo"/><br/>
                    </div>
                    <div class="form-group">
                        <label>Data de Aniversário:</label>    
                        <input class="form-control" type="date" name="nascimento"/><br/>
                    </div>
                    
                    <input type="submit" class="btn btn-success"/>
                    <input type="reset" class="btn btn-danger"/>
                </form>
            </div>
            <div class="col"></div>
        </div>
        <%@include file="/WEB-INF/jspf/rodape.jspf" %>
    </body>
</html>
