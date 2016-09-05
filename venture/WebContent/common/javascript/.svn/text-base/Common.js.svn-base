/**
 * <p>程序名称: Common.js</p>
 * <p>程序功能: 公用函数变量定义 </p>
 * <p>注释更新人: 胡博</p>
 * <p>最近更新日期: 2002-10-2</p>
 * <p>注意：所有的变量类型为VAR，在JAVA中表示为STRING<p>
 */

//公用变量
/** 日期分隔符,初始值=":" */
var DATEVALUEDELIMITER=":";
/** 域名与域值的分隔符,初始值=":" */
var NAMEVALUEDELIMITER=":";
/** 初始值=":" */
var SBCCASECOLON="：";
/** 域之间的分隔符,初始值="|" */
var FIELDDELIMITER="|";
/** 初始值="｜" */
var SBCCASEVERTICAL="｜";
/** 记录之间的分隔符,初始值="^" */
var RECORDDELIMITER="^";
/** 每一页最大显示的行数,初始值="10" */
var MAXSCREENLINES=10;
/** 内存中存储的最大的页数,初始值="20" */
var MAXMEMORYPAGES=20;
/** 修改(颜色),初始值="FFFF00" */
var BGCOLORU="FFFF00";
/** 添加(颜色),初始值="#00F0F0" */
var BGCOLORI="#00F0F0";
/** 删除(颜色),初始值="#778899" */
var BGCOLORD="#778899";
/** 快捷菜单最大项数 */
var MAXMENUSHORTNUM = 3;


  /**
   * 更换图片
   * <p><b>Example: </b><p>
   * <p>function changeImage(image,gif)<p>
   * @param image 存放图片的对象或框架或页面
   * @param gif 图片的全路径
   */
function changeImage(image,gif)
{
	//image.src='/Images/piccSh/'+gif;
	image.src=gif;  //Modify by yt 2002-05-30
}

  /**
   * 替换字符串函数
   * <p><b>Example: </b><p>
   * <p>replace("Minim123Minim", "123", "Minim") returns "MinimMinimMinim"<p>
   * @param strExpression 字符串表达式
   * @param strFind 被替换的子字符串
   * @param strReplaceWith 替换的目标字符串，即用strReplaceWith字符串替换掉strFind
   * @return 返回替换后的字符串表达式
   */
function replace(strExpression,strFind,strReplaceWith)
{
  var strReturn;
  var intIndex;
  strReturn = (strExpression==null?"":strExpression);
	
  while((intIndex=strReturn.indexOf(strFind))>-1)
  {	
    strReturn = strReturn.substring(0,intIndex) + strReplaceWith
               + strReturn.substring(intIndex+strFind.length,strReturn.length);
  }
  return strReturn;
}

  /**
   * 去掉字符串头尾空格
   * <p><b>Example: </b><p>
   * <p>trim(" Minim ") returns "Minim"<p>
   * @param strValue 字符串表达式
   * @return 头尾无空格的字符串表达式
   */
function trim(s)
{
  var strReturn;
  strReturn=s;
  while(strReturn.indexOf(" ")==0) strReturn=strReturn.substring(1);
  if(strReturn.length==0) return "";
  while(strReturn.lastIndexOf(" ")==strReturn.length-1)
  {
    strReturn=strReturn.substring(0,strReturn.length-1);
    if(strReturn.length==0) return "";
  }
  return strReturn;
}

  /**
   * 对输入域是否是整数的校验
   * <p><b>Example: </b><p>
   * <p>isInteger("Minim") returns false<p>
   * <p>isInteger("123") returns true<p>
   * @param strValue 输入数值表达式或字符串表达式
   * @return 布尔值（true--是整数, false--不是整数）
   */
function isInteger(strValue)
{
  var NUM="0123456789";
  var i;
  if(strValue==null || strValue=="") return false;
  for(i=0;i<strValue.length;i++)
  {
    if(NUM.indexOf(strValue.charAt(i))<0) return false;

  }
  return true;
}

  /**
   * 对输入域是否是数字的校验
   * <p><b>Example: </b><p>
   * <p>isNumeric("Minim") returns false<p>
   * <p>isNumeric("123.1") returns true<p>
   * @param strValue 输入数值表达式或字符串表达式
   * @return 布尔值（true--是数字, false--不是数字）
   */
function isNumeric(strValue)
{
  var NUM="0123456789.";
  var i;
  if(strValue==null ||strValue=="") return false;
  for(i=0;i<strValue.length;i++)
  {
    if(NUM.indexOf(strValue.charAt(i))<0) return false
  }
  if(strValue.indexOf(".")!=strValue.lastIndexOf(".")) return false;
  return true;
}

  /**
   * 离开域时的数字校验
   * <p><b>Example: </b><p>
   * <p>checkNumber(HTML.Form.Object.Name)<p>
   * @param Field HTML页面的对象名称
   * @return true或产生一个“errorMessage("请输入合法的数字")”
   */
function checkNumber(Field)
{
	var strValue=Field.value;
	if( trim(strValue)!="" && !isNumeric(strValue) )
	{
	  errorMessage("请输入合法的数字");
		Field.focus();
		Field.select();
		return false;
	}
	return true;
}

  /**
   * 检查年
   * <p><b>Example: </b><p>
   * <p>checkYear(HTML.Form.Object.Name)<p>
   * @param Field HTML页面的对象名称
   * @return 产生一个“errorMessage("年份应为4位数字")”
   */
function checkYear(Field)
{
	var strValue=Field.value;
	if(trim(strValue)!="" && !(isInteger(strValue) && strValue.length==4 ) )
	{
	  errorMessage("年份应为4位数字");
		Field.focus();
		Field.select();
	}
}

  /**
   * 检查月
   * <p><b>Example: </b><p>
   * <p>checkMonth(HTML.Form.Object.Name)<p>
   * @param Field HTML页面的对象名称
   * @return 产生一个“errorMessage("月份应为1-12之间的数字")”
   */
function checkMonth(Field)
{
	var strValue=Field.value;
	if(trim(strValue)!="" && !(isInteger(strValue) && eval(strValue)>0 && eval(strValue)<13 ) )
	{
	  errorMessage("月份应为1-12之间的数字");
		Field.focus();
		Field.select();
	}
}

  /**
   * 检查日
   * <p><b>Example: </b><p>
   * <p>checkDay(HTML.Form.Object.Name)<p>
   * @param Field HTML页面的对象名称
   * @return 产生一个“errorMessage("日期应为1-31之间的数字")”
   */
function checkDay(Field)
{
	var strValue=Field.value;
	if(trim(strValue)!="" && !(isInteger(strValue) && eval(strValue)>0 && eval(strValue)<32 ) )
	{
	  errorMessage("日期应为1-31之间的数字");
		Field.focus();
		Field.select();
	}
}

  /**
   * 检查小时
   * <p><b>Example: </b><p>
   * <p>checkHour(HTML.Form.Object.Name)<p>
   * @param Field HTML页面的对象名称
   * @return 产生一个“errorMessage("小时应为0-24之间的数字")”
   */
function checkHour(Field)
{
	var strValue=Field.value;
	if(trim(strValue)!="" && !(isInteger(strValue) && eval(strValue)>=0 && eval(strValue)<=24 ) )
	{
		errorMessage("小时应为0-24之间的数字");
		Field.focus();
		Field.select();
	}
}

  /**
   * 检查空
   * <p><b>Example: </b><p>
   * <p>hasValue(HTML.Form.Object.Name)<p>
   * @param Field HTML页面的对象名称
   * @return 布尔值（true--有值, false--空）
   */
function hasValue(Field)
{
	if(Field.value=="")
		return false;
	else
	  return true;
}


  /**
   * 对输入域按键时的整数校验
   * <p><b>Example: </b><p>
   * <p>checkInteger(window.event)<p>
   * @param Event 按键盘事件
   * @return 布尔值（true--按了整数键, false--按了非整数键）
   */
function checkInteger(e)
{
  var charCode=e.keyCode;
  if(charCode>=48 && charCode<=57)
  {
    return true;
  }
  return false;
}

  /**
   * 对输入域按键时的装订方式的校验(只允许数字和*的录入)
   * <p><b>Example: </b><p>
   * <p>checkBind(window.event)<p>
   * @param Event 按键盘事件
   * @return 布尔值（true--符合装订方式, false--不符合装订方式）
   */
function checkBind(e)
{
  var charCode=e.keyCode;
  if(charCode>=48 && charCode<=57 || charCode==42)
  {
    return true;
  }
  return false;
}

  /**
   * 对输入域按键时的数字校验
   * <p><b>Example: </b><p>
   * <p>checkNumeric(window.event)<p>
   * @param Event 按键盘事件
   * @return 布尔值（true--按了数字键, false--按了非数字键）
   */
function checkNumeric(e)
{

  var charCode=e.keyCode;
	if(charCode>31 && (charCode<48 || charCode>57) && charCode!=46)
	{
	return false;
	}
	return true;
}
 /**
   * 判断字符是否在s中
   */
function isCharsInBag (s, bag)
{
var i;
for (i = 0; i < s.length; i++)
{
var c = s.charAt(i);
if (bag.indexOf(c) == -1) return false;
}
return true;
}

  /**
   * 日期的合法判断
   * <p><b>Example: </b><p>
   * <p>isLegalDate("2002", "10", "03") returns true<p>
   * <p>isLegalDate("Minim", "10", "03") returns false<p>
   * @param year 年份字符串
   * @param month 月份字符串
   * @param day 日期字符串
   * @return 布尔值（true--合法日期, false--非法日期）
   */
function isLegalDate(y,m,d)
{
  if(isNaN(parseInt(y,10)) || isNaN(parseInt(m,10)) || isNaN(parseInt(d,10)) )
    return false;
  var dt = new Date(parseInt(y,10),parseInt(m,10)-1,parseInt(d,10));
  if( dt.getYear()==parseInt(y,10) &&
      dt.getMonth()==parseInt(m,10)-1 &&
      dt.getDate()==parseInt(d,10)
    )
    return true;
  else
    return false;
}

  /**
   * 对输入域是否是日期的校验
   * <p><b>Example: </b><p>
   * <p>isDate("2002-10-03") returns true<p>
   * <p>isDate("2002/10/03") returns false<p>
   * @param date 日期字符串,格式必须为“yyyy-mm-dd”
   * @return 布尔值（true--合法日期, false--非法日期）
   */
function isDate(date)
{
  if(date.length > 10) return false;
  var strValue;
  strValue=date.split("-");
  if(strValue.length!=3) return false;
  if(!isInteger(strValue[0]) || !isInteger(strValue[1]) || !isInteger(strValue[2]) ) return false;

  var intYear=eval(strValue[0]);
  var intMonth=eval(strValue[1]);
  var intDay=eval(strValue[2]);

  if( intYear<=0 || intYear>9999 || intMonth<=0 || intMonth>12 || intDay<=0 || intDay>31 ) return false;
  //添加对闰年的校验
  if (2 == intMonth)
  {
  	var day = ((0 == intYear % 4) && (0 != (intYear % 100))) ||(0 == intYear % 400) ? 29 : 28;
  	if(intDay > day)
  	{
  		return false;
  	}
  }
  if (31 == intDay)
  {
  	if(intMonth==1||intMonth==3||intMonth==5||intMonth==7||intMonth==8||intMonth==10||intMonth==12){
  		return true;
  	}else{
  		return false;
  	}
  }
  return true;
}

  /**
   * 输入日期格式为yyyymmdd
   * 输出日期格式为yyyy-mm-dd
   */
function modifydate(strDate){
	var stadate;
	//alert(isDate(strDate));
	if (!isDate(strDate))
	{
		var year=strDate.substring(0,4);
		var month=strDate.substring(4,6);
		var day=strDate.substring(6);
		stadate=year+'-'+month+'-'+day;
	 }
	else
		{stadate=strDate;}
		return stadate;
	}

  /**
   * 比较两个日期字符串
   * <p><b>Example: </b><p>
   * <p>compareDate("2002-10-03", "2002-10-03") returns 0<p>
   * <p>compareDate("2002-10-03", "2001-10-03") returns 1<p>
   * @param date1 日期字符串,格式必须为“yyyy-mm-dd”
   * @param date2 日期字符串,格式必须为“yyyy-mm-dd”
   * @return date1=date2则返回0 , date1>date2则返回1 , date1<date2则返回2
   */
function compareDate(date1,date2)
{
  var strValue=date1.split("-");
  var date1Temp=new Date(strValue[0],strValue[1],strValue[2]);

  strValue=date2.split("-");
  var date2Temp=new Date(strValue[0],strValue[1],strValue[2]);

  if(date1Temp.getTime()==date2Temp.getTime())
    return 0;
  else if(date1Temp.getTime()>date2Temp.getTime())
    return 1;
  else
    return 2;
}

  /**
   * 对格式字符串进行解析,返回一个关联数组
   * <p><b>Example: </b><p>
   * <p>splitField("Minim:123|Hzm:456|") returns arrayReturn[Minim]=123;arrayReturn[Hzm]=456<p>
   * @param record 格式字符串 FieldName:FieldValue|
   * @return 关联数组 array[FieldName]=FieldValue
   */
function splitField(record)
{
  var arrayField=record.split(FIELDDELIMITER);
  var arrayReturn=new Array();
  var i;
  for(i=0;i<arrayField.length-1;i++)
  {
    var arrayNameValuePair=arrayField[i].split(NAMEVALUEDELIMITER);      //分割出一对域名和域值
    arrayReturn[arrayNameValuePair[0]]=arrayNameValuePair[1];
  }
  return arrayReturn;
}


  /**
   * 对span的显示、隐藏
   * <p><b>Example: </b><p>
   * <p>showPage(HTML.ImageObject, HTML.SpanObject.ID)<p>
   * @param img 显示图片的HTML对象
   * @param spanID HTML中SPAN对象的ID
   * @return 如果页面SPAN可见，则将其隐藏，并显示表示关闭的图片；反之
   */
function showPage(img,spanID)
{
  if(spanID.style.display=="")
  {
    //关闭
    spanID.style.display="none";
    img.src="../common/images/butCollapse.gif";
  }
  else
  {
    //打开
    spanID.style.display="";
    img.src="../common/images/butExpand.gif";
  }
}

  /**
   * 对span的显示only
   * <p><b>Example: </b><p>
   * <p>showPageOnly(HTML.ImageObject, HTML.SpanObject.ID)<p>
   * @param img 显示图片的HTML对象
   * @param spanID HTML中SPAN对象的ID
   */
function showPageOnly(img,spanID)
{
  //打开
  spanID.style.display="";
  img.src="/Images/piccSh/butExpand.gif";
}

  /**
   * 打开一个窗口
   * <p><b>Example: </b><p>
   * <p>openWindow("www.163.com", null)<p>
   * @param strURL 新窗口的完整路径（URL）或相对路径
   * @param strName 指定窗口名，可以为空
   * @return 返回新建窗口的句柄
   */
