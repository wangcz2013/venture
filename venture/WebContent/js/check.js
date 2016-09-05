
//检测输入必须全部为数字
function checkNum(ele,min,max){
	if(checklen(ele,min,max)=="1"){
		if(isNaN(ele.value)==true){
			alert("请输入0-9之间的有效数字");
			ele.focus();
		}
	}
	 
}
//输入全部为汉字
function checkchinese(ele,min,max){
	var reg = /^[\u2E80-\u9FFF]+$/;
	if(checklen(ele,min,max)=="1"){
		if(reg.test(ele.value)==false){
			alert("只能输入汉字，请重新输入");
			ele.focus();
		}
	}
}

//检测是否符合规定长度
function  checklen(ele,min,max){
	 var flag=1;
	 if(ele.value.length==0||ele.value.length<min||ele.value.length>max){
			alert("长度为"+min+"到"+max+"，请重新输入");
			flag=0;
			ele.focus();
	}
 	return flag;
}