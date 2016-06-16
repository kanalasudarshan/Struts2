<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<title>Insert title here</title>
</head>
<body>

<s:form action="longin.action" method="post">
      <s:textfield name="userName"  label="Name" size="20" />
      <s:textfield name="password" label="Age" size="20" />
      <s:submit name="submit" label="Submit" align="center" />
</s:form>
</body>
</html>