function openWindow(strURL,strName)
{
  var newWindow = window.open(strURL,strName,'width=640,height=480,top=0,left=0,toolbar=0,location=0,directories=0,menubar=0,scrollbars=1,resizable=1,status=0');
  newWindow.focus();
  return newWindow;
}

  /**
   * 分割代码并放在select域里
   * <p><b>Example: </b><p>
   * <p>setOption("name", "1=Minim&2=Hzm");将在下拉框中看到可选项Minim和Hzm<p>
   * @param selectName HTML的select对象名
   * @param strValue 包含select对象显示内容的字符串，串的格式必须为: value1=text1&value2=text2，以“&"号分隔
   */
function setOption(selectName,strValue)
{
  var arrayField=strValue.split("&");
  var i=0;
  fm.all(selectName).length = 0;
  while(i<arrayField.length)
  {
    var option=document.createElement("option");
    var arrayTemp=arrayField[i].split("=");
    var strFieldName=arrayTemp[0];
    var strFieldValue=unescape(arrayTemp[1]);
    option.value=strFieldName;
    option.text=strFieldValue;
    fm.all(selectName).add(option);
    i++;
  }
}

  /**
   * 在指定的变量前加0，直至满足指定位数
   * <p><b>Example: </b><p>
   * <p>addZero("Minim", 10) returns "00000Minim"<p>
   * @param strValue 需要加0的字符串
   * @param intLen 加0后字符串的长度
   * @return 加0后满足要求长度的字符串
   */
function addZero(strValue,intLen)
{
	var i,len;
	var strRet;
	strRet=strValue.toString();
	len=strRet.length;
	if (len<intLen)
	{
		while (strRet.length!=intLen)
		{
			strRet="0"+strRet;
		}
		return strRet;
	}
	else
	{
		return strRet;
	}
}

  /**
   * 大写输入域，onkeypress时调用该方法，可以使所有输入自动转换成大写
   * <p><b>Example: </b><p>
   * <p>uppercaseKey()<p>
   */
function uppercaseKey()
{
  var keycode = window.event.keyCode;
  if( keycode>=97 && keycode<=122 )
  {
    window.event.keyCode = keycode-32;
  }
}

  /**
   * 使HTML的FORM框架内的所有元素和对象变成无效
   * <p><b>Example: </b><p>
   * <p>setFormAllDisabled()<p>
   */
function setFormAllDisabled()
{
  var i = 0;
  for(i=0;i<fm.elements.length;i++)
	{
			fm.elements[i].disabled=true;
	}
}

  /**
   * 使HTML的FORM框架内的所有元素和对象变成有效，与setFormAllDisabled相对
   * <p><b>Example: </b><p>
   * <p>setFormAllEnabled()<p>
   */
function setFormAllEnabled()
{
  var i = 0;
  for(i=0;i<fm.elements.length;i++)
	{
			fm.elements[i].disabled=false;
	}
}

/** 按币别汇总函数的汇总项数组 */
var arrayCollect = new Array();    //汇总项数组

  /**
   * 汇总 (行数,币别域名,保额域名,保费域名)
   * <p><b>Example: </b><p>
   * <p>暂缺，需相关业务处理人员添加<p>
   * @param intNum 行数
   * @param CN 币别域名
   * @param Amt 保额域名
   * @param Prm 保费域名
   * @return 直接为全局变量汇总项数组arrayCollect负值
   */
function collectFee(intNum,CN,Amt,Prm )
{
  var arrayCollectOne ;
  for(i=0;i<intNum;i++)
  {
    var strCN      = fm.all(CN)[i].value;
    var strAmount  = fm.all(Amt)[i].value;
    var strPremium = fm.all(Prm)[i].value;
    var existFlag  = false;

    if(!isNumeric(strAmount))
      strAmount=0;
    else
      strAmount=eval(strAmount);
    if(!isNumeric(strPremium))
      strPremium=0;
    else
      strPremium=eval(strPremium);

    for(j=0;j<arrayCollect.length;j++)
    {
      if( arrayCollect[j]["CN"] == strCN )
      {
        existFlag = true;
        break;
      }
    }
    if(!existFlag)
    {
      arrayCollectOne = new Array(); //一个汇总项
      arrayCollectOne["CN"] = strCN;
      arrayCollectOne["Amount"] = strAmount;
      arrayCollectOne["Premium"] = strPremium;
      arrayCollect[j] = arrayCollectOne;
    }
    else
    {
      arrayCollect[j]["Amount"] = arrayCollect[j]["Amount"] + strAmount ;
      arrayCollect[j]["Premium"] = arrayCollect[j]["Premium"] + strPremium ;
    }
  }
}

/**
 * 获取日期对象
 * @param strDate 日期字符串
 * @param splitOp 分割符
 * @return 返回日期对象
 */
function getDate(strDate, splitOp) {
  if (splitOp == null) splitOp = "-";

  var arrDate = strDate.split(splitOp);
  if (arrDate[1].length == 1) arrDate[1] = "0" + arrDate[1];
  if (arrDate[2].length == 1) arrDate[2] = "0" + arrDate[2];

  return new Date(arrDate[0], arrDate[1]-1, arrDate[2]);
}

  /**
   * 计算两个日期的差,返回差的月数(M)或天数(D) (其中天数除2.29这一天)
   * <p><b>Example: </b><p>
   * <p>dateDiff("2002-10-1", "2002-10-3", "D") returns "2"<p>
   * <p>dateDiff("2002-1-1", "2002-10-3", "M") returns "9"<p>
   * @param dateStart 减日期
   * @param dateEnd 被减日期
   * @param MD 标记，“M”为要求返回差的月数；“D”为要求返回差的天数
   * @return 返回两个日期差的月数(M)或天数(D)
   */
function dateDiff(dateStart,dateEnd,MD)
{
  if(dateStart==""||dateEnd=="")
  {
  	return false;
  }
  if (typeof(dateStart) == "string") {
    dateStart = getDate(dateStart);
  }

  if (typeof(dateEnd) == "string") {
    dateEnd = getDate(dateEnd);
  }

  var i;
  if(MD=="D") //按天计算差
  {
    var endD = dateEnd.getDate();
    var endM = dateEnd.getMonth();
    var endY = dateEnd.getFullYear();
    var startD = dateStart.getDate();
    var startM = dateStart.getMonth();
    var startY = dateStart.getFullYear();
    var startT=new Date(startY,startM,startD);
    var endT=new Date(endY,endM,endD);
    var diffDay=(endT.valueOf()-startT.valueOf())/86400000;
    return diffDay;
  }
  else //按月计算差
  {
    var endD = dateEnd.getDate();
    var endM = dateEnd.getMonth();
    var endY = dateEnd.getFullYear();
    var startD = dateStart.getDate();
    var startM = dateStart.getMonth();
    var startY = dateStart.getFullYear();

    if(endD>=startD)
    {
      return (endY-startY)*12 + (endM-startM) + 1;
    }
    else
    {
      return (endY-startY)*12 + (endM-startM);
    }
  }
}
/*
function dateDiff(dateStart,dateEnd,MD)
{
  if (typeof(dateStart) == "string") {
    dateStart = getDate(dateStart);
  }

  if (typeof(dateEnd) == "string") {
    dateEnd = getDate(dateEnd);
  }

  var i;
  if(MD=="D") //按天计算差
  {
    var endTm = dateEnd.getTime();
    var startTm = dateStart.getTime();
    var diffDay = (endTm - startTm)/86400000 + 1;
    var dateL;
    for(i=dateStart.getFullYear();i<=dateEnd.getFullYear();i++)
    {
      dateL = new Date(i,1,29); //试着构造一个该年的2月29日
      if( dateL.getDate()==29 &&      //判断构造成功否
          dateL.getTime()>=startTm && //判断该天介于起始日期和
          dateL.getTime()<=endTm      // 终止日期之间
        )  diffDay--;
    }
    return diffDay;
  }
  else //按月计算差
  {
    var endD = dateEnd.getDate();
    var endM = dateEnd.getMonth();
    var endY = dateEnd.getFullYear();
    var startD = dateStart.getDate();
    var startM = dateStart.getMonth();
    var startY = dateStart.getFullYear();

    if(endD>=startD)
    {
      return (endY-startY)*12 + (endM-startM) + 1;
    }
    else
    {
      return (endY-startY)*12 + (endM-startM);
    }
  }
}
*/
  /**
   * 设置HTML元素对象的背景色
   * <p><b>Example: </b><p>
   * <p>setBackColor(HTML.Form.Object.Name, "red")<p>
   * <p>setBackColor(HTML.Form.Object.Name, "#ff0000")<p>
   * @param Field HTML页面的对象名称
   * @param bcolor 颜色的字符串码或16位码
   */
function setBackColor(Field,bcolor)
{
  Field.style.backgroundColor = bcolor;
}

  /**
   * 当普通域的值改变时,将域的背景色设置为当前页的背景色
   * <p><b>Example: </b><p>
   * <p>commonBlur(HTML.Form.Object.Name)<p>
   * @param Field HTML页面的对象名称
   */
function commonBlur(Field)
{
  var oldValue = eval("old"+Field.name);
  if( Field.value==oldValue )
    setBackColor(Field,"");
  else
    setBackColor(Field,BGCOLORU);
}

  /**
   * 当多行输入域的值改变时设置背景色(显示多条)
   * <p><b>Example: </b><p>
   * <p>未知，使用后请增加<p>
   * @param Field HTML页面的对象名称
   * @param PageName 未知，使用后请增加
   */
function mulline1Blur(Field,PageName)
{
  var i;
  var flen=fm.all(Field.name).length;
  var index=0;
  var oldValue;
  for(i=0;i<flen;i++)
  {
    if( fm.all(Field.name)[i]==Field )
    {
      index = i;
      break;
    }
  }
  if( index+1>eval("old"+PageName+"Num") ) return ;
  oldValue = eval("old"+Field.name+"["+index+"]");
  if( Field.value==oldValue )
    setBackColor(Field,"");
  else
    setBackColor(Field,BGCOLORU);

}

  /**
   * 当多行输入域的值改变时设置背景色(显示一条)
   * <p><b>Example: </b><p>
   * <p>未知，使用后请增加<p>
   * @param Field HTML页面的对象名称
   * @param PageName 未知，使用后请增加
   */
function mulline2Blur(Field,PageName)
{
  var index=0;
  index = pagesAttributes[PageName]["curindex"];
  if( index+1>eval("old"+PageName+"Num") ) return ;
  oldValue = eval("old"+Field.name+"["+index+"]");
  if( Field.value==oldValue )
    setBackColor(Field,"");
  else
    setBackColor(Field,BGCOLORU);
}

  /**
   * 将保存的数值在指定的坐标（ex,ey）中，通过span显示出来
   * @param oldValue 保存的数值
   * @param ex X坐标
   * @param ey Y坐标
   */
function showOldValue(oldValue,ex,ey)
{
  spanOldValue.innerHTML = oldValue;
  spanOldValue.style.left=ex;
  spanOldValue.style.top=ey;
  spanOldValue.style.display ='';
}

  /**
   * 通过将span设置为不可见“NONE”隐藏数值
   */
function hideOldValue()
{
  spanOldValue.style.display ='none';
}

  /**
   * 普通域mouseover事件，具体使用未知，使用后请增加
   * @param Field HTML页面的对象名称
   */
function commonOldValue(Field)
{
  var i;
  var oldValue = eval("old"+Field.name);
  if( Field.value!=oldValue )
  {
    var ex=window.event.clientX+document.body.scrollLeft;
    var ey=window.event.clientY+document.body.scrollTop;
    if( Field.tagName == "SELECT" )
    {
			for(i=0;i<Field.options.length;i++)
			{
				if(Field.options[i].value==oldValue)
				{
				  oldValue = Field.options[i].text;
				  break;
				}
      }
    }
    showOldValue(oldValue,ex,ey);
  }
}

  /**
   * 多行输入域的mouseover事件(显示多条)，具体使用未知，使用后请增加
   * @param Field HTML页面的对象名称
   */
function mulline1OldValue(Field,PageName)
{
  var i;
  var flen=fm.all(Field.name).length;
  var index=0;
  var oldValue;
  for(i=0;i<flen;i++)
  {
    if( fm.all(Field.name)[i]==Field )
    {
      index = i;
      break;
    }
  }
  if( index+1>eval("old"+PageName+"Num") ) return ;
  oldValue = eval("old"+Field.name+"["+index+"]");
  if( Field.value!=oldValue )
  {
    var ex=window.event.clientX+document.body.scrollLeft;
    var ey=window.event.clientY+document.body.scrollTop;
    if( Field.tagName == "SELECT" )
    {
			for(i=0;i<Field.options.length;i++)
			{
				if(Field.options[i].value==oldValue)
				{
				  oldValue = Field.options[i].text;
				  break;
				}
      }
    }
    showOldValue(oldValue,ex,ey);
  }

}

  /**
   * 多行输入域的mouseover事件(显示一条)，具体使用未知，使用后请增加
   * @param Field HTML页面的对象名称
   */
function mulline2OldValue(Field,PageName)
{
  var index=0;
  index = pagesAttributes[PageName]["curindex"];
  if( index+1>eval("old"+PageName+"Num") ) return ;
  oldValue = eval("old"+Field.name+"["+index+"]");
  if( Field.value!=oldValue )
  {
    var ex=window.event.clientX+document.body.scrollLeft;
    var ey=window.event.clientY+document.body.scrollTop;
    if( Field.tagName == "SELECT" )
    {
			for(i=0;i<Field.options.length;i++)
			{
				if(Field.options[i].value==oldValue)
				{
				  oldValue = Field.options[i].text;
				  break;
				}
      }
    }
    showOldValue(oldValue,ex,ey);
  }

}

  /**
   * 批改的设置删除标志，具体使用未知，使用后请增加
   * @param flagName 未知，使用后请增加
   * @return 未知，使用后请增加
   */
function setFlagText(flagName)
{
  var i;
  var flagText = "";
  for(i=0;i<eval(flagName+".length");i++)
  {
    flagText = flagText + "<input name='" + flagName+"s' "
                        + "value='" + eval(flagName+"["+i+"]") + "'>";
  }
  return flagText;
}

  /**
   * 加保(保额)，具体使用未知，使用后请增加
   * @param vNewAmount 未知，使用后请增加
   * @param vOldAmount 未知，使用后请增加
   * @param vNewRate 未知，使用后请增加
   * @param vOldRate 未知，使用后请增加
   * @param vDiscount 未知，使用后请增加
   * @param vShortRate 未知，使用后请增加
   * @return 未知，使用后请增加
   */
