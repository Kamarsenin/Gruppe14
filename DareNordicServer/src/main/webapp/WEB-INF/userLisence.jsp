<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<HTML>

	<HEAD>
		<META http-equiv="Content-Type" content="text/html; charset=utf-8" />
		
		<LINK rel="stylesheet" type="text/css" href="./CSS/user-css.css"/>
		
		<TITLE>Dare To Be Digital Nordic</TITLE>

	</HEAD>
	
	<BODY>
		<!--BACKGROUND IMG-->
		<IMG id="BackgroundImg" src="Bilder/Bakgrunn.png">
		
		<!--MAIN-->
		<DIV id="divMainContent">
			
			<div id="divMain">
				<c:forEach var="userLisence" items="${userLisences}">
					<div id="divLsncSpacing">	
						<div id="divLsncObject">
							<div id="divLsncContent">
								<div id="divLsncStatus">
									<img id="imgStatus"src="Bilder/REGISTERED.png">
								</div>
								<div id="divLsncPicture">
									<div id="divFrame">
										<img id="imgUser" src="Bilder/USERIMG.png">
									</div>
								</div>
								<div id="divLsncInfo">
									<div id="divLsncUser">
										<p id="textUserName"><c:out value="${userLisence.nickName}" /></p>
									</div>
									<div id="divLsncSkills">
										<div id="divLsncSkill_1">
											<p class="textSkill"><c:out value="${userLisence.skill1}" /></p>
										</div>
										<div id="divLsncSkill_2">
											<p class="textSkill"><c:out value="${userLisence.skill2}" /></p>
										</div>
										<div id="divLsncSkill_3">
											<p class="textSkill"><c:out value="${userLisence.skill3}" /></p>
										</div>
									</div>
									<div id="divLsncTeamStatus">
										<div id="divLsncTeam">
											<p id="textTeam"><c:out value="${userLisence.teamName}" /></p>
										</div>
										<div id="divLsncGame">
											<p id="textGame"><c:out value="${userLisence.gameName}" /></p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
			
		</DIV>
		
		<!--HEADER-->
		<DIV id="divHeaderContainer">
			
			<!--MainMenu-->
			<DIV id="divHeaderMainMenuContainer">
				<DIV id="divMainMenuFrame"></DIV>
					<DIV id="divMainMenuTop">
						<DIV id="divMenuLogo">
							<IMG id="imgMenuLogo" src="Bilder/Dare Nordic Logo.png"/>
						</DIV>
						
						<DIV id="divMenuSearchBar">
							<!--Søkeskjema-->
							<form id="form-search" accept-charset="utf-16">
								<input id="input-search" type="text" name="q" class="input-medium search-query" 
								value="<c:out value="${param.q}"/>">
								<button type="submit" id="btn"> <p id="txtSearch">Search</p> </button>
							</form>
						</DIV>
						
						<DIV id="divMenuCorner">
							<IMG id="imgMenuCorner" src="Bilder/TopMargCorners.png"/>
						</DIV>
					</DIV>
				<DIV id="divMainMenuBottom">
					<DIV id="divBanner1"> <P>News</P> </DIV>
					<DIV id="divBanner2"> <P>User</P> </DIV>
					<DIV id="divBanner3"> <P>Team</P> </DIV>
					<DIV id="divBanner4"> <P>Game</P> </DIV>
					<DIV id="divBanner5"> <P>Community</P> </DIV>
				</DIV>
			</DIV>
			
			<!--UserInfo-->
			<DIV id="divHeaderUserContainer">
				
				<DIV id="divUserImage">
					<IMG id="imgUserAvatar" src="Bilder/USERIMG.png"/>
				</DIV>
				
				<DIV id="divUserInfoLeft">
					<DIV id="divInfoUserName">
						<P>Fingar Bøen</P>
					</DIV>
					<DIV id="divInfoTeamName">
						<P>Gruppe14</P>	
					</DIV>
				</DIV>
				
				<DIV id="divUserInfoRight">
					<DIV id="divInfoLogOut">
						<P>Log out</P>
					</DIV>
					<DIV id="divInfoCountry">
						<P>Norway</P>	
					</DIV>
				</DIV>
				
			</DIV>
			
		</DIV>
		
		<!--FOOTER-->
		<DIV id="divFooterContainer">
			<DIV id="divFooterBanner">
				<DIV id="divFooterBannerBox"></DIV>
			</DIV>
			<DIV id="divFooterInfo">
				<DIV id="divFooterCorner">
					<IMG id="imgFooterCorner" src="Bilder/FooterMargAll.png"/>
				</DIV>
				<DIV id="divFooterSocial">
					<DIV id="divFooterSocialFacebook">
						<IMG id="imgSocialFacebook" src="Bilder/DareLogo.png"/>
					</DIV>
					<DIV id="divFooterSocialTwitter">
						<IMG id="imgSocialTwitter" src="Bilder/FacebookLogo.png"/>
					</DIV>
					<DIV id="divFooterSocialDareInternational">
						<IMG id="imgSocialDareInternational" src="Bilder/TwitterLogo.png"/>
					</DIV>
				</DIV>
			</DIV>
		</DIV>
		
	</BODY>
	
</HTML>