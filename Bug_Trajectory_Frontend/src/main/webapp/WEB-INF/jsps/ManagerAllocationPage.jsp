<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ManagerProjectAllocationPage</title>
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
      <a class="nav-link" href="ViewBugDetailPage">View Bug</a>
    </li>
   
    <li class="nav-item  navbar-right"" ></li>
    </ul>
  
   <ul class="nav navbar-nav navbar-right" style="float:right">
        <li> 
  Welcome Manager-${uObj.username}
  </li>
   <li class="nav-item active">
      <a class="nav-link" href="LogOut">LogOut</a>
    </li>
      </ul>
  

</nav>
</div>

<div >
<form action="Manager" method="post">
<br/>
	<table class="table table-dark table-hover table-responsive" style="width:400px;height:100%;margin-left:500px;">
		<tr>
			<td>Select Project:-</td>
			<td><select name="project" class="form-control">
			<option value="none">---------Select Project---------</option>
			<c:forEach items="${ProjectList}" var="plist">
			<option value="${plist.p_Id}">
			${plist.p_name}</option>
			</c:forEach>
			</select>
			</td>
		</tr>
		<tr>
			<td>Select Developer:-</td>
			<td><select name="Developer" multiple class="form-control">
			<option value="none">---------Select Developer---------</option>
			<c:forEach items="${developerList}" var="dlist">
			<option value="${dlist.userid}">
			${dlist.username}</option>
			</c:forEach>
			</select>
			</td>
		</tr>
		
		<tr>
			<td>Select Tester:-</td>
			<td><select name="Tester" multiple class="form-control">
			<option value="none">---------Select Tester---------</option>
			<c:forEach items="${testerList}" var="tlist">
			<option value="${tlist.userid}">
			${tlist.username}</option>
			</c:forEach>
			</select>
			</td>
		</tr>
		<td></td>
		<td><input type="submit" value="Allocate" class="btn btn-primary"></td>
		
	</table>

</form>	
</div>
</body>
</html>