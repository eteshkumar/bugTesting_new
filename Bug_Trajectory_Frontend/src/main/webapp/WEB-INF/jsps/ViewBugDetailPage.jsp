<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BugDetailPage</title>
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
  Welcome ${uObj.username}
  </li>
      </ul>
  

</nav>
</div>

<h1 align="center">Bugs Detail</h1>
<div align="center">
	<table border="1" align="center" class="table table-dark table-hover table-responsive" style="width:1000px;height:500%;">
		<tr>
			<th>BugAllocated Id</th>	
			<th>Project Name</th>
			<th>Bug Name</th>
			<th>Bug Status</th>
			<th>Bug Severity</th>
			<th>Bug Description</th>
			<th>Bug Assignment</th>
		</tr>
		<c:forEach items="${bugAllocationDetailList}" var="bList">
		<tr>
			<td>${bList.bugAllocateId}</td>
			<td>${bList.projectObj.p_name}</td>
			<td>${bList.bugTypeObj.bug_type}</td>
			<td>${bList.bugStatusObj.status_name}
			<td>${bList.severityObj.severity_name}</td>
			<td>${bList.description}</td>
			<td><a href="${path}/ShowBugDetail/${bList.bugAllocateId}">Assign Bug</a></td>
		</tr>
		</c:forEach>
		</table>
		</div>
		</body>
		</html>
		