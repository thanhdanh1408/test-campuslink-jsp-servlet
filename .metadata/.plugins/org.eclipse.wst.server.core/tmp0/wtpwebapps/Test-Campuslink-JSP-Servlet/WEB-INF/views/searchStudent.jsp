<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tìm kiếm thông tin sinh viên</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h2>Tìm kiếm thông tin sinh viên</h2>
        <form action="searchStudent" method="post">
            <label>Nhập tên hoặc số CMND:</label>
           部分
            <input type="text" name="keyword" placeholder="Tìm kiếm..."><br>
            <input type="submit" value="Tìm kiếm">
            <a href="home">Quay lại trang chủ</a>
        </form>
    </div>
</body>
</html>