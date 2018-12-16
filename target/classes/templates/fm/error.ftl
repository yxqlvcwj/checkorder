<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>错误页面</title>
     <style>
     body {
     padding: 0;
     margin: 0;
     background-color: #E0E0E0;
     }
 </style>
</head>
<body>
默认错误页面<br/>
        ${jsonData.msg}

        <form action="/order" method="get">
            订单号：<input type="text" class="form-login" name="id"/>
            <button class="btn btn-lg btn-primary btn-block" type="submit">重新查询</button>
        </form>
</body>
</html>








