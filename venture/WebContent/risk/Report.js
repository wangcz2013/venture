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



	
function loaddata(){
	alert("导出excel");
}

function queryReport(){
	afterSubmit("query");
	ReportGrid.clearData("ReportGrid");   
	for(var i=0;i<mulLineShowCount;i++){
		ReportGrid.addOne("ReportGrid");
		ReportGrid.setRowColData(i,1,"泰康人寿保险股份有限公司");
		ReportGrid.setRowColData(i,2,"山东分公司");
		ReportGrid.setRowColData(i,3,"健康险提数");
	
	}
}

function addReport(){
	divAddReport.style.display="";
	divShowInput.style.display="none";

}

function back(){
	divAddReport.style.display="none";
	divShowInput.style.display="";
}

function saveReport(){
	alert("保存报表");
}
