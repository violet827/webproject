<%@page import="com.familykitchen.utils.IDefConst"%>
<%@ page contentType="text/html; charset=GB2312" %>
<%@ page import="java.util.List,java.util.ArrayList,
				java.util.Date,
				com.familykitchen.utils.DateUtil,
				com.familykitchen.bean.UserVO,
				com.familykitchen.bean.DishVO,
				com.familykitchen.service.impl.DishServiceImpl"%>
<%
	// ȡ�õ�ǰ����Ա
        UserVO uservo = (UserVO) session.getAttribute("uservo");
        if(uservo == null)
        {
          response.sendRedirect("index.jsp");
        }

	    DishServiceImpl dishservice = new DishServiceImpl();
        // ȡ�ñ��������û���
        if(request.getParameter("pk_dish") != null && request.getParameter("action").equals("approve")) {
        	String pk_dish = request.getParameter("pk_dish");
        	dishservice.updateDishStatus(Integer.parseInt(pk_dish), IDefConst.DISHSTATUS_APPROVED);
        }

        int dishstatus_int = -1;
	    if(request.getParameter("dishstatus") != null) {
          String dishstatus = request.getParameter("dishstatus");
          if (dishstatus != null) {
        	  dishstatus_int = Integer.parseInt(dishstatus);
          }
	    }
        List<DishVO> dishlist = new ArrayList<DishVO>();
        try {
	        dishlist = dishservice.getDishByCondition(dishstatus_int);
		} catch (Exception ex) {
        	
        } 
	%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>�ھӳ���-��Ʒ����</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>

<body>
 <div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<h3 class="text-center">
				<strong>�ھӳ�����̨����ϵͳ</strong>
			</h3>
			<ul  class="nav nav-pills">
				<li class="active">
					<a href="#"><strong>��Ʒ����</strong></a>
				</li>
				<li>
					<a href="orderlist.jsp">��������</a>
				</li>
				<li class="dropdown pull-right">
					<a class="dropdown-toggle" data-toggle="dropdown" href="index.jsp">��ǰ�û���<%
					if (uservo != null) out.print(uservo.getTelphone());%></a>
				</li>
			</ul>   
			<ul class="breadcrumb">
				<li class="active">
					<a href="?dishstatus=-1">ȫ��</a> 
				</li>
				<li>
					 <a href="?dishstatus=0">�����</a>
				</li>
				<li >
					<a href="?dishstatus=1">�ѷ���</a>
				</li>
				<li>
					 <a href="?dishstatus=2">�����</a>
				</li>
				<li>
					 <a href="?dishstatus=3">��ɾ��</a>
				</li> 
				</li>
			</ul>   
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>
							��Ʒ����
						</th>
						<th>
							��Ʒ����
						</th>
						<th>
							��ƷͼƬ
						</th>
						<th>
							��Ʒ�۸�
						</th>
						<th>
							�û��ֻ���
						</th>
						<th>
							�ɶ�����
						</th>
						<th>
							��������
						</th>
						<th>
							��Ʒ״̬
						</th>
						<th>
							<b>����<b>
						</th>
					</tr>
				</thead>
				<tbody>
<%
	 if (dishlist != null && dishlist.size() > 0) {
		 int i = 0;
		 for(DishVO dishvo : dishlist) {
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
    <td><%=dishvo.getDishname()%></td>
    <td><%=dishvo.getDishintro() == null ? "" : dishvo.getDishintro()%></td>
    <td><a href="<%=dishvo.getPreviewimagedir() == null ? "" : dishvo.getPreviewimagedir()%>" ><img height="200" width="200" src="<%=dishvo.getPreviewimagedir() == null ? "" : dishvo.getPreviewimagedir()%>" alt="<%=dishvo.getDishname()%>" /></a></td>
    <td><%=dishvo.getUnitprice() == null ? "" : dishvo.getUnitprice()%></td>
    <td><%=dishvo.getPk_user().getTelphone() == null ? "" : dishvo.getPk_user().getTelphone()%></td>
    <td><%=dishvo.getDishcount() == null ? "" : dishvo.getDishcount()%></td>
    <td><%=dishvo.getPublishdate() == null ? "" : dishvo.getPublishdate()%></td>
    <td><%if(dishvo.getDishstatus() == IDefConst.DISHSTATUS_ADD) 
    	out.print("�����");
	else if(dishvo.getDishstatus() == IDefConst.DISHSTATUS_PUBLISHED) 
		out.print("�ѷ���"); 
	else if(dishvo.getDishstatus() == IDefConst.DISHSTATUS_APPROVED) 
		out.print("�����"); 
	else if(dishvo.getDishstatus() == IDefConst.DISHTYPE_DELETED) 
		out.print("��ɾ��"); 
	else if(dishvo.getDishstatus() == IDefConst.DISHTYPE_NOTPUBLISHED) 
		out.print("����Ҫ����"); 
	else 
		out.print("δ֪"); 
		%>
	</td>
    <td>
    <%if (dishvo.getDishstatus() == IDefConst.DISHSTATUS_ADD) { %>
    <a href="?action=approve&pk_dish=<%=dishvo.getPk_dish()%>"><b>����<b></a>
    <% } else {
    	out.print("--");
    } %>
    </td>
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
