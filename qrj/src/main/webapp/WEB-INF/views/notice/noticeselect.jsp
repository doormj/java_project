<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center"></div>
	<jsp:include page="../menu/menu.jsp"></jsp:include>
	<div><h1>게시글 상세보기</h1></div>
	<div>
		<div>
					<table border="1">
						<tr>
							<th width="150">작성자</th>
							<td widdth="150">
								${ n.noticeWriterName }</td>
							<th width="150">작성일자</th>
							<td >
								<input type="date" id="noticeDate" name="noticeDate">
							</td>
						</tr>
						<tr>
							<th>이미지</th>
							<td colspan="3">
							</td>
						</tr>
						<tr>
							<th>제 목</th>
							<td colspan="3"></td>
							<input type="text" id="noticeTitle" name="noticeTitle">
						</tr>
						<tr>
							<th>내 용</th>
							<td colspan="3">
									<textarea rows="10" cols="60" id="noticeSubject" name="noticeSubject"></textarea>
							</td>
						</tr>
						<tr>
							<th>첨부파일</th>
							<td colspan="3">
								<input type="file" id="attechfile" name="attechfile">
							</td>
						</tr>
					</table>
				</div>
	</div>

</body>
</html>