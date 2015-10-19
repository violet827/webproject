<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.familykitchen.bean.UserVO,
				com.familykitchen.service.impl.UserServiceImpl" %>

<%
	if(request.getParameter("telphone") != null) {
          String telphone = request.getParameter("telphone");
          String password = request.getParameter("password");
          UserServiceImpl service = new UserServiceImpl();
          UserVO uservo = service.getUserByTelAndPwd(telphone, password);
          if(uservo != null) {
            session.setAttribute("uservo", uservo);
            response.sendRedirect("dishlist.jsp");
          }
	}

        if(request.getParameter("action") != null) {
        	String action = request.getParameter("action");
                if(action.equals("logoff")) {
            		session.setAttribute("uservo", null);
                }
        }
%>
<html xmlns='http://www.w3.org/1999/xhtml'>
<head>
    <title>邻居厨房后台管理系统</title>
      <link href="css/bootstrap.min.css" rel="stylesheet">
      <script src="js/jquery.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class='container'>
      <form action='#' class='form-signin' role='form' method="post" >
        <h4 class='form-signin-heading'>用户登录</h4>
        <input name="telphone" type='text' class='form-control' placeholder='请输入手机号' required autofocus>
            <div style='height:10px;clear:both;display:block'></div>
        <input name="password" type='password' class='form-control' placeholder='请输入密码' required>
        <div class='checkbox'>
          <label>
            <input type='checkbox' value='remember-me'> 记住登录状态
          </label>
        </div>
        <button class='btn btn-lg btn-primary btn-block' type='submit'>登录</button>
      </form>
    </div> 
</body>
</html>