<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-29
  Time: 오후 2:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>도시 정보 입력</h1>
<form action="cityinsert" method="post">
    <br>
    도시 이름 : <input type="text" name="name"><br>
    국가 코드 : <input type="text" name="code"><br>
    지역 : <input type="text" name="district"><br>
    인구 : <input type="text" name="population"><br>
    <button type="submit">삽입</button>
</form>
<br>
<a href="cityList">City 전체 목록 검색</a>

</body>
</html>
