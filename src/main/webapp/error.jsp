<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
</head>
<body>
	<h4>The application has malfunctioned.</h4>

	<p>Please contact technical support with the following information:</p>

	<h4>
		Exception Name:	<s:property value="exception" />
	</h4>

	<h4>
		Exception Details:	<s:property value="exceptionStack" />
	</h4>

</body>
</html>