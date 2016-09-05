<%@page contentType="text/html;charset=GBK" %>

<html>
<head>
  <title>信息反馈</title>
   <%@page import="com.zjlife.venture.util.*"%>
  <%--页面样式--%>
  <link rel="stylesheet" type="text/css" href="../css/Project.css">
<%
  String SUCCESS    = "S";  //成功
  String FAILURE    = "F";  //失败
  String COMMON     = "C";  //一般信息

 String Picture    = request.getParameter("picture");
 
  String Content    = StrTool.unicodeToGBK(request.getParameter("content"));
 
  /*********************************************************************/    
  
  String strPicture ="";  
                               
%>

</head>
<body class="interface">
  <h1><center>系统信息</center></h1>
  <br>

<%
  if(Picture==null)
    Picture = COMMON;

  if(Picture.equalsIgnoreCase(SUCCESS)){
    strPicture ="success.gif";
 
    }
  else if (Picture.equalsIgnoreCase(FAILURE))
    strPicture ="failure.gif";
  else
    strPicture ="common.gif";
%>

<table>
  <td>
    <img src='../../images/<%=strPicture%>'>
  </td>
  <td class="common">
    <%=Content%>
  </td>
</table>

<table >
  <center>
  <table width=80%><tr><td align=left>
    <!--<table id=lpc bgcolor=blue><tr><td>&nbsp;</td></tr></table>-->
    
    </td></tr>
  </table>
  </center>
</table>

<%if (Content.indexOf("正在") == -1) {%>
<center><input type=button class=common id=butSubmit value="确 定" onclick="window.close()" tabIndex=0>
<%}%>
<script language=JavaScript>

ini = new Date().getTime();
var pc = 0;
//load();

function load() {
  pc += 1;
  lpc.style.width = pc + "%";
  time = setTimeout("load()",30);
  if (pc > 100) { 
    pc=0;
  }
}

function loaded() {
  fim = new Date().getTime();
  dif = fim - ini;
  ld.style.display = 'none';
  body.style.backgroundColor = 'silver';
  q.innerHTML = dif/1000;
  page.style.display = '';
}

function Show() {
  if (txt.style.display == "none") { txt.style.display = "" }
  else { txt.style.display = "none" }
}
// event.onAnyDoubt = "../js.htm";

try {
  window.butSubmit.focus();
} 
catch(e) {}

</script>

</body>
</html>