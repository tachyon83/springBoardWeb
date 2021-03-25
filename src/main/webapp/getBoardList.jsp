<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
/* Model 1 Architecture */
	/* reserved for [search] function */
	/* BoardVO vo=new BoardVO();
	BoardDAO boardDAO=new BoardDAO();
	List<BoardVO> boardList=boardDAO.getBoardList(vo); */
	
	/* List<BoardVO> boardList=(List)session.getAttribute("boardList"); */
	
	List<BoardVO> boardList=(List<BoardVO>)request.getAttribute("boardList");
	
	/* List<BoardVO> boardList=null; */
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board List</title>
</head>
<body>
	<center>
		<h1>board list</h1>
		<h3>welcome..
			<!-- <a href="logout_proc.jsp">log-out</a> -->
			<a href="logout.do">log-out</a>
		</h3>
		
		<form action="getBoardList.jsp" method="post">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right">
						<select name="searchCondition">
							<option value="TITLE">title
							<option value="CONTENT">content
						</select>
						<input name="searchKeyword" type="text"/>
						<input type="submit" value="search"/>
					</td>
				</tr>
			</table>
		</form>
		
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th bgcolor="orange" width="100">seq</th>
				<th bgcolor="orange" width="200">title</th>
				<th bgcolor="orange" width="150">writer</th>
				<th bgcolor="orange" width="150">regdate</th>
				<th bgcolor="orange" width="100">count</th>
			</tr>
			
			<% for(BoardVO board:boardList){ %>
			<tr>
				<td><%=board.getSeq() %></td>
				<td align="left">
					<%-- <a href="getBoard.jsp?seq=<%=board.getSeq() %>"> --%>
					<a href="getBoard.do?seq=<%=board.getSeq() %>">
						<%=board.getTitle() %>
					</a>
				</td>
				<td><%=board.getWriter() %></td>
				<td><%=board.getRegDate() %></td>
				<td><%=board.getCnt() %></td>
			</tr>
			<%} %>
		</table>
		
		<br>
		<a href="insertBoard.jsp">new writing</a>	
	</center>
</body>
</html>