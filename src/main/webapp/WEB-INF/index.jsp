<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina 1::</title>
</head>
<body>

<div>
  
     <h1>Mi primer JSP</h1>
     <h2><c:out value="${parametro1}"></c:out></h2>

</div>

</body>
</html>