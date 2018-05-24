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
               <title>Plataforma</title>
    </head>
    <body>
        <h1>Encontre desenvolvedores e analistas para apoiarem na especificação de um requisito</h1>
        <form method="post">
            <label>Insira a palavra chave: <input name="keyword"/></label><br/>
            <input type="submit"/>
            <input type="reset"/>
        </form>

       <table class="table table-hover">
                <thead>
                <th>Repositório</th>
                <th>Nome do Usuário</th>
                <th>E-mail</th>
                <th>Contribuidores</th>
                </thead>
                
                <tbody>
                    <c:forEach var="repositorio" items="${repositorios}">
                    
                    <tr>
                        <td>${repositorio.fullName}</td> 
                        <td>${repositorio.name}</td> 
                        <td>${repositorio.email}</td> 
                                                                               
                    </tr>
                    </c:forEach>
                </tbody>
                
            </table>
</body>
</html>
