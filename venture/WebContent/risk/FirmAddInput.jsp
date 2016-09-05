<%@page contentType="text/html;charset=utf-8" %>
<html>
<head>

<script type="text/javascript" src="../js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="../js/codelist.js"></script>
<script type="text/javascript" src="../js/check.js"></script>
<SCRIPT src="../common/javascript/Common.js"></SCRIPT>
<SCRIPT src="../common/javascript/MulLine.js"></SCRIPT>
<SCRIPT src="./FirmAdd.js"></SCRIPT>
<SCRIPT src="../common/Calendar/Calendar.js"></SCRIPT>
<LINK href="../common/css/Project.css" rel=stylesheet type=text/css>
<LINK href="../common/css/mulLine.css" rel=stylesheet type=text/css>



<script type="text/javascript">

</script>

<title>平台管理 </title>
</head>
<body>
	<br/>
		<div id="divHideInput">
			<table>
				<tr>
					<td class=titleImg><font size='2.5px'>保险公司基本信息</font></td>
				</tr>
			</table>
			<form action="" method=post name=fm >
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
			</table>
			</form>
		
			<div id="divSubCmdButtonbase" >
			<INPUT VALUE="提 交" TYPE=button onclick="save()" class="cssButton" id="platformsub">
			<INPUT VALUE="返  回" TYPE=button onclick="cancelClick()" class="cssButton">
			</div>
			<hr/>
			<table>
				<tr>
					<td class=titleImg><font size='2.5px'>分公司管理</font></td>&nbsp;&nbsp;
				<!-- 	<td><img src="../common/images/butNew.gif" alt="模块增加"></td> -->
				<td><INPUT VALUE="新 增" TYPE=button  class="cssButton" onclick="addSubFirm();" ></td>
				</tr>
			</table>
			</table>
			<hr/>
			
			
			<div id="divdatasql">
				<table class="common">
				<TR class=common>
					<TD class=title>所属保险公司</TD>
					<TD class=input>
						 <input class=codeno name=areaCode  id="owerfirm"  value="1000" readonly="readonly" ><input id="tablename_name" class=codename name=areaCodeName value="泰康人寿" readonly=true>
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
				<div id="divSubCmdButtondatasql">
					<INPUT VALUE="提 交" TYPE=button onclick="save()" class="cssButton">
					<INPUT VALUE="返  回" TYPE=button onclick="cancelClick()" class="cssButton">
				</div>		
			</div>
	
			
			
		</div>
		
	
		<div id="divdatadetailsql" style="display: none;">
				<table class="common">
					<TR class=common>
					
					<TD class=title>所属平台</TD>
					<TD class=input>
						 <input class=codeno name=areaCode  id="platformowner"  value="1000" readonly="readonly" ><input id="tablename_name" class=codename name=areaCodeName value="江苏满意度平台" readonly=true>
					</TD>
					<TD class=title>所属模块</TD>
					<TD class=input>
						 <input class=codeno name=areaCode  id="modelowner" value="1001" readonly="readonly" ><input id="tablename_name" class=codename name=areaCodeName value="北京健康险个险承保" readonly=true>
					</TD>
					<TD class=title>所属表</TD>
					<TD class=input>
						 <input class=codeno name=areaCode  id="tableower" ondblclick="selclick(this);"   onkeyup="return selkeyup(this);" onchange="checkchange();"><input id="tableower_name" class=codename name=areaCodeName readonly=true>
					</TD>
					<TD class=title>备注</TD>
					<TD class=input>
						 <Input class=common name=company value="" id="detailmark">
					</TD>
					
					
				</TR>
				</table>
				<table class="common">
				<TR >
					<TD class=titleImg>抓具体数据sql</TD>
				</TR>
					
					<tr>
					<TD>
							<textarea  rows="15" cols="150" id="detailsql" onfocus="checktableower();"></textarea>
						</TD>
					</tr>			
			</table>
			  <div id="divSubCmdButtondetailsql">
					<INPUT VALUE="提 交" TYPE=button onclick="savedatadetailsql()" class="cssButton">
					<INPUT VALUE="返  回" TYPE=button onclick="cancelClick()" class="cssButton">
				</div>			
		</div>
		
		
		
		<div id="divnodeorder" style="display: none;">
				<table class="common">
					<TR class=common>
					
					<TD class=title>所属平台</TD>
					<TD class=input>
						 <input class=codeno name=areaCode  id="plnodeowner"  value="1000" readonly="readonly" ><input id="tablename_name" class=codename name=areaCodeName value="江苏满意度平台" readonly=true>
					</TD>
					<TD class=title>所属模块</TD>
					<TD class=input>
						 <input class=codeno name=areaCode  id="monodeowner" value="1001" readonly="readonly" ><input id="tablename_name" class=codename name=areaCodeName value="北京健康险个险承保" readonly=true>
					</TD>
					<TD class=title>所属表</TD>
					<TD class=input>
						 <input class=codeno name=areaCode  id="tablenodeower" ondblclick="selclick(this);"   onkeyup="return selkeyup(this);" onchange="checkchange();"><input id="tablenodeower_name" class=codename name=areaCodeName readonly=true>
					</TD>
				</TR>
					<TR class=common>
					<TD class=title>父节点</TD>
					<TD class=input>
						 <input class=codeno name=areaCode  id="parentnode" ondblclick="selclick(this);"   onkeyup="return selkeyup(this);" onchange="checkchange();"><input id="parentnode_name" class=codename name=areaCodeName readonly=true>
					</TD>
					<TD class=title>节点层次</TD>
					<TD class=input>
						  <Input class=common name=company value=""  id="nodeLevel">
					</TD>
					<TD class=title>备注</TD>
					<TD class=input>
						  <Input class=common name=company value="" id="remark" >
					</TD>
					
					
				</TR>
				
				</table>
				
			  <div id="divSubCmdButtonnodeorder">
					<INPUT VALUE="提 交" TYPE=button onclick="savenodeorder()" class="cssButton">
					<INPUT VALUE="返  回" TYPE=button onclick="cancelClick()" class="cssButton">
				</div>			
		</div>
		
		<div id="divtransorder" style="display: none;">
				<table class="common">
					<TR class=common>
						<TD class=title>所属平台</TD>
						<TD class=input>
							 <input class=codeno name=areaCode  id="pltransowner"  value="1000" readonly="readonly" ><input id="pltransowner_name" class=codename name=areaCodeName value="江苏满意度平台" readonly=true>
						</TD>
						<TD class=title>所属模块</TD>
						<TD class=input>
							 <input class=codeno name=areaCode  id="motransowner" value="1001" readonly="readonly" ><input id="motransowner_name" class=codename name=areaCodeName value="北京健康险个险承保" readonly=true>
						</TD>
						<TD class=title>所属表</TD>
						<TD class=input>
							 <input class=codeno name=areaCode  id="tabletransower" ondblclick="selclick(this);"   onkeyup="return selkeyup(this);" onchange="checktranstable();"><input id="tabletransower_name" class=codename name=areaCodeName readonly=true>
						</TD>
					</TR>
				
			
				<TR class=common>
					<TD class=title>节点层次</TD>
					<TD class=input>
						  <Input class=common name=company value=""  id="transLevel">
					</TD>
					<TD class=title>备注</TD>
					<TD class=input>
						  <Input class=common name=company value="" id="transremark" >
					</TD>
					
				</TR>
				</table>
				<table class="common">
					<TR class=common>
						<TD class=titleImg>更新节点sql</TD>
					</TR>
					<tr>
					<TD>
							<textarea  rows="15" cols="150" id="transsql" onfocus="checktabletransower();"></textarea>
						</TD>
					</tr>			
			</table>
			  <div id="divSubCmdButtontransorder">
					<INPUT VALUE="提 交" TYPE=button onclick="savetransorder()" class="cssButton">
					<INPUT VALUE="返  回" TYPE=button onclick="cancelClick()" class="cssButton">
				</div>			
		</div>
		
				
		<div id="divcodemap" style="display: none;">
				<table class="common">
					<TR class=common>
						<TD class=title>所属平台</TD>
						<TD class=input>
							 <input class=codeno name=areaCode  id="plcodemapowner"  value="1000" readonly="readonly" ><input id="pltransowner_name" class=codename name=areaCodeName value="江苏满意度平台" readonly=true>
						</TD>
						<TD class=title>数据来源</TD>
						<TD class=input>
							 <input class=codeno name=areaCode  id="motransowner" value="1001" readonly="readonly" ><input id="motransowner_name" class=codename name=areaCodeName value="北京健康险个险承保" readonly=true>
						</TD>
						<td  class=input><input type="button" class="button" value="导出模板" onclick=""/></td>
							
					</TR>
					<TR class=common>
						
						
						<TD class=title>映射上传</TD>
						<td  class=input><input   id="codemapfile" type="file"  name="codemapfile" ></td>
						<TD  class=input>
								<input type="button" class="button" value="上  传" onclick=""/>
						</td>
							
					</TR>
				</table>
			
				<table>
				<tr>
					<td class=titleImg>添加映射</td>
					<td><img src="../images/butCollapse.gif" alt="新建映射"  onclick="addcodemap()">
				
					</td>
					
					
				</tr>
				</table>
			 <table class="common" id="codemap1">
				<TR class=common>
					<TD class=title>映射类型</TD>
					<TD class=input>
						  <Input class=common name=company value=""  id="maptype">
					</TD>
					<TD class=title>本地映射代码</TD>
					<TD class=input>
						  <Input class=common name=company value="" id="localcode" >
					</TD>
					<TD class=title>本地映射名称</TD>
					<TD class=input>
						  <Input class=common name=company value="" id="localname" >
					</TD>
					
				</TR>
				<TR class=common>
					<TD class=title>平台映射代码</TD>
					<TD class=input>
						  <Input class=common name=company value=""  id="plcode">
					</TD>
					<TD class=title>平台映射名称</TD>
					<TD class=input>
						  <Input class=common name=company value="" id="plname" >
					</TD>
					<TD class=title>备注</TD>
					<TD class=input>
						  <Input class=common name=company value="" id="plremark" >
						  <td align="center"><img src="../images/butExpand.gif" alt="删除字段" class="delcodemap" style="display: none"/></td>
					</TD>
					
				</TR>
				</table>
				
			  <div id="divSubCmdButtoncodemap">
					<INPUT VALUE="提 交" TYPE=button onclick="savecodemap()" class="cssButton">
					<INPUT VALUE="返  回" TYPE=button onclick="cancelClick()" class="cssButton">
				</div>			
		</div>
		
		<div id="divtable" style="display: none;">
				<table class="common">
					<TR class=common>
					
					<TD class=title>所属平台</TD>
					<TD class=input>
						 <input class=codeno name=areaCode  id="pltableowner"  value="1000" readonly="readonly" ><input id="pltableowner_name" class=codename name=areaCodeName value="江苏满意度平台" readonly=true>
					</TD>
					<TD class=title>所属模块</TD>
					<TD class=input>
						 <input class=codeno name=areaCode  id="modeltableowner" value="1001" readonly="readonly" ><input id="modeltableowner_name" class=codename name=areaCodeName value="北京健康险个险承保" readonly=true>
					</TD>
					<TD class=title>所属表</TD>
					<TD class=input>
						 <input class=codeno name=areaCode  id="tableower2" ondblclick="selclick(this);"   onkeyup="return selkeyup(this);" ><input id="tableower2_name" class=codename name=areaCodeName readonly=true>
						
					</TD>
					<td class=input><input type="button" class="button" value="导出模板" onclick=""/></td>
					
					
			
				<TR class=common>
					
					<TD class=title>字段映射上传</TD>
		
					<TD class=input>
								
								<input class=input  id="tablefile" type="file"  name="tablefile" >
								
								
					</td>
					<td class=input><input type="button" class="button" value="上  传" onclick=""/></td>	
					
				</TR>
				
				</table>
				<table class="common">
					
				</table>
			<table>
				<tr>
					<td class=titleImg>字段管理</td>  
					<td><img src="../images/butCollapse.gif" alt="字段新增" onclick="addfield();"></td>
				</tr>
			</table>
			<table class="common" id="field1">
				<TR class=common>
					<TD class=title>字段编码</TD>
					<TD class=input >
						<Input class=common name=company value="V1" id="fieldcode1" >
					</TD>
					<TD class=title>字段名称</TD>
					<TD class=input >
						<Input class="common common1" name=company value="" id="fieldname">
					</TD>
					<TD class=title>字段类型 </TD>
					<TD class=input>
						 <input class=codeno name=areaCode  id="datasource91" ondblclick="selclick(this);" onkeyup="return selkeyup(this);"><input id="datasource91_name" class=codename name=areaCodeName readonly=true>
					</TD>
					<TD class=title>字段描述</TD>
					<TD class=input id="tdcompany">
						<Input class="common common1" name=company value="" >
					</TD>
					
				</TR>
				<TR class=common>
				<TD class=title>字段长度</TD>
					<TD class=input id="tdcompany">
						<Input class="common common1" name=company value="" >
					</TD>
					<TD class=title>是否映射 </TD>
					<TD class=input>
						 <input class=codeno name=areaCode  id="datasource101" ondblclick="selclick(this);" onkeyup="return selkeyup(this);"><input id="datasource101_name" class=codename name=areaCodeName readonly=true>
					</TD>
					<TD class=title>备注</TD>
					<TD class=input id="tdcompany">
						<Input class="common common1" name=company value="" >
					</TD>
					<td align="center"><img src="../images/butExpand.gif" alt="删除字段" class="delcolum" style="display: none"/></td>
				</TR>
			</table>
			
			 <div id="divSubCmdButtoncodemap">
					<INPUT VALUE="提 交" TYPE=button onclick="okClick()" class="cssButton">
					<INPUT VALUE="返  回" TYPE=button onclick="cancelClick()" class="cssButton">
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
		
		
		<input type=hidden id="EdorValiFlag" name="EdorValiFlag">

	<span id="spanCode" style="display: none; position:absolute; slategray"></span>
	<input type="hidden" id="backmsg" value="${backmsg }" />
	<input type="hidden" id="errormsg" value="${errormsg }" />
</body>
</html>