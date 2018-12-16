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
<form action="/order" method="get">
    订单号：<input type="text" class="form-login" name="id"/>
    <button class="btn btn-lg btn-primary btn-block" type="submit">查询</button><br />
    </form>
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
             <!--订单对比信息结果-->
                <hr />
              <font color="#FFA500" size = "4px">超距记录对比信息：</font><br />
              <font color="#20B2AA" size = "3px">order_foul_record：</font>
                <div class="pre-content">${listData}</div>
         </#list>
    </#if>
 </#list>
</div>
</#if>
</body>
</html>








