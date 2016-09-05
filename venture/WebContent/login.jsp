<!-- 登陆页面 -->
<%@page contentType='text/html;charset=GBK' %>

<html>
<head>
<title>AB-AuditSystem</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">


<link rel='stylesheet' type='text/css' href='common/css/other.css'>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script type="text/javascript">

$(function(){
    $("#logonBtn").click(function(){
    	var separationMain="userMain={\"usercode\":\""+$('#usercode').val()+"\",\n"+
			"\"password\":\""+$('#password').val()+"\"}";

		var data = separationMain+"&v=1.0&method=user.logon&messageFormat=json&appKey="+$('#appKey').val()+"&locale=zh_CN";
        $.get($("#routerUrl").val(),data,function(data,textStatus){
            $("#result").html("");
            $("#result").fadeOut();
            var date = (new Date());
            var time = date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
            $("#result").html("<b>time:</b>"+time+ "<br/>"+
                              "<b>data:</b><br/>"+ JSON.stringify(data));
            $("#result").fadeIn();
        });
    });
})
</script>

<style type="text/css">
	body {FONT-FAMILY: 宋体;font-size:9pt}
	td {FONT-FAMILY: 宋体;font-size:9pt}
	input {FONT-FAMILY: 宋体;font-size:9pt}
	#text{
		text-shadow: 2px 2px 0px red;
	}
</style>
</head>
<body leftmargin="0" topmargin="0" onload=""  background="" >
 <div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1;y-index:-1;">    
<img src="images/loginback.png" height="100%" width="100%"/>    
</div>  

 <div id = "text">
 <font size="6px" style="position:absolute;margin-left: 37%;margin-top: 7%;" ><b>累计风险保额系统</b></font>
 <input id="routerUrl" type="hidden" value="http://localhost:8080/venture/router"/> <br/>
 </div>



<form name="fm" method="post"  action="risk/LogInput.jsp">
        <table width="846" border="0" cellspacing="0" style="position:relative;margin-top:12%;margin-left:17%;">
          <tr> 
            <td width="744" align="center" valign="top"><table width="421" height="193" border="0" cellpadding="3" cellspacing="0">
                <tr> 
                  <td width="294" height="50" align="right" valign="middle">用户名</td>
                  <td width="219">
                  <table width="101" border="0" cellspacing="0">
                      <tr>
                      
                        <td width="99"><input id="usercode" value="" class="common2" type="text" id="usercode" size="12" maxlength="8" onblur=""></td>
                      </tr>
                    </table>
                    </td>
                </tr>
                <tr> 
                  <td height="50" align="right" valign="middle">密码</td>
                  <td>
                  <table width="100" border="0" cellspacing="0">
                      <tr> 
                        <td><input id="password" value="" class="common2" type="Password" id="password" size="12" maxlength="20" ></td>
                      </tr>
                    </table>
                   </td>
                </tr>
                <tr>  
                 
                </tr>
                <tr/>
                <tr align="center" valign="top">
                	<td height="49" colspan="2"><table width="600" border="0" cellspacing="0" cellpadding="0">
                      <tr>
                        <td width="230" align="center">&nbsp;</td>
                        <td width="66"><input id="logonBtn" type="image" src="images/button_login.PNG"  width="57" height="24"></td>
                        <td width="218" align="left"><input type="image" src="images/button_reset.PNG" name="reset2" onClick="fm.reset();return false;" width="57" height="24"></td>
                      </tr>
                  </table></td>
                </tr>
				
              </table></td>
          </tr>
        </table>
<!--添加层-->		
		<span id="spanCode"  style="display: none; position:absolute; slategray; left: 736px; top: 264px; width: 229px; height: 44px;"> 
        </span> 
      </form> </td>
  </tr>
</table>

</body>
</html>
<script>
	fm.usercode.focus();
	</script>