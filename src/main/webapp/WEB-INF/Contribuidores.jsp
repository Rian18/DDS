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

        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
        <script type="text/javascript">
            var dados = <%=request.getAttribute("colaboradoresJson")%>;
            google.charts.load("current", {packages: ["corechart"]});
            google.charts.setOnLoadCallback(drawChart);
            function drawChart() {

                var data = new google.visualization.DataTable();
                data.addColumn('string', 'Contribuidores');
                data.addColumn('number', 'Commits');
                $.each(dados, function (i, dados)
                {
                    var nome = dados.nome;
                    var commits = dados.contribuicao;
                    data.addRows([[nome, commits]]);
                });
                var options = {
                    title: 'Commits por Contribuidor',
                    is3D: true,
                };
                var chart = new google.visualization.PieChart(document.getElementById('piechart'));
                chart.draw(data, options);
            }
            ;

        </script>

        <script type="text/javascript">
            // Some raw data (not necessarily accurate)
            var rowData1 = [['Month', 'Bolivia', 'Ecuador', 'Madagascar', 'Papua  Guinea',
                    'Rwanda', 'Average'],
                ['2004/05', 165, 938, 522, 998, 450, 114.6],
                ['2005/06', 135, 1120, 599, 1268, 288, 382],
                ['2006/07', 157, 1167, 587, 807, 397, 623],
                ['2007/08', 139, 1110, 615, 968, 215, 409.4],
                ['2008/09', 136, 691, 629, 1026, 366, 569.6]];
            var rowData2 = [['Month', 'Bolivia', 'Ecuador', 'Madagascar', 'Papua  Guinea',
                    'Rwanda', 'Average'],
                ['2004/05', 122, 638, 722, 998, 450, 614.6],
                ['2005/06', 100, 1120, 899, 1268, 288, 682],
                ['2006/07', 183, 167, 487, 207, 397, 623],
                ['2007/08', 200, 510, 315, 1068, 215, 609.4],
                ['2008/09', 123, 491, 829, 826, 366, 569.6]];

            // Create and populate the data tables.
            var data = [];
            data[0] = google.visualization.arrayToDataTable(rowData1);
            data[1] = google.visualization.arrayToDataTable(rowData2);

            var options = {
                width: 400,
                height: 240,
                vAxis: {title: "Cups"},
                hAxis: {title: "Month"},
                seriesType: "bars",
                series: {5: {type: "line"}},
                animation: {
                    duration: 1000,
                    easing: 'out'
                },
            };
            var current = 0;
            // Create and draw the visualization.
            var chart = new google.visualization.ComboChart(document.getElementById('visualization'));
            var button = document.getElementById('b1');
            function drawChart() {
                // Disabling the button while the chart is drawing.
                button.disabled = true;
                google.visualization.events.addListener(chart, 'ready',
                        function () {
                            button.disabled = false;
                            button.value = 'Switch to ' + (current ? 'Tea' : 'Coffee');
                        });
                options['title'] = 'Monthly ' + (current ? 'Coffee' : 'Tea') + ' Production by Country';

                chart.draw(data[current], options);
            }
            drawChart();

            button.onclick = function () {
                current = 1 - current;
                drawChart();
            }
        </script>

        <title>Contribuidores</title>
    </head>
    <body>
        <%@include file="/WEB-INF/jspf/cabecalho.jspf" %>
        <br/>
    <center><h3>Contribuidores</h3></center>
    <center><h6>Você poderá conhecer melhor um pouco dos contribuidores do Repositório escolhido</h6></center>

    <center><div id="piechart" style="width: 500px; height:300px;"></div></center>
    
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
