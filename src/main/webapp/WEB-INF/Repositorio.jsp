<%-- 
    Document   : Repositorio
    Created on : 23/05/2018, 09:57:15
    Author     : Rian Alves
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/WEB-INF/jspf/bootstrap.jspf" %>
               <title>Plataforma</title>
    </head>
    <body>
        <h3>Encontre desenvolvedores e analistas para apoiarem na especificação de um requisito</h3>
        <form method="post"> 
            <label>Você poderá inserir o domínio de seu projeto e assim encontrar pessoas capazes de te ajudar   <input class="form-control" type="text" placeholder="Insira aqui a palavra chave" name="keyword"/></label><br/>
            <input type="submit" class="btn btn-success"/>
            <input type="reset" class="btn btn-danger"/>
        </form>

       <table class="table table-hover">
           <thead>
                <tr class="table-primary">
                    <th><center>Repositório</center></th>
                    <th><center>Nome do Usuário</center></th>
                    <th><center>E-mail</center></th>
                    <th><center>Contribuidores</center></th>
                </tr>
           </thead>
                <tbody>
                    <c:forEach var="repositorio" items="${repositorios}">
                    
                    <tr>
                        <td><a href="${repositorio.url}" target="_blank">${repositorio.fullName}</a></td> 
                        <td><center>${repositorio.name}</center></td> 
                        <td><center>${repositorio.email}</center></td> 
                        <td><center><a href="contribuidores.html">Visualizar</a></center></td> 
                                                                               
                    </tr>
                    </c:forEach>
                </tbody>
                
            </table>
</body>
</html>
