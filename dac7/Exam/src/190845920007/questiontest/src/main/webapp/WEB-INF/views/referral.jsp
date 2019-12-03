<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insert">
<table>

<tr>
<th>Refferal form</th>


</tr>
<tr>
<td>First Name</td>><td><input type="text" name="fname"></td>

</tr>
<tr>
<td>last Name</td><td><input type="text" name="lname"></td>

</tr>
<tr>
<td>Contact Number</td><td><input type="text" name="cno"></td>

</tr>

<tr>
<td>Email address</td> <td><input type="email" name="email"></td>

</tr>
<tr>
<td>Date Of birth</td><td><input type="text" name="bdate"></td>

</tr>
<tr>
<td>Current City/Location </td><td> <select name="city">
  <option value="gurgaon">gurgaon</option>
  <option value="mumbai">mumbai</option>
  <option value="pune">pune</option>
  <option value="chennai">chennai</option>
</select> </td>

</tr>
<tr>
<td><input type="submit" name="submit" value="submit"></td>

</tr>

</table>


</form>





</body>
</html>