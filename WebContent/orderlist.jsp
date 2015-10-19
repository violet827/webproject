<%@page import="com.familykitchen.utils.IDefConst"%>
<%@ page contentType="text/html; charset=GB2312" %>
<%@ page import="java.util.List,java.util.ArrayList,
				java.util.Date,
				com.familykitchen.utils.DateUtil,
				com.familykitchen.bean.UserVO,
				com.familykitchen.bean.OrderVO,
				com.familykitchen.service.impl.OrderServiceImpl"%>
<%
	// 取得当前操作员
        UserVO uservo = (UserVO) session.getAttribute("uservo");
        if(uservo == null)
        {
          response.sendRedirect("index.jsp");
        }

	    OrderServiceImpl orderservice = new OrderServiceImpl();

	    List<OrderVO> orderlist = new ArrayList<OrderVO>();
	    int dealstatus_int = -1;
	    if(request.getParameter("dealstatus") != null) {
          String dealstatus = request.getParameter("dealstatus");
          if (dealstatus != null) {
        	  dealstatus_int = Integer.parseInt(dealstatus);
          }
	    }
        try {
	        orderlist = orderservice.getOrderByCondition(dealstatus_int);
		} catch (Exception ex) {
        	
        }
	%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>邻居厨房-订单管理</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>

<body>
 <div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<h3 class="text-center">
				<strong >邻居厨房后台管理系统</strong>
			</h3>
			<ul class="nav nav-pills">
				<li >
					<a href="dishlist.jsp"><strong>菜品管理</strong></a>
				</li>
				<li class="active">
					<a href="#" >订单管理</a>
				</li>
				<li class="dropdown pull-right">
					<a class="dropdown-toggle" data-toggle="dropdown" href="index.jsp">当前用户：<%if (uservo != null) { out.print(uservo.getTelphone());} %></a>
				</li>
			</ul>
			<ul class="breadcrumb">
				<li class="active">
					<a href="?dealstatus=-1">全部</a> 
				</li>
				<li>
					 <a href="?dealstatus=0">待处理</a>
				</li>
				<li >
					<a href="?dealstatus=1">已确认</a>
				</li>
				<li>
					 <a href="?dealstatus=2">取消未确认</a>
				</li>
				<li>
					 <a href="?dealstatus=3">已完成</a>
				</li> 
				<li>
					 <a href="?dealstatus=4">已点赞</a>
				</li> 
				<li>
					 <a href="?dealstatus=5">取消已确认</a>
				</li>
			</ul>   
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>
							订单ID
						</th>
						<th>
							订单时间
						</th>
						<th>
							订单菜品
						</th>
						<th>
							配送地址
						</th>
						<th>
							订单处理状态
						</th>
						<th>
							订单总价
						</th>
						<th>
							支付状态
						</th>
						<th>
							卖方电话
						</th>
					</tr>
				</thead>
				<tbody>
<%
	 if (orderlist != null && orderlist.size() > 0) {
		 int i = 0;
		 for(OrderVO ordervo : orderlist) {
			 String tdclass = "";
			 if (i % 5 == 0) {
				 tdclass = "";
			  } else if (i % 5  == 1) {
				  tdclass = "success";
			  } else if (i % 5  == 2) {
				  tdclass = "error";
			  } else if (i % 5  == 3) {
				  tdclass = "warning";
			  } else if (i % 5  == 4) {
				  tdclass = "info";
			  }
%>
  <tr class="<%=tdclass%>">
    <td><%=ordervo.getPk_order()%></td>
    <td><%=ordervo.getOrderdate()%></td>
    <td><%=ordervo.getPk_dish().getDishname() == null ? "" : ordervo.getPk_dish().getDishname()%></td>
    <td><%=ordervo.getReceiveaddress() == null ? "" : ordervo.getReceiveaddress()%></td>
    <td>
    <%if(ordervo.getDealstatus() == IDefConst.DEALSTATUS_TODO) 
    	out.print("待处理"); 
	else if(ordervo.getDealstatus() == IDefConst.DEALSTATUS_VALIDATE) 
		out.print("已确认"); 
	else if(ordervo.getDealstatus() == IDefConst.DEALSTATUS_CANCEL) 
		out.print("取消未确认"); 
	else if(ordervo.getDealstatus() == IDefConst.DEALSTATUS_FINISHED) 
		out.print("已完成"); 
	else if(ordervo.getDealstatus() == IDefConst.DEALSTATUS_LIKED) 
		out.print("已点赞"); 
	else if(ordervo.getDealstatus() == IDefConst.DEALSTATUS_CANCELED) 
		out.print("取消已确认"); 
	else 
		out.print("未知"); 
		%>
	<td><%=ordervo.getTotalprice() == null ? "" : ordervo.getTotalprice()%></td>
    <td><%
    if(ordervo.getPaystatus() != null && ordervo.getPaystatus() == IDefConst.PAYSTATUS_NOPAY) 
    	out.print("未支付"); 
	else if(ordervo.getOrdertype() != null && ordervo.getOrdertype() == IDefConst.PAYSTATUS_PAYED)
		out.print("已支付"); 
	else 
		out.print("未支付"); 
    %></td>
    <td><%=ordervo.getSalertelphone() == null ? "" : ordervo.getSalertelphone()%></td>
 </tr>
<% 
	i++;
	}
	 	}
%>
				</tbody>
			</table>
		</div>
	</div>
</div>

</body>
</html>
