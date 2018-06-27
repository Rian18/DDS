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
        <%@include file="/WEB-INF/jspf/cabecalho.jspf" %>
        <br/>

        <div class="container-fluid">

            <center><h4>Encontre desenvolvedores e analistas para apoiarem na especificação de um requisito</h4></center>
            <center><h6>Você poderá inserir o domínio de seu projeto e assim encontrar pessoas capazes de te ajudar</h6></center>           
            <br/>
            <form method="post"> 
                <div class="row">
                    <div class="col">
                    </div>
                    <div class="col">

                        <input class="form-control form-control-sm" type="text" placeholder="Insira aqui a palavra chave para sua busca" name="keyword"/> 


                    </div>
                    <div class="col">

                    </div>
                </div>
                <br/>
                <div class="row">

                    <div class="col"> 
                    </div>
                    <div class="col">
                        <button type="submit" class="btn btn-success btn-sm">Buscar</button>
                        <button type="reset" class="btn btn-danger  btn-sm"/>Cancelar</button>
                    </div>
                    <div class="col"> 
                    </div>
                </div>           

            </form>
            <br/>
            <table class="table table-hover">
                <thead>
                    <tr class="table-success">
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
                    <td><center><a href="contribuidores.html?repo=${repositorio.id}">Visualizar</a></center></td> 

                    </tr>
                </c:forEach>
                </tbody>

            </table>
        </div>

        <%@include file="/WEB-INF/jspf/rodape.jspf" %>
    </body>

</html>
