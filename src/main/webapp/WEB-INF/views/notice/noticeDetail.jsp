<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>게시판 상세</title>
</head>
<body>

<table border="1" cellspacing="0" cellpadding="0" width="90%">
    <tr width="90%">
        <td width="10%" align="center">글쓴이</td>
        <td width="50%">${notice.createId}</td>
    </tr>
    <tr>
        <td align="center">제목</td>
        <td><input type="text" name="subject" style="width: 95%;" value="${notice.title}"></td>
    </tr>
    <tr>
        <td align="center">내용</td>
        <td><textarea name="content" style="width: 95%;height: 200px;">${notice.content}</textarea></td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <button type="button">수정</button>
            <button type="button" onclick="noticeListMove();">목록</button>
        </td>
    </tr>
</table>

</body>
</html>
<script>

    // 목록이동
    function noticeListMove() {
        location.href = "/notice";
    }

</script>