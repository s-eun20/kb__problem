<!-- city.jsp -->
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>City Form</title>
</head>
<body>
<h1>Enter City Information</h1>
<a href="tour?cityName=busan&cityPopulation=5000">busan</a>
<hr style="background-color: red; height:2px; border:none">
<form action="tour" method="post">
    <label for="cityName">City Name:</label>
    <input type="text" id="cityName" name="cityName"><br>
    <label for="cityPopulation">City Population:</label>
    <input type="text" id="cityPopulation" name="cityPopulation"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
