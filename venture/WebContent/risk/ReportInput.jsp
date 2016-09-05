<%@page contentType="text/html;charset=utf-8" %>
<html>
<head>

<script type="text/javascript" src="../js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="../js/codelist.js"></script>
<script type="text/javascript" src="../js/check.js"></script>
<SCRIPT src="../common/javascript/Common.js"></SCRIPT>
<SCRIPT src="../common/javascript/MulLine.js"></SCRIPT>
<SCRIPT src="Report.js"></SCRIPT>
<SCRIPT src="../common/Calendar/Calendar.js"></SCRIPT>
<LINK href="../common/css/Project.css" rel=stylesheet type=text/css>
<LINK href="../common/css/mulLine.css" rel=stylesheet type=text/css>

<%@include file="./ReportInit.jsp"%>

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
				
				<TD class=title>报表名称</TD>
				<TD class=input>
					 <input class=codeno   id="reportcode"  ondblclick="selclick(this,'reportcode',${user.comcode});" onkeyup="return selkeyup(this,'reportcode',${user.comcode});"><input id="reportcode_name" class=codename  readonly=true>
				</TD>
				
		
			</TR>
		</table>
		<div id="divCmdButton" style="display:''">
		
			<input value="报表查询" type=button onclick="queryReport()" class="cssButton">
			<INPUT VALUE="报表新增" TYPE=button onclick="addReport()" class="cssButton" >
			<INPUT VALUE="报表删除" TYPE=button onclick="delReport()" class="cssButton">
			
			
		</div>
		
		
		
	
		<form id="reportfm" name="reportfm" >
			<Div id="divReportGrid" >
				<table>
					<tr>
						<td class=titleImg>报表查询结果</td>
					</tr>
				</table>
				<table class=common>
					<tr class=common>
						<td text-align: right colSpan=1>
							<span id="spanReportGrid"></span> 
						</td>
						
					</tr>
					
				</table>
				
				<INPUT VALUE="首  页" TYPE=button onclick="" class="cssButton"/>
				<INPUT VALUE="上一页" TYPE=button onclick="" class="cssButton"/>
				<INPUT VALUE="下一页" TYPE=button onclick="" class="cssButton"/>
				<INPUT VALUE="尾  页" TYPE=button onclick="" class="cssButton"/>
			</div>
		</form>
		
		
		<table class="common">
				<TD class=title>开始日期</TD>
				<TD class=input>
					<Input class="coolDatePicker" verify="有效开始日期|DATE" dateFormat="short" name=startdate id=startdate >
				</TD>
				<TD class=title>结束日期</TD>
				<TD class=input>
					<Input class="coolDatePicker" verify="有效结束日期|DATE" dateFormat="short" name=enddate id=enddate >
				</TD>
				<td><INPUT VALUE="EXCEL导出" TYPE=button onclick="loaddata()" class="cssButton"></td>
		</table>	
			
	</div>
		<div id="hide" style="display: none">
		
			<table class=common>
				<tr>
					<TD class=input>
						<Input class=common name=Action id="Action">
					</TD>
				</tr>
			</table>
		</div>
		
	<form id="reportaddfm" name="reportaddfm">
			<div id="divAddReport" style="display: none" >
				<table class="common">
				
					<TR class=common>
						<TD class=title>保险公司名称</TD>
						<TD class=input>
							  <input class=codeno  id="firmno" ondblclick="selclick(this,'firmcode',${user.comcode});" onkeyup="return selkeyup(this,'firmcode',${user.comcode});"><input id="firmno_name" class=codename  readonly=true>
							
						</TD>
					
			
						<TD class=title>分公司名称</TD>
						<TD class=input>
							 <input class=codeno   id="servicecode"  ondblclick="selclick(this,'firmno',${user.comcode});" onkeyup="return selkeyup(this,'firmno',${user.comcode});"><input id="servicecode_name" class=codename  readonly=true>
						</TD>
						
						<TD class=title>报表名称</TD>
						<TD class=input>
							 <input class=common name="reportname"  id="reportname"  >
						</TD>
						
				
					</TR>
					
				
				</table>
				<table class="common">
						<TR >
							<TD class=titleImg>报表提数逻辑</TD>
						</TR>
						<tr>
						<TD>
								<textarea   rows="15" cols="150" id="datasql"></textarea>
							</TD>
						</tr>			
					</table>
					<div id="divCmdButton" style="display:''">
						<input value="提   交" type=button onclick="saveReport();" class="cssButton">
						<input value="返   回" type=button onclick="back();" class="cssButton">
						
					</div>
				
				</div>
				
	</form>
		
		<input type=hidden id="EdorValiFlag" name="EdorValiFlag">

	<span id="spanCode" style="display: none; position:absolute; slategray"></span>
	
</body>
</html>