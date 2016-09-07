<%@page contentType="text/html;charset=utf-8" %>
<html>
<head>

<script type="text/javascript" src="../js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="../js/codelist.js"></script>
<script type="text/javascript" src="../js/check.js"></script>
<SCRIPT src="../common/javascript/Common.js"></SCRIPT>
<SCRIPT src="../common/javascript/MulLine.js"></SCRIPT>
<SCRIPT src="riskalgorithm.js"></SCRIPT>
<SCRIPT src="../common/Calendar/Calendar.js"></SCRIPT>
<LINK href="../common/css/Project.css" rel=stylesheet type=text/css>
<LINK href="../common/css/mulLine.css" rel=stylesheet type=text/css>

<%@include file="./riskalgorithmInit.jsp"%>

<script type="text/javascript">

</script>

<title>平台管理 </title>
</head>
<body onload="initForm();">
	<br/>
	 <input id="routerUrl" type="hidden" value="http://localhost:8080/venture/router"/> 
		
	<div id="divShowInput">
		<table class="common">	
			<TR class=common>
				<TD class=title>风险类别</TD>
				<TD class=input>
					  <input class=codeno  id="risktype" ondblclick="selclick(this,'risktype');" onkeyup="return selkeyup(this,'risktype');"><input id="risktype_name" class=codename  readonly=true>		
				</TD>
				<TD class=title>是否未成年人</TD>
				<TD class=input>
					<input class=codeno  id="isadult" ondblclick="selclick(this,'isadult');" onkeyup="return selkeyup(this,'isadult');"><input id="isadult_name" class=codename  readonly=true>
				</TD>			
				</TD>
				<TD class=title>公式</TD>
				<TD class=input>
					<!-- <Input class="coolDatePicker" verify="有效开始日期|DATE" dateFormat="short" name=startdate id=startdate > -->
					<input class=codeno  id="formula" ondblclick="selclick(this,'formula');" onkeyup="return selkeyup(this,'formula');"><input id="formula_name" class=codename  readonly=true>
				</TD>				
				
			</TR>
			
		</table>
		
	
			
	<div id="divShowInput2">
		<table class="common">	
			<TR class=common>
			   <td>
						<div id="divCmdButton" style="display:''">
						<input value="算法新增" type=button onclick="addriskalgorithm()" class="cssButton">
							<input value="算法查询" type=button onclick="searchPlan()" class="cssButton">
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
	</div>	
		<br/>

	
		<div id="divAlgorInput" style="display: none;">
		<table class="common">	
			<TR class=common>
				<TD class=title>险种</TD>
				<TD class=input>
					  <input   id="risktype"  type="text"  >		
				</TD>
				
			</TR>
			<TR class=common>
				<TD class=title>风险类别</TD>
				<TD class=input>
					  <input class=codeno  id="risktype" ondblclick="selclick(this,'risktype');" onkeyup="return selkeyup(this,'risktype');"><input id="risktype_name" class=codename  readonly=true>		
				</TD>
				
			</TR>
			<TR class=common>
				<TD class=title>是否未成年人</TD>
				<TD class=input>
					  <input class=codeno  id="risktype" ondblclick="selclick(this,'risktype');" onkeyup="return selkeyup(this,'risktype');"><input id="risktype_name" class=codename  readonly=true>		
				</TD>
				
			</TR>
			<TR class=common>
				<TD class=title>公式</TD>
				<TD class=input>
					  <input class=codeno  id="risktype" ondblclick="selclick(this,'risktype');" onkeyup="return selkeyup(this,'risktype');"><input id="risktype_name" class=codename  readonly=true>		
				</TD>
				
			</TR>
			<TR class=common>
				<TD class=title>百分比</TD>
				<TD class=input>
					  <input  id="risktype" type="text" >		
				</TD>
				
			</TR>
			
		</table>
		算法
		<br/>
		<textarea rows="8" cols="130" id="excuresult"></textarea>
		<table class="common">	
			<TR class=common>
			   <td>
						<input value="提交" type=button onclick="addriskalgorithm2()" class="cssButton">
						<input value="返回" type=button onclick="addriskalgorithm2()" class="cssButton">
				</td>
			</TR>
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
		
	
	
	<span id="spanCode" style="display: none; position:absolute; slategray"></span>
	
</body>
</html>