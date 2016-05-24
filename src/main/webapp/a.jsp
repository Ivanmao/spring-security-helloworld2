<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<body>
<h2>this is a!</h2>

<sec:authorize access="hasRole('ROLE_USER')">

  This content will only be visible to users who have the "ROLE_USER" authority in their list of <tt>GrantedAuthority</tt>s.

</sec:authorize>

<sec:authorize access="hasRole('ROLE_ADMIN')">

  This content will only be visible to users who have the "ROLE_ADMIN" authority in their list of <tt>GrantedAuthority</tt>s.

</sec:authorize>

</body>
</html>