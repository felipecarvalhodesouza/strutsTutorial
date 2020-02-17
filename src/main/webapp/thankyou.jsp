<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Registration Successful</title>
  </head>
  <body>
    <h3>Thank you for registering for a prize.</h3>

    <p>Your registration information:</p>
    <p> First name: <s:property value="personBean.firstName" /> </p>
    <p> Last Name:  <s:property value="personBean.lastName" /> </p>
    <p> Email:      <s:property value="personBean.email" /> </p>
    <p> Age:        <s:property value="personBean.age" /> </p>
    
    <p> Information using the toString() </p>
    <p> <s:property value="personBean" /> </p>

    <p><a href="<s:url action='index' />" >Return to home page</a>.</p>
  </body>
</html>