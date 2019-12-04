<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AssignBug Page</title>
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
  Manager ${uObj.username}
  </li>
      </ul>
</nav>
</div>
<div align="center">
<h2>Assign Bug To Developer</h2>
<hr/>
<form action="${path}/assigned" method="get">
	<table   align="center" class="table table-dark table-hover table-responsive" style="width:500px;height:100%;" >
	<tr>
		<td>Project Name:-</td>
		<td>
		<input type="hidden" value="${bugAllocationDetail.bugAllocateId }" name="bugAllocateId">
		<input type="hidden" value="${bugAllocationDetail.projectObj.p_Id }" name="projectId">
		<%-- ${bugAllocationDetail.projectObj.p_name}--%>
		 <input type="text" value="${bugAllocationDetail.projectObj.p_name}"  readonly="readonly">
		</td>
	</tr>
	<tr>
		<td>Developer List:-</td>
			<td><select name="developer">
			<option value="none">--------Select developer--------</option>
			<c:forEach items="${developerList}" var="dlist">
			<option value="${dlist.userid}">
			${dlist.username}</option>
			</c:forEach>
			</select>
			
	<tr>
		<td>Bug Type:-</td>
		<td><input type="text" value="${bugAllocationDetail.bugTypeObj.bug_type}" readonly="readonly"></td>
	</tr>
	
	<tr>
	<td>Bug Status:-</td>
	  <td><select name="status">
    <option value="0">------Select Bug Status--------</option>
          <c:forEach items="${statusList}" var="statusObj">
           <option value="${statusObj.status_id}">${statusObj.status_name}</option>
           </c:forEach>    
     </select> 
    </td>
	
	<td>
	</tr>
	<tr>
	<td>Assigned Date:-</td>
	<td><input type="date" name="plannedStartDate"></td>
	</tr>
	<tr>
		<td>End Date:-</td>
		<td><input type="date" name="plannedEndDate"></td>
		</tr>		
	<tr>
		<td>Description:-</td>
		<td><textarea  cols="20" rows="5" readonly="readonly">${bugAllocationDetail.description}</textarea><td>
	</tr>
		
		<tr>
			<td></td>
			<td><input type="submit" value="Assign"></td>
			</tr>
			
</table>
	</form>
	</div>
	</body>
	</html>

