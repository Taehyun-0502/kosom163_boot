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
					<h1 class="h3 mb-4 text-gray-800">professor page</h1>
					<div class="row justify-content-center">
						<div class="col-6">
							<table class="table table-bordered">
								<thead>
									<tr>
										<th scope="col">PROFESSOR_NO</th>
										<th scope="col">PROFESSOR_NAME</th>
										<th scope="col">PROFESSOR_SSN</th>
										<th scope="col">PROFESSOR_ADDRESS</th>
										<th scope="col">DEPARTMENT_NO</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list}" var="d">
										<tr>
											<td><a href="./detail?professorNo=${d.professorNo}">
													${d.professorNo}</a></td>
											<td>${d.professorName}</td>
											<td>${d.professorSsn}</td>
											<td>${d.professorAddress}</td>
											<td>${d.departmentNo}</td>

										</tr>
									</c:forEach>
								</tbody>
							</table>
							<div>
								<nav aria-label="Page navigation example">
									<ul class="pagination">
										<li class="page-item"><a class="page-link" href="./list?page=${pager.pre?pager.start-1:pager.start}"
											aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
										</a></li>
										<c:forEach begin="${pager.start}" end="${pager.end}" var="i">

											<li class="page-item"><a class="page-link"
												href="./list?page=${i}">${i}</a></li>
										</c:forEach>
										<li class="page-item"><a class="page-link" href="./list?page=${pager.next?pager.end+1:pager.end}"
											aria-label="Next"> <span aria-hidden="true">&raquo;</span>
										</a></li>
									</ul>
								</nav>

							</div>
							<div>
								<a href="./create">교수 정보 등록</a>
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