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

        <title>Minera Git - Busca GitHub</title>

        <script type="text/javascript" src="C:\Users\Rian Alves\Desktop\Envio3\DDS\src\main\webapp\WEB-INF\VivaGraphJS-master\dist\vivagraph.js"></script>
        <script type="text/javascript">
            function main() {
                // Step 1. Create a graph:
                var graph = Viva.Graph.graph();
                // Step 2. Add graph content.
                graph.addNode('anvaka', '91bad8ceeec43ae303790f8fe238164b');
                graph.addNode('indexzero', 'd43e8ea63b61e7669ded5b9d3c2e980f');
                graph.addLink('anvaka', 'indexzero');
                // Step 3. Customize node appearance.
                var graphics = Viva.Graph.View.svgGraphics();
                // Nothing changed in these lines. They are the same as in Step 2
                // of this tutorial. Except maybe chaining support:
                graphics.node(function (node) {
                    return Viva.Graph.svg('image')
                            .attr('width', 40)
                            .attr('height', 40)
                            .link('https://secure.gravatar.com/avatar/' + node.data);
                }).placeNode(function (nodeUI, pos) {
                    nodeUI.attr('x', pos.x - 12).attr('y', pos.y - 12);
                });
                // Step 4. Customize link appearance:
                //   As you might have guessed already the link()/placeLink()
                //   functions complement the node()/placeNode() functions
                //   and let us override default presentation of edges:
                graphics.link(function (link) {
                    return Viva.Graph.svg('path')
                            .attr('stroke', 'blue')
                            .attr('stroke-dasharray', '5, 5');
                }).placeLink(function (linkUI, fromPos, toPos) {
                    // linkUI - is the object returend from link() callback above.
                    var data = 'M' + fromPos.x + ',' + fromPos.y +
                            'L' + toPos.x + ',' + toPos.y;
                    // 'Path data' (http://www.w3.org/TR/SVG/paths.html#DAttribute )
                    // is a common way of rendering paths in SVG:
                    linkUI.attr("d", data);
                });
                // Step 5. Render the graph with our customized graphics object:
                var renderer = Viva.Graph.View.renderer(graph, {
                    graphics: graphics
                });
                renderer.run();
            }
        </script>
        <style type="text/css" media="screen">
            html, body, svg { width: 100%; height: 100%;}
        </style>
        <script type="text/javascript">
            var progresso = new Number();
            var maximo = new Number();
            progresso = 0;
            maximo = 100;
                function start(){
                    if((progresso + 1)< maximo){
                        progresso = progresso + 1;
                        document.getElementById("pg").value=progresso;
                        setTimeout("start();",1000);
                        
                    }
                }
        </script>
    </head>
    <body onload="start();">
        <%@include file="/WEB-INF/jspf/cabecalho.jspf" %>
        <br/>

        <div class="container-fluid">

            <center><h4>Encontre desenvolvedores e analistas para apoiarem na especificação de um requisito</h4></center>
            <center><h6>Você poderá inserir o domínio de seu projeto e assim encontrar pessoas capazes de te ajudar</h6></center>           
            <br/>

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
            <div id="pg" class="progress">
                <div class="progress-bar bg-info" role="progressbar" aria-valuemin="0" aria-valuemax="100"></div>
            </div>
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
