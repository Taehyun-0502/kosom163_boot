<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<c:import url="/WEB-INF/views/temp/head_css.jsp"></c:import>
</head>
<body id="page-top">
	
	<div id="wrapper">
		<c:import url="/WEB-INF/views/temp/sidebar.jsp"></c:import>
		<div id="content-wrapper" class="d-flex flex-column">
		
		<div id="content">
			<c:import url="/WEB-INF/views/temp/topbar.jsp"></c:import>
					
					<div class="container-fluid">
		                    <!-- Page Heading -->
		                    <h1 class="h3 mb-4 text-gray-800">detail page</h1>
		                    <div >
		                    	<table class="table">
		                    		<thead class="thead-dark">
		                    			<tr>
		                    				<th scope="col">교수 번호</th>
		                    				<th scope="col">교수 명</th>
		                    				<th scope="col">주민번호</th>
		                    				<th scope="col">주소</th>
		                    				<th scope="col">과 번호</th>
		                    			</tr>
		                    		</thead>
		                    		<tbody>
		                    			<tr>
		                    				<td>${detail.professorNo} </td>
		                    				<td>${detail.professorName} </td>
		                    				<td>${detail.professorSsn} </td>
		                    				<td>${detail.professorAddress} </td>
		                    				<td>${detail.departmentNo} </td>
		                    			</tr>
		                    		
		                    		</tbody>
		                    	
		                    	
		                    	
		                    	</table>
		                    	
		                    
		                    </div>
						<div>
								<a  class="btn btn-primary" href="./update?professorNo=${detail.professorNo}">정보 수정</a>
								
								<form action="./delete" method="post">
									<input type="hidden" name="professorNo" value="${detail.professorNo}">
								<button type="submit" class="btn btn-primary"> 삭제</button>
								</form>
								
						</div>
	                </div>
				<!-- end page content fluid -->
		</div>
<!-- end content page  -->

		<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
		</div>
		<!-- end content wrapper  -->
	</div>
	<c:import url="/WEB-INF/views/temp/footer_script.jsp"></c:import>
	<!-- end wrapper  -->
	
</body>
</html>