<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订单数据查询</title>
    <style>
    body {
    padding: 0;
    margin: 0;
    background-color: #E0E0E0;
    }
</style>
</head>
<body>
<form action="/order" method="get">
    订单号：<input type="text" class="form-login" name="id"/>
    <button class="btn btn-lg btn-primary btn-block" type="submit">查询</button>
</form>
<!--
    jsonData.map：获取到map，因为返回结果中只有一个map，所以直接获取即可，如果是list中方的map，需要遍历list然后获取map
    jsonData.map?values as testValues：直接获取map中的value，也可以获取map中的key，通过key获取value
    testValues as listData：map中的value是个list，遍历list，获取list中的每一个对象
    listData.id：取出list中对象的id值，通过这几步，就可以将list中的数据全部取出来了
-->
    <#if jsonData??>
      <#list jsonData.map?keys as mapKey>
            <#if mapKey == "orderInfo">
                <table border="1" width="350">
                    <thead >
                        <tr  >
                            <td colspan="2" align="center" ><font color="red" />order表数据</td>
                        </tr>
                        <tr >
                            <th bgcolor="green">字段名</th>
                            <th bgcolor="green">字段值</th>
                          </tr>
                        </thead>
                        <tbody>
                             <#list  jsonData.map[mapKey] as listData>
                                    <tr>
                                    <td>id</td>
                                    <td>${listData.id!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>cityId</td>
                                    <td>${listData.cityId!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>code</td>
                                    <td>${listData.code!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>shopId</td>
                                    <td>${listData.shopId!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>shopTitle</td>
                                    <td>${listData.shopTitle!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>platformShopid</td>
                                    <td>${listData.platformShopid!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>status</td>
                                    <td>${listData.status!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>fromAddr</td>
                                    <td>${listData.fromAddr!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>fromLng</td>
                                    <td>${listData.fromLng!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>fromLat</td>
                                    <td>${listData.fromLat!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>fromTel</td>
                                    <td>${listData.fromTel!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>toAddr</td>
                                    <td>${listData.toAddr!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>toLng</td>
                                    <td>${listData.toLng!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>toLat</td>
                                    <td>${listData.toLat!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>toTel</td>
                                    <td>${listData.toTel!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>toName</td>
                                    <td>${listData.toName!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>distance</td>
                                    <td>${listData.distance!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>placeTm</td>
                                    <td>${(listData.placeTm?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>recordTm</td>
                                    <td>${(listData.recordTm?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>dispatchTm</td>
                                    <td>${(listData.dispatchTm?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>arriveTm</td>
                                    <td>${(listData.arriveTm?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>acceptTm</td>
                                    <td>${(listData.acceptTm?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>leaveTm</td>
                                    <td>${(listData.leaveTm?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>finishTm</td>
                                    <td>${(listData.finishTm?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                                    </tr>
                                    <td>requireTm</td>
                                    <td>${(listData.requireTm?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>arriveableTm</td>
                                    <td>${(listData.arriveableTm?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>leaveableTm</td>
                                    <td>${(listData.leaveableTm?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>dispatchableTm</td>
                                    <td>${(listData.dispatchableTm?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>takeDur</td>
                                    <td>${listData.takeDur!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>why</td>
                                    <td>${listData.why!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>paid</td>
                                    <td>${listData.paid!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>requireRiderType</td>
                                    <td>${listData.requireRiderType!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>realRiderType</td>
                                    <td>${listData.realRiderType!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>payWay</td>
                                    <td>${listData.payWay!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>cancelReason</td>
                                    <td>${listData.cancelReason!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>source</td>
                                    <td>${listData.source!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>channelId</td>
                                    <td>${listData.channelId!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>serialId</td>
                                    <td>${listData.serialId!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>tradeId</td>
                                    <td>${listData.tradeId!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>tradingAreaId</td>
                                    <td>${listData.tradingAreaId!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>shopRegionId</td>
                                    <td>${listData.shopRegionId!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>riderRegionId</td>
                                    <td>${listData.riderRegionId!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>orderType</td>
                                    <td>${listData.orderType!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>remarks</td>
                                    <td>${listData.remarks!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>switchTimes</td>
                                    <td>${listData.switchTimes!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>overTime</td>
                                    <td>${listData.overTime!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>modified</td>
                                    <td>${listData.modified!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>dispatchMode</td>
                                    <td>${listData.dispatchMode!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>shardx</td>
                                    <td>${listData.shardx!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>shardy</td>
                                    <td>${listData.shardy!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>shardz</td>
                                    <td>${listData.shardz!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>groupId</td>
                                    <td>${listData.groupId!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>contractType</td>
                                    <td>${listData.contractType!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>goodsType</td>
                                    <td>${listData.goodsType!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>weight</td>
                                    <td>${listData.weight!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>requireTag</td>
                                    <td>${listData.requireTag!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>requireLevel</td>
                                    <td>${listData.requireLevel!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>outterGroup</td>
                                    <td>${listData.outterGroup!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>recruitTaskId</td>
                                    <td>${listData.recruitTaskId!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>waybillNo</td>
                                    <td>${listData.waybillNo!'null'}</td>
                                    </tr>
                                    <td>waybillNoSuffix</td>
                                    <td>${listData.waybillNoSuffix!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>platformRegionId</td>
                                    <td>${listData.platformRegionId!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>companyId</td>
                                    <td>${listData.companyId!'null'}</td>
                                    </tr>
                                    <tr>
                                    <td>standard</td>
                                    <td>${listData.standard!'null'}</td>
                                    </tr>
                             </#list>
                         <tbody>
                 </table>
             </#if>
              <!--超距记录表订单查询-->
                              <#if mapKey == "orderFoulRecordList">
                                                    <#list  jsonData.map[mapKey] as listData>
                                                          <table border="1"  width="350">
                                                             <thead>
                                                                <tr >
                                                                   <td colspan="2" align="center" ><font color="red" />order_foul_record表数据</td>
                                                                </tr>
                                                                <tr >
                                                                   <th bgcolor="green">字段名</th>
                                                                   <th bgcolor="green">字段值</th>
                                                                </tr>
                                                             </thead>
                                                             <tbody>
                                                            <tr>
                                                            <td>id</td>
                                                            <td>${listData.id!'null'}</td>
                                                            </tr>
                                                            <tr>
                                                            <td>riderId</td>
                                                            <td>${listData.riderId!'null'}</td>
                                                            </tr>
                                                            <tr>
                                                            <td>cityId</td>
                                                            <td>${listData.cityId!'null'}</td>
                                                            </tr>
                                                            <tr>
                                                            <td>orderId</td>
                                                            <td>${listData.orderId!'null'}</td>
                                                            </tr>
                                                            <tr>
                                                            <td>orderPhase</td>
                                                            <td>${listData.orderPhase!'null'}</td>
                                                            </tr>
                                                            <tr>
                                                            <td>foulReason</td>
                                                            <td>${listData.foulReason!'null'}</td>
                                                            </tr>
                                                            <tr>
                                                            <td>remark</td>
                                                            <td>${listData.remark!'null'}</td>
                                                            </tr>
                                                            <tr>
                                                            <td>riderLng</td>
                                                            <td>${listData.riderLng!'null'}</td>
                                                            </tr>
                                                            <tr>
                                                            <td>riderLat</td>
                                                            <td>${listData.riderLat!'null'}</td>
                                                            </tr>
                                                            <tr>
                                                            <td>dealType</td>
                                                            <td>${listData.dealType!'null'}</td>
                                                            </tr>
                                                            <tr>
                                                            <td>shardx</td>
                                                            <td>${listData.shardx!'null'}</td>
                                                            </tr>
                                                            <tr>
                                                            <td>shardy</td>
                                                            <td>${listData.shardy!'null'}</td>
                                                            </tr>
                                                            <tr>
                                                            <td>shardz</td>
                                                            <td>${listData.shardz!'null'}</td>
                                                            </tr>
                                                            <tr>
                                                            <td>insTm</td>
                                                            <td>${(listData.insTm?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                                                            </tr>
                                                            <tr>
                                                            <td>updTm</td>
                                                            <td>${(listData.updTm?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                                                            </tr>
                                                            <tbody>
                                                        </table>
                                                  </#list>
                                               </#if>

            <!--工单表数据查询-->
             <#if mapKey == "workOrderList">
                      <#list  jsonData.map[mapKey] as listData>

                      ${listData}
                            <table border="1"  width="350">
                               <thead>
                                  <tr >
                                     <td colspan="2" align="center" ><font color="red" />workorder表数据</td>
                                  </tr>
                                  <tr >
                                     <th bgcolor="green">字段名</th>
                                     <th bgcolor="green">字段值</th>
                                  </tr>
                               </thead>
                               <tbody>
                              <tr>
                              <td>primarykey</td>
                              <td>${listData.primarykey!'null'}</td>
                              </tr>
                              <tr>
                              <td>id</td>
                              <td>${listData.id!'null'}</td>
                              </tr>
                              <tr>
                              <td>cityId</td>
                              <td>${listData.cityId!'null'}</td>
                              </tr>
                              <tr>
                              <td>source</td>
                              <td>${listData.source!'null'}</td>
                              </tr>
                              <tr>
                              <td>sourceId</td>
                              <td>${listData.sourceId!'null'}</td>
                              </tr>
                              <tr>
                              <td>sourceMobile</td>
                              <td>${listData.sourceMobile!'null'}</td>
                              </tr>
                              <tr>
                              <td>sourceName</td>
                              <td>${listData.sourceName!'null'}</td>
                              </tr>
                              <tr>
                              <td>classify</td>
                              <td>${listData.classify!'null'}</td>
                              </tr>
                              <tr>
                              <td>subclassify</td>
                              <td>${listData.subclassify!'null'}</td>
                              </tr>
                              <tr>
                              <td>itemCode</td>
                              <td>${listData.itemCode!'null'}</td>
                              </tr>
                              <tr>
                              <td>target</td>
                              <td>${listData.target!'null'}</td>
                              </tr>
                              <tr>
                              <td>targetId</td>
                              <td>${listData.targetId!'null'}</td>
                              </tr>
                              <tr>
                              <td>targetName</td>
                              <td>${listData.targetName!'null'}</td>
                              </tr>
                              <tr>
                              <td>targetMobile</td>
                              <td>${listData.targetMobile!'null'}</td>
                              </tr>
                              <tr>
                              <td>targetRegionId</td>
                              <td>${listData.targetRegionId!'null'}</td>
                              </tr>
                              <tr>
                              <td>serviceId</td>
                              <td>${listData.serviceId!'null'}</td>
                              </tr>
                              <tr>
                              <td>channelWorkId</td>
                              <td>${listData.channelWorkId!'null'}</td>
                              </tr>
                              <tr>
                              <td>receiveRole</td>
                              <td>${listData.receiveRole!'null'}</td>
                              </tr>
                              <tr>
                              <td>receiver</td>
                              <td>${listData.receiver!'null'}</td>
                              </tr>
                              <tr>
                              <td>accepter</td>
                              <td>${listData.accepter!'null'}</td>
                              </tr>
                              <tr>
                              <td>status</td>
                              <td>${listData.status!'null'}</td>
                              </tr>
                              <tr>
                              <td>priority</td>
                              <td>${listData.priority!'null'}</td>
                              </tr>
                              <tr>
                              <td>attachment</td>
                              <td>${listData.attachment!'null'}</td>
                              </tr>
                              <tr>
                              <td>wdata</td>
                              <td>${listData.wdata!'null'}</td>
                              </tr>
                              <tr>
                              <td>result</td>
                              <td>${listData.result!'null'}</td>
                              </tr>
                              <tr>
                              <td>resultContent</td>
                              <td>${listData.resultContent!'null'}</td>
                              </tr>
                              <tr>
                              <td>createSource</td>
                              <td>${listData.createSource!'null'}</td>
                              </tr>
                              <tr>
                              <td>createTime</td>
                              <td>${(listData.createTime?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                              </tr>
                              <tr>
                              <td>acceptTime</td>
                              <td>${(listData.acceptTime?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                              </tr>
                              <tr>
                              <td>requireTime</td>
                              <td>${(listData.requireTime?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                              </tr>
                              <tr>
                              <td>resolvedTime</td>
                              <td>${(listData.resolvedTime?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                              </tr>
                              <tr>
                              <td>actionType</td>
                              <td>${listData.actionType!'null'}</td>
                              </tr>
                              <tr>
                              <td>actionValue</td>
                              <td>${listData.actionValue!'null'}</td>
                              </tr>
                              <tr>
                              <td>actionResult</td>
                              <td>${listData.actionResult!'null'}</td>
                              </tr>
                              <tr>
                              <td>actionTime</td>
                              <td>${(listData.actionTime?string('yyyy-MM-dd HH:mm:ss'))!'null'}</td>
                              </tr>
                              <tr>
                              <td>refundAccount</td>
                              <td>${listData.refundAccount!'null'}</td>
                              </tr>
                              <tr>
                              <td>refundAccountName</td>
                              <td>${listData.refundAccountName!'null'}</td>
                              </tr>
                              <tr>
                              <td>platformShopId</td>
                              <td>${listData.platformShopId!'null'}</td>
                              </tr>
                              <tr>
                              <td>extra1</td>
                              <td>${listData.extra1!'null'}</td>
                              </tr>
                              <tr>
                              <td>creatorName</td>
                              <td>${listData.creatorName!'null'}</td>
                              </tr>
                              <tr>
                              <td>urgeCount</td>
                              <td>${listData.urgeCount!'null'}</td>
                              </tr>
                              <tr>
                              <td>relevance</td>
                              <td>${listData.relevance!'null'}</td>
                              </tr>
                              <tr>
                              <td>canAppeal</td>
                              <td>${listData.canAppeal!'null'}</td>
                              </tr>
                              <tr>
                              <td>thirdId</td>
                              <td>${listData.thirdId!'null'}</td>
                              </tr>
                              <tr>
                              <td>relateSource</td>
                              <td>${listData.relateSource!'null'}</td>
                              </tr>
                              <tr>
                              <td>pendingVisible</td>
                              <td>${listData.pendingVisible!'null'}</td>
                              </tr>
                              <tr>
                              <td>relatedBatchNo</td>
                              <td>${listData.relatedBatchNo!'null'}</td>
                              </tr>
                              <tr>
                              <td>appraise</td>
                              <td>${listData.appraise!'null'}</td>
                              </tr>
                              <td>wdesc</td>
                              <td>${listData.wdesc!'null'}</td>
                              </tr>
                              <tbody>
                          </table>
                    </#list>
                 </#if>
      </#list>
    </#if>
</body>
</html>








