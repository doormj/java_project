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
		<form action="memberjoin.do" id="signin" name="signin"
			method="post">
			<h1>회원가입</h1>
			<div>
				<table border="1">
					<tr>
						<th width="150">아이디 *</th>
						<td width="250"><input type="text" id="memberId" name="memberId" required="required" />&nbsp;&nbsp; <label
							for="idCheck">중복체크</label> <input type="button" id="idCheck"
							value="No" onclick="memberIdCheck()" /></td>
					</tr>

					<tr>
						<th>패스워드 *</th>
						<td><input type="text" id="memberPassword"
							name="memberPassword" required="required" /></td>
					</tr>

					<tr>
						<th>패스워드 확인 *</th>
						<td><input type="text" id="memberPassword"
							name="memberPassword" required="required" /></td>
					</tr>

					<tr>
						<th>이름 *</th>
						<td><input type="text" id="name" name="name"
							required="required" /></td>
					</tr>
					<tr>
						<th>전화번호</th>
						<td><input type="text" id="tel" name="tel"
							required="required" /></td>
					</tr>
					<tr>
						<td colspan="2" align="center"> * 표시 항목은 필수 입력 정보입니다.</td>
					</tr>
				</table>
			</div>
			<br>
			<div>
				<input type="submit" value="회원가입" />&nbsp;&nbsp; <input
					type="reset" value="취소" />
			</div>
		</form>
	</div>
	<script type="text/javascript">
		function formCheck() {
			let form = document.getElementById("signin");

			if (form.idCheck == 'No') {
				alert("아이디 중복체크를 하세요.");
				return false;
			}

			if (form.memberPassword != form.checkPassword) {
				alert("입력한 패스워드가 일치하지 않습니다.");
				form.memberPassword.value = "";
				form.checkPassword.value = "";
				form.memberPassword.focus();
				return false;
			}
			return true;
		}
		function memberIdCheck() { //ajax 사용
			let url = "ajaxmembercheck.do"
			let payload = document.getElementById("memberId").value;
			
			url = url + "?memberId=" + payload;
			
			console.log(url);
			
			fetch(url)
				.then(response => response.text())
				.then(text => membercheck(text));
		}
		
		function membercheck(str){
			if(str == 'Yes'){
				alert("사용가능한 아이디 입니다.");
				document.getElementById("idCheck").value = "Yes";
				document.getElementById("idCheck").disabled = ture;
			}else{
				alert("이미 사용하는 아이디 입니다.")
				document.getElementById("memberId").value =="";
				document.getElementById("memberId").focus();
			}
		}
	</script>
</body>
</html>