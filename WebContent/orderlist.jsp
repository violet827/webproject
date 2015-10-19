<%@page import="com.familykitchen.utils.IDefConst"%>
<%@ page contentType="text/html; charset=GB2312" %>
<%@ page import="java.util.List,java.util.ArrayList,
				java.util.Date,
				com.familykitchen.utils.DateUtil,
				com.familykitchen.bean.UserVO,
				com.familykitchen.bean.OrderVO,
				com.familykitchen.service.impl.OrderServiceImpl"%>
<%
	// ȡ�õ�ǰ����Ա
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
<title>�ھӳ���-��������</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>

<body>
 <div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<h3 class="text-center">
				<strong >�ھӳ�����̨����ϵͳ</strong>
			</h3>
			<ul class="nav nav-pills">
				<li >
					<a href="dishlist.jsp"><strong>��Ʒ����</strong></a>
				</li>
				<li class="active">
					<a href="#" >��������</a>
				</li>
				<li class="dropdown pull-right">
					<a class="dropdown-toggle" data-toggle="dropdown" href="index.jsp">��ǰ�û���<%if (uservo != null) { out.print(uservo.getTelphone());} %></a>
				</li>
			</ul>
			<ul class="breadcrumb">
				<li class="active">
					<a href="?dealstatus=-1">ȫ��</a> 
				</li>
				<li>
					 <a href="?dealstatus=0">������</a>
				</li>
				<li >
					<a href="?dealstatus=1">��ȷ��</a>
				</li>
				<li>
					 <a href="?dealstatus=2">ȡ��δȷ��</a>
				</li>
				<li>
					 <a href="?dealstatus=3">�����</a>
				</li> 
				<li>
					 <a href="?dealstatus=4">�ѵ���</a>
				</li> 
				<li>
					 <a href="?dealstatus=5">ȡ����ȷ��</a>
				</li>
			</ul>   
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>
							����ID
						</th>
						<th>
							����ʱ��
						</th>
						<th>
							������Ʒ
						</th>
						<th>
							���͵�ַ
						</th>
						<th>
							��������״̬
						</th>
						<th>
							�����ܼ�
						</th>
						<th>
							֧��״̬
						</th>
						<th>
							�����绰
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
    	out.print("������"); 
	else if(ordervo.getDealstatus() == IDefConst.DEALSTATUS_VALIDATE) 
		out.print("��ȷ��"); 
	else if(ordervo.getDealstatus() == IDefConst.DEALSTATUS_CANCEL) 
		out.print("ȡ��δȷ��"); 
	else if(ordervo.getDealstatus() == IDefConst.DEALSTATUS_FINISHED) 
		out.print("�����"); 
	else if(ordervo.getDealstatus() == IDefConst.DEALSTATUS_LIKED) 
		out.print("�ѵ���"); 
	else if(ordervo.getDealstatus() == IDefConst.DEALSTATUS_CANCELED) 
		out.print("ȡ����ȷ��"); 
	else 
		out.print("δ֪"); 
		%>
	<td><%=ordervo.getTotalprice() == null ? "" : ordervo.getTotalprice()%></td>
    <td><%
    if(ordervo.getPaystatus() != null && ordervo.getPaystatus() == IDefConst.PAYSTATUS_NOPAY) 
    	out.print("δ֧��"); 
	else if(ordervo.getOrdertype() != null && ordervo.getOrdertype() == IDefConst.PAYSTATUS_PAYED)
		out.print("��֧��"); 
	else 
		out.print("δ֧��"); 
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
