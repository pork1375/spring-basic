<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <meta charset="UTF-8">
    <title>회원가입</title>
</head>
<style>
    div { margin-bottom: 15px; }
</style>
<body>
<h2>회원가입</h2>
    <div>
        <label for="userId">아이디:</label>
        <input type="text" id="userId" name="userId" maxlength="50" required>
    </div>
    <div>
        <label for="userName">이름:</label>
        <input type="text" id="userName" name="userName" maxlength="50" required>
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
        <button onclick="signUp()">회원가입</button>
    </div>
</body>
</html>
<script>

    // 회원가입
    function signUp() {

        const reqData = {
            userId : document.querySelector("#userId").value,
            userName : document.querySelector("#userName").value,
            email : document.querySelector("#email").value,
            password : document.querySelector("#password").value
        }

        // validation(reqData);

        console.log(reqData);

        $.ajax({
            type: 'post',
            url: '/login/user-add',
            data: JSON.stringify(reqData),
            dataType : "json",
            contentType:"application/json",
            success: function (resData) {
                console.log(resData);

            },
            error: function (err) {
                console.log(err);

                if (err.status === 400) {
                    alert("code : " + err.responseJSON.code + "\nmessage : " + err.responseJSON.message);
                } else {
                    alert("서버에러 관리자에게 문의 하세요.");
                }

            }
        });

    }

    function validation(data) {

        if (data.userId.length === 0) {
            alert("아이디를 입력하세요.");
            return false;
        }

        if (data.userName.length === 0) {
            alert("이름 입력하세요.");
            return false;
        }

        if (data.email.length === 0) {
            alert("이메일을 입력하세요.");
            return false;
        }

        if (data.password.length === 0) {
            alert("비밀번호를 입력하세요.");
            return false;
        }

        return isCheck;
    }





</script>