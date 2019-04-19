<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@tag description="Generic webpage skeleton with optional head and content." pageEncoding="UTF-8"%>
<%@attribute name="title" required="true"%>
<%@attribute name="head" fragment="true" %>
<%@attribute name="script" required="false"%>
<html>
  <head>
    <jsp:include page="./components/globalincludes.jsp"></jsp:include>
    <jsp:invoke fragment="head"/>
    <title>${title}</title>
  </head>
  <body>
    <div>
      <jsp:include page="./components/header.jsp"></jsp:include>
      <jsp:doBody/>
      <jsp:include page="./components/footer.jsp"></jsp:include>
    </div>

    <c:choose>
      <c:when test="${not empty script}">
       <script src="<c:url value="/assets/js/"/>${script}" charset="utf-8"></script>
      </c:when>
    </c:choose>
  </body>
</html>
