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
					<h1 class="h3 mb-4 text-gray-800">학과 목록 페이지</h1>
					<div class="row justify-content-center">
						<div class="col-6">
							<div>
								<form action="./list" method="get">
									<div class="input-group mb-3">
									<div class="input-group-prepend">
											<button class="btn btn-outline-secondary dropdown-toggle"
												type="button" data-toggle="dropdown" aria-expanded="false">Dropdown</button>
											<div class="dropdown-menu">
												<a class="dropdown-item" href="#">Action</a> <a
													class="dropdown-item" href="#">Another action</a> <a
													class="dropdown-item" href="#">Something else here</a>
												<div role="separator" class="dropdown-divider"></div>
												<a class="dropdown-item" href="#">Separated link</a>
											</div>
										</div>
										<input type="text" name="search" class="form-control"
											placeholder="Recipient's username"
											aria-label="Recipient's username"
											aria-describedby="button-addon2">
										<div class="input-group-append">
											<button class="btn btn-outline-secondary" type="submit"
												id="button-addon2">검색</button>
										</div>
									</div>
								</form>
							</div>
							<table class="table table-bordered">
								<thead>
									<tr>
										<th scope="col">학과 이름</th>
										<th scope="col">계열</th>
										<th scope="col">개설여부</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list}" var="d">
										<tr>
											<td><a href="./detail?departmentNo=${d.departmentNo}">
													${d.departmentName}</a></td>
											<td>${d.category}</td>
											<c:choose>
												<c:when test="${d.openYn eq'Y'}">
													<td>OPEN</td>
												</c:when>
											</c:choose>
											<c:if test="${d.openYn eq'N'}">
												<td>CLOSE</td>
											</c:if>

										</tr>
									</c:forEach>
								</tbody>
							</table>
							<div>
								<nav aria-label="Page navigation example">
									<ul class="pagination">
										<li class="page-item"><a class="page-link"
											href="./list?page=${pager.pre?pager.start-1:pager.start}&search=${pager.search}"
											aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
										</a></li>
										<c:forEach begin="${pager.start}" end="${pager.end}" var="i">

											<li class="page-item"><a class="page-link"
												href="./list?page=${i}&search=${pager.search}">${i}</a></li>
										</c:forEach>
										<li class="page-item"><a class="page-link"
											href="./list?page=${pager.next?pager.end+1:pager.end}&search=${pager.search}"
											aria-label="Next"> <span aria-hidden="true">&raquo;</span>
										</a></li>
									</ul>
								</nav>

							</div>
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