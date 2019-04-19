<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<t:genericpage title="Home" script="main.js">
  <jsp:attribute name="head">
    <link href="<c:url value="/assets/css/compiled/main.css"/>" rel="stylesheet"/>
  </jsp:attribute>
  <jsp:body>
    <main>
    </main>
  </jsp:body>
</t:genericpage>
