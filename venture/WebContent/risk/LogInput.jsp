<%@page contentType="text/html;charset=utf-8" %>
<html>
<head>

<script type="text/javascript" src="../js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="../js/codelist.js"></script>
<script type="text/javascript" src="../js/check.js"></script>
<SCRIPT src="../common/javascript/Common.js"></SCRIPT>
<SCRIPT src="../common/javascript/MulLine.js"></SCRIPT>
<SCRIPT src="Log.js"></SCRIPT>
<SCRIPT src="../common/Calendar/Calendar.js"></SCRIPT>
<LINK href="../common/css/Project.css" rel=stylesheet type=text/css>
<LINK href="../common/css/mulLine.css" rel=stylesheet type=text/css>

<%@include file="./LogInit.jsp"%>

<script type="text/javascript">

</script>

<title>平台管理 </title>
</head>
<body onload="initForm();">
	<br/>
	
		
		<table>
					<tr>
						<td class=common>
							<img src="../images/butExpand.gif" onclick="showclose();" class="delcolum" onmouseover="this.style.cursor='hand'"  id="imgShowOpen"/>
							<img src="../images/butCollapse.gif" onclick="showopen();"   onmouseover="this.style.cursor='hand'" id="imgShowclose" style="display: none">
						</td>
						<td class=titleImg>
							批处理执行日志
						</td>
					</tr>
				</table>
	<div id="divShowInput">
	
	
	
	
		<table class="common">
		
			<TR class=common>
				<TD class=title>基本任务编码</TD>
				<TD class=input>
					  <input class=codeno  id="taskcode" ondblclick="selclick(this,'taskcode',${user.comcode});" onkeyup="return selkeyup(this,'taskcode',${user.comcode});"><input id="taskcode_name" class=codename  readonly=true>
					
				</TD>
				<TD class=title>执行日期</TD>
				<TD class=input>
					<Input class="coolDatePicker" verify="有效开始日期|DATE" dateFormat="short" name=startdate id=startdate >
				</TD>
				</TD>
				<TD class=title>执行状态</TD>
				<TD class=input>
					  <input class=codeno  id="excutestatus" ondblclick="selclick(this,'excutestatus','00');" onkeyup="return selkeyup(this,'excutestatus','00');"><input id="excutestatus_name" class=codename  readonly=true>
					
				</TD>
				
			
			</TR>
			
		   <TR class=common>
				
				<TD class=title>任务计划编码</TD>
				<TD class=input>
					  <input class=codeno  id="taskplancode" ondblclick="selclick(this,'taskplancode',${user.comcode});" onkeyup="return selkeyup(this,'taskcode',${user.comcode});"><input id="taskplancode_name" class=codename  readonly=true>
					
				</TD>
		
			</TR>
			
				
				<td>
						<div id="divCmdButton" style="display:''">
							<input value="查  询" type=button onclick="searchPlan()" class="cssButton">
				</div>
				</td>
		
			</TR>
		</table>
		</div>
		
	
		<form id="planfm" name="planfm">
			<Div id="divPlanGrid" align="center">
				
				<table class=common>
					<tr class=common> 
						<td text-align: right colSpan=1>
							<span id="spanPlanGrid"></span> 
							
						</td>
						
					</tr>
					<tr class=common> 
						<td text-align: right colSpan=1>
							<div align="right" >
								第  1/2 页  &nbsp;&nbsp;转到&nbsp;<INPUT VALUE="" TYPE="text"   style="width: 40px;" />&nbsp;页
								<INPUT VALUE="- >" TYPE=button onclick="" class="cssButton"/>
							</div>
							
						</td>
						
					</tr>
				</table>
				
				<INPUT VALUE="首  页" TYPE=button onclick="" class="cssButton"/>
				<INPUT VALUE="上一页" TYPE=button onclick="" class="cssButton"/>
				<INPUT VALUE="下一页" TYPE=button onclick="" class="cssButton"/>
				<INPUT VALUE="尾  页" TYPE=button onclick="" class="cssButton"/>
				
				
		
			</div>
		</form>
		
		<br/>
		<hr/>
	<div id="divShowDetail">
	
		<table class="common">
		
					<TR class=common>
						<TD class=title>任务名称</TD>
						<TD class=input>
							   <input class=common   id="taskname"  >
							
						</TD>
						<TD class=title>执行日期</TD>
						<TD class=input>
							   <input class=common   id="dodate"  >
							
						</TD>
						<TD class=title>执行时间</TD>
						<TD class=input>
							   <input class=common   id="dotime"  >
							
						</TD>
						
					
					</TR>
					
				   <TR class=common>
						<TD class=title>执行状态</TD>
						<TD class=input>
							   <input class=common   id="status"  >
							
						</TD>
						<TD class=title>结束日期</TD>
						<TD class=input>
							   <input class=common   id="enddate"  >
							
						</TD>
						<TD class=title>结束时间</TD>
						<TD class=input>
							   <input class=common   id="endtime"  >
							
						</TD>
					</TR>
						
				   <TR class=common>
						<TD class=title colspan="6" >结果描述</TD>
						
					</TR>
					 
			</table>
			<div>
		
			<textarea rows="8" cols="130" id="excuresult"></textarea>
		</div>
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
		
	
	
	<span id="spanCode" style="display: none; position:absolute; slategray"></span>
	
</body>
</html>