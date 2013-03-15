<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<title>User</title>
		<link rel="stylesheet" type="text/css" href="./CSS/user-css.css"/>
	</head>	
		
		<div class="container">
			<div class="page-header">
				<h1>UserPage</h1>
			</div>
			
			<!--Søkeskjema-->
			<form class="form-search" accept-charset="utf-16">
				<input type="text" name="q" class="input-medium search-query" 
				value="<c:out value="${param.q}"/>">
				<button type="submit" class="btn">Search</button>
			</form>
			
			<div id="divMain">
			
				<c:forEach var="user" items="${users}">
					<div id="divLsncSpacing">	
						<div id="divLsncObject">
							<div id="divLsncContent">
								<div id="divLsncStatus">
									<img id="imgStatus"src="BILDER/REGISTERED.png">
								</div>
								<div id="divLsncPicture">
									<div id="divFrame">
										<img id="imgUser" src="BILDER/USERIMG.png">
									</div>
								</div>
								<div id="divLsncInfo">
									<div id="divLsncUser">
										<p id="textUserName"><c:out value="${user.nickName}" /></p>
									</div>
									<div id="divLsncSkills">
										<div id="divLsncSkill_1">
											<p class="textSkill">Skill1</p>
										</div>
										<div id="divLsncSkill_2">
											<p class="textSkill">Skill2</p>
										</div>
										<div id="divLsncSkill_3">
											<p class="textSkill">Skill3</p>
										</div>
									</div>
									<div id="divLsncTeamStatus">
										<div id="divLsncTeam">
											<p id="textTeam">The Awesome Team</p>
										</div>
										<div id="divLsncGame">
											<p id="textGame">The Not So Awesome Game</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
			
		</div>
	
	</body>

</html>