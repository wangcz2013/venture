var baseurl ="../common/jsp/MessagePage.jsp?picture=S&content=";
var showRes;
var mulLineShowCount = 10;


//提交后操作,服务器数据返回后执行的操作  自己写
function afterSubmit(action)
{	
	
	var showResStr = "";

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



function searchFirm(){

	
	
	afterSubmit("query");
	FirmGrid.clearData("FirmGrid");   
	for(var i=0;i<mulLineShowCount;i++){
		FirmGrid.addOne("FirmGrid");
		FirmGrid.setRowColData(i,1,"1001");
		FirmGrid.setRowColData(i,2,"泰康人寿股份有限公司");
		FirmGrid.setRowColData(i,3,"100");
		FirmGrid.setRowColData(i,4,"2001");
		FirmGrid.setRowColData(i,5,"山东分公司");	
		FirmGrid.setRowColData(i,6,"109");
		
		
	}
}

function forwordUpdate(){
	firmupdate.style.display = "";
	$("#firmcode").val("1001");
	$("#firmname").val("泰康人寿股份有限公司");
	$("#comcode").val("100");
	$("#subfirmcode").val("2001");
	$("#subfirmname").val("山东分公司");
	$("#subcomcode").val("109");
	
}

function update(){
	afterSubmit("update");
	
}



