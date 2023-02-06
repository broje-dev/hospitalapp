<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<style>
.change{
position:relative;
left:30%;
right:30%
top:60%
}
body {
    background-image: url("https://static.vecteezy.com/system/resources/previews/004/941/847/non_2x/cosmetic-background-for-product-branding-and-packaging-presentation-geometry-form-circle-molding-on-podium-stage-with-shadow-of-leaf-background-design-eps10-vector.jpg");
}
.no-background {
    background-image: url("images/blank.jpg");
}
</style>

<meta charset="ISO-8859-1">
<title>registration</title>
</head>
<body class="change">
<h2>Create Registration</h2>

<form action="savePatientReg">

<table>
<tr><td>Patient Name</td><td><input type="text" name="patientName"/></td></tr>
<tr><td>City </td><td> <input type="text" name="city"/></td></tr>
<tr><td>Email Id  </td><td> <input type="text" name="email"/></td></tr>
<tr><td>Mobile  </td><td> <input type="text" name="mobile"/></td></tr>
<tr><td>  </td><td> <input type="submit" name="save"/></td></tr>

</table>

   
</form>

</body>
</html>