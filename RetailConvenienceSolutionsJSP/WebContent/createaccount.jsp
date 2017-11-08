<%@page import="com.google.gson.Gson"%>
<%@page import="edu.ecu.retailconveniencesolutions.User"%>
<%@page import="edu.ecu.retailconveniencesolutions.RegisterAccountController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="scripts/jquery-3.2.1.min.js"></script>
	<script>
		$(document).ready(function(){
	
			var obj = jQuery.parseJSON( '{"firstname": "John", "lastname": "Doe", "email": "johndoe@students.ecu.edu", "streetAddress": "123 Tabrizi Drive Greenville, NC", "zipCode": 27858, "username": "JohnDoe"}' );

			var firstName = obj.firstname;
			var lastName = obj.lastname;
			var email = obj.email;
			var streetAddress = obj.streetAddress;
			var zipCode = obj.zipCode;
			var username = obj.username;
    
			$('#firstName').html(firstName);
			$('#lastName').html(lastName);
			$('#email').html(email);
			$('#streetAddress').html(streetAddress);
			$('#zipCode').html(zipCode);
			$('#username').html(username);
		});
	</script>
	<title>Create Account</title>
</head>
<body>
	<table>
		<tr>
			<td>First Name: </td>
			<td id="firstName"></td>
		</tr>
		<tr>
			<td>Last Name: </td>
			<td id="lastName"></td>
		</tr>
		<tr>
			<td>Email: </td>
			<td id="email"></td>
		</tr>
		<tr>
			<td>Street Address: </td>
			<td id="streetAddress"></td>
		</tr>
		<tr>
			<td>Zip Code: </td>
			<td id="zipCode"></td>
		</tr>
		<tr>
			<td>Username: </td>
			<td id="username"></td>
		</tr>
	</table>
	
	<% 
		String jsonString = "{\"firstName\":\"John\",\"lastName\":\"Doe\",\"email\":\"johndoe@students.ecu.edu\",\"streetAddress\":\"123 Tabrizi Drive Greenville, NC\",\"zipCode\":27858,\"username\":\"JohnDoe\"}";
		Gson gson = new Gson();
		User user = gson.fromJson(jsonString, User.class);
			
		RegisterAccountController controller = new RegisterAccountController();
		controller.addAccountToDB(user);
			
	%>
</body>
</html>