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

<hr color="red">
<button id="b1" class="btn btn-primary">json1(one)</button>
<button id="b2" class="btn btn-primary">json2(list)</button>
<button id="b3" class="btn btn-primary">json3(list)</button>
<div class="container mt-5">
    <div id="result" class="row"></div>
</div>

<script>
    document.getElementById('b1').addEventListener('click', function() {
        // Axios로 JSON 데이터를 호출
        axios.get('json1.jsp')
            .then(function (response) {
                // 데이터를 받아서 result div에 출력
                let json = response.data;
                console.log(json)
                var resultDiv = document.getElementById('result');

                // 기존 내용을 지우기
                resultDiv.innerHTML = '';

                let jsonElement = document.createElement('div');
                jsonElement.className = 'card col-12 col-md-6 offset-md-3';
                jsonElement.innerHTML = '<div class="card-body">' +
                    '<h5 class="card-title">Today: ' + json.today + '</h5>' +
                    '<p class="card-text">Temp: ' + json.temp + ' days</p>' +
                    '<p class="card-text">hu: $' + json.hu + '</p>' +
                    '</div>';
                resultDiv.appendChild(jsonElement);
            })
            .catch(function (error) {
                console.error('Error fetching the tour:', error);
            });
    });//b1

    document.getElementById('b2').addEventListener('click', function() {
        // Axios로 JSON 데이터를 호출
        axios.get('json2.jsp')
            .then(function (response) {
                // 데이터를 받아서 result div에 출력
                let jsonArray = response.data;
                let resultDiv = document.getElementById('result');

                // 기존 내용을 지우기
                resultDiv.innerHTML = '';
                let img_result = "<img src=resources/image/rain.png width='100' height='100'><br>";

                jsonArray.forEach(function(json) {
                    let jsonElement = document.createElement('div');
                    jsonElement.className = 'card col-12 col-md-6 offset-md-3';
                    if(json.today == 'sun') {
                        img_result = "<img src=resources/image/sun.png width='100' height='100'><br>";
                    }
                    jsonElement.innerHTML = '<div class="card-body">' + img_result +
                        '<h5 class="card-title text-danger">Today: ' + json.today + '</h5>' +
                        '<p class="card-text">Temp: ' + json.temp + ' 도</p>' +
                        '<p class="card-text">hu: ' + json.hu + '</p>' +
                        '<p class="card-text">location: ' + json.location + '</p>' +
                        '</div>';
                    resultDiv.appendChild(jsonElement);
                });
            })
            .catch(function (error) {
                console.error('Error fetching the tours:', error);
            });
    });//b2

    document.getElementById('b3').addEventListener('click', function() {
        // Axios로 JSON 데이터를 호출
        axios.get('json3.jsp')
            .then(function (response) {
                // 데이터를 받아서 result div에 출력
                var jsonArray = response.data;
                var resultDiv = document.getElementById('result');

                // 기존 내용을 지우기
                resultDiv.innerHTML = '';

                jsonArray.forEach(function(json) {
                    const jsonElement = document.createElement('div');
                    jsonElement.className = 'card col-12 col-md-6 offset-md-3';
                    jsonElement.innerHTML = '<div class="card-body">' +
                        '<h5 class="card-title text-danger">Name: ' + json.name + '</h5>' +
                        '<p class="card-text">Age: ' + json.age + '세</p>' +
                        '<p class="card-text">Pic: <img src=resources/image/' + json.pic + ' width=100 height="100"></p>' +
                        '</div>';
                    resultDiv.appendChild(jsonElement);
                });
            })
            .catch(function (error) {
                console.error('Error fetching the tours:', error);
            });
    });//b3


</script>
</body>
</html>
