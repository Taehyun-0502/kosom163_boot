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
						<form action="./create" method="post" enctype="multipart/form-data">
							<div class="form-group">
								<label for="title">제목</label> <input
									type="text" name="title" class="form-control" id="title">
							</div>
							<div class="form-group">
								<label for="professorNo">작성자</label> <input
									type="text" name="professorNo" class="form-control" id="professorNo">
							</div>
							<div class="form-group">
								<label for="contents">내용</label>
								<textarea rows="8" cols=""name="contents"id="contents"class="form-control"></textarea>
								
							</div>

							<div class="form-group">
								 <label>첨부파일</label>
								 <input type="file" name="attach" class="form-control">
								 <input type="file" name="attach" class="form-control">
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