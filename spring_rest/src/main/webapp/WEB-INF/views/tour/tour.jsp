<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Axios Example</title>
    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap Icons CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
<a href="tour/string">tour/string</a> <br>
<hr color="red">
<button id="b1" class="btn btn-primary">tour/json1(vo)</button>
<button id="b2" class="btn btn-primary">tour/json2(vo list)</button>
<button id="b3" class="btn btn-primary">tour/json3(from db-table)</button>
<button id="b4" class="btn btn-primary">tour/json3(from db-list)</button>
<div class="container mt-5">
    <div id="result" class="row"></div>
</div>

<script>
    document.getElementById('b1').addEventListener('click', function() {
        // Axios로 JSON 데이터를 호출
        axios.get('/tour/json1')
            .then(function (response) {
                // 데이터를 받아서 result div에 출력
                var tour = response.data;
                console.log(tour)
                var resultDiv = document.getElementById('result');

                // 기존 내용을 지우기
                resultDiv.innerHTML = '';

                var tourElement = document.createElement('div');
                tourElement.className = 'card col-12 col-md-6 offset-md-3';
                tourElement.innerHTML = '<div class="card-body">' +
                    '<h5 class="card-title">Destination: ' + tour.destination + '</h5>' +
                    '<p class="card-text">Duration: ' + tour.duration + ' days</p>' +
                    '<p class="card-text">Price: $' + tour.price + '</p>' +
                    '</div>';
                resultDiv.appendChild(tourElement);
            })
            .catch(function (error) {
                console.error('Error fetching the tour:', error);
            });
    });//b1

    document.getElementById('b2').addEventListener('click', function() {
        // Axios로 JSON 데이터를 호출
        axios.get('/tour/json2')
            .then(function (response) {
                // 데이터를 받아서 result div에 출력
                var tours = response.data;
                var resultDiv = document.getElementById('result');

                // 기존 내용을 지우기
                resultDiv.innerHTML = '';

                tours.forEach(function(tour) {
                    var tourElement = document.createElement('div');
                    tourElement.className = 'card col-12 col-md-6 offset-md-3 mb-3';
                    tourElement.innerHTML = '<div class="card-body">' +
                        '<h5 class="card-title">Destination: ' + tour.destination + '</h5>' +
                        '<p class="card-text">Duration: ' + tour.duration + ' days</p>' +
                        '<p class="card-text">Price: $' + tour.price + '</p>' +
                        '</div>';
                    resultDiv.appendChild(tourElement);
                });
            })
            .catch(function (error) {
                console.error('Error fetching the tours:', error);
            });
    });//b2

    document.getElementById('b3').addEventListener('click', function() {
        // Axios로 JSON 데이터를 호출
        axios.get('/tour/json3')
            .then(function (response) {
                // 데이터를 받아서 result div에 출력
                var tours = response.data;
                var resultDiv = document.getElementById('result');

                // 기존 내용을 지우기
                resultDiv.innerHTML = '';

                tours.forEach(function(tour) {
                    var tourElement = document.createElement('div');
                    tourElement.className = 'card col-12 col-md-6 offset-md-3 mb-3 bg-warning';
                    tourElement.innerHTML = '<div class="card-body">' +
                        '<h5 class="card-title text-primary">Destination: ' + tour.destination + '</h5>' +
                        '<p class="card-text">Duration: ' + tour.duration + ' days</p>' +
                        '<p class="card-text">Price: $' + tour.price + '</p>' +
                        '</div>';
                    resultDiv.appendChild(tourElement);
                });
            })
            .catch(function (error) {
                console.error('Error fetching the tours:', error);
            });
    });//b3

    document.getElementById('b4').addEventListener('click', function() {
        // Axios로 JSON 데이터를 호출
        axios.get('/tour/json3')
            .then(function (response) {
                // 데이터를 받아서 result div에 테이블 형태로 출력
                var tours = response.data;
                var resultDiv = document.getElementById('result');

                // 기존 내용을 지우기
                resultDiv.innerHTML = '';

                var table = document.createElement('table');
                table.className = 'table table-striped';

                var thead = document.createElement('thead');
                thead.innerHTML = '<tr>' +
                    '<th scope="col">#</th>' +
                    '<th scope="col">Destination</th>' +
                    '<th scope="col">Duration</th>' +
                    '<th scope="col">Price</th>' +
                    '</tr>';
                table.appendChild(thead);

                var tbody = document.createElement('tbody');
                tours.forEach(function(tour, index) {
                    var row = document.createElement('tr');
                    row.innerHTML = '<th scope="row">' + (index + 1) + '</th>' +
                        '<td><i class="bi bi-geo-alt-fill me-2"></i>' + tour.destination + '</td>' +
                        '<td>' + tour.duration + ' days</td>' +
                        '<td>$' + tour.price + '</td>';
                    tbody.appendChild(row);
                });
                table.appendChild(tbody);

                resultDiv.appendChild(table);
            })
            .catch(function (error) {
                console.error('Error fetching the tours:', error);
            });
    });//b4
</script>
</body>
</html>
