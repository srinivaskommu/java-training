<html>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<head>
<title>customer registration form </title>
</head>

<b>customer registration form </b><br/>

<s:form action="customer" > 
 
<s:textfield name="id" label="Customer Id"/>
<s:textfield name="firstName" label="Customer firstName"/>
<s:textfield name="lastName" label="Customer lastName"/>
<s:textfield name="servicePrice" label="Services Price"/>
<s:textfield name="prodcutsPrice" label="Products Price"/>
<s:radio list="{'MEMBER','NON MEMBER'}" name="isMember"/>

<s:combobox  label="Member Type"   name="memberType" list="#{'GOLD':'GOLD', 'SILVER':'SILVER', 'PREMIUM':'PREMIUM'}" 
   headerKey="-1"
   headerValue="--- Please Select ---"
   emptyOption="false"/>

<s:submit value="save"/>  

</s:form>  


</html>