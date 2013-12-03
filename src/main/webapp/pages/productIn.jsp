<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<html>
<head>
<title>产品入库</title>
<link href="<s:url value="/css/main.css"/>" rel="stylesheet"
	type="text/css" />
</head>
<body>
	<center>
		<h2>产品入库</h2>
	</center>
	<s:form action="productInSubmit" enctype="multipart/form-data"
		method="post">

		<div id="container">
			<div id="link">
				<s:submit value="提交" theme="simple" />
			</div>
			<table align=center class="borderAll">
				<tr>
					<th><s:text name="编号" /></th>
					<th><s:text name="类型" /></th>
					<th><s:text name="花色" /></th>
					<th><s:text name="尺寸" /></th>
					<th><s:text name="库存数量" /></th>
					<th><s:text name="入库数量" /></th>
					<th>&nbsp;</th>
				</tr>
				<s:iterator value="productInList" status="status" var="productInRow">
					<tr
						class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
						<td class="nowrap"><s:property value="id" /></td>
						<td class="nowrap"><s:select list="ptList"
								name="productInList[%{#status.index}].selectedProductType"
								theme="simple" /></td>
						<td class="nowrap"><s:select list="pcList"
								name="productInList[%{#status.index}].selectedProductColor"
								theme="simple" /></td>
						<td class="nowrap"><s:select list="psList"
								name="productInList[%{#status.index}].selectedProductSize"
								theme="simple" /></td>
						<td class="nowrap"><s:property
								value="productInList[%{#status.index}].ptNumber" /></td>
						<td class="nowrap"><s:textfield
								name="productInList[%{#status.index}].inNum" size="5"
								theme="simple" /></td>
					</tr>
				</s:iterator>
				<table>
					</div>
					</s:form>
</body>
</html>