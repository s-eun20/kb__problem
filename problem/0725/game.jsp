<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-25
  Time: 오후 3:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>game</title>
</head>
<body>
<h1>Game Form</h1>
<h3>자바 스크립트로 GET요청</h3>

<form action="game" method="get">
    gameName : <input type="text" name="gameName"><br>
    gameType : <input type="text" name="gameType"><br>
    <input type="submit" value="자바 스크립트로 GET 요청">
</form>
<hr style="background-color: blue; height:2px; border:none">
<form action="player" method="post">
    Player name : <input type="text" name="playerName"><br>
    Player Score : <input type="text" name="playerScore"><br>
    <input type="submit" value="폼으로 POST 요청">
</form>


</body>
</html>
