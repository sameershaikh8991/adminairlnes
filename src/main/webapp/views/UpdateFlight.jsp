<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Flight</h2>
  <form action="/saveFlight">
           <label for="flightno">Flight No</label>
        <input type="text" name="flightNo" id=""><br>

        <label for="source">From</label>
        <input type="text" name="source"><br>

        <label for="destination">To</label>
        <input type="text" name="destinatin" id=""><br>

        <label for="departuretime">departure Time</label>
        <input type="text" name="departure_time" id=""><br>

        <label for="arrivaltime">Arrivel Time</label>
        <input type="text" name="arrival_time" id=""><br>

        <label for="duration">Duration</label>
        <input type="text" name="duration"><br>
        <input type="submit" value="add Flight">
    </form>
</body>
</html>