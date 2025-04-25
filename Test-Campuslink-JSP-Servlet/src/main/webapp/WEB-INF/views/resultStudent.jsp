<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kết quả tìm kiếm thông tin sinh viên</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h2>Kết quả tìm kiếm</h2>
        <c:if test="${not empty error}">
            <p class="error">${error}</p>
        </c:if>
        <c:if test="${not empty students}">
            <table border="1">
                <tr>
                    <th>Số CMND</th>
                    <th>Họ tên</th>
                    <th>Email</th>
                    <th>Số ĐT</th>
                    <th>Địa chỉ</th>
                </tr>
                <c:forEach var="student" items="${students}">
                    <tr>
                        <td>${student.soCMND}</td>
                        <td>${student.hoTen}</td>
                        <td>${student.email}</td>
                        <td>${student.soDT}</td>
                        <td>${student.diaChi}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
        <a href="searchStudent">Tìm kiếm lại</a> | <a href="home">Quay lại trang chủ</a>
    </div>
</body>
</html>