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
        .pre-content {
            white-space: pre;
        }

</style>
</head>
<body>
<form action="/order/check" method="get">
    骑手ID：<input type="text" class="form-login" name="riderId"/><br/>
    订单号：<input type="text" class="form-login" name="id"/><br/>
	订单状态：
            <label><input name="status" type="radio" value="0" />已下单 </label>
            <label><input name="status" type="radio" value="5" />已抢单 </label>
            <label><input name="status" type="radio" value="10" />已到店 </label>
            <label><input name="status" type="radio" value="15" />已离店 </label>
            <label><input name="status" type="radio" value="100" />已完成 </label>
            <label><input name="status" type="radio" value="98" />异常完成 </label>
            <label><input name="status" type="radio" value="99" />已取消 </label> <br/>
    其他校验：<label><input name="checkDistance" type="checkbox" value="true" />校验超距 </label>
    <label><input name="checkWorkorder" type="checkbox" value="true" />校验工单 </label> <br/>
    <button class="btn btn-lg btn-primary btn-block" type="submit">查询</button>
    <!--下面是校验部分-->
    <#if jsonData??>
     <div class="orderId">
        <#list jsonData.map?keys as mapKey>
           <#if mapKey == "orderCheck">
              <#list  jsonData.map[mapKey] as listData>
            <div class="orderInfo" style="text-align: center; line-height: 40px;" >
                <font color="007979" size = "4px">${listData.id!'null'}</font><font size="4px" color = "005757">（订单号）</font>
            </div>
                <!--订单对比信息结果-->
            <hr />
            <font color="#FFA500" size = "4px">订单对比信息：</font><br />
            <font color="#20B2AA" size = "3px">order：</font>
        <div class="pre-content">${listData}</div>
	 </#list>
   </#if>

   <#if mapKey == "orderFoulRecordList">
         <#list  jsonData.map[mapKey] as listData>
             <!--当前节点超距记录信息-->
                <hr />
              <font color="#FFA500" size = "4px">超距记录信息：</font><br />
              <font color="#20B2AA" size = "3px">order_foul_record：</font>
                <div class="pre-content">${listData}</div>
         </#list>
    </#if>

     <#if mapKey == "workorderList">
             <#list  jsonData.map[mapKey] as listData>
                 <!--当前节点工单信息-->
                    <hr />
                  <font color="#FFA500" size = "4px">工单信息：</font><br />
                  <font color="#20B2AA" size = "3px">workorder：</font>
                    <div class="pre-content">${listData}</div>
             </#list>
        </#if>

 </#list>
</div>
</#if>
</body>
</html>








