<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
        <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
<h2>update list</h2>
<form action="saveUpdateReg">
<pre >
<input type="hidden" name="id" value="${update.id }"/>
Patient Name<input type="text" name="patientName" value="${update.patientName }"/>
City<input type="text" name="city" value="${update.city }"/>
Email Id <input type="text" name="email"value="${update.email }"/>
Mobile<input type="text" name="mobile"value="${update.mobile }"/>
<input type="submit" value="save"/>
</pre> 
</form>


         
      





</body>
</html>