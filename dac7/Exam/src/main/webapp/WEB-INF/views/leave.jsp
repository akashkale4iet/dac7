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
<th>Leave form</th>


</tr>
<tr>
<td>Employee Number</td>><td><input type="number" name="emp_no"></td>

</tr>
<tr>
<td>Leave Reason </td><td> <select name="l_reason">
  <option value="Personal Leave">Personal Leave</option>
  <option value="Sick Leave">Sick Leave</option>
  <option value="Out Of Station">Out Of Station</option>
</select> </td>

</tr>


<tr>
<td>Leave Start Date</td><td><input type="date" name="l_start"></td>

</tr>
<tr>
<td>Leave End Date</td><td><input type="date" name="l_end"></td>

</tr>
<tr>
<td><input type="submit" name="submit" value="Apply Leave"></td>

</tr>

</table>


</form>





</body>
</html>