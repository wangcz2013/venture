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


function addriskalgorithm(){

	divAlgorInput.style.display = "";
	
	divShowInput.style.display = "none";

}

function addriskalgorithm2(){

	divAlgorInput.style.display = "none";
	
	divShowInput.style.display = "";

}
	
function showclose(){
	imgShowOpen.style.display = "none";
	imgShowclose.style.display = "";
	divShowDetail.style.display = "none";

}

function showopen(){
	imgShowOpen.style.display = "";
	imgShowclose.style.display = "none";
	divShowDetail.style.display = "";
}

function searchPlan(){
	afterSubmit("query");
	PlanGrid.clearData("PlanGrid");   
	for(var i=0;i<mulLineShowCount;i++){
		PlanGrid.addOne("PlanGrid");
		PlanGrid.setRowColData(i,1,"2014");
		PlanGrid.setRowColData(i,2,"寿险");
		PlanGrid.setRowColData(i,3,"是");
		PlanGrid.setRowColData(i,4,"保单金额");
		PlanGrid.setRowColData(i,5,"100");
		PlanGrid.setRowColData(i,6,"16:08:09");
		
	
	}
}

function ab(){
$("#taskname").val("山东意外险预警发送批处理");
$("#dodate").val("2016-05-11");
$("#dotime").val("11:14:00");
$("#status").val("成功");
$("#enddate").val("2015-05-11");
$("#endtime").val("16:08:09");
$("#excuresult").val("任务执行完成");
	
}