<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
</head>
<style>
    div { margin-bottom: 15px; }
</style>
<body>
<h2>회원가입</h2>
<form action="/" method="POST">
    <div>
        <label for="user_id">아이디:</label>
        <input type="text" id="user_id" name="user_id" maxlength="50" required>
    </div>
    <div>
        <label for="user_name">이름:</label>
        <input type="text" id="user_name" name="user_name" maxlength="50" required>
    </div>
    <div>
        <label for="email">이메일:</label>
        <input type="email" id="email" name="email" maxlength="100" required>
    </div>
    <div>
        <label for="password">비밀번호:</label>
        <input type="password" id="password" name="password" maxlength="255" required>
    </div>
    <div>
        <button type="submit">회원가입</button>
    </div>
</form>
</body>
</html>