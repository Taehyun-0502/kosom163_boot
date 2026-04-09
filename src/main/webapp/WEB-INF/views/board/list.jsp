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
					<h1 class="h3 mb-4 text-gray-800">Notice list Page</h1>
					<div class="row justify-content-center">
						<div class="col-6">
							<table class="table table-bordered">
								<thead>
									<tr>
										<th scope="col">글 번호</th>
										<th scope="col">제목</th>
										
										<th scope="col">작성시간</th>
										<th scope="col">조회수</th>
										<th scope="col">작성자</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list}" var="d">
										<tr>
											<td>${d.commentNo}</td>
											<td><a href="./detail?commentNo=${d.commentNo}">
													${d.title}</a></td>
											
											<td>${d.toDate}</td>
											<td>${d.views}</td>
											<td>${d.professorNo}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							<div>
								<a href="./create">학과 등록</a>
							</div>


						</div>
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