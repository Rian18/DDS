<%-- 
    Document   : Contribuidores
    Created on : 24/05/2018, 13:02:20
    Author     : Rian Alves
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Contribuidores</h1>
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
                        <td><center><a href="">Visualizar</a></center></td> 
                                                                               
                    </tr>
                    </c:forEach>
                </tbody>
                
            </table>
    </body>
</html>
