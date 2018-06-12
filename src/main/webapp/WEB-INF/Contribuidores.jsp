<%-- 
    Document   : Contribuidores
    Created on : 24/05/2018, 13:02:20
    Author     : Rian Alves
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/WEB-INF/jspf/bootstrap.jspf" %>
        <title>Contribuidores</title>
    </head>
    <body>
        <%@include file="/WEB-INF/jspf/cabecalho.jspf" %>
        <br/>
    <center><h3>Contribuidores</h3></center>
    <center><h6>Você poderá conhecer melhor um pouco dos contribuidores do Repositório escolhido</h6></center>

    <table class="table table-hover">
        <thead>
            <tr class="table-primary">
                <th><center>Nome</center></th>
    <th><center>E-mail</center></th>
<th><center>Localização</center></th>
<th><center>Foto</center></th>
</tr>
</thead>
<tbody>
    <c:forEach var="contribuidor" items="${contribuidores}">

        <tr>
            <td><center><a href="${contribuidor.url}" target="_blank">${contribuidor.nome}</center></td> 
<td><center><a href="mailto:${contribuidor.email}" target="_blank">${contribuidor.email}</center></td> 
<td><center>${contribuidor.localizacao}</center></td> 
<td><center><img src="${contribuidor.imagem_URL}" alt="imagem Usuário" width="64" height="64"></center></td> 

</tr>
</c:forEach>
</tbody>

</table>
<%@include file="/WEB-INF/jspf/rodape.jspf" %>
</body>
</html>