function incAmount(vNewAmount,vOldAmount,vNewRate,vOldRate,vDiscount,vShortRate)
{
  var Dpremium =
    ( parseFloat(vNewAmount)-parseFloat(vOldAmount) ) * parseFloat(vNewRate) * parseFloat(vDiscount) * parseFloat(vShortRate)
    + parseFloat(vOldAmount) * ( parseFloat(vNewRate) - parseFloat(vOldRate) )  * parseFloat(vDiscount) * parseFloat(vShortRate);

  return Dpremium;
}

  /**
   * 减保(保额)，具体使用未知，使用后请增加
   * @param vNewAmount 未知，使用后请增加
   * @param vOldAmount 未知，使用后请增加
   * @param vNewRate 未知，使用后请增加
   * @param vOldRate 未知，使用后请增加
   * @param vDiscount 未知，使用后请增加
   * @param vOldShortRate 未知，使用后请增加
   * @param vOverShortRate 未知，使用后请增加
   * @return 未知，使用后请增加
   */
function decAmount(vNewAmount,vOldAmount,vNewRate,vOldRate,vDiscount,vOldShortRate,vOverShortRate)
{
  var Dpremium =
    ( parseFloat(vNewAmount)-parseFloat(vOldAmount) ) * parseFloat(vNewRate) * parseFloat(vDiscount)
    * ( parseFloat(vOldShortRate) - parseFloat(vOverShortRate) )
    + parseFloat(vOldAmount) * ( parseFloat(vNewRate) - parseFloat(vOldRate) )  * parseFloat(vDiscount)
    * ( parseFloat(vOldShortRate) - parseFloat(vOverShortRate) );

  return Dpremium;
}

  /**
   * 加保(保险期限)，具体使用未知，使用后请增加
   * @param vAmount 未知，使用后请增加
   * @param vRate 未知，使用后请增加
   * @param vDiscount 未知，使用后请增加
   * @param vShortRate 未知，使用后请增加
   * @return 未知，使用后请增加
   */
function incTime(vAmount,vRate,vDiscount,vShortRate)
{
  var Dpremium =
    parseFloat(vAmount) * parseFloat(vRate) * parseFloat(vDiscount) * parseFloat(vShortRate);
  return Dpremium;
}

  /**
   * 减保(保险期限)，具体使用未知，使用后请增加
   * @param vAmount 未知，使用后请增加
   * @param vRate 未知，使用后请增加
   * @param vDiscount 未知，使用后请增加
   * @param vOldShortRate 未知，使用后请增加
   * @param vNewShortRate 未知，使用后请增加
   * @return 未知，使用后请增加
   */
function decTime(vAmount,vRate,vDiscount,vOldShortRate,vNewShortRate)
{
  var Dpremium =
    parseFloat(vAmount) * parseFloat(vRate) * parseFloat(vDiscount)
    * ( parseFloat(vNewShortRate) - parseFloat(vOldShortRate) );
  return Dpremium;
}

  /**
   * 将空值输入域设为给定值，isMulti表示该域是否为多个输入域
   * <p><b>Example: </b><p>
   * <p>setEmpty([name1,name2], [Minim, Hzm], 2)<p>
   * @param FieldName HTML页面的对象名称
   * @param FieldValue 要负给对象的值
   * @param isMulti 标志传入的是单个对象还是对象数组
   */
function setEmpty(FieldName,FieldValue,isMulti)
{
		var i = 0;
		if (!isMulti)
		{
			if (fm.all(FieldName).value == "")
				fm.all(FieldName).value = FieldValue;
		}
		else
		{
			for(i = 0; i< fm.all(FieldName).length; i++)
			{
				theField = fm.all(FieldName)[i];
				if (trim(theField.value) == "" || eval(theField.value) == 0)
					theField.value = FieldValue;
			}
		}
}

  /**
   * 批改的计算保费(保额变化时)，具体使用未知，使用后请增加
   * @param Field 未知，使用后请增加
   * @param ext 未知，使用后请增加
   */
function calAmountPremium(Field,ext)
{
	var fieldname=Field.name;
	var i = 0;
	var findex=0;
	//得到行索引
	for(i=0;i<fm.all(fieldname).length;i++)
	{
		if( fm.all(fieldname)[i] == Field )
		{
			findex=i;
			break;
		}
	}
	//得到新值
	var amountValue    = fm.all("Amount"+ext)[findex].value;         //新保额
	var rateValue      = fm.all("Rate"+ext)[findex].value;           //新费率
	var shortRateValue = fm.all("ShortRate"+ext)[findex].value;      //未了短期费率
	var discountValue  = fm.all("Discount"+ext)[findex].value;       //折扣率
	var vShortrateFlag = fm.all("ShortrateFlag"+ext)[findex].value;  //短期费率方式
	//检验值的合法性
	if(vShortrateFlag=="1") vShortrateFlag = "M";
	else vShortrateFlag = "D";

	if( !isNumeric(amountValue) || !isNumeric(rateValue)
	    || !isNumeric(discountValue) || !isNumeric(shortRateValue) ) return ;
	if( eval(amountValue)<0 || eval(rateValue)<0
		  || eval(discountValue)<0 || eval(shortRateValue)<0) return ;

  //原值变量
	var pv = 0;             //保费
	var dpv = 0;            //保费变化量
	var vOldAmount = 0;     //原保额
	var vOldRate = 0 ;      //原费率
	var vShortRate = 0;     //原短期费率
	var vOverShortRate = 0; //已了责任短期费率
	if( findex < eval("oldAmount"+ext+".length") ) //修改标的
	{
	  pv = eval("oldPremium"+ext+"["+findex+"]");        //原保费
	  vOldAmount = eval("oldAmount"+ext+"["+findex+"]"); //原保额
	  vOldRate   = eval("oldRate"+ext+"["+findex+"]");   //原费率
	}
	else
	{
	  pv = 0;         //原保费
	  vOldAmount = 0; //原保额
	  vOldRate = 0;   //原费率
	}

	//日期
	var sdate,edate,pdate,pprevdate;
  var tmpd = fm.ValidDate.value.split("/");
  pdate = new Date(tmpd[0],parseInt(tmpd[1],10)-1,tmpd[2]);
  sdate = new Date(fm.StartDateYear.value,parseInt(fm.StartDateMonth.value,10)-1,fm.StartDateDay.value );
  edate = new Date(fm.EndDateYear.value,parseInt(fm.EndDateMonth.value,10)-1,fm.EndDateDay.value );
  pprevdate = new Date(pdate.getYear(),pdate.getMonth(),pdate.getDate()-1);

  //未了责任短期费率
  if( vShortrateFlag=="M" )
    shortRateValue = monthToRate(dateDiff(pdate,edate,vShortrateFlag));
  else
    shortRateValue = dateDiff(pdate,edate,vShortrateFlag)/365;
  //原短期费率
  if( vShortrateFlag=="M" )
    vShortRate = monthToRate(dateDiff(sdate,edate,vShortrateFlag));
  else
    vShortRate = dateDiff(sdate,edate,vShortrateFlag)/365;
  //已了责任短期费率
  if( vShortrateFlag=="M" )
    vOverShortRate = monthToRate(dateDiff(sdate,pprevdate,vShortrateFlag));
  else
    vOverShortRate = dateDiff(sdate,pprevdate,vShortrateFlag)/365;
	if( vOldAmount==0 || vOldAmount<=parseFloat(amountValue) )
	{
	  dpv = incAmount( parseFloat(amountValue),
	             vOldAmount,
	             parseFloat(rateValue)/1000,
	             parseFloat(vOldRate)/1000,
	             discountValue/100,
	             shortRateValue);
	}
	else
	{
	  dpv = decAmount( parseFloat(amountValue),
	             vOldAmount,
	             parseFloat(rateValue)/1000,
	             parseFloat(vOldRate)/1000,
	             discountValue/100,
	             vShortRate,
	             vOverShortRate
	             );
	}

	pv = parseFloat(pv) + dpv;
	pv = pointTwo(mathRound(pv));
	fm.all("Premium"+ext)[findex].value= pv;
	fm.all("Premium"+ext)[findex].onchange();
}

  /**
   * 批改的计算保费(保险期限变化时)，具体使用未知，使用后请增加
   * @param Field 未知，使用后请增加
   * @param ext 未知，使用后请增加
   */
function calTimePremium(fieldname,ext)
{
  var i;

	var vShortRate = 0;     //原短期费率(起保-原终保)
	var vOverShortRate = 0; //已了责任短期费率(起保-新终保)
  var shortRateValue = 0; //未了短期费率(原终保-新终保)
	//日期
	var sdate,edate,pdate,enextdate;
  pdate = new Date(fm.EndDateYear.value,parseInt(fm.EndDateMonth.value,10)-1,fm.EndDateDay.value );
  sdate = new Date(fm.StartDateYear.value,parseInt(fm.StartDateMonth.value,10)-1,fm.StartDateDay.value );
  edate = new Date(oldEndDateYear,parseInt(oldEndDateMonth,10)-1,oldEndDateDay);
  enextdate = new Date(edate.getYear(),edate.getMonth(),edate.getDate()+1);

  //计算各个保费
  for(i=0;i<parseInt(fm.all(fieldname).value,10);i++)
  {
  	//得到新值
  	var amountValue    = fm.all("Amount"+ext)       [i].value;  //新保额
  	var rateValue      = fm.all("Rate"+ext)         [i].value;  //新费率
  	var discountValue  = fm.all("Discount"+ext)     [i].value;  //折扣率
    var vShortrateFlag = fm.all("ShortrateFlag"+ext)[i].value;  //短期费率方式
  	if(vShortrateFlag=="1") vShortrateFlag = "M";
  	else vShortrateFlag = "D";
    //未了责任短期费率
    if( vShortrateFlag=="M" )
      shortRateValue = monthToRate(dateDiff(enextdate,pdate,vShortrateFlag));
    else
      shortRateValue = dateDiff(edate,pdate,vShortrateFlag)/365;
    //原短期费率
    if( vShortrateFlag=="M" )
      vShortRate = monthToRate(dateDiff(sdate,edate,vShortrateFlag));
    else
      vShortRate = dateDiff(sdate,edate,vShortrateFlag)/365;
    //已了责任短期费率
    if( vShortrateFlag=="M" )
      vOverShortRate = monthToRate(dateDiff(sdate,pdate,vShortrateFlag));
    else
      vOverShortRate = dateDiff(sdate,pdate,vShortrateFlag)/365;

  	//检验值的合法性
  	if( !isNumeric(amountValue) || !isNumeric(rateValue)
  	    || !isNumeric(discountValue) ) continue;
  	if( eval(amountValue)<0 || eval(rateValue)<0
  		  || eval(discountValue)<0 ) continue;

    //计算保费
  	var pv = eval("oldPremium"+ext+"["+i+"]"); //保费

  	if( isNaN(parseFloat(pv)) ) //误操作
  	{
      fm.all("Premium"+ext)[i].value = "";
  	  fm.all("Premium"+ext)[i].onchange();
  	  return ;
  	}
  	var dpv = 0;            //保费变化量
  	if( edate.getTime()<pdate.getTime() )
  	{
  	  dpv = incTime(parseFloat(amountValue),
  	                parseFloat(rateValue)/1000,
  	                discountValue/100,
  	                shortRateValue);
  	}
  	else
  	{
  	  dpv = decTime(parseFloat(amountValue),
  	                parseFloat(rateValue)/1000,
  	                discountValue/100,
  	                vShortRate,
  	                vOverShortRate);
  	}
  	pv = parseFloat(pv) + dpv;
  	pv = pointTwo(mathRound(pv));
  	fm.all("Premium"+ext)[i].value= pv;
  	fm.all("Premium"+ext)[i].onchange();
  }
}

  /**
   * 对小数点后第三位四舍五入
   * <p><b>Example: </b><p>
   * <p>mathRound(123.456) returns 123.46<p>
   * @param intValue 整型数值
   * @return 对小数点后第三位四舍五入后的整型数值
   */
function mathRound( x )
{
  var v = Math.round( x * 100 ) ;
  v = v/100;
  return v;
}

  /**
   * 对数字按0.00格式化
   * <p><b>Example: </b><p>
   * <p>pointTwo(123.456) returns 123.45<p>
   * <p>pointTwo(123) returns 123.00<p>
   * @param intValue 整型数值
   * @return 按0.00格式化后的整型数值
   */
function pointTwo( s )
{
  var v = s.toString();
  var len = v.length;
  var index = v.indexOf(".");

  if( index==-1 )
  {
    v = v + ".00";
    return v;
  }
  else
  {
    if( len-index==3 )
    {
      return v;
    }
    else if( len-index==2 )
    {
      v = v +"0";
      return v;
    }
    else if( len-index==1 )
    {
      v = v + "00";
      return v;
    }
    else
    {
      return v.substring(0,index+3);
    }
  }
}

  /**
   * 对数字按0.0000格式化
   * <p><b>Example: </b><p>
   * <p>pointFour(123.456789) returns 123.4567<p>
   * <p>pointFour(123) returns 123.0000<p>
   * @param intValue 整型数值
   * @return 按0.0000格式化后的整型数值
   */
function pointFour( s )
{
	var v = Math.round( parseFloat(s) * 10000 )/10000;
  v = v.toString();

  //var v = s.toString();

  var len = v.length;
  var index = v.indexOf(".");

  if( index==-1 )
  {
    v = v + ".0000";
    return v;
  }
  else
  {
    if( len-index==5)
    {
      return v;
    }
    else if( len-index==4 )
    {
      v = v +"0";
      return v;
    }
    else if( len-index==3 )
    {
      v = v + "00";
      return v;
    }
    else if( len-index==2 )
    {
      v = v + "000";
      return v;
    }
    else if( len-index==1 )
    {
      v = v + "0000";
      return v;
    }
    else
    {
      return v.substring(0,index+5);
    }
  }
}

  /**
   * 返回一个格式化日期字符串
   * <p><b>Example: </b><p>
   * <p>dateToString("2002-10-4") returns "2002/10/4"<p>
   * @param date 日期型变量
   * @return “YYYY/MM/DD”格式化日期字符串
   */
function dateToString(d)
{
  return  d.getFullYear() +"/"+
          (d.getMonth()<9?("0"+(d.getMonth()+1)):(d.getMonth()+1) ) +"/"+
          (d.getDate()<10?("0"+d.getDate()):d.getDate() );
}

  /**
   * 在浏览器中弹出一个alert框显示错误信息
   * @param strErrMsg 要显示的错误信息字符串
   */
function errorMessage(strErrMsg)
{
	alert(strErrMsg);
}

  /**
   * 显示打印窗口，主要是统一打印窗口的样式
   * <p><b>Example: </b><p>
   * <p>printWindow("../print.jsp", null)<p>
   * @param strURL 新窗口的完整路径（URL）或相对路径
   * @param strWindowName 指定窗口名，可以为空
   * @return 返回新建窗口的句柄
   */
