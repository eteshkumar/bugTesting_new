<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TesterLogInPage</title>
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
   
    <li class="nav-item">
      <a class="nav-link disabled" href="#">About Us</a>
    </li>
    <li class="nav-item  navbar-right"" ></li>
    </ul>
  
   <ul class="nav navbar-nav navbar-right" style="float:right">
        <li> 
  Welcome Tester ${uObj.username}
  </li>
  <li class="nav-item active">
      <a class="nav-link" href="LogOut">LogOut</a>
    </li>
      </ul>
  

</nav>
</div>
<div align="center">

<form action="test">
	
	<table border="1" align="center" class="table table-dark table-hover table-responsive" style="width:250px;height:100%;">
		<tr>
			<td>Project List</td>
			<td>Report</td>
		</tr>
		
		<c:forEach items="${ProjectList}" var="pList">
		<tr>
			<td>${pList.p_name}</td>
			
			<td><a href="BugAllocate/${pList.p_Id}">Report Bug</a></td>
		</tr>
		</c:forEach>
	</table>
		</form>
	</div>
</body>
</html>