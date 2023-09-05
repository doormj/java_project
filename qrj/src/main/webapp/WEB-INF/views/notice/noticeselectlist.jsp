<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<div align="center">
		<jsp:include page="../menu/menu.jsp" />
		<div>
			<h2>게시글 목록</h2>
		</div>
		<div>
			<form id = "search" action="">
				<table border="1">
					<tr>
						<td><label for="key">Choose a key:</label> <select name="key"
							id="key">
								<option value="title">제목</option>
								<option value="subject">내용</option>
								<option value="writer">작성자</option>
						</select> <input type="text" name="val" id="val">&nbsp;&nbsp; <input
							type="button" id="btn" value="검색" onclick="searchList()">
						</td>
					</tr>
				</table>
			</form>
		</div>
		<br>
		<div>
			<table border="1">
				<thead>
					<tr>
						<th width="50">순번</th>
						<th width="100">이미지</th>
						<th width="200">제목</th>
						<th width="100">작성자</th>
						<th width="100">작성일자</th>
						<th width="50">조회수</th>
						<th width="100">첨부파일</th>
					</tr>
				</thead>
				<tbody>
					<c:choose>
						<c:when test="${empty notices}">
							<tr>
								<td colspan="7" align="center">데이터가 존재하지 않습니다.</td>
							</tr>
						</c:when>
						<c:otherwise>
							<c:forEach items="${noties}" var="n">
								<tr onmouseover=onmouseout>
									<td align="center">${n.noticeId }</td>
									<td align="center"><img alt=""
										src="attech/notice/${n.noticeImage } " /></td>
									<td>${n.noticeTitle }</td>
									<td align="center">${n.noticeWriterName }</td>
									<td align="center">${n.noticeDate }</td>
									<td align="center">${n.noticeHit }</td>
									<td align="center">${n.noticeAttech }</td>
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</tbody>
			</table>
		</div>
		<br>
		<div>
			<c:if test="${not empty id}">
				<button type="button" onclick="location.href='noticewriterform.do'">글쓰기버튼</button>
			</c:if>
			<form id="sform" action="noticeselect.do" method="post">
				<input type="hidden" id="noticeId" name="noticeId">
			</form>
		</div>
	</div>
	<script type="text/javascript">
		function selectNotice(id){
			let form = document.getElementById("sform");
			form.noticeId.value = id;
			form.submit();
		}
		function searchList(){
			let frm = document.getElementById("search");
			const formData = new FormData(frm);
			let payload = formData;
			let url = "ajaxNoticeSearch.do"
			fetch(url,{
				method: "POST",
				body: payload
			}).then(response=>response.json())
				.then(json->htmlViews(json));
		}
		
		function htmlViews(datas){
			document.querySelector('tbody').remove();	//본문에서 <tbody>태그 삭제
			// const tbody = document.createElement('tbody');
			// tbody.innerHTML = datas.map(data=>htmlConvert(data).join(''));
			// document.querySelector('table').append(tbody)
		}

		function htmlConvert(data){
			return `
			<tr onmouseover="this.style.background='#C8FE2E'"
					onmouseout="this.style.background='#FFFFFF'"
					onclick="selectNotice(\${n.noticeId }">
									<td align="center">\${n.noticeId }</td>
									<td align="center">
										<img src="attech/notice/\${n.noticeThumb } " />
										</td>
									<td>\${n.noticeTitle }</td>
									<td align="center">\${n.noticeWriterName }</td>
									<td align="center">\${n.noticeDate }</td>
									<td align="center">\${n.noticeHit }</td>
									<td align="center">\${n.noticeAttech }</td>
								</tr>
			`
		}

		function enterKey(e){
			if(e.KeyCode == 13){
				document.getElementById("btn").focus();
			}
		}

	</script>
</body>

</html>