function printWindow(strURL,strWindowName)
{
  var pageWidth=screen.availWidth-10;
  var pageHeight=screen.availHeight-30;
  if (pageWidth<100 )
  {
    pageWidth = 100;
  }
  if (pageHeight<100 )
  {
    pageHeight = 100;
  }

  var newWindow = window.open(strURL,strWindowName,'width='+pageWidth+',height='+pageHeight+',top=0,left=0,toolbar=0,location=0,directories=0,menubar=0,scrollbars=1.resizable=1,status=0');
  newWindow.focus();
  return newWindow;
}

  /**
   * 对输入域是否是日期的校验(日期格式xxxx/xx/xx)，建议修改，与isDate函数合并
   * <p><b>Example: </b><p>
   * <p>isDateI("2004/10/4") returns true<p>
   * <p>isDateI("2004-10-4") returns false<p>
   * @param date 格式必须为“YYYY/MM/DD”的日期字符串
   * @return 布尔值（true--合法日期, false--非法日期）
   */
function isDateI(date)
{
  var strValue;
  strValue=date.split("/");

  if(strValue.length!=3) return false;
  if(!isInteger(strValue[0]) || !isInteger(strValue[1]) || !isInteger(strValue[2]) ) return false;

  var intYear=eval(strValue[0]);
  var intMonth=eval(strValue[1]);
  var intDay=eval(strValue[2]);

  if( intYear<0 || intYear>9999 || intMonth<0 || intMonth>12 || intDay<0 || intDay>31 ) return false;
  return true;
}
  /**
   * 对输入域是否是日期的校验(日期格式xxxxxxxx)，建议修改，与isDate函数合并
   * <p><b>Example: </b><p>
   * <p>isDateI("2004104") returns true<p>
   * <p>Other returns false<p>
   */
function isDateN(date)
{
	if(date.length > 8) return false;
  var strValue;
  strValue=new Array();
  strValue[0]=date.substring(0, 4);
  strValue[1]=date.substring(4, 6);
  strValue[2]=date.substring(6, 8);
  if(strValue.length!=3) return false;
  if(!isInteger(strValue[0]) || !isInteger(strValue[1]) || !isInteger(strValue[2]) ) return false;

  var intYear=eval(strValue[0]);
  var intMonth=eval(strValue[1]);
  var intDay=eval(strValue[2]);

  if( intYear<0 || intYear>9999 || intMonth<0 || intMonth>12 || intDay<0 || intDay>31 ) return false;
  return true;
}
  /**
   * 比较两个日期字符串(日期格式xxxx/xx/xx)
   * <p><b>Example: </b><p>
   * <p>compareDateI("2002/10/03", "2002/10/03") returns 0<p>
   * <p>compareDateI("2002/10/03", "2001/10/03") returns 1<p>
   * @param date1 日期字符串,格式必须为“yyyy/mm/dd”
   * @param date2 日期字符串,格式必须为“yyyy/mm/dd”
   * @return date1=date2则返回0 , date1>date2则返回1 , date1<date2则返回2
   */
function compareDateI(date1,date2)
{
  var strValue=date1.split("/");
  var date1Temp=new Date(strValue[0],strValue[1],strValue[2]);

  strValue=date2.split("/");
  var date2Temp=new Date(strValue[0],strValue[1],strValue[2]);

  if(date1Temp.getTime()==date2Temp.getTime())
    return 0;
  else if(date1Temp.getTime()>date2Temp.getTime())
    return 1;
  else
    return 2;
}

 /**
 *得到当前的系统时间：
 *splitOp 为分割符，Example：
 *splitOp='-' 则日期格式为 年-月-日
 *splitOp='/' 则日期格式为 年/月/日
 *splitOp如果为空，则默认是：'-'
 */
function getCurrentDate(splitOp)
{
   if(splitOp==null) splitOp='-';
   if(trim(splitOp)=='') splitOp='-';
   var SystemDate=new Date();
   var year=SystemDate.getYear();
   var month=SystemDate.getMonth()+1;
   var day=SystemDate.getDate();
   var CurrentDate=year+splitOp+month+splitOp+day;
   return CurrentDate;
}

  /**
   * 对输入域是否是满足查询格式的日期的校验(日期格式xxxx/xx/xx)
   * <p><b>Example: </b><p>
   * <p>isQueryDate(":", "2002/10/03:2002/10/04") returns true<p>
   * <p>isQueryDate("", "2001/10/03") returns true<p>
   * @param sign 日期区间和单一日期的判断标志,区间内日期不能相等
   * @param date 包含日期内容的字符串
   * @return 布尔值（true--合法日期, false--非法日期）
   */
function isQueryDate(sign,date)
{
  var strValue;

  //区间的判断
  if (sign==":")
  {
  	strValue=date.split(":");
  	if (strValue.length!=2) return false;
  	if (!isDateI(strValue[0])) return false;
  	if (!isDateI(strValue[1])) return false;
  	if (compareDateI(strValue[0],strValue[1])==1) return false;
	}
	//单一日期的判断
	else
	{
		return isDateI(date);
	}
  return true;
}

  /**
   * 对输入域是否是满足查询格式的整数的校验integer
   * <p><b>Example: </b><p>
   * <p>isQueryInteger(":", "2002.12:2003.34") returns true<p>
   * <p>isQueryInteger("", "2001.567") returns true<p>
   * @param sign 整数区间和单一整数的判断标志
   * @param integer 包含整数内容的字符串，区间内整数不能相等
   * @return 布尔值（true--合法整数格式, false--非法整数格式）
   */
function isQueryInteger(sign,integer)
{
  var strValue;

  //区间的判断
  if (sign==":")
  {
  	strValue=integer.split(":");
  	if (strValue.length!=2) return false;
  	if (!isInteger(strValue[0])) return false;
  	if (!isInteger(strValue[1])) return false;
  	if (strValue[0]>strValue[1]) return false;
	}
	//单一日期的判断
	else
	{
		return isInteger(integer);
	}
  return true;
}

  /**
   * 对输入域是否是满足查询格式的数字的校验
   * <p><b>Example: </b><p>
   * <p>isQueryNum(":", "2002:2003") returns true<p>
   * <p>isQueryNum("", "2001") returns true<p>
   * @param sign 数字区间和单一数字的判断标志
   * @param num 包含数字内容的字符串，区间内数字不能相等
   * @return 布尔值（true--合法数字格式, false--非法数字格式）
   */
function isQueryNum(sign,num)
{
  var strValue;

  //区间的判断
  if (sign==":")
  {
  	strValue=num.split(":");
  	if (strValue.length!=2) return false;
  	if (!isNumeric(strValue[0])) return false;
  	if (!isNumeric(strValue[1])) return false;
  	if (strValue[0]<strValue[1]) return false;
	}
	//单一日期的判断
	else
	{
		return isNumeric(num);
	}
  return true;
}

  /**
   * 对图片的显示、隐藏
   * @param imgID HTML中可显示图片的对象的ID
   * @param stl 控制显示或隐藏的标志，“”为显示，“none”为隐藏
   */
function showImg(imgID,stl)
{
  document.all(imgID).style.display = stl;
}

  /**
   * 给新***代码赋值 --代码维护模块专用onblur=setNewCode(this)
   * @param field HTML页面的对象名称
   */
function setNewCode(field)
{
  if( trim(fm.all("new"+field.name).value)=="" )
  {
    fm.all("new"+field.name).value = field.value;
  }
}

//重复函数？？？？？？？？
//对输入域是否是日期的校验
function isCodeDate(date)
{
  var strValue;
  strValue=date.split("/");

  if(strValue.length!=3) return false;
  if(!isInteger(strValue[0]) || !isInteger(strValue[1]) || !isInteger(strValue[2]) ) return false;

  var intYear=eval(strValue[0]);
  var intMonth=eval(strValue[1]);
  var intDay=eval(strValue[2]);

  if( intYear<0 || intYear>9999 || intMonth<0 || intMonth>12 || intDay<0 || intDay>31 ) return false;
  return true;
}

  /**
   * 获取字符串的部分子串，该函数得到c_Str中的第c_i个以c_Split分割的字符串
   * <p><b>Example: </b><p>
   * <p>getStr("Minim|Hzm|Yt|", "2", "|") returns "Hzm"<p>
   * @param c_Str 有分隔规则的字符串
   * @param c_i 取第几个分隔子串
   * @param c_Split 分隔符
   * @return 返回第c_i个分隔子串
   */
function getStr(c_Str , c_i ,c_Split)
{
  var t_Str1, t_Str2 , t_strOld;
  var i, i_Start, j_End;
  t_Str1 = c_Str;
  t_Str2 = c_Split;
  i = 0;
	try
	{
    while (i < c_i)
    {
      i_Start = t_Str1.indexOf(t_Str2,0);
      if (i_Start >= 0)
      {
        i = i + 1;
        t_strOld = t_Str1;
        t_Str1 = t_Str1.substring(i_Start+t_Str2.length,t_Str1.length);
      }
      else
      {
        if (i != c_i - 1)
        {
          t_Str1="";
        }
        break;
      }
    }

    if (i_Start >= 0)
      t_Str1=t_strOld.substring(0,i_Start);
  }
  catch(ex)
  {
    t_Str1="";
  }
  return t_Str1;
}

  /**
   * 将字符串解析成为一个数组，该字符串的头部有返回信息
   * <p><b>Example: 未测试，请确认例子的正确性</b><p>
   * <p>decodeString("Minim|1^Hzm|2^Yt|3") returns "3，Minim,1,Hzm,2,Yt,3"<p>
   * @param strValue 需要解析的字符串,通常是查询数据库返回的结果字符串
   * @return 如果执行成功，则返回以记录为行，字段为列的二唯数组，如果执行不成功，则返回false
   */
function decodeString(strValue)
{
	var i,i1,j,j1;
  var strValue;                         //存放服务器端返回的代码数据
  var arrField;
  var arrRecord;
  var arrCode = new Array();             //存放初始化变量时用
  var t_Str;

  try
  {
    arrRecord = strValue.split(RECORDDELIMITER);  //拆分字符串，形成返回的数组

    t_Str     = getStr(arrRecord[0],1,FIELDDELIMITER);

    if (t_Str!="0")                                     //如果不为0表示服务器端执行发生错误
    {
      return false;
    }

    i1=arrRecord.length;
    for (i=1;i<i1;i++)
    {
      arrField  = arrRecord[i].split(FIELDDELIMITER); //拆分字符串,将每个纪录拆分为一个数组
      j1=arrField.length;
      arrCode[i-1] = new Array();
      for (j=0;j<j1;j++)
      {
        arrCode[i-1][j] = arrField[j];
      }
    }
  }
  catch(ex)
  {
    return false;
  }
  return arrCode;
}

  /**
   * 将字符串解析成为一个数组，该字符串的头部没有有返回信息
   * <p><b>Example: 未测试，请确认例子的正确性</b><p>
   * <p>decodeStringNoHead("Minim|1^Hzm|2^Yt|3") returns "Minim,1,Hzm,2,Yt,3"<p>
   * @param strValue 需要解析的字符串,通常是查询数据库返回的结果字符串
   * @return 如果执行成功，则返回以记录为行，字段为列的二唯数组，如果执行不成功，则返回false
   */
function decodeStringNoHead(strValue)
{
	var i,i1,j,j1;
  var strValue;                         //存放服务器端返回的代码数据
  var arrField;
  var arrRecord;
  var arrCode = new Array();             //存放初始化变量时用
  var t_Str;
  if(strValue==null || strValue=="")
    return false;

  try
  {
    arrRecord = strValue.split(RECORDDELIMITER);  //拆分字符串，形成返回的数组
    i1=arrRecord.length;
    for (i=0;i<i1;i++)
    {
      arrField  = arrRecord[i].split(FIELDDELIMITER); //拆分字符串,将每个纪录拆分为一个数组
      j1=arrField.length;
      arrCode[i] = new Array();
      for (j=0;j<j1;j++)
      {
        arrCode[i][j] = arrField[j];
      }
    }
  }
  catch(ex)
  {
    return false;
  }
  return arrCode;
}

  /**
   * 判断号码类型，如个人保单号，集体保单号
   * 在“项目规范_约定”的“新旧号码对照.xls”中规定“号码的[12,13]位”为代码类型标志;
   * <p><b>Example: </b><p>
   * <p>getCodeType("abcdefghijk11asdfasdf") returns "11"<p>
   * @param strCode 含代码字符串
   * @return 号码字符串
   */
function getCodeType( strCode ) {
    if ( (strCode == null) || (strCode == "") ) {
      return "00";
    } else {
    //在“项目规范_约定”的“新旧号码对照.xls”中规定“号码的[12,13]位”为代码类型标志
      return strCode.substring(11, 13);
    };
}

  /**
   * 判断输入号码中包含的类型号码和指定类型号码是否一致
   * 在“项目规范_约定”的“新旧号码对照.xls”中规定“号码的[12,13]位”为代码类型标志;
   * <p><b>Example: </b><p>
   * <p>judgeCodeType("abcdefghijk11asdfasdf", "11") returns ture<p>
   * @param strCode 含代码字符串
   * @param strType 类型号码，参照“新旧号码对照.xls”
   * @return 布尔值（true--一致, false--不一致）
   */
function judgeCodeType( strCode, strType ) {
    if ( (strCode == null) || (strCode == "") || (strType == null) || (strType == "") ) {
      return false;
    } else {
      return (getCodeType(strCode).compareTo(strType) == 0);
    };
}

  /**
   * 清空界面上的所有输入栏
   * <p><b>Example: </b><p>
   * <p>EmptyFormElements()<p>
   */
function emptyFormElements() {
  var formsNum = 0;          //窗口中的FORM数
  var elementsNum = 0;       //FORM中的元素数

  //遍历所有FORM
  for (formsNum=0; formsNum<window.document.forms.length; formsNum++) {
    //遍历FORM中的所有ELEMENT
    for (elementsNum=0; elementsNum<window.document.forms[formsNum].elements.length; elementsNum++) {
  	  if (window.document.forms[formsNum].elements[elementsNum].type == "text") {
  	    window.document.forms[formsNum].elements[elementsNum].value = "";
  	  }
  	}
  }
}

  /**
   * 将界面上的所有输入栏中为"undefined"清空
   * <p><b>Example: </b><p>
   * <p>EmptyFormElements()<p>
   */
function emptyUndefined() {
  var formsNum = 0;          //窗口中的FORM数
  var elementsNum = 0;       //FORM中的元素数

  //遍历所有FORM
  for (formsNum=0; formsNum<window.document.forms.length; formsNum++) {
    //遍历FORM中的所有ELEMENT
    for (elementsNum=0; elementsNum<window.document.forms[formsNum].elements.length; elementsNum++) {
  	  if ((window.document.forms[formsNum].elements[elementsNum].value == "undefined"
  	      || window.document.forms[formsNum].elements[elementsNum].value == "null")
  	      &&
  	      (window.document.forms[formsNum].elements[elementsNum].type == "text"
  	      || window.document.forms[formsNum].elements[elementsNum].type == "textarea")) {
  	    window.document.forms[formsNum].elements[elementsNum].value = "";
  	  }
  	}
  }
}


