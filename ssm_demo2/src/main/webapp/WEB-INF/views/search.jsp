<%@ page  contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户查询</title>
</head>
<body>
  <form action="search.do" method="get">
  	 <fieldset>
  	 	<legend>用户查询</legend>
  	 	<input type="text" name="name" placeholder="请输入用户名" />
  	 	<button>查询</button>
  	 </fieldset>
  </form>
  
  <ul>
  	<c:if test="${not empty userlist }">
  		<c:forEach var="u" items="${userlist}">
  			<li>
  				<span>${u.id}</span>
  				<span>${u.name}</span>
  				<span>${u.sex}</span>
  				<span>${u.age}</span>
  				<span>${u.info}</span>
  			</li>
  		</c:forEach>
  	</c:if>
  </ul>
  
  
  
</body>
</html>