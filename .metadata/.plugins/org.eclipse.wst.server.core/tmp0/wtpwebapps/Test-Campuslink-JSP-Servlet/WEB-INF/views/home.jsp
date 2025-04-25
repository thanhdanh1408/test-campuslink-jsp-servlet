<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Trang chủ - Hệ thống quản lý thống kê việc làm</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h2>Hệ thống Quản lý Thống kê Việc làm Sinh viên</h2>
        <p>Chào mừng bạn đến với hệ thống quản lý thông tin tốt nghiệp và việc làm của sinh viên trên toàn quốc.</p>
        <div class="menu">
            <h3>Chọn chức năng:</h3>
            <ul>
                <li><a href="${pageContext.request.contextPath}/student/add">Thêm thông tin sinh viên và tốt nghiệp</a></li>
                <li><a href="${pageContext.request.contextPath}/student/search">Tìm kiếm thông tin cơ bản của sinh viên</a></li>
                <li><a href="${pageContext.request.contextPath}/student/graduationJob">Tìm kiếm thông tin tốt nghiệp và việc làm</a></li>
            </ul>
        </div>
    </div>
</body>
</html>