/**
 * 使用一维数组中存放的索引来过滤二维数组
 * <p><b>Example: </b><p>
 * <p>chooseArray({{1，2}，{3，4}}, {0}) returns {{1}，{3}}<p>
 * @param dataArray 存放数据的二维数组
 * @param filterArray 存放有索引的一维数组
 * @return 按一维数组中的索引过滤过的二维数组
 */
function chooseArray(dataArray, filterArray) {
  var arrResult = new Array();
  var recordNum, filterNum;

  try {
    for (recordNum=0; recordNum<dataArray.length; recordNum++) {
      arrResult[recordNum] = new Array();

      for (filterNum=0; filterNum<filterArray.length; filterNum++) {
        arrResult[recordNum].push(dataArray[recordNum][filterArray[filterNum]]);
      }
    }
  } catch(ex) {
    alert("chooseArray处理出现错误！");
  }

  return arrResult;
}

/**
 * 把js文件中的字符转换成特殊字符
 */
function Conversion(strIn) {
	//alert("342432"+strIn);
  var strOut;
	strOut=replace(strIn,"@@Enter","\r\n");
  strIn=strOut;
  //strOut=replace(strIn,"@@NewLine","\n");
  //strIn=strOut;
  strOut=replace(strIn,"@@DouQuot","\"");
  strIn=strOut;
  strOut=replace(strIn,"@@SinQuot","\'");
	//strOut=replace(strIn,"@@Delimiter","^");
	//alert(strOut);
  return strOut;
}

/**
 * 根据代码选择的代码查找并显示名称
 */
/*
function showCodeName1() {
  var formsNum = 0;          //窗口中的FORM数
  var elementsNum = 0;       //FORM中的元素数
  var strEvent = "";         //保存onDoubleClick事件代码
  var urlStr = "";
  var sFeatures = "";
  var strCode = "";          //代码选择
  var strQueryResult = "";   //代码选择的查询结果集
  var arrCode = null;        //拆分数组
  var strCodeValue = "";     //代码值
  var cacheFlag = false;     //内存中有数据标志

  var strCodeSelect = "";

  //寻找主窗口
  var win = searchMainWindow(this);
  if (win == false) { win = this; }

  //遍历所有FORM
  for (formsNum=0; formsNum<window.document.forms.length; formsNum++) {
    //遍历FORM中的所有ELEMENT
    for (elementsNum=0; elementsNum<window.document.forms[formsNum].elements.length; elementsNum++) {
      //寻找代码选择元素
      if ((window.document.forms[formsNum].elements[elementsNum].className == "code") ||
      	  (window.document.forms[formsNum].elements[elementsNum].className == "code8") ||
      	  (window.document.forms[formsNum].elements[elementsNum].className == "readonly")) {
        //alert(window.document.forms[formsNum].elements[elementsNum].type);
        //return;
        //取出代码值
        strCodeValue = window.document.forms[formsNum].elements[elementsNum].value;

        //空值则不处理
        if (strCodeValue == "") continue;

        //虚拟数据源处理
        if (window.document.forms[formsNum].elements[elementsNum].CodeData != null) {
          strQueryResult = window.document.forms[formsNum].elements[elementsNum].CodeData;
        }
        //从后台取数据
        else {
          //取出CODESELECT代码
          strEvent = window.document.forms[formsNum].elements[elementsNum].ondblclick;
          strCode = new String(strEvent);
          strCode = strCode.substring(strCode.indexOf("showCodeList") + 14);
          strCode = strCode.substring(0, strCode.indexOf("'"));
          //alert(strCode);

          //如果内容中有数据，从内容中取数据
          if (win.parent.VD.gVCode.getVar(strCode) != false) {
            arrCode = win.parent.VD.gVCode.getVar(strCode);
            cacheFlag = true;
          }
          else {
           if(strCode=="AgentCode"||strCode=="OccupationCode9"){
          		//由于代理人数据和职业类别数据的数据量较大，无条件遍历查询时会严重影响汉化显示速度
          		//特对他们的汉化查询进行了单独处理（有条件单条查询，结果不会再缓存）
            	 urlStr = "../common/jsp/CodeQueryWindow.jsp?codeType=" + strCode+"&codeField="+strCode+"&codeConditon="+strCodeValue;
    	    }
    	    else
    	         urlStr = "../common/jsp/CodeQueryWindow.jsp?codeType=" + strCode;
    	   sFeatures = "status:no;help:0;close:0;dialogWidth:10px;dialogHeight:0px;dialogLeft:-1;dialogTop:-1;resizable=1";

            //连接数据库进行CODE查询，返回查询结果给strQueryResult
      	    strQueryResult = window.showModalDialog(urlStr, "", sFeatures);
    	    }
  	      }

  	    //拆分成数组
  	    try {
  	      if (!cacheFlag) {
  	        arrCode = decodeEasyQueryResult(strQueryResult);

  	        strCodeSelect = "";
  	        var arr2 = new Array();
            for (i=0; i<arrCode.length; i++) {
              if (i%100==0) {
                arr2.push(strCodeSelect);
                strCodeSelect = "";
              }

              strCodeSelect = strCodeSelect + "<option value=" + arrCode[i][0] + ">"
                            + arrCode[i][0] + "-" + arrCode[i][1] + "</option>";
            }
            arr2.push(strCodeSelect);


            strCodeSelect = "";
            for (i=0; i<arr2.length; i++) {
              strCodeSelect =  strCodeSelect + arr2[i];
            }

//  	        for (i=0; i<arrCode.length; i++) {
//  	          strCodeSelect = strCodeSelect + "<option value=" + arrCode[i][0] + ">";
//              strCodeSelect = strCodeSelect + arrCode[i][0] + "-" + arrCode[i][1];
//              strCodeSelect = strCodeSelect + "</option>";
//  	        }

  	        if(strCode=="AgentCode" ||strCode=="OccupationType9"){
  	        	//由于代理人数据和职业类别数据的数据量较大，无条件遍历查询时会严重影响汉化显示速度
          		//特对他们的汉化查询进行了单独处理（有条件单条查询，结果不会再缓存）
  	        }else{
  	         //将拆分好的数据放到内存中
  	        win.parent.VD.gVCode.addArrVar(strCode, "", arrCode);
  	        //无论是否有数据从服务器端得到,都设置该变量
  	        win.parent.VD.gVCode.addVar(strCode+"Select","",strCodeSelect);
  	      　}
  	      }
  	      cacheFlag = false;

    	    for (i=0; i<arrCode.length; i++) {
  	  	    if (strCodeValue == arrCode[i][0]) {
  	  	   	  //window.document.forms[formsNum].elements[elementsNum].value = arrCode[i][0] + "-" + arrCode[i][1];
  	  	   	  window.document.forms[formsNum].elements[elementsNum].value = arrCode[i][1];
  	  	  	  break;
  	  	    }
          }

        }
  	    catch(ex)
  	    {}
  	    //alert(arrCode);

  	    //alert(window.document.forms[formsNum].elements[elementsNum].type == "text");
        //return;
      }

      //显示title
      if (window.document.forms[formsNum].elements[elementsNum].type == "text") {
         window.document.forms[formsNum].elements[elementsNum].title = window.document.forms[formsNum].elements[elementsNum].value;
      }

    }
  }
}
*/

/**
 * 根据代码选择的代码查找并显示名称
 */
function showCodeName() {
	var formsNum = 0;          //窗口中的FORM数
	var elementsNum = 0;       //FORM中的元素数
	var strEvent = "";         //保存onDoubleClick事件代码
	var urlStr = "";
	var sFeatures = "";
	var strCode = "";          //代码选择
	var strQueryResult = "";   //代码选择的查询结果集
	var arrCode = null;        //拆分数组
	var strCodeValue = "";     //代码值
	var cacheFlag = false;     //内存中有数据标志

  	var strCodeSelect = "";

	//寻找主窗口
	var win = searchMainWindow(this);
	if (win == false) { win = this; }

	//遍历所有FORM
	for (formsNum=0; formsNum < window.document.forms.length; formsNum++)
	{
		//遍历FORM中的所有ELEMENT
		for (elementsNum=0; elementsNum < window.document.forms[formsNum].elements.length; elementsNum++)
		{
			//寻找代码选择元素
			if ((window.document.forms[formsNum].elements[elementsNum].className == "code")||
			    (window.document.forms[formsNum].elements[elementsNum].className == "readonly")||
			    (window.document.forms[formsNum].elements[elementsNum].className == "code8"))
			{
				//取出代码值
			    strCodeValue = window.document.forms[formsNum].elements[elementsNum].value;

			    //空值则不处理
			    if (strCodeValue == "") continue;

			    //虚拟数据源处理
			    if (window.document.forms[formsNum].elements[elementsNum].CodeData != null)
			    {
					strQueryResult = window.document.forms[formsNum].elements[elementsNum].CodeData;
			    }
			    //从后台取数据
			    else
			    {
					//取出CODESELECT代码
					strEvent = window.document.forms[formsNum].elements[elementsNum].ondblclick;
					strCode = new String(strEvent);
					strCode = strCode.substring(strCode.indexOf("showCodeList") + 14);
					strCode = strCode.substring(0, strCode.indexOf("'"));
					//alert(strCode);

					//如果内容中有数据，从内容中取数据
					if (win.parent.VD.gVCode.getVar(strCode) != false)
					{
						arrCode = win.parent.VD.gVCode.getVar(strCode);
						cacheFlag = true;
					}
      				else
      				{
						if (strCode=="AgentCode"||strCode=="OccupationCode9")
						{
							//由于代理人数据和职业类别数据的数据量较大，无条件遍历查询时会严重影响汉化显示速度
							//特对他们的汉化查询进行了单独处理（有条件单条查询，结果不会再缓存）
							 urlStr = "../common/jsp/CodeQueryWindow.jsp?codeType=" + strCode+"&codeField="+strCode+"&codeConditon="+strCodeValue;
						}
						else
							urlStr = "../common/jsp/CodeQueryWindow.jsp?codeType=" + strCode;

						sFeatures = "status:no;help:0;close:0;dialogWidth:10px;dialogHeight:0px;dialogLeft:-1;dialogTop:-1;resizable=1";

				        //连接数据库进行CODE查询，返回查询结果给strQueryResult
				  	    strQueryResult = window.showModalDialog(urlStr, "", sFeatures);
	    			}
    			}

				//拆分成数组
				try
				{
					if (!cacheFlag)
					{
						arrCode = decodeEasyQueryResult(strQueryResult);

						strCodeSelect = "";
						var arr2 = new Array();
						for (i=0; i<arrCode.length; i++)
						{
							if (i%100 == 0)
							{
								arr2.push(strCodeSelect);
								strCodeSelect = "";
							}

							strCodeSelect = strCodeSelect + "<option value=" + arrCode[i][0] + ">"
							            + arrCode[i][0] + "-" + arrCode[i][1] + "</option>";
						}
						arr2.push(strCodeSelect);

						strCodeSelect = "";
						for (i=0; i<arr2.length; i++)
						{
							strCodeSelect =  strCodeSelect + arr2[i];
						}

						if(strCode=="AgentCode" ||strCode=="OccupationType9")
						{
							//由于代理人数据和职业类别数据的数据量较大，无条件遍历查询时会严重影响汉化显示速度
							//特对他们的汉化查询进行了单独处理（有条件单条查询，结果不会再缓存）
						}
						else
						{
							 //将拆分好的数据放到内存中
							win.parent.VD.gVCode.addArrVar(strCode, "", arrCode);
							//无论是否有数据从服务器端得到,都设置该变量
							win.parent.VD.gVCode.addVar(strCode+"Select","",strCodeSelect);
						}
					}
					cacheFlag = false;

					for (i=0; i<arrCode.length; i++)
					{
						if (strCodeValue == arrCode[i][0])
						{
							window.document.forms[formsNum].elements[elementsNum].value = arrCode[i][1];
							//arrCode[i][0]
							break;
						}
					}
				}
				catch(ex)
				{}
  			}

			//显示title
			if (window.document.forms[formsNum].elements[elementsNum].type == "text")
			{
				window.document.forms[formsNum].elements[elementsNum].title = window.document.forms[formsNum].elements[elementsNum].value;
			}
		}
	}
}

/**
 *用于代码反显，为不与现有的showcodename冲突，
 *添加一个新的函数
 *Yangming
 *
 */
