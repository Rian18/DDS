
function drawChart(contribuidores) {

    // Create the data table.
    var data = new google.visualization.DataTable();
    data.addColumn('string', 'Contribuidores');
    data.addColumn('number', 'Commits');
    for (var i = 0; i < contribuidores.length; i++) {
        data.addRows([

            [contribuidores[i].nome, i],
        ]);
    }
    // Set chart options
    var options = {'title': 'Apresentação de possíveis Colaboradores',
        'width': 400,
        'height': 300};

    // Instantiate and draw our chart, passing in some options.
    var chart = new google.visualization.PieChart(document.getElementById('chart_div'));
    chart.draw(data, options);
}
