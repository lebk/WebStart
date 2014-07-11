<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<DIV class=header >
<DIV class=title_img>
<IMG src="/WebStart/css/InventoryIcon.jpg"/>
</DIV>
<DIV id=welcome_msg>
<span style="FLOAT:left">当前用户：  &nbsp; &nbsp;</span>
<a href="<s:url action="login"/>"><font color="yellow">登录&nbsp;&nbsp;</font></a>
<a href="<s:url action="logout"/>"><font color="yellow">登出</font></a>
</P>
</DIV>
</DIV>