function showAllCodeName()
{
	var formsNum = 0;          //窗口中的FORM数
	var elementsNum = 0;       //FORM中的元素数
	var strEvent = "";         //保存onDoubleClick事件代码
	var urlStr = "";
	var sFeatures = "";
	var strCode = "";          //代码选择
	var strQueryResult = "";   //代码选择的查询结果集
	var arrCode = null;        //拆分数组
	var strCodeValue = "";     //代码值
	var cacheFlag = false;     //内存中有数据标志

  	var strCodeSelect = "";

	//寻找主窗口
	var win = searchMainWindow(this);
	if (win == false) { win = this; }

	//遍历所有FORM
	for (formsNum=0; formsNum < window.document.forms.length; formsNum++)
	{
		//遍历FORM中的所有ELEMENT
		for (elementsNum=0; elementsNum < window.document.forms[formsNum].elements.length; elementsNum++)
		{
			//寻找代码选择元素
			if (//(window.document.forms[formsNum].elements[elementsNum].className == "code")||
			    //(window.document.forms[formsNum].elements[elementsNum].className == "readonly") ||
			    (window.document.forms[formsNum].elements[elementsNum].className == "codeno")||
			    (window.document.forms[formsNum].elements[elementsNum].className == "codeNo"))
			{
				//取出代码值
			    strCodeValue = window.document.forms[formsNum].elements[elementsNum].value;
			    //空值则不处理
			    if (strCodeValue == "") continue;

			    //虚拟数据源处理
			    if (window.document.forms[formsNum].elements[elementsNum].CodeData != null)
			    {
					strQueryResult = window.document.forms[formsNum].elements[elementsNum].CodeData;
			    }
			    //从后台取数据
			    else
			    {
					//取出CODESELECT代码
					strEvent = window.document.forms[formsNum].elements[elementsNum].ondblclick;
					strCode = new String(strEvent);
					strCode = strCode.substring(strCode.indexOf("showCodeList") + 14);
					strCode = strCode.substring(0, strCode.indexOf("'"));

					//如果内容中有数据，从内容中取数据
					if (win.parent.VD.gVCode.getVar(strCode) != false)
					{
						arrCode = win.parent.VD.gVCode.getVar(strCode);
						cacheFlag = true;
					}
      				else
      				{
						if (strCode=="AgentCode"||strCode=="OccupationCode9")
						{
							//由于代理人数据和职业类别数据的数据量较大，无条件遍历查询时会严重影响汉化显示速度
							//特对他们的汉化查询进行了单独处理（有条件单条查询，结果不会再缓存）
							 urlStr = "../common/jsp/CodeQueryWindow.jsp?codeType=" + strCode+"&codeField="+strCode+"&codeConditon="+strCodeValue;
						}
						else
							urlStr = "../common/jsp/CodeQueryWindow.jsp?codeType=" + strCode;

						sFeatures = "status:no;help:0;close:0;dialogWidth:10px;dialogHeight:0px;dialogLeft:-1;dialogTop:-1;resizable=1";

				        //连接数据库进行CODE查询，返回查询结果给strQueryResult
				  	    strQueryResult = window.showModalDialog(urlStr, "", sFeatures);

	    			}
    			}

				//拆分成数组
				try
				{
					if (!cacheFlag)
					{
						arrCode = decodeEasyQueryResult(strQueryResult);
						strCodeSelect = "";
						var arr2 = new Array();
						for (i=0; i<arrCode.length; i++)
						{
							if (i%100 == 0)
							{
								arr2.push(strCodeSelect);
								strCodeSelect = "";
							}
							strCodeSelect = strCodeSelect + "<option value=" + arrCode[i][0] + ">"
							            + arrCode[i][0] + "-" + arrCode[i][1] + "</option>";

						}
						arr2.push(strCodeSelect);
						strCodeSelect = "";
						for (i=0; i<arr2.length; i++)
						{
							strCodeSelect =  strCodeSelect + arr2[i];
						}

						if(strCode=="AgentCode" ||strCode=="OccupationType9")
						{
							//由于代理人数据和职业类别数据的数据量较大，无条件遍历查询时会严重影响汉化显示速度
							//特对他们的汉化查询进行了单独处理（有条件单条查询，结果不会再缓存）
						}
						else
						{
							 //将拆分好的数据放到内存中
							win.parent.VD.gVCode.addArrVar(strCode, "", arrCode);
							//无论是否有数据从服务器端得到,都设置该变量
							win.parent.VD.gVCode.addVar(strCode+"Select","",strCodeSelect);
						}
					}
					cacheFlag = false;

					for (i=0; i<arrCode.length; i++)
					{
						if (strCodeValue == arrCode[i][0])
						{
							window.document.forms[formsNum].elements[elementsNum+1].value = arrCode[i][1];
							break;
						}
					}
				}
				catch(ex)
				{}
  			}

			//显示title
			if (window.document.forms[formsNum].elements[elementsNum].type == "text")
			{
				window.document.forms[formsNum].elements[elementsNum].title = window.document.forms[formsNum].elements[elementsNum].value;
			}
		}
	}
}
/**
 * 根据代码选择的代码查找并显示名称，显示指定的一个
 * strCode - 代码选择的代码
 * showObjName - 要显示的界面对象
 */
function showOneCodeName(strCode, showObjName) {
  var formsNum = 0;          //窗口中的FORM数
  var elementsNum = 0;       //FORM中的元素数
  var urlStr = "";
  var sFeatures = "";
  var strQueryResult = "";   //代码选择的查询结果集
  var arrCode = null;        //拆分数组
  var strCodeValue = "";     //代码值
  var cacheFlag = false;     //内存中有数据标志
  var showObj;

  //alert(strCode);
  if (showObjName == null) showObjName = strCode;

  //遍历所有FORM
  for (formsNum=0; formsNum<window.document.forms.length; formsNum++) {
    //遍历FORM中的所有ELEMENT
    for (elementsNum=0; elementsNum<window.document.forms[formsNum].elements.length; elementsNum++) {
      //寻找代码选择元素
      //alert(window.document.forms[formsNum].elements[elementsNum].name);
      if (window.document.forms[formsNum].elements[elementsNum].name == showObjName) {
	   	  showObj = window.document.forms[formsNum].elements[elementsNum];
	  	  break;
	  	}
	  }
	}

  //寻找主窗口
  var win = searchMainWindow(this);
  if (win == false) { win = this; }

  //如果内容中有数据，从内容中取数据
  if (win.parent.VD.gVCode.getVar(strCode) != false) {
    arrCode = win.parent.VD.gVCode.getVar(strCode);
    cacheFlag = true;
  }
  else {
    urlStr = "../common/jsp/CodeQueryWindow.jsp?codeType=" + strCode;
    sFeatures = "status:no;help:0;close:0;dialogWidth:150px;dialogHeight:0px;dialogLeft:-1;dialogTop:-1;resizable=1";

    //连接数据库进行CODE查询，返回查询结果给strQueryResult
    strQueryResult = window.showModalDialog(urlStr, "", sFeatures);
  }

  //拆分成数组
  try {
    if (!cacheFlag) {
      arrCode = decodeEasyQueryResult(strQueryResult);

      strCodeSelect = "";
      for (i=0; i<arrCode.length; i++) {
        strCodeSelect = strCodeSelect + "<option value=" + arrCode[i][0] + ">";
        strCodeSelect = strCodeSelect + arrCode[i][0] + "-" + arrCode[i][1];
        strCodeSelect = strCodeSelect + "</option>";
      }

      //将拆分好的数据放到内存中
      win.parent.VD.gVCode.addArrVar(strCode, "", arrCode);
      //无论是否有数据从服务器端得到,都设置该变量
      win.parent.VD.gVCode.addVar(strCode+"Select","",strCodeSelect);
    }
    cacheFlag = false;

    for (i=0; i<arrCode.length; i++) {
	    if (showObj.value == arrCode[i][0]) {
      //showObj.value = arrCode[i][0] + "-" + arrCode[i][1];
      	showObj.value = arrCode[i][1];
	    }
    }

  }
  catch(ex)
  {}
  //alert(arrCode);
}
/**
* 根据代码选择的代码查找并显示名称，显示指定的一个
* strCode - 代码选择的代码
* showObjCode - 代码存放的界面对象
* showObjName - 要显示名称的界面对象
*/
function showOneCodeName1(strCode, showObjCode, showObjName) {
	var formsNum = 0;	//窗口中的FORM数
	var elementsNum = 0;	//FORM中的元素数
	var urlStr = "";
	var sFeatures = "";
	var strQueryResult = "";	//代码选择的查询结果集
	var arrCode = null;	//拆分数组
	var strCodeValue = "";	//代码值
	var cacheFlag = false;	//内存中有数据标志
	var showObjn;
	var showObjc;
	if (showObjName == null) showObjName = strCode;
	//遍历所有FORM
	for (formsNum=0; formsNum<window.document.forms.length; formsNum++)

	{
		//遍历FORM中的所有ELEMENT
		for (elementsNum=0; elementsNum<window.document.forms[formsNum].elements.length; elementsNum++)

		{
			//寻找代码选择元素
			//alert(window.document.forms[formsNum].elements[elementsNum].name);
			if (window.document.forms[formsNum].elements[elementsNum].name == showObjCode)
			{
				showObjc = window.document.forms[formsNum].elements[elementsNum];
			}
			if (window.document.forms[formsNum].elements[elementsNum].name == showObjName)
			{
				showObjn = window.document.forms[formsNum].elements[elementsNum];
				break;
			}
		}
	}
	//如果代码栏的数据不为空，才查询，否则不做任何操作
	if (showObjc.value != "")
	{
		//寻找主窗口
		var win = searchMainWindow(this);
		if (win == false) { win = this; }



		//如果内容中有数据，从内容中取数据
		if (win.parent.VD.gVCode.getVar(strCode))
		{
			arrCode = win.parent.VD.gVCode.getVar(strCode);
			cacheFlag = true;
		}
		else
		{
			urlStr = "../common/jsp/CodeQueryWindow.jsp?codeType=" + strCode;
			sFeatures = "status:no;help:0;close:0;dialogWidth:150px;dialogHeight:0px;resizable=1";
			            //+ "dialogLeft:-1;dialogTop:-1;";
			//连接数据库进行CODE查询，返回查询结果给strQueryResult
			//strQueryResult = window.showModalDialog(urlStr, "", sFeatures);
		    Request = new ActiveXObject("Microsoft.XMLHTTP");
	        Request.open("POST",urlStr, false);
	        Request.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	        Request.send(null);
	//      Request.open("GET", strURL, false);
	//      Request.send(null);
	        try
	        {
	            strQueryResult = Request.responseText;
	            if (strQueryResult != null && typeof(strQueryResult) == "string")
	            {
	                strQueryResult = strQueryResult.trim();
	            }
	        }
	        catch (ex)
	        {
	            //alert("数据返回出错：" + ex.message);
	        }
		}
		//拆分成数组
		try {
			if (!cacheFlag)

			{
				try
				{
					arrCode = decodeEasyQueryResult(strQueryResult);
				}
				catch(ex)
				{
					alert("页面缺少引用EasyQueryVer3.js");
				}
				strCodeSelect = "";
				for (i=0; i<arrCode.length; i++)
				{
					strCodeSelect = strCodeSelect + "<option value=" + arrCode[i][0] + ">";
					strCodeSelect = strCodeSelect + arrCode[i][0] + "-" + arrCode[i][1];
					strCodeSelect = strCodeSelect + "</option>";
				}
				//将拆分好的数据放到内存中
				win.parent.VD.gVCode.addArrVar(strCode, "", arrCode);
				//无论是否有数据从服务器端得到,都设置该变量
				win.parent.VD.gVCode.addVar(strCode+"Select","",strCodeSelect);
			}
			cacheFlag = false;
			for (i=0; i<arrCode.length; i++)
			{
				if (showObjc.value == arrCode[i][0])
				{
					showObjn.value = arrCode[i][1];
					break;
				}
			}
		}
		catch(ex)
		{}
	}
}



function showOneCodeNametoAfter(strCode, showObjName) {
  var formsNum = 0;          //窗口中的FORM数
  var elementsNum = 0;       //FORM中的元素数
  var urlStr = "";
  var sFeatures = "";
  var strQueryResult = "";   //代码选择的查询结果集
  var arrCode = null;        //拆分数组
  var strCodeValue = "";     //代码值
  var cacheFlag = false;     //内存中有数据标志
  var showObj;
   var showName;

  //alert(strCode);
  if (showObjName == null) showObjName = strCode;

  //遍历所有FORM
  for (formsNum=0; formsNum<window.document.forms.length; formsNum++) {
    //遍历FORM中的所有ELEMENT
    for (elementsNum=0; elementsNum<window.document.forms[formsNum].elements.length; elementsNum++) {
      //寻找代码选择元素
      //alert(window.document.forms[formsNum].elements[elementsNum].name);
      if (window.document.forms[formsNum].elements[elementsNum].name == showObjName) {
	   	  showObj = window.document.forms[formsNum].elements[elementsNum];
	   	  showName = window.document.forms[formsNum].elements[elementsNum+1];
	  	  break;
	  	}
	  }
	}

  //寻找主窗口
  var win = searchMainWindow(this);
  if (win == false) { win = this; }

  //如果内容中有数据，从内容中取数据
  if (win.parent.VD.gVCode.getVar(strCode) != false) {
    arrCode = win.parent.VD.gVCode.getVar(strCode);
    cacheFlag = true;
  }
  else {
    urlStr = "../common/jsp/CodeQueryWindow.jsp?codeType=" + strCode;
    sFeatures = "status:no;help:0;close:0;dialogWidth:150px;dialogHeight:0px;dialogLeft:-1;dialogTop:-1;resizable=1";

    //连接数据库进行CODE查询，返回查询结果给strQueryResult
    strQueryResult = window.showModalDialog(urlStr, "", sFeatures);
  }

  //拆分成数组
  try {
    if (!cacheFlag) {
      arrCode = decodeEasyQueryResult(strQueryResult);

      strCodeSelect = "";
      for (i=0; i<arrCode.length; i++) {
        strCodeSelect = strCodeSelect + "<option value=" + arrCode[i][0] + ">";
        strCodeSelect = strCodeSelect + arrCode[i][0] + "-" + arrCode[i][1];
        strCodeSelect = strCodeSelect + "</option>";
      }

      //将拆分好的数据放到内存中
      win.parent.VD.gVCode.addArrVar(strCode, "", arrCode);
      //无论是否有数据从服务器端得到,都设置该变量
      win.parent.VD.gVCode.addVar(strCode+"Select","",strCodeSelect);
    }
    cacheFlag = false;

    for (i=0; i<arrCode.length; i++) {
	    if (showObj.value == arrCode[i][0]) {
      //showObj.value = arrCode[i][0] + "-" + arrCode[i][1];
      	showName.value = arrCode[i][1];
//      	alert(showName.value);
//      	alert(showName.name);
	    }
    }
  }
  catch(ex)
  {}
  //alert(arrCode);
}


/**
 * 以年龄和性别校验身份证号的函数
 * 参数，输入的证件号码，出生日期，性别
 * 返回  布尔值
 */
function chkIdNo(iIdNo, iBirthday ,iSex)
{
  var tmpStr="";
  var idDate="";
  var tmpInt=0;
  var strReturn = "";

  iIdNo = trim(iIdNo);
  iBirthday = trim(iBirthday);
  iSex = trim(iSex);

  if ((iIdNo.length!=15) && (iIdNo.length!=18))
  {
    strReturn = "输入的身份证号位数错误";
    return strReturn;
  }

  if (!(isDate(iBirthday)))
  {
  	strReturn = "输入的日期格式错误";
    return strReturn;
  }

  //转换日期格式到yy－mm－dd，by Minim
  var arrDate = iBirthday.split("-");
  if (arrDate[1].length == 1) arrDate[1] = "0" + arrDate[1];
  if (arrDate[2].length == 1) arrDate[2] = "0" + arrDate[2];
  iBirthday = arrDate[0] + "-" + arrDate[1] + "-" + arrDate[2];

  if (iSex!="0" && iSex!="1")
  {
  	strReturn = "输入的性别不明确";
    return strReturn;
  }

  if (iIdNo.length==15)
  {
    tmpStr=iIdNo.substring(6,12);
    tmpStr= "19" + tmpStr;
    tmpStr= tmpStr.substring(0,4) + "-" + tmpStr.substring(4,6) + "-" + tmpStr.substring(6)

    if ( iBirthday == tmpStr )
    {
      if (iSex=="0")
      {
      	tmpInt = parseInt(iIdNo.substring(14));
      	tmpInt = tmpInt % 2
      	if (tmpInt==0)
      	{
      	  strReturn = "输入的性别与身份证号的信息不一致";
          return strReturn;
      	}
      }
      else
      {
      	tmpInt = parseInt(iIdNo.substring(14));
      	tmpInt = tmpInt % 2
      	if (tmpInt!=0)
      	{
      	  strReturn = "输入的性别与身份证号的信息不一致";
          return strReturn;
      	}
      }
    }
    else
    {
      strReturn = "输入的生日与身份证号的信息不一致";
      return strReturn;
    }

    return strReturn;
  }

  if (iIdNo.length==18)
  {
  	tmpStr=iIdNo.substring(6,14);
  	tmpStr= tmpStr.substring(0,4) + "-" + tmpStr.substring(4,6) + "-" + tmpStr.substring(6)

    if ( iBirthday == tmpStr )
    {
      if (iSex=="0")
      {
      	tmpInt = parseInt(iIdNo.substring(16,17));
      	tmpInt = tmpInt % 2
      	if (tmpInt==0)
      	{
      	  strReturn = "输入的性别与身份证号的信息不一致";
          return strReturn;
      	}
      }
      else
      {
      	tmpInt = parseInt(iIdNo.substring(16,17));
      	tmpInt = tmpInt % 2
      	if (tmpInt!=0)
      	{
      	  strReturn = "输入的性别与身份证号的信息不一致";
          return strReturn;
      	}
      }
    }
    else
    {
      strReturn = "输入的生日与身份证号的信息不一致";
      return strReturn;
    }

    return strReturn;
  }
}

