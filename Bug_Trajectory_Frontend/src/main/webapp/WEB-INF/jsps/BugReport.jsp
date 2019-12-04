<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BugReportPage</title>
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
  Welcome ${uObj.username}
  </li>

      </ul>
  

</nav>
</div>
<div align="center">
	
	${msg}
	<form action="${path}/BugSuccessfullyAllocated" method="get">
		<table border="1" align="center" class="table table-dark table-hover table-responsive" style="width:400px;height:500%;">
			<tr>
				<td> Tester Name: </td>
				<td> <input type="text" value="${uObj.username}" readonly="readonly"></td>
			</tr>
			<tr>
				<td> Project Name: </td>
			<td> 
 				<input type="text" value="${projectObj.p_name}" readonly="readonly">

 			</td>
			</tr>
		<tr>
      		<td> Bug Type: </td>
  			<td><select name="bug">
    			<option value="none">-------Select--------</option>
   				<c:forEach items="${bugListObj}" var="bObj">
       			<option value="${bObj.bugtype_id}">${bObj.bug_type}</option>
           		</c:forEach>    
     		</select> 
    </td>
</tr>
<tr>
      <td> Severity : </td>
  <td><select name="Severity">
    <option value="none">---------Select--------</option>
   <c:forEach items="${severityList}" var="severityList">
       <option value="${severityList.severity_id}">${severityList.severity_name}</option>
           </c:forEach>    
     </select> 
    </td>
</tr>
  <tr>
<td> Description: </td>
<td> <textarea cols="30" rows="8" name="description" required></textarea></td>
</tr>
<tr>
       <td></td>
              <td>
                     <input type="submit" value="Report Bug">
              </td>
       </tr>
</table>
</form>
</div>
</body>
</html>