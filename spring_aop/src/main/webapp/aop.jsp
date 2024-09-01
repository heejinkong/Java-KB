<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<html lang="UTF-8">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>트랜잭션 테스트</title>
    <link rel="stylesheet" href="resources/css/out2.css">
</head>
<body>

<div class="container">
    <div class="section">
        <div class="section-header">회원가입 먼저</div>
        <div class="section-content">
            <form action="/transaction.do" method="POST">
                <div class="form-group">
                    <label for="id">id:</label>
                    <input type="text" id="id" name="id" required value="win55">
                </div>
                <div class="form-group">
                    <label for="pw">pw:</label>
                    <input type="password" id="pw" name="pw" required value="1234">
                </div>
                <div class="form-group">
                    <label for="name">name:</label>
                    <input type="text" id="name" name="name" required value="name">
                </div>
                <div class="form-group">
                    <label for="tel">tel:</label>
                    <input type="text" id="tel" name="tel" value="011">
                </div>
        </div>
    </div>

    <div class="section">
        <div class="section-header">게시판 글쓰기 나중</div>
        <div class="section-content">
                <div class="form-group">
                    <label for="title">제목:</label>
                    <input type="text" id="title" name="title" required value="title">
                </div>
                <div class="form-group">
                    <label for="content">내용:</label>
                    <input type="text" id="content" name="content" required value="content">
                </div>
                <div class="form-group">
                    <label for="writer">작성자:</label>
                    <input type="text" id="writer" name="writer" required value="win55">
                </div>
                <div class="form-group">
                    <input type="submit" value="글쓰기">
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
