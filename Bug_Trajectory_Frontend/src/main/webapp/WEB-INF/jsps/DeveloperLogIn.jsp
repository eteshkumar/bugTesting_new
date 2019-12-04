<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DeveloperLogInPage</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div>
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
<span class="navbar-text">
  Bug Trajectory Arrangement
  </span>
  	<ul class="navbar-nav">
    <li class="nav-item  navbar-right"" ></li>
    </ul>
  
   <ul class="nav navbar-nav navbar-right" style="float:right">
        <li> 
  Welcome Developer ${uObj.username}
  </li>
  <li class="nav-item active">
      <a class="nav-link" href="LogOut">LogOut</a>
    </li>
      </ul>
  

</nav>
</div>
<div align="center" style="color:red">
	
	<form>
		<table>
		<tr>
			<td align="center">Assigned Project:-</td>
			</tr>
			<tr>
			<td>
			<c:forEach items="${ProjectList}" var="pList">
		
			<input type="text" value="${pList.p_name}">
			</c:forEach></td>
		</tr>
		<tr>
		<td></td>
		<td><input type="submit" value="BugAssigned" style="align:center"></td>
		</tr>
		</table>
	</form>
	</div>
</body>
</html>