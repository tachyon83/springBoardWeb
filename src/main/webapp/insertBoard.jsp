<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board insert</title>
</head>
<body>
<center>
	<h1>new writing</h1>
	<!-- <a href="logout_proc.jsp">log-out</a> -->
	<a href="logout.do">log-out</a>
	<hr>
	<!-- <form action="insertBoard_proc.jsp" method="post"> -->
	<form action="insertBoard.do" method="post">
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td bgcolor="orange" width="70">title</td>
				<td align="left">
					<input type="text" name="title"/>
				</td>
			</tr>
			<tr>
				<td bgcolor="orange">writer</td>
				<td align="left">
					<input type="text" name="writer" size="10"/>
				</td>
			</tr>
			<tr>
				<td bgcolor="orange">content</td>
				<td align="left">
					<textarea name="content" cols="40" rows="10">
					</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="insert this"/>
				</td>
			</tr>
		</table>
	</form>
	<hr>
	<a href="getBoardList.do">board list</a>
</center>
</body>
</html>