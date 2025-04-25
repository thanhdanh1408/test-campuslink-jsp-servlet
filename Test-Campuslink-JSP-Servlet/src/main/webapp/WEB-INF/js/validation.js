function validateForm() {
    var ngayTN = document.getElementsByName("ngayTN")[0].value;
    var datePattern = /^\d{4}-\d{2}-\d{2}$/;
    if (ngayTN && !datePattern.test(ngayTN)) {
        alert("Ngày tốt nghiệp phải có định dạng yyyy-MM-dd!");
        return false;
    }
    return true;
}