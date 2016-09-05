var baseurl ="../common/jsp/MessagePage.jsp?picture=S&content=";
var showRes;

function afterSubmit(action)
{	
	
	
	showResStr="";
		if (action == "query")
		{
				showResStr="查询成功！";
		}
		if (action == "insert")
		{
				showResStr="提交成功!";
		}
		
		if (action == "update")
		{
				showResStr="更新成功!";
		}
		
	
	showRes=window.showModelessDialog(baseurl + showResStr,window,"status:no;help:0;close:0;dialogWidth:550px;dialogHeight:250px");
}



function addSubFirm(){
	$("#subfirmcode").val("");
	$("#subfirmname").val("");
	$("#subcomcode").val("");
}

function save(){
	afterSubmit("insert");
	
}