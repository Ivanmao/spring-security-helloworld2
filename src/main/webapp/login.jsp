<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>

	<form action='<c:url value="/j_spring_security_check"></c:url>' method="post">
		<table>
			<tr>
				<td>username:</td>
				<td><input name="username" type="text"></td>
			</tr>
			<tr>
				<td>password:</td>
				<td><input name="password" type="password"></td>
			</tr>
			<tr>
				<td><input type="button" value="cancel"></td>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>

	</form>

</body>
</html>
