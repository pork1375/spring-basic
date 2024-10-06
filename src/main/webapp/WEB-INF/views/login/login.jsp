<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>로그인</title>
</head>
<style>
</style>
<body>
<h2>로그인</h2>
<form>
    <label for="email">아이디 : </label>
    <input type="email" id="email" name="email" required><br><br>
    <label for="password">비밀번호 : </label>
    <input type="password" id="password" name="password" required><br><br>
    <button type="submit">로그인</button> <button onclick="userAdd();">회원가입</button>
</form>
</body>
</html>
<script>
    function userAdd() {
        location.href = "/login/user-add";
    }
</script>