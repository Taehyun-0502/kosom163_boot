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
		                    				<th scope="col">학과 번호</th>
		                    				<th scope="col">학과 명</th>
		                    				<th scope="col">계열</th>
		                    				<th scope="col">개설 여부</th>
		                    				<th scope="col">정원</th>
		                    			</tr>
		                    		</thead>
		                    		<tbody>
		                    			<tr>
		                    				<td>${detail.departmentNo} </td>
		                    				<td>${detail.departmentName} </td>
		                    				<td>${detail.category} </td>
		                    				<td>${detail.openYn} </td>
		                    				<td>${detail.capacity} </td>
		                    			</tr>
		                    		
		                    		</tbody>
		                    	
		                    	
		                    	
		                    	</table>
		                    	
		                    
		                    </div>
						<div>
								<a  class="btn btn-primary" href="./update?departmentNo=${detail.departmentNo}">학과 수정</a>
								
								<form action="./delete" method="post">
									<input type="hidden" name="departmentNo" value="${detail.departmentNo}">
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