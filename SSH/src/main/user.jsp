<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="user.action" method="post">
		<table>
			<tr>
				<td>用户名:</td>
				<td>
					<input type="text" name="userName">
				</td>
			</tr>
			<tr>
				<td>密码:</td>
				<td>
					<input type="password" name="passWord">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="提交">
					<input type="reset" value="重置">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>