/**
 * 通过身份证号的得到出生日期函数
 * 参数，输入的证件号码
 * 返回  出生日期
 */
function getBirthdatByIdNo(iIdNo)
{
  var tmpStr="";
  var idDate="";
  var tmpInt=0;
  var strReturn = "";

  iIdNo = trim(iIdNo);

  if ((iIdNo.length!=15) && (iIdNo.length!=18))
  {
    strReturn = "输入的身份证号位数错误";
    return strReturn;
  }

  if (iIdNo.length==15)
  {
    tmpStr=iIdNo.substring(6,12);
    tmpStr= "19" + tmpStr;
    tmpStr= tmpStr.substring(0,4) + "-" + tmpStr.substring(4,6) + "-" + tmpStr.substring(6)

    return tmpStr;
  }
  else// if (iIdNo.length==18)
  {
  	tmpStr=iIdNo.substring(6,14);
  	tmpStr= tmpStr.substring(0,4) + "-" + tmpStr.substring(4,6) + "-" + tmpStr.substring(6)

    return tmpStr;
  }
}



/**
 * 用出生日期计算年龄
 * 参数，出生日期yy－mm－dd
 * 返回  年龄
 */
function calAge(birthday) {
  var arrBirthday = birthday.split("-");
  if (arrBirthday[1].length == 1) arrBirthday[1] = "0" + arrBirthday[1];
  if (arrBirthday[2].length == 1) arrBirthday[2] = "0" + arrBirthday[2];

  var today = new Date();
  var arrToday = new Array();
  arrToday[0] = today.getYear();
  arrToday[1] = today.getMonth() + 1;
  arrToday[2] = today.getDate();

  var age = arrToday[0] - arrBirthday[0] - 1;
  //当前月大于出生月
  //alert(arrToday[1] + " | " + arrBirthday[1] + " | " + (arrToday[1] > arrBirthday[1]));
  if (arrToday[1] > arrBirthday[1]) {
    age = age + 1;
    return age;
  }
  //当前月小于出生月
  else if (arrToday[1] < arrBirthday[1]) {
    return age;
  }
  //当前月等于出生月的时候，看出生日
  else if (arrToday[2] >= arrBirthday[2]) {
    age = age + 1;
    return age;
  }
  else {
    return age;
  }
}

/**
 * 搜寻主窗口，用于CodeSelect缓存数据
 * 参数
 * 返回
 */
function searchMainWindow(win) {
  if (typeof(win) != "object") {
    return false;
  }
  //alert(win.top.name);

  if (win.top.name == "Lis") {
    return win.top;
  }
 
  return searchMainWindow(win.top.opener);
}


//校验暂交费号发放
function verifyTempfeeNo(tempfeeNo) {
	//去系统表LDSysVar中查询Sysvar字段名为checkNewType的纪录，判断是否需要去查询单证状态表
	var tSql = "select Sysvarvalue from LDSysVar where Sysvar='CheckNewType'";
	var tResult = easyExecSql(tSql, 1, 0, 1);
	//为了校验，设置ldsysvar变量为3
	if(tResult=="1" || tResult=="3") {
		//如果查到该纪录，表明需要查询单证状态表
		//去单证状态表里查询该号码是否有效,暂交费收据号
		var strSql = "select CertifyCode from LZCardTrack where Startno<='"+tempfeeNo+"' and Endno>='"+tempfeeNo+"' and Receivecom = 'D"+fm.all('AgentCode').value+"' and StateFlag='0' and CertifyCode in (select CertifyCode from LMCertifyDes where CertifyClass2 = '0')";
		var strResult=easyQueryVer3(strSql, 1, 0, 1);
		if(!strResult) {
			alert("该单证（单证编码为："+tempfeeNo+" ）没有发放给该代理人（"+fm.all('AgentCode').value+"）!");
			return false;
		}
	}
	return true;
}

//校验印刷号发放
function verifyPrtNo(prtNo) {
	//去系统表LDSysVar中查询Sysvar字段名为checkNewType的纪录，判断是否需要去查询单证状态表
	var tSql = "select Sysvarvalue from LDSysVar where Sysvar='CheckNewType'";
	var tResult = easyExecSql(tSql, 1, 0, 1);
	if(tResult=="2" || tResult=="3") {
		//如果查到该纪录，表明需要查询单证状态表
		//去单证状态表里查询该号码是否有效,投保单印刷号码
//		var cardType = prtNo.substring(2, 4);
//		if (cardType=="11") {
//			cardType = "1101";
//		}
//		else if (cardType=="12") {
//			cardType = "1201";
//		}
//		else if (cardType=="15") {
//			cardType = "1501";
//		}
//		else if (cardType=="16") {
//			cardType = "1601";
//		}
//		var strResult;
//		var strSql="";
//		if (cardType=="14") {
//			//cardType = "1401";
//			strSql = "select CertifyCode from LZCardTrack where Startno<='"+prtNo+"' and Endno>='"+prtNo+"' and Receivecom = 'D"+fm.all('AgentCode').value+"' and StateFlag='0'";
//			strResult=easyQueryVer3(strSql, 1, 0, 1);
//		}
//		else if(cardType=="24") {
//			strSql = "select CertifyCode from LZCardTrack where Startno<='"+prtNo+"' and Endno>='"+prtNo+"' and Receivecom = 'D"+fm.all('AgentCode').value+"' and StateFlag='0'";
//			strResult=easyQueryVer3(strSql, 1, 0, 1);
//		}
//		else {
		var strSql = "select CertifyCode from LZCardTrack where Startno<='"+prtNo+"' and Endno>='"+prtNo+"' and Receivecom = 'D"+fm.all('AgentCode').value+"' and StateFlag='0'";
		var strResult=easyQueryVer3(strSql, 1, 0, 1);
//		}
		if(!strResult) {
			alert("该单证（单证编码为："+prtNo+" ）没有发放给该代理人（"+fm.all('AgentCode').value+"）!");
			return false;
		}
	}
	return true;
}


/**
 * 显示元素的Title信息（解决信息较多无法直接在界面元素中获得所有信息的问题）
 */
function showTitle() {
  var formsNum = 0;          //窗口中的FORM数
  var elementsNum = 0;       //FORM中的元素数
  var strEvent = "";         //保存onDoubleClick事件代码
  var urlStr = "";
  var sFeatures = "";
  var strCode = "";          //代码选择
  var strQueryResult = "";   //代码选择的查询结果集
  var arrCode = null;        //拆分数组
  var strCodeValue = "";     //代码值
  var cacheFlag = false;     //内存中有数据标志

  var strCodeSelect = "";

  //寻找主窗口
  var win = searchMainWindow(this);
  if (win == false) { win = this; }

  //遍历所有FORM
  for (formsNum=0; formsNum<window.document.forms.length; formsNum++) {
    //遍历FORM中的所有ELEMENT
    for (elementsNum=0; elementsNum<window.document.forms[formsNum].elements.length; elementsNum++) {
      //寻找代码选择元素
      if (window.document.forms[formsNum].elements[elementsNum].className == "code") {
       //取出代码值
        strCodeValue = window.document.forms[formsNum].elements[elementsNum].value;

        //空值则不处理
        if (strCodeValue == "") continue;
      }

      //显示title
      if (window.document.forms[formsNum].elements[elementsNum].type == "text") {
         window.document.forms[formsNum].elements[elementsNum].title = window.document.forms[formsNum].elements[elementsNum].value;
      }

    }
  }
}

/**
 *窗口聚焦函数
 *参数：show：要显示的窗体
 */
function myonfocus(show){
	if(show!=null)
	{
	  try
	  {
	    show.focus();
	  }
	  catch(ex)
	  {
	    show=null;
	  }
	}
}
//初始化控件类型
function initElementtype(){
    for(var fm=0;fm<document.forms.length;fm++){
      var theElements=document.forms[fm].elements;
      for(var i=0;i<theElements.length;i++){
        if(theElements[i].elementtype && theElements[i].elementtype.indexOf("nacessary")!=-1 )
            theElements[i].insertAdjacentHTML("afterEnd","<font color=red>&nbsp;*</font>");
        if(theElements[i].elementtype && theElements[i].elementtype.indexOf("misty")!=-1 )
            theElements[i].insertAdjacentHTML("afterEnd","<font color=red>&nbsp;?</font>");
      }
    }
}

//显示textarea中的内容
function showTextareaDiv(parm1,parm2){
    var ex,ey;
    ex = window.event.clientX+document.body.scrollLeft;  //得到事件的坐标x
    ey = window.event.clientY+document.body.scrollTop;   //得到事件的坐标y
    var str=fm.all( parm1 ).all(parm2).value;
    Gridobj=fm.all(parm1 ).all(parm2);
    divDownList.innerHTML='<table id="tabList" style="width:100%" border="0" cellpadding="0" cellspacing="0">'
    +'<tr><td align="right"><textarea class=common2 rows=4 id=textareavalue name=textareavalue value="" style="overflow:auto;width:100%"></textarea></td></tr>'
    +'<tr><td align="right"><input type="button" value="确定" onclick="insertvalue()"></td></tr></table>';
    textareavalue.value=str;
    divDownList.style.left=ex;
    divDownList.style.top =ey;
    divDownList.style.display="";
}
//将填入textarea的内容填入控件
function insertvalue(){
  Gridobj.value=textareavalue.value;
  divDownList.style.display="none";
}
//检查字符串中是否含有中文  含有--true 没有--false
function chkzh(tchar){
    if (tchar =="")
        return false;
    var pattern = /^([\u4E00-\u9FA5]|[\uFE30-\uFFA0])*$/gi;
    if (pattern.test(tchar))
        return true;
    else
        return false;
}

//根据身份证号取得性别 update 2004-12-09 wzw
function getSexByIDNo(iIdNo){
  var tSex="";
  var strReturn="";
  if ((iIdNo.length!=15) && (iIdNo.length!=18))
  {
    strReturn = "输入的身份证号位数错误";
    return strReturn;
  }
  var tmpInt=0;
  if(iIdNo.length==15){
    tmpInt = parseInt(iIdNo.substring(14));
  }
  if(iIdNo.length==18){
    tmpInt = parseInt(iIdNo.substring(16,17));
  }
  tmpInt = tmpInt % 2;
  if (tmpInt==0){
    tSex="1";
  }
  else {
    tSex="0";
  }
  return tSex;
}


/*
 * 下面的代码是更改页面title提示显示样式的代码
 * 默认的显示title时间太短不爽
 * update 2004-12-09 wzw
 */
ToolTipGlobal={id:0,getId:function(o){this.all[this.all.length]=o;return this.id++},all:[]};
function ToolTip(defaultOpacity,font,BGround,color,border,offsetOn,offsetOff)
{
	this.id = ToolTipGlobal.getId(this);
	this.defaultOpacity = defaultOpacity;
	this.opacity = defaultOpacity;
	this.font = font;
	this.BGround = BGround;	//title显示的背景颜色
	this.border = border;
	this.timerOn = null;
	this.timerOff = null;
	this.offsetOn = offsetOn;
	this.offsetOff = offsetOff;
	this.control = null;
	var o = this;
	window.attachEvent("onload",function(){ o.setup();});
}
ToolTip.prototype.fadeOn = function()
{
	window.clearTimeout(this.timerOff);
	this.timerOn = window.setTimeout("ToolTipGlobal.all["+this.id+"].fade(1)",this.offsetOn[1]);
}
ToolTip.prototype.fadeOff = function()
{
	window.clearTimeout(this.timerOn);
	this.timerOff = window.setTimeout("ToolTipGlobal.all["+this.id+"].fade(0)",this.offsetOff[1]);
}
ToolTip.prototype.setOpacity = function(x)
{
	this.opacity = x;
	this.control.style.filter = "progid:DXImageTransform.Microsoft.Alpha(opacity="+ x +") progid:DXImageTransform.Microsoft.Shadow(color='#FF444444', Direction=135, Strength=3)";
}
ToolTip.prototype.fade = function(x)
{
	var o = this.control;
	var ox = this.opacity;
	if(x)
	{
		if(ox + this.offsetOn[0] <100)
		{
			this.setOpacity(ox+this.offsetOn[0]);
			this.fadeOn();
		}
		else
		{
			this.setOpacity(100);
		}
	}
	else
	{
		if(ox - this.offsetOff[0]>this.defaultOpacity)
		{
			this.setOpacity(ox - this.offsetOn[0]);
			this.fadeOff();
		}
		else
		{
			this.setOpacity(this.defaultOpacity);
			o.style.visibility = "hidden"
		}
	}
}
ToolTip.prototype.setup = function()
{
	var o = document.createElement("div");
	var oThis = this;
	with(o.style)
	{
		position = "absolute";
		top = "0px";
		left = "0px";
		font = this.font;
		zIndex = 99999;
		background = this.BGround;
		color = this.color;
		border = this.border;
		padding = "2px 4px";
		visibility = "hidden";
	}
	document.body.appendChild(o);
	this.control = o;
	document.attachEvent("onmouseover",function(){
		var e = window.event.srcElement;
		if(e.title != "")
		{
			e.tip = e.title;
			e.title = "";
		}
		if(typeof(e.tip) != "undefined" && e.tip != null)
		{
			o.innerHTML = e.tip;
			oThis.setOpacity(oThis.defaultOpacity);
			var x,y,docheight,docwidth,dh,dw;
			x = window.event.clientX + document.body.scrollLeft;	//触发事件所在横坐标
			//document.body.scrollLeft，滚动条的左移量
			y = window.event.clientY + document.body.scrollTop;	//触发事件所在纵坐标
			docheight = document.body.clientHeight;	//触发事件的所在区域高度
			docwidth  = document.body.clientWidth;	//触发事件的所在区域宽度
			dh =(o.offsetHeight + y) - docheight;
			dw =(o.offsetWidth + x)  - docwidth;
//			o.offsetWidth = e.offsetWidth;
			if(dw > 0)
			{
//				o.style.left =(x - o.offsetWidth) + document.body.scrollLeft - 5 ;
				o.style.left = x;
			}
			else
			{
//				o.style.left = x + document.body.scrollLeft + 10;
				o.style.left = x;
			}
			if(dh > 0)
			{
				o.style.top = y  - 5 ;
			}
			else
			{
				o.style.top  = y  + 10 ;
			}
//			o.style.width = e.offsetWidth;
			o.style.visibility = "visible";
			oThis.fadeOn();
		}
	});
	//鼠标移开目标的时候触发事件
	document.attachEvent("onmouseout",function(){
		var e = window.event.srcElement;
		if(typeof(e.tip) != "undefined" && e.tip != null)
		{
//			oThis.fadeOff();
			//隐藏titile信息
			o.style.visibility = "hidden";
		}
	});
};
var tooltip = new ToolTip(20,"9pt Arial 宋体","#ffffdd","#000000","1px solid #000000",[8,20],[8,20]);
var tooltip =new ToolTip(20,"9pt Arial 宋体","#ffffdd","#000000","1px solid #000000",[8,20],[8,20]);

