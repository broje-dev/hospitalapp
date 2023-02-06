<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
        <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
<meta charset="ISO-8859-1">
<title>listPatient</title>
</head>
<body>
<h2>Patient List</h2>
<table>
<tr>
<th>Patient name</th>
<th>City</th>
<th>Email</th>
<th>Mobile</th>
<th>action</th>
</tr>
 <c:forEach var = "patients" items="${patient}">
   <tr>
   <td>${patients.patientName}</td>
   <td>${patients.city}</td>
   <td>${patients.email}</td>
   <td>${patients.mobile}</td>
   <td><a href ="delete?id=${patients.id }">delete</a></td>
   <td><a href ="update?id=${patients.id }">update</a></td>
   <td><a href ="compose?email=${patients.email }">email</a></td>

   </tr>      
         
         
      </c:forEach>




</table>
</body>
</html>