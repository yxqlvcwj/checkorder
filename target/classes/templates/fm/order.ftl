<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <style>
    body {
    padding: 0;
    margin: 0;
    background-color: #E0E0E0;
    }
    a{
    	text-decoration:none
    }
    .orderId{
    	height: 2000px;
    	width: 1000px;
    	margin-left: 10px;
    	border-radius: 1%;
    	background-color: white;
    }
    .orderInfo{
    	height: 30px;
    	width: 1000px;
    	background-color: white;
    }
            .black_overlay{
            display: none;
            position: absolute;
            top: 0%;
            left: 0%;
            width: 100%;
            height: 100%;
            background-color: black;
            filter: alpha(opacity=88);
        }
        .click_stop {
            display: none;
            position: absolute;
            width: 900px;
            top: 100px;
            left: 30px;
            border-radius: 2%;
            background-color: #E0E0E0;
            overflow: auto;
        }
        .pre-content {
            white-space: pre;
        }

</style>
</head>
<body>
<form action="/order" method="get">
    订单号：<input type="text" class="form-login" name="id"/>
    <button class="btn btn-lg btn-primary btn-block" type="submit">查询</button><br />
    </form>
    <#if jsonData??>
     <div class="orderId">
        <#list jsonData.map?keys as mapKey>
           <#if mapKey == "orderInfo">
              <#list  jsonData.map[mapKey] as listData>
            <div class="orderInfo" style="text-align: center; line-height: 40px;" >
                <font color="007979" size = "4px">${listData.id!'null'}</font><font size="4px" color = "005757">（订单号）</font>
            </div>
                <!--订单信息-->
             <div>
            <hr />
            <font color="#FFA500" size = "4px">订单信息：</font>
            <a href = "javascript:void(0)" onclick = "document.getElementById('order-light').style.display='block'">
                <span>
                    <font color="#20B2AA" size = "3px">feature</font>
                </span>
            </a>
        <div id="order-light" class="click_stop">
            <a href = "javascript:void(0)" onclick = "document.getElementById('order-light').style.display='none'">
                <span  >
                    <font color="#20B2AA" size = "3px">关闭</font>
                 </span>
                <br />
            </a>
            <font color="#20B2AA" size = "3px">OrderInfo：</font>
        <div class="pre-content">${listData}</div>
        </div>
            <br />
           &nbsp;&nbsp;<font color="#000000" size = "3px">骑手id：${listData.riderId!'null'}</font>
           &nbsp;&nbsp;<font color="#000000" size = "3px">商家id：${listData.shopId!'null'}</font>
           &nbsp;&nbsp;<font color="#000000" size = "3px">渠道id：${listData.platformShopid!'null'}</font>
           &nbsp;&nbsp;<font color="#000000" size = "3px">订单状态：${listData.status!'null'}</font>
           &nbsp;&nbsp;<font color="#000000" size = "3px">派单模式：${listData.dispatchMode!'null'}</font>
           &nbsp;&nbsp;<font color="#000000" size = "3px">订单组id：${listData.groupId!'null'}</font>
           &nbsp;&nbsp;<font color="#000000" size = "3px">运单号：${listData.waybillNo!'null'}</font>
           &nbsp;&nbsp;<font color="#000000" size = "3px">标品：${listData.standard!'null'}</font>
           &nbsp;&nbsp;<font color="#000000" size = "3px">订单类型：${listData.orderType!'null'}</font>
        </div>
	 </#list>
   </#if>
<!--工单信息-->
    <#if mapKey == "workOrderList">
      <#list  jsonData.map[mapKey] as listData>
            <div>
            <hr />
            <font color="#FFA500" size = "4px">工单信息：</font>
            <a href = "javascript:void(0)" onclick = "document.getElementById('workorder-light').style.display='block'">
                <span>
                    <font color="#20B2AA" size = "3px">feature</font>
                </span>
            </a>
        <div id="workorder-light" class="click_stop">
            <a href = "javascript:void(0)" onclick = "document.getElementById('workorder-light').style.display='none'">
                <span  >
                    <font color="#20B2AA" size = "3px">关闭</font>
                 </span>
                <br />
            </a>
            <font color="#20B2AA" size = "3px">workorderInfo：</font>
        <div class="pre-content">${listData}</div>
        </div>
            <br />
            &nbsp;&nbsp;<font color="#000000" size = "3px">工单id：${listData.id!'null'}</font>
            &nbsp;&nbsp;<font color="#000000" size = "3px">工单targetId：${listData.targetId!'null'}</font>
            &nbsp;&nbsp;<font color="#000000" size = "3px">工单itemCode：${listData.itemCode!'null'}</font>
            &nbsp;&nbsp;<font color="#000000" size = "3px">工单sourceId：${listData.sourceId!'null'}</font>
            &nbsp;&nbsp;<font color="#000000" size = "3px">工单serviceId：${listData.serviceId!'null'}</font>
            &nbsp;&nbsp;<font color="#000000" size = "3px">工单wdata：${listData.wdata!'null'}</font>
        </div>
	 </#list>
   </#if>
<!--超距记录信息-->
    <#if mapKey == "orderFoulRecordList">
      <#list  jsonData.map[mapKey] as listData>
            <div>
            <hr />
            <font color="#FFA500" size = "4px">超距记录信息：</font>
            <a href = "javascript:void(0)" onclick = "document.getElementById('order-foul-record-light').style.display='block'">
                <span>
                    <font color="#20B2AA" size = "3px">feature</font>
                </span>
            </a>
        <div id="order-foul-record-light" class="click_stop">
            <a href = "javascript:void(0)" onclick = "document.getElementById('order-foul-record-light').style.display='none'">
                <span  >
                    <font color="#20B2AA" size = "3px">关闭</font>
                 </span>
                <br />
            </a>
            <font color="#20B2AA" size = "3px">orderFoulRecord：</font>
        <div class="pre-content">${listData}</div>
        </div>
            <br />
            &nbsp;&nbsp;<font color="#000000" size = "3px">超距记录id：${listData.id!'null'}</font>
            &nbsp;&nbsp;<font color="#000000" size = "3px">超距记录riderId：${listData.riderId!'null'}</font>
            &nbsp;&nbsp;<font color="#000000" size = "3px">超距记录cityId：${listData.cityId!'null'}</font>
            &nbsp;&nbsp;<font color="#000000" size = "3px">超距记录orderId：${listData.orderId!'null'}</font>
            &nbsp;&nbsp;<font color="#000000" size = "3px">超距原因foulReason：${listData.foulReason!'null'}</font>
            &nbsp;&nbsp;<font color="#000000" size = "3px">超距节点orderPhase：${listData.orderPhase!'null'}</font>
            &nbsp;&nbsp;<font color="#000000" size = "3px">超距详细信息remark：${listData.remark!'null'}</font>
        </div>
	 </#list>
   </#if>
 </#list>
</div>
</#if>
</body>
</html>