function OpenWindowNew(strurl,windowname,opentype,width,height)
{

     if(opentype=="left")
     {
      window.open(strurl,windowname,'width='+screen.availWidth+',height='+screen.availHeight+',top=0,left=0,toolbar=0,location=0,directories=0,menubar=0,scrollbars=1,resizable=1,status=0');
     }

     if (width=='undefined' || width==null  )
     {
     	width=600
     }
     if ( height=='undefined'||  height==null )
     {
     	height=500
     }
     if(opentype=="middle")
     {
        var  iWidth=width; //模态窗口宽度
        var  iHeight=height;//模态窗口高度
        var  iTop=(window.screen.height-iHeight)/2;
        var  iLeft=(window.screen.width-iWidth)/2;
        window.open(strurl,windowname,'width='+iWidth+',height='+iHeight+',top='+iTop+',left='+iLeft+',toolbar=0,location=0,directories=0,menubar=0,scrollbars=1,resizable=1,status=0');
     }
}
/**
* 查询指定字段的值
* tableName:表名
* fieldName:字段名
* fieldValue:查询条件
* returnField:返回字段名
* 如果存在返回名称,反之返回null
*/
function getNameByCode(returnField,tableName,fieldName,fieldValue){
	var strSQL = "";
	if(fieldValue!='' && fieldValue!=null){
		strSQL = "select "+returnField+" from "+tableName+" where "+fieldName+" = '"+fieldValue+"'";
		strQueryResult = easyQueryVer3(strSQL,1,0,1,0,1);
		//判断是否查询成功
		if (!strQueryResult){
			return("");
		}
		var arrReturn = new Array();
		arrReturn = decodeEasyQueryResult(strQueryResult,0,1);
		return arrReturn[0][0];
	}
	else{
		return("");
	}
}
/**
* 从LDCode取得代码对应的名称
* CodeType:字段类型
* Code:代码
* 如果存在返回名称,反之返回""
*/
function getNameFromLDCode(CodeType,Code){
	var tCodeType=CodeType.toLowerCase();
	var tCode=Code;

	if(tCode!='' && tCode!=null){
		var arrSelected=new Array();

		var strSQL = "";
		strSQL = "select CodeName from LDCode where CodeType='"+tCodeType+"' and Code='"+tCode+"'";

		var strQueryResult = easyQueryVer3(strSQL,1,0,1,0,1);
		arrSelected = decodeEasyQueryResult(strQueryResult,0,1);

		if(arrSelected==null)
			return("");
		else
			return(arrSelected[0][0]);
	}
	else{
		return("");
	}
}

  /**
   * 计算传入日期前n天或后n天的日期
   *
   *
   *
   *
   *
   *
   *
   */
function newDate(oldDate,months)
{
	if(oldDate==""||months=="")
	{
		return false;
	}
	if (typeof(oldDate) == "string") {
		origDate = getDate(oldDate);
	}
	var oldD=origDate.getDate();
	var oldM=origDate.getMonth();
	var oldY=origDate.getFullYear();
	var tempM=oldM+months;
	var newM=tempM;
	var newY=oldY;
while (newM>12||newM<1)
	{
		if (newM>12)
		{
			newM=tempM-12;
			newY=oldY+1;
		}
		if(newM<1)
		{
			newM=tempM+12;
			newY=oldY-1;
		}
	}

	newD=oldD;
	splitOp='-';
	newDate=newY+splitOp+newM+splitOp+newD;
//	alert(newDate);
	return newDate;
}

//取某月天数
function getDays(month, year)
{
	var daysInMonth = new Array(0,31, 28, 31, 30, 31, 30, 31, 31,30, 31, 30, 31);
	 if (2 == month)
     return ((0 == year % 4) && (0 != (year % 100))) ||(0 == year % 400) ? 29 : 28;
  else
     return daysInMonth[month];
}
//根据年龄算生日
function AgeToBirthday(tAge)
{
	var today = new Date();
	var year = String(today.getYear()-tAge);
	var month = String(today.getMonth() + 1);
	var day = String(today.getDate());
	var Birthday = year+"-"+month+"-"+day;
	return Birthday;
}
//校验某一个日期是否正确，主要是天数的正确，比如4月31日
function getOneMonthError(InputDate)
{
	if(InputDate == "") return 0;
	var year=InputDate.substring(0,InputDate.indexOf("-"));
	var month=InputDate.substring(InputDate.indexOf("-")+1,InputDate.lastIndexOf("-"));
	if(month.length==2)
	{
		if(month.indexOf("0")==0)
		{
			month = month.substring(1);
		}
	}
	var day=InputDate.substring(InputDate.lastIndexOf("-")+1,InputDate.length);
	var chkDay = getDays(month,year)
	var calChkDay = chkDay/1;
	var calday = day/1;
	var tSub =  calChkDay - calday;
	return tSub;
}
//校验每个月的天数是否正常
function chkDayAndMonth()
{
	for (formsNum=0; formsNum < window.document.forms.length; formsNum++)
	{
		//遍历FORM中的所有ELEMENT
		for (elementsNum=0; elementsNum < window.document.forms[formsNum].elements.length; elementsNum++)
		{
			//寻找代码选择元素
			if (window.document.forms[formsNum].elements[elementsNum].className == "coolDatePicker")
			{
				var chkDate = window.document.forms[formsNum].elements[elementsNum].value;
				if(chkDate != "")
				{
					var Differ = getOneMonthError(chkDate);
					if(Differ < 0)
					{
						alert("录入日期格式有误！");
						window.document.forms[formsNum].elements[elementsNum].focus();
						return false;decode
					}
				else
					{
						return true;
					}
				}
				return true;
			}
		}
	}
}
function ChangeDecodeStr(){
	//alert(window.document.forms[0].elements.length);
  for (var elementsNum=0; elementsNum<window.document.forms[0].elements.length; elementsNum++) {
      if (window.document.forms[0].elements[elementsNum].type == "text"
          || window.document.forms[0].elements[elementsNum].type == "textarea" ) {
          	if(window.document.forms[0].elements[elementsNum].value.indexOf("^")!=-1){
		        window.document.forms[0].elements[elementsNum].value = replace(window.document.forms[0].elements[elementsNum].value,"^","@#");
		      }
        //window.document.forms[0].elements[elementsNum].onfocus = debugShow;
      }
    }
}
function UnChangeDecodeStr(){
	//alert(window.document.forms[0].elements.length);
  for (var elementsNum=0; elementsNum<window.document.forms[0].elements.length; elementsNum++) {
      if (window.document.forms[0].elements[elementsNum].type == "text"
          || window.document.forms[0].elements[elementsNum].type == "textarea" ) {
          	if(window.document.forms[0].elements[elementsNum].value.indexOf("@#")!=-1){
		        window.document.forms[0].elements[elementsNum].value = replace(window.document.forms[0].elements[elementsNum].value,"@#","^");
		      }
        //window.document.forms[0].elements[elementsNum].onfocus = debugShow;
      }
    }
}
//严格校验身份证号码

//兰军 2005-7-2 17:05

//公民身份号码是特征组合码，
//由十七位数字本体码和一位数字校验码组成。
//排列顺序从左至右依次为：六位数字地址码，八位数字出生日期码，
//三位数字顺序码和一位数字校验码。顺序码的奇数分给男性，偶数分给女性。
//校验码是根据前面十七位数字码，按照ISO7064:1983.MOD11-2校验码计算出来的检验码。

 function checkIdCard(idCard)
 {
    var SystemDate=new Date();
    var year=SystemDate.getFullYear();
    var month=SystemDate.getMonth()+1;
    var day=SystemDate.getDate();
		var yyyy; //年
		var mm; //月
		var dd; //日
		var birthday; //生日
		var sex; //性别

    var id=idCard;
    var id_length=id.length;

    if (id_length==0)
    {
        alert("请输入身份证号码!");
        return false;
    }

    if (id_length!=15 && id_length!=18)
    {
        alert("身份证号长度应为15位或18位！");
        return false;
    }

    if (id_length==15)
    {
    	 for(var i =0 ;i<id_length;i++)  
    	 {
    	 	 if(isNaN(idCard.charAt(i)))
    	 	 {
    	 	 	alert("15位身份证号中不能有字符！");
          return false;
    	 	 }
    	 }
    	
        yyyy="19"+id.substring(6,8);
        mm=id.substring(8,10);
        dd=id.substring(10,12);

        if (mm>12 || mm<=0){
            alert("身份证号月份非法！");
            return false;
        }

        if (dd>31 || dd<=0){
            alert("身份证号日期非法！");
            return false;
        }
        
        
	      if((mm==4||mm==6||mm==9||mm==11)&&(dd>30))//4,6,9,11月份日期不能超过30
				{
				    alert("身份证号日期非法！");
				    return false;
				}
	
				if(mm==2)//判断2月份
				{
					if(LeapYear(yyyy))
					{
					   if(dd>29)
					   {
							  alert("身份证号日期非法！");
						    return false;
					   }
					}
					else
					{
					   if(dd>28)
					   {
					      alert("身份证号日期非法！");
						    return false;
					   }
					}
				}

    }
    else if (id_length==18)
    	{
    		
    	 for(var i =0 ;i<id_length-1;i++)  
    	 {
    	 //	alert(i+"="+idCard.charAt(i));
    	 	 if(isNaN(idCard.charAt(i)))
    	 	 {
    	 	 	alert("身份证号中前17位中不能有字符！");
    	 	 	return false;
    	 	 }
    	 }
    	 
    	 if(isNaN(idCard.charAt(17))&& idCard.charAt(17) !="X" && idCard.charAt(17) !="x" )
    	 {
    	 	  alert("身份证最后一位错误！");
    	 	  return false;
    	 }
        if (idCard.indexOf("X") > 0 && idCard.indexOf("X")!=17 || idCard.indexOf("x")>0 && idCard.indexOf("x")!=17){
            alert("身份证中\"X\"输入位置不正确！");
            return false;
      }

        yyyy=id.substring(6,10);
        if (yyyy>year || yyyy<1900)
        {
            alert("身份证号年度非法！");
            return false;
        }

        mm=id.substring(10,12);
        if (mm>12 || mm<=0)
        {
            alert("身份证号月份非法！");
            return false;
        }
        if(yyyy==year&&mm>month)
        {
            alert("身份证号月份非法！");
            return false;        	
        }

      dd=id.substring(12,14);
      if (dd>31 || dd<=0)
      {
            alert("身份证号日期非法！");
            return false;
      }

			if((mm==4||mm==6||mm==9||mm==11)&&(dd>30))//4,6,9,11月份日期不能超过30
			{
			    alert("身份证号日期非法！");
			    return false;
			}

			if(mm==2)//判断2月份
			{
				if(LeapYear(yyyy))
				{
				   if(dd>29)
				   {
						  alert("身份证号日期非法！");
					    return false;
				   }
				}
				else
				{
				   if(dd>28)
				   {
				      alert("身份证号日期非法！");
					    return false;
				   }
				}
			}
        if(yyyy==year&&mm==month&&dd>day)
        {
            alert("身份证号日期非法！");
            return false;        	
        }


        if (id.charAt(17)=="x" || id.charAt(17)=="X")
        {
            if ("x"!=GetVerifyBit(id) && "X"!=GetVerifyBit(id))
            {
                alert("身份证校验错误，请检查最后一位！");
                return false;
            }

        }else{
            if (id.charAt(17)!=GetVerifyBit(id))
            {
               alert("身份证校验错误，请检查最后一位！");
               return false;
            }
        }
    }
    return true;
}

//计算身份证校验码

//兰军 2005-7-2 17:06

//原理:
//∑(a[i]*W[i]) mod 11 ( i = 2, 3, ..., 18 )(1)
//"*" 表示乘号
//i--------表示身份证号码每一位的序号，从右至左，最左侧为18，最右侧为1。
//a[i]-----表示身份证号码第 i 位上的号码
//W[i]-----表示第 i 位上的权值 W[i] = 2^(i-1) mod 11
//计算公式 (1) 令结果为 R
//根据下表找出 R 对应的校验码即为要求身份证号码的校验码C。
//R 0 1 2 3 4 5 6 7 8 9 10
//C 1 0 X 9 8 7 6 5 4 3 2
// X 就是 10，罗马数字中的 10 就是 X
//15位转18位中,计算校验位即最后一位

 function GetVerifyBit(id){
    var result;
    var nNum=eval(id.charAt(0)*7+id.charAt(1)*9+id.charAt(2)*10+id.charAt(3)*5+id.charAt(4)*8+id.charAt(5)*4+id.charAt(6)*2+id.charAt(7)*1+id.charAt(8)*6+id.charAt(9)*3+id.charAt(10)*7+id.charAt(11)*9+id.charAt(12)*10+id.charAt(13)*5+id.charAt(14)*8+id.charAt(15)*4+id.charAt(16)*2);
    nNum=nNum%11;
    switch (nNum) {
       case 0 :
          result="1";
          break;
       case 1 :
          result="0";
          break;
       case 2 :
          result="X";
          break;
       case 3 :
          result="9";
          break;
       case 4 :
          result="8";
          break;
       case 5 :
          result="7";
          break;
       case 6 :
          result="6";
          break;
       case 7 :
          result="5";
          break;
       case 8 :
          result="4";
          break;
       case 9 :
          result="3";
          break;
       case 10 :
          result="2";
          break;
    }
    //document.write(result);
    return result;
}

//校验是否闰年
//xuxin
function LeapYear(year)
{
  return ((0 == year % 4) && (0 != (year % 100))) ||(0 == year % 400);
}
/**
 * 在String对象上添加trim方法
 */
function String.prototype.trim()
{
	//利用正则表达式去除头尾的空格
	return this.replace(/(^\s*)|(\s*$)/g,"");
}