<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
/* Model 1 Architecture */
/* 	String seq=request.getParameter("seq");

	BoardVO vo=new BoardVO();
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO boardDAO=new BoardDAO();
	BoardVO board=boardDAO.getBoard(vo); */
	
	/* Model 2 */
	/* BoardVO board=(BoardVO)session.getAttribute("board"); */
	BoardVO board=(BoardVO)request.getAttribute("board");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board - detail</title>
</head>
<body>
	<center>
		<h1>board - detail</h1>
		<!-- <a href="logout_proc.jsp">log-out</a> -->
		<a href="logout.do">log-out</a>
		<hr>
		<!-- <form action="updateBoard_proc.jsp" method="post"> -->
		<form action="updateBoard.do" method="post">
			<%-- <input name="seq" type="hidden" value="<%=board.getSeq() %>"/> --%>
			<input name="seq" type="hidden" value="${board.seq }"/>
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">title</td>
					<td align="left">
						<%-- <input name="title" type="text" value="<%=board.getTitle() %>"/> --%>
						<input name="title" type="text" value="${board.title }"/>
					</td>
				</tr>
				<tr>
					<td bgcolor="orange">writer</td>
					<td align="left"><%=board.getWriter() %></td>
					<%-- <td align="left">${board.writer }</td> --%>
				</tr>
				<tr>
					<td bgcolor="orange">content</td>
					<td align="left">
						<textarea name="content" cols="40" rows="10">
							<%=board.getContent() %>
						</textarea>
					</td>
				</tr>
				<tr>
					<td bgcolor="orange">regdate</td>
					<td align="left">
						<%=board.getRegDate() %>
					</td>
				</tr>
				<tr>
					<td bgcolor="orange">count</td>
					<td align="left">
						<%=board.getCnt() %>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="update(modify)"/>
					</td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertBoard.jsp">board insert</a>&nbsp;&nbsp;&nbsp;
		<%-- <a href="deleteBoard_proc.jsp?seq=<%=board.getSeq()%>">board delete</a>&nbsp;&nbsp;&nbsp; --%>
		<a href="deleteBoard.do?seq=<%=board.getSeq()%>">board delete</a>&nbsp;&nbsp;&nbsp;
		<!-- <a href="getBoardList.jsp">board list</a>&nbsp;&nbsp;&nbsp; -->
		<a href="getBoardList.do">board list</a>&nbsp;&nbsp;&nbsp;
	</center>
</body>
</html>