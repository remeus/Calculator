<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="../Driver/Client.java" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Expression Calculator</title>
	
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
	<script type="text/javascript" src="JavaScriptResources.js"></script>
	<link rel="stylesheet" type="text/css" href="style.css"></link>
	
</head>

<body>

	<%
		DriverPackage.Client client = new DriverPackage.Client();
			String infix = "4 + 5";
			int calcResult = 0;
			calcResult = client.expressionResult(infix);
			System.out.print(calcResult);
	%>

	<div id="image">
		<img src = "logo.png" alt="Calculator"/>	
	</div>

	<div id="content">			
		<FORM id="expForm" name="expForm" action="">
			<INPUT id="expSubmit" type="submit" name="expSubmit" value="Submit">
			<TEXTAREA id="expArea" name="expArea" cols="70" rows="2">
			</TEXTAREA>
		</FORM>	
	</div>
	
	<div id="result">
	
	<%= calcResult %>
	
	</div>

</body>

</html>