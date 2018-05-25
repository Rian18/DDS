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
        <header>
            <nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
            <a class="navbar-brand" href="#">
                <img src="/docs/4.1/assets/brand/bootstrap-solid.svg" width="30" height="30" alt="">Minera Git</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="index.html">Início <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="repositorio.html">Busca</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Perfil</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Documentação
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Artigo</a>
                            <a class="dropdown-item" href="#">Documento de Requisitos</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Trabalho Dissertativo</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Sobre</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Sair</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Busque na Plataforma">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Busca</button>
                </form>
            </div>
        </nav>
        </header>
        

        <br/>
        <div class="container-fluid">
        
             <center><h4>Encontre desenvolvedores e analistas para apoiarem na especificação de um requisito</h4></center>
             <center><h6>Você poderá inserir o domínio de seu projeto e assim encontrar pessoas capazes de te ajudar<h6></center>           
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
        </div>
</body>
<footer>
    <div class="card-footer text-muted text-center">
        Tópicos em Desenvolvimento de Software II- DCC094<br/>
        Departamento de Ciência da Computação - UFJF<br/>
        Professor : José Maria David<br/>
        Rian das Dores Alves/Gabriel dos Santos Nascimento<br/>
        Desenvolvimento distribuído de Software 
    </div>

</footer>
</html>
