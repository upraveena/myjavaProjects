<?xml version="1.0" encoding="ISO-8859-1" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	<jsp:directive.page contentType="text/html; charset=ISO-8859-1" 
		pageEncoding="ISO-8859-1" session="false"/>
	<jsp:output doctype-root-element="html"
		doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
		omit-xml-declaration="true" />
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title> Interstellar Transport System </title>
</head>
<body>
<h2>Select source and destination for finding the shortest path</h2>
	<form method="post" modelAttribute="planetNames" action="saveDetails">   
    	
<table>	
<tr>
    <td>Select source planet</td>
    <td><form:select id="planetNode" path="planetNames">
           <form:option value="NONE" label="--- Select ---" />
           <form:options items="${planetNames}" itemValue="value" itemLabel="lable"/>
         </form:select>
    </td>
    <td><form:errors path="planetNames" cssClass="error" /></td>
    <td>Select Destination planet</td>
    <td><form:select id="planetNode" path="planetNames">
           <form:option value="NONE" label="--- Select ---" />
           <form:options items="${planetNamesList}" itemValue="value" itemLabel="lable"/>
         </form:select>
    </td>
    <td><form:errors path="planetNames" cssClass="error" /></td>
</tr>
</table>	
<input type="submit" value="Submit">
</form>
</body>
</html>
</jsp:root>