<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thêm thông tin sinh viên</title>
    <link rel="stylesheet" href="css/style.css">
    <script src="js/validation.js"></script>
</head>
<body>
    <div class="container">
        <h2>Thêm thông tin sinh viên</h2>
        <c:if test="${not empty error}">
            <p class="error">${error}</p>
        </c:if>
        <c:if test="${not empty message}">
            <p style="color: green">${message}</p>
        </c:if>

        <form action="addStudent" method="post" onsubmit="return validateForm()">
            <h3>Thông tin sinh viên</h3>
            <label>Số CMND (*):</label>
            <input type="text" name="soCMND" required><br>
            <label>Họ tên:</label>
            <input type="text" name="hoTen"><br>
            <label>Email:</label>
            <input type="email" name="email"><br>
            <label>Số ĐT:</label>
            <input type="text" name="soDT"><br>
            <label>Địa chỉ:</label>
            <input type="text" name="diaChi"><br>

            <h3>Thông tin tốt nghiệp</h3>
            <label>Trường (*):</label>
            <select name="maTruong" required>
                <option value="">Chọn trường</option>
                <c:forEach var="school" items="${schools}">
                    <option value="${school.maTruong}">${school.tenTruong}</option>
                </c:forEach>
            </select><br>
            <label>Ngành (*):</label>
            <select name="maNganh" required>
                <option value="">Chọn ngành</option>
                <c:forEach var="major" items="${majors}">
                    <option value="${major.maNganh}">${major.tenNganh}</option>
                </c:forEach>
            </select><br>
            <label>Hệ tốt nghiệp:</label>
            <input type="text" name="heTN"><br>
            <label>Ngày tốt nghiệp (yyyy-MM-dd):</label>
            <input type="text" name="ngayTN" placeholder="yyyy-MM-dd"><br>
            <label>Loại tốt nghiệp:</label>
            <input type="text" name="loaiTN"><br>

            <input type="submit" value="Lưu">
            <a href="home">Quay lại trang chủ</a>
        </form>
    </div>
</body>
</html>