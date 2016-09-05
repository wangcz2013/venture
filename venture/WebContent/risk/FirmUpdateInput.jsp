<%@page contentType="text/html;charset=utf-8" %>
<html>
<head>

<script type="text/javascript" src="../js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="../js/codelist.js"></script>
<script type="text/javascript" src="../js/check.js"></script>
<SCRIPT src="../common/javascript/Common.js"></SCRIPT>
<SCRIPT src="../common/javascript/MulLine.js"></SCRIPT>
<SCRIPT src="FirmUpdate.js"></SCRIPT>
<SCRIPT src="../common/Calendar/Calendar.js"></SCRIPT>
<LINK href="../common/css/Project.css" rel=stylesheet type=text/css>
<LINK href="../common/css/mulLine.css" rel=stylesheet type=text/css>

<%@include file="./FirmUpdateInit.jsp"%>

<script type="text/javascript">

</script>

<title>平台管理 </title>
</head>
<body onload="initForm();">
	<br/>
	
	<div id="divShowInput">
		<table class="common">
		
			<TR class=common>
				<TD class=title>保险公司名称</TD>
				<TD class=input>
					  <input class=codeno  id="firmno" ondblclick="selclick(this,'firmcode',${user.comcode});" onkeyup="return selkeyup(this,'firmcode',${user.comcode});"><input id="firmno_name" class=codename  readonly=true>
					
				</TD>
			
				</TD>
				<TD class=title>分公司名称</TD>
				<TD class=input>
					 <input class=codeno   id="servicecode"  ondblclick="selclick(this,'firmno',${user.comcode});" onkeyup="return selkeyup(this,'firmno',${user.comcode});"><input id="servicecode_name" class=codename  readonly=true>
				</TD>
				
				<td>
						<div id="divCmdButton" style="display:''">
							<input value="公司查询" type=button onclick="searchFirm()" class="cssButton">
				</div>
				</td>
		
			</TR>
		</table>
		</div>
		
	
		<form id="firmfm" name="firmfm">
			<Div id="divFirmGrid">
				<table>
					<tr>
						<td class=titleImg>保险公司查询结果</td>
					</tr>
				</table>
				<table class=common>
					<tr class=common>
						<td text-align: left colSpan=1>
							<span id="spanFirmGrid"></span> 
						</td>
						
					</tr>
				</table>
				<INPUT VALUE="首  页" TYPE=button onclick="" class="cssButton"/>
				<INPUT VALUE="上一页" TYPE=button onclick="" class="cssButton"/>
				<INPUT VALUE="下一页" TYPE=button onclick="" class="cssButton"/>
				<INPUT VALUE="尾  页" TYPE=button onclick="" class="cssButton"/>
				<INPUT VALUE="更  新" TYPE=button onclick="forwordUpdate();" class="cssButton"/>
			</div>
		</form>
		
		<div id="hide" style="display: none">
		
			<table class=common>
				<tr>
					<TD class=input>
						<Input class=common name=Action id="Action">
					</TD>
				</tr>
			</table>
		</div>
		
		<div id="firmupdate" style="display: none">

		<hr/>
			<table>
					<tr>
						<td class=titleImg>保险公司更新</td>
					</tr>
				</table>
			<table class="common" id="addpl">
				<TR class=common>
						<TD class=title id="tdplatformno">保险公司编码</TD>
						<TD class=input >
							<Input class=common   id="firmcode" name="platformInfo.platformno"   >
						</TD>
						<TD class=title id="tdfirmowner">保险公司名称</TD>
						<TD class=input>
							<Input class=common   id="firmname" name="platformInfo.platformno"   >
						</TD>
						<TD class=title id="tdplatformname">机构编码</TD>
						<TD class=input>
							<Input class=common   id="comcode" name="platformInfo.platformno"   >
						</TD>
				</TR>
				<TR class=common>
					
					
					<TD class=title id="tdplatformname">分公司编码</TD>
						<TD class=input>
							<Input class=common   id="subfirmcode" name="platformInfo.platformno"   >
						</TD>
					<TD class=title id="tdplatformname">分公司名称</TD>
						<TD class=input>
							<Input class=common   id="subfirmname" name="platformInfo.platformno"   >
					</TD>
					<TD class=title id="tdplatformname">分公司管理机构</TD>
						<TD class=input>
							<Input class=common   id="subcomcode" name="platformInfo.platformno"   >
					</TD>
					
					
				</TR>
			</table>
			<br/>
			
			<div id="divCmdButton" >
							<input value="更  新" type=button onclick="update();" class="cssButton">
				</div>
		</div>
		
		
		<input type=hidden id="EdorValiFlag" name="EdorValiFlag">

	<span id="spanCode" style="display: none; position:absolute; slategray"></span>
	<input type="hidden" id="backmsg" value="${backmsg }" />
	<input type="hidden" id="errormsg" value="${errormsg }" />
</body>
</html>