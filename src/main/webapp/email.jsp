<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<c:if test = "${invalidEmail != null}">
<b> Niepoprawny email </b>
</c:if>

<%--
<% if (request.getAttribute("invalidEmail") != null) { %>
    <b>Niepoprawny email</b>
<% } %>
--%>
<form action="" method="POST">
Podaj adres email:
<input name="email"/>
<input type="submit" value="Wyslij"/>
</form> 