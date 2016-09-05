
 
        //测试用的数据
 	
        var old_value = "";
        var highlightindex = -1;   //高亮


 
 
 
  function AutoCompleteSelect(selspan, selinput, left,top,mylist) {
            if ($("#" + selinput).val() != old_value || old_value == "") {
                var spanNode = $("#" + selspan);   //缓存对象（弹出框）
                var carlist = new Array();
                var n = 0;
                old_value = $("#" + selinput).val();
 
                for (i in mylist) {
                    if (mylist[i].indexOf(old_value) >= 0) {
                        carlist[n++] = mylist[i];
                    }
                }
	                if (carlist.length == 0) {
	                    spanNode.hide();
	                    return;
                }
                spanNode.empty();  //清空上次的记录
            
                 var eles = $("#"+selspan).get(0);
              	eles.style.left=left+"px";
              	eles.style.top=top+"px";
                var selnode = $("<select>").attr("name", "codeselect");
                selnode.attr("style", "width:250px");
                selnode.attr("size", "8");
                for (i in carlist) {
                    var wordNode = carlist[i];   //弹出框里的每一条内容
 
                    var newDivNode = $("<option>").html(wordNode);    //设置每个节点的id值
                    
 					newDivNode.val(wordNode);
                    newDivNode.appendTo(selnode);  //追加到弹出框
                    selnode.appendTo(spanNode);
 
 
                    //鼠标点击文字上屏
                     selnode.click(function () {
                  
                        //取出高亮节点的文本内容
                        var comText = selnode.val();
                        var coms = comText.split("-");
                        highlightindex = -1;
                        //文本框中的内容变成高亮节点的内容
                        $("#" + selinput).val(coms[0]);
                         $("#" + selinput+"_name").val(coms[1]);
                      
                    })
                    if (carlist.length > 0) {    //如果返回值有内容就显示出来
                        spanNode.show();
                    } else {               //服务器端无内容返回 那么隐藏弹出框
                        spanNode.hide();
                        //弹出框隐藏的同时，高亮节点索引值也变成-1
                        highlightindex = -1;
                    }
                }
                
               
            }
 
            //点击页面隐藏自动补全提示框
            document.onclick = function (e) {
                var e = e ? e : window.event;
                var tar = e.srcElement || e.target;
                if (tar.id != selinput) {
                    if ($("#" + selspan).is(":visible")) {
                        $("#" + selspan).css("display", "none");
                    }
                }
            }
 
        }
 
 	 function getX(ele){
  	    return ele.offsetLeft+(ele.offsetParent?getX(ele.offsetParent):ele.x?ele.x:0);
    }
    function getY(ele){
  	   return ele.offsetParent?ele.offsetTop+getY(ele.offsetParent):ele.y?ele.y:0;
  
    }
    

     function selclick(ele,codetype,comcode){
    	 
    
    	 $.ajax({
				type:"post",
				url:"../codeAction!searchcode",
				data:"code.codePK.codetype="+codetype+"&&code.comcode="+comcode,
				dataType:"json",//预期得到类型
				success:function(rs){
					var codelist = new Array();
					for(var i=0;i<rs.length;i++){
						codelist[i]=rs[i].codePK.code+"-"+rs[i].codename;
					}
					
					var x = ele.offsetLeft+(ele.offsetParent?getX(ele.offsetParent):ele.x?ele.x:0);
		     		var y = (ele.offsetParent?ele.offsetTop+getY(ele.offsetParent):ele.y?ele.y:0)+ele.offsetHeight;
		           if ($("#"+ele.id).val() == "") {
		                    AutoCompleteSelect("spanCode", ele.id, x,y,codelist);
		            }
				}	

			});
    	
     	
            
     }  
     
//  
	   function selkeyup(ele,codetype,comcode){
		 
	    	 $.ajax({
					type:"post",
					url:"../codeAction!searchcode",
					data:"code.codePK.codetype="+codetype+"&&code.comcode="+comcode,
					dataType:"json",//预期得到类型
					success:function(rs){
						var codelist = new Array();
						for(var i=0;i<rs.length;i++){
							codelist[i]=rs[i].codePK.code+"-"+rs[i].codename;
						}
						 var x = ele.offsetLeft+(ele.offsetParent?getX(ele.offsetParent):ele.x?ele.x:0);
			     		 var y = (ele.offsetParent?ele.offsetTop+getY(ele.offsetParent):ele.y?ele.y:0)+ele.offsetHeight;
				   	 	AutoCompleteSelect("spanCode", ele.id, x,y,codelist);
						
					}	

				});
	    	 
	  		
	   	
	   }
