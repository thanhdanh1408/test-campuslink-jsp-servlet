<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kết quả tìm kiếm tốt nghiệp và việc làm</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h2>Kết quả tìm kiếm</h2>
        <c:if test="${not empty error}">
            <p class="error">${error}</p>
        </c:if>
        <c:if test="${not empty results}">
            <table border="1">
                <tr>
                    <th>Số CMND</th>
                    <th>Họ tên</th>
                    <th>Mã ngành (Tốt nghiệp)</th>
                    <th>Mã trường</th>
                    <th>Mã ngành (Công ty)</th>
                    <th>Tên công ty</th>
                    <th>Thời gian làm việc</th>
                </tr>
                <c:forEach var="result" items="${results}">
                    <tr>
                        <td>${result[0]}</td>
                        <td>${result[1]}</td>
                        <td>${result[2]}</td>
                        <td>${result[3]}</td>
                        <td>${result[4]}</td>
                        <td>${result[5]}</td>
                        <td>${result[6]}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
        <a href="searchGraduationJob">Tìm kiếm lại</a> | <a href="home">Quay lại trang chủ</a>
    </div>
</body>
</html>