<%@ page contentType="text/html; charset=UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

<h2>
添加产品类型
</h2>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>添加产品类型</title>
<link href="<s:url value="/css/main.css"/>" rel="stylesheet" type="text/css"/>
</head>

<div id="link">
<s:url action="showProductTypeListtilesAction" var="aURL" />
<s:a href="%{aURL}"><u>[返回产品类型列表界面]</u></s:a>
</div>

<s:form action="addProductTypetilesAction" enctype="multipart/form-data" method="post">
<div style="text-align:center">
    <s:textfield name="addProductType" key="产品类型"/>
</div>

<div style="text-align:center">    
    <s:submit key="提交" name="update"/>
</div>
</s:form>
