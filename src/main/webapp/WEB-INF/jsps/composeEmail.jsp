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
<title>compose</title>
</head>
<body class="change">
<h2>composeEmail</h2>
<form action="sentEmail">
<pre>
To   <input type="text" name="to" value="${email}"/>
Sub  <input type="text" name="sub"/>
 <textarea rows="10" cols="20" name="msg">

 </textarea>
	<input type="submit" value="sent"/>
</pre>

</form>
${sent}
</body>
</html>