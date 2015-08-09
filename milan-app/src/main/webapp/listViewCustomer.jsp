<html>

<body>

<%@ taglib uri="/struts-tags" prefix="s" %>  
  
<h1>All Customer Records:</h1> 
<table> 

<s:iterator  value="customerList">  
<tr>
 	<s:property value="customerId"/> 
 	<s:property value="firstName"/> 
 	<s:property value="lastName"/>  
 	<s:property value="isAMember"/>  
 	<s:property value="memberType"/>  

</tr>
</s:iterator>

</table> 


</body>
</html>