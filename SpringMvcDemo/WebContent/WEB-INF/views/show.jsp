<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" 
    prefix="fn" %> 
<html>
<head>
   
<body>
    <h1>Submit Form</h1>
    <h2>Name </h2><br><br>
   Student name::::${studentName}
   <div>
   <c:forEach items="${testList}" var="item">
   
   <c:if test="${not empty item}">
   
   <c:out value="${item}"></c:out>
</c:if>
</c:forEach>
   </div>
</body>
</html>