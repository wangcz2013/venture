<script src="./UserAdd.js"></script>
<%@page contentType="text/html;charset=utf-8" %>
<script language="JavaScript">


function initForm()
{
	try
	{
	
		
		initFirmGrid();
	}
	catch(re)
	{
		alert("LDUserInputInit.jsp-->InitForm初始化错误!");
	}
}

function initFirmGrid()
{
	var iArray = new Array();
	try
	{
		iArray[0]=new Array();
		iArray[0][0]="序号";	//猫聞聲猫聞篓猫聞聶忙虏隆忙聥垄莽炉聯茅潞聯猫聞拢猫聞聲猫聞篓猫聞娄茅聶聥猫聞拢茅虏聛猫聞篓猫虏聦忙陆聻猫聞聹忙聥垄氓聧垄猫聞聲猫聞篓猫聞聶忙虏隆猫聞娄猫聞录猫聞陋猫聤聮猫聞陋忙掳聯忙聥垄氓聧垄茅聹虏茅聟露猫聞聼猫聞陋猫聶聫莽娄聞猫聞搂猫聞颅猫聞垄忙聢庐忙聥垄忙录聫
		iArray[0][1]="40px";	//猫聞聲猫聞篓茅漏麓茅聯聠
		iArray[0][2]=10;		//猫聞聲猫聞篓猫聞鲁氓聧炉茅潞聯猫麓赂猫聞掳莽垄聦
		iArray[0][3]=0;
		
		

		iArray[1]=new Array();
		iArray[1][0]="保险公司编码";
		iArray[1][1]="80px";
		iArray[1][2]=10;
		iArray[1][3]=0;

		iArray[2]=new Array();
		iArray[2][0]="保险公司名称";
		iArray[2][1]="200px";
		iArray[2][2]=100;
		iArray[2][3]=0;

		iArray[3]=new Array();
		iArray[3][0]="保险公司管理机构";
		iArray[3][1]="80px";
		iArray[3][2]=100;
		iArray[3][3]=0;

	
		
		iArray[4]=new Array();
		iArray[4][0]="分公司编码";
		iArray[4][1]="80px";
		iArray[4][2]=100;
		iArray[4][3]=0;
		
		iArray[5]=new Array();
		iArray[5][0]="分公司名称";
		iArray[5][1]="200px";
		iArray[5][2]=100;
		iArray[5][3]=0;
		
		iArray[6]=new Array();
		iArray[6][0]="分公司管理机构";
		iArray[6][1]="80px";
		iArray[6][2]=100;
		iArray[6][3]=0;
		
		
		FirmGrid = new MulLineEnter( "firmfm" , "FirmGrid" );
		
		//猫聞庐猫聤聮猫聞篓忙录聫猫聞垄盲鹿聢猫聞篓猫聞颅氓聧陇猫聞麓猫聞篓忙炉聸猫聞颅猫聞路loadMulLine猫聞聼忙聨鲁
		FirmGrid.mulLineCount = 0;
		FirmGrid.displayTitle = 1;
		FirmGrid.canChk =0;
		FirmGrid.canSel =1;
		FirmGrid.locked =1;				//猫聞垄猫聞聼猫路炉氓赂陆猫聞拢茅聟露茅聹虏莽炉聯忙聥垄忙陆聻1猫聞娄茅聶聥猫聞拢茅聟露茅聹虏莽炉聯 0猫聞娄茅聶聥猫聶聫莽娄聞猫聞拢茅聟露茅聹虏莽炉聯
		FirmGrid.hiddenPlus=1;			//猫聞垄猫聞聼猫路炉氓赂陆猫聞陋茅聲聛猫聶聫猫聞麓"+"猫聞陇茅聯聠氓陆聲猫聞芦猫聞陋莽娄聞猫聞篓猫聞篓氓聧陇茅聰職猫聞掳忙聢庐忙聥垄忙陆聻1猫聞娄茅聶聥猫聞陋茅聲聛猫聶聫猫聞麓忙聥垄莽娄聞0猫聞娄茅聶聥猫聶聫莽娄聞猫聞陋茅聲聛猫聶聫猫聞麓
		FirmGrid.hiddenSubtraction=1;	//猫聞垄猫聞聼猫路炉氓赂陆猫聞陋茅聲聛猫聶聫猫聞麓"-"猫聞陇茅聯聠氓陆聲猫聞芦猫聞陋莽娄聞猫聞篓猫聞篓氓聧陇茅聰職猫聞掳忙聢庐忙聥垄忙陆聻1猫聞娄茅聶聥猫聞陋茅聲聛猫聶聫猫聞麓忙聥垄莽娄聞0猫聞娄茅聶聥猫聶聫莽娄聞猫聞陋茅聲聛猫聶聫猫聞麓
		FirmGrid.recordNo=0;			//猫聞隆莽聦芦猫聞掳猫聞聶猫聞篓猫虏聦忙陆聻猫聞聹猫聞聺氓聠聮猫聞垄氓陆聲莽娄聞茅聹聣猫聞垄氓陋聮猫聞娄茅聶聥10忙聥垄氓聧垄猫聞聽猫聨陆茅鹿驴忙虏隆猫聞陋茅聶聥猫路炉猫聞掳猫聞陋茅虏聛猫聞搂猫聞颅猫聞垄忙聢庐猫聞垄氓陋聮忙聢庐猫聞禄猫聞芦猫聞篓猫聞芦猫聞聶
		FirmGrid.loadMulLine(iArray);
	}
	catch(ex)
	{
		alert(ex);
	}
}



</script>