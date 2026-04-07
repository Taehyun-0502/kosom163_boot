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
					<h1 class="h3 mb-4 text-gray-800">Create Page</h1>
					<!-- 입력 폼 시작 -->
					<div>
						<form  method="post">
							<div class="form-group">
								<label for="departmentNo">학과 번호</label> <input
									type="text" name="departmentNo" class="form-control" id="departmentNo">
							</div>
							<div class="form-group">
								<label for="departmentName">학과 이름</label> <input
									type="text" name="departmentName" class="form-control" id="departmentName">
							</div>
							<div class="form-group">
								<label for="category">계열</label> <input
									type="text" name="category" class="form-control" id="category">
							</div>
							<div class="form-group">
								<label for="capacity">정원</label> <input
									type="text" name="capacity" class="form-control" id="capacity">
							</div>
							<div class="form-group">
								<label for="yes">OPEN</label> <input
									type="radio" checked name="openYn" value="Y" class="form-control" id="open">
									<label for="close">close</label> <input
									type="radio" name="openYn" class="form-control" value="N" id="close">
							</div>
							
							<button type="submit" class="btn btn-primary">등록</button>
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