

<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<head>
<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="${css}/shop-homepage.css" rel="stylesheet">

<!-- jQuery -->
<script src="${js}/jquery.js"></script>

<!-- jQuery validator -->
<script src="${js}/jquery.validate.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="${js}/bootstrap.min.js"></script>

<!-- Datatable plugin -->
<script src="${js}/jquery.dataTables.min.js"></script>

<!-- Datatable Bootstrap Script -->
<script src="${js}/dataTables.bootstrap.js"></script>

<!-- Bootbox -->
<script src="${js}/bootbox.min.js"></script>

<!-- Self coded js -->
<script src="${js}/myapp.js"></script>

</head>

<!-- Navigation -->
<%@include file="../shared/flows-header.jsp" %>

<div class="container">

	<div class="row">

		<div class="col-md-6 col-md-offset-3">

			<div class="panel panel-primary">

				<div class="panel-heading">

					<h4>Sign Up - Personal</h4>

				</div>

				<div class="panel-body">

					<sf:form method="POST" class="form-horizontal" id="registerForm"
						modelAttribute="user">

						<div class="form-group">
							<label class="control-label col-md-4">First Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="firstName" class="form-control"
									placeholder="First Name" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-4">Last Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="lastName" class="form-control"
									placeholder="Last Name" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-4">Email</label>
							<div class="col-md-8">
								<sf:input type="text" path="email" class="form-control"
									placeholder="Email" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-4">Contact Number</label>
							<div class="col-md-8">
								<sf:input type="text" path="contactNumber" class="form-control"
									placeholder="XXXXXXXXXX" maxlength="10" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-4">Password</label>
							<div class="col-md-8">
								<sf:input type="password" path="password" class="form-control"
									placeholder="Password" />
							</div>
						</div>
						<!-- radio button using bootstrap class of radio-inline -->
						<div class="form-group">
							<label class="control-label col-md-4">Select Role</label>
							<div class="col-md-8">
								<label class="radio-inline"> <sf:radiobutton path="role"
										value="USER" checked="checked" />User
								</label> <label class="radio-inline"> <sf:radiobutton
										path="role" value="SUPPLIER" />Supplier
								</label>
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-offset-4 col-md-8">
								<button type="submit" class="btn btn-primary"
									name="_eventId_billing">

									Next - Billing <span class="glyphicon glyphicon-chevron-right"></span>

								</button>
							</div>
						</div>
					</sf:form>
				</div>

			</div>

		</div>

	</div>

</div>

<!-- Footer -->
<%@include file="../shared/flows-footer.jsp" %>


