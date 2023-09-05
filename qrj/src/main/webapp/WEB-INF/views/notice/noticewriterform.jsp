<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<jsp:include page="../menu/menu.jsp"></jsp:include>
		<div><h1>게시글 작성</h1></div>
		<div>
			<form id="frm" action="noticewriter.do" method="post" enctype="multipart/form-data">
				<div>
					<table border="1">
						<tr>
							<th width="150">작성자</th>
							<td widdth="150">
								<input type="text" id="noticeWriterName" name="noticeWriterName" value="${name}" readonly>
							</td>
							<th width="150">작성일자</th>
							<td>
								<input type="date" id="noticeDate" name="noticeDate">
							</td>
						</tr>
						<tr>
							<th>이미지</th>
							<td colspan="3">
								<input type="file" id="imgfile" name="imgfile" required="required">
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
				</div><br>
				<div>
					<input type="hidden" name="noticeWriter" value="${id }">
					<input type="submit" value="글등록"> &nbsp;&nbsp;
					<input type="reset" value="취 소">
				</div>
			</form>
		</div>
	</div>
</body>
</html>