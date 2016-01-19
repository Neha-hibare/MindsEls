
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en" ng-app="theApp">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>MindsEls- AngularJS Page</title>
<link rel="stylesheet" href='"""),_display_(/*8.31*/routes/*8.37*/.Assets.at("stylesheets/main.css")),format.raw/*8.71*/("""'>

<link rel="stylesheet" href='"""),_display_(/*10.31*/routes/*10.37*/.Assets.at("lib/bootstrap/css/bootstrap.css")),format.raw/*10.82*/("""'>
<link rel="stylesheet" href='"""),_display_(/*11.31*/routes/*11.37*/.Assets.at("lib/bootstrap/css/bootstrap-theme.min.css")),format.raw/*11.92*/("""'>
<link rel="stylesheet" href='"""),_display_(/*12.31*/routes/*12.37*/.Assets.at("lib/bootstrap/css/bootstrap-datetimepicker.css")),format.raw/*12.97*/("""'>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<script type="text/javascript" src='"""),_display_(/*15.38*/routes/*15.44*/.Assets.at("lib/bootstrap/js/bootstrap-datetimepicker.js")),format.raw/*15.102*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*16.38*/routes/*16.44*/.Assets.at("lib/jquery/jquery.min.js")),format.raw/*16.82*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*17.38*/routes/*17.44*/.Assets.at("lib/toastr/toastr.min.js")),format.raw/*17.82*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*18.38*/routes/*18.44*/.Assets.at("lib/bootstrap/js/bootstrap.min.js")),format.raw/*18.91*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*19.38*/routes/*19.44*/.Assets.at("lib/angularjs/angular.min.js")),format.raw/*19.86*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*20.38*/routes/*20.44*/.Assets.at("lib/angularjs/angular-resource.min.js")),format.raw/*20.95*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*21.38*/routes/*21.44*/.Assets.at("lib/angularjs/angular-route.min.js")),format.raw/*21.92*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*22.38*/routes/*22.44*/.Assets.at("lib/angularjs/angular-ui-router.min.js")),format.raw/*22.96*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*23.38*/routes/*23.44*/.Assets.at("lib/angularjs/angular-messages.min.js")),format.raw/*23.95*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*24.38*/routes/*24.44*/.Assets.at("lib/angularjs/dirPagination.js")),format.raw/*24.88*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*25.38*/routes/*25.44*/.Assets.at("lib/font-awesome/css/font-awesome.min.css")),format.raw/*25.99*/("""'></script>

<!-- <script type="text/javascript" src='"""),_display_(/*27.43*/routes/*27.49*/.Assets.at("lib/ui-router-extras/ct-ui-router-extras.js")),format.raw/*27.106*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*28.38*/routes/*28.44*/.Assets.at("lib/ui-router-extras/ct-ui-router-extras.sticky.js")),format.raw/*28.108*/("""'></script> -->


<script type="text/javascript" src='"""),_display_(/*31.38*/routes/*31.44*/.Assets.at("javascripts/app.js")),format.raw/*31.76*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*32.38*/routes/*32.44*/.Assets.at("javascripts/constants.js")),format.raw/*32.82*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*33.38*/routes/*33.44*/.Assets.at("javascripts/controllers.js")),format.raw/*33.84*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*34.38*/routes/*34.44*/.Assets.at("javascripts/directives.js")),format.raw/*34.83*/("""'></script>
 <script type="text/javascript" src='"""),_display_(/*35.39*/routes/*35.45*/.Assets.at("javascripts/services.js")),format.raw/*35.82*/("""'></script>
 <script type="text/javascript" src='"""),_display_(/*36.39*/routes/*36.45*/.Assets.at("javascripts/htmlcontrols/htmlcontroller.js")),format.raw/*36.101*/("""'></script>

<script type="text/javascript" src='"""),_display_(/*38.38*/routes/*38.44*/.Assets.at("javascripts/staff/staff.controller.js")),format.raw/*38.95*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*39.38*/routes/*39.44*/.Assets.at("javascripts/staff/stafflist.controller.js")),format.raw/*39.99*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*40.38*/routes/*40.44*/.Assets.at("javascripts/staff/staff.services.js")),format.raw/*40.93*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*41.38*/routes/*41.44*/.Assets.at("javascripts/staff/staff.apiservices.js")),format.raw/*41.96*/("""'></script>



<script type="text/javascript" src='"""),_display_(/*45.38*/routes/*45.44*/.Assets.at("javascripts/Login/login.controller.js")),format.raw/*45.95*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*46.38*/routes/*46.44*/.Assets.at("javascripts/Login/authentication.service.js")),format.raw/*46.101*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*47.38*/routes/*47.44*/.Assets.at("javascripts/Login/flash.service.js")),format.raw/*47.92*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*48.38*/routes/*48.44*/.Assets.at("javascripts/Login/user.service.js")),format.raw/*48.91*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*49.38*/routes/*49.44*/.Assets.at("javascripts/Login/userDetail.service.js")),format.raw/*49.97*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*50.38*/routes/*50.44*/.Assets.at("javascripts/register/register.controller.js")),format.raw/*50.101*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*51.38*/routes/*51.44*/.Assets.at("javascripts/admin/organization.controller.js")),format.raw/*51.102*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*52.38*/routes/*52.44*/.Assets.at("javascripts/admin/admin.controller.js")),format.raw/*52.95*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*53.38*/routes/*53.44*/.Assets.at("javascripts/admin/admin.controller.js")),format.raw/*53.95*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*54.38*/routes/*54.44*/.Assets.at("javascripts/admin/admin.service.js")),format.raw/*54.92*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*55.38*/routes/*55.44*/.Assets.at("javascripts/admin/adminpost.service.js")),format.raw/*55.96*/("""'></script>




<script type="text/javascript" src='"""),_display_(/*60.38*/routes/*60.44*/.Assets.at("javascripts/admin/adminAPI.service.js")),format.raw/*60.95*/("""'></script>


<!-- New Template Dependencies -->
<script type="text/javascript" src='"""),_display_(/*64.38*/routes/*64.44*/.Assets.at("partial-html-app/newTemplate/admin/newlogin.controller.js")),format.raw/*64.115*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*65.38*/routes/*65.44*/.Assets.at("partial-html-app/newTemplate/admin/newuser.service.js")),format.raw/*65.111*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*66.38*/routes/*66.44*/.Assets.at("partial-html-app/newTemplate/admin/newauth.service.js")),format.raw/*66.111*/("""'></script>

<script type="text/javascript" src='"""),_display_(/*68.38*/routes/*68.44*/.Assets.at("partial-html-app/admin/student/admin.stud.controller.js")),format.raw/*68.113*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*69.38*/routes/*69.44*/.Assets.at("partial-html-app/admin/staff/admin.staff.controller.js")),format.raw/*69.112*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*70.38*/routes/*70.44*/.Assets.at("partial-html-app/admin/staff/admin.staff.edit.controller.js")),format.raw/*70.117*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*71.38*/routes/*71.44*/.Assets.at("partial-html-app/admin/transportation/admin.transport.controller.js")),format.raw/*71.125*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*72.38*/routes/*72.44*/.Assets.at("partial-html-app/admin/Campus/admin.campus.controller.js")),format.raw/*72.114*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*73.38*/routes/*73.44*/.Assets.at("partial-html-app/admin/Campus/admin.news.controller.js")),format.raw/*73.112*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*74.38*/routes/*74.44*/.Assets.at("partial-html-app/admin/library/library.controller.js")),format.raw/*74.110*/("""'></script>






</head>
<body ng-controller="AppCtrl">
	<!-- Static navbar -->
	<nav class="navbar navbar-default navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				 <div class="row">
        <div class="col-sm-12 col-sm-offset-2">
          <div class="col-sm-1 ">
            <img  src='"""),_display_(/*94.25*/routes/*94.31*/.Assets.at("images/yeoman.png")),format.raw/*94.62*/("""' width="60" height="60">
          </div>
          <div class="col-sm-11 text-left">
            <h3><strong>Minds E Learning Student Information System - [MELSIS]</strong></h3>
            <hr >
          </div>
        </div>
    </div>
			</div>
			
			<!--/.nav-collapse -->
			 
		</div>
	</nav>
	


	<div class="col-md-12" ng-view>
	
	</div>
	 
	<div class="container">
		<div class="row">&nbsp;</div>
		<div class="alert alert-info ">
	    	<p class="text-center">Following will allow you to make API Calls</p>
	     </div>
		<nav class="navbar">
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#/index">Home</a></li>
					<!-- <li><a href="#/messages">Messages</a></li>
					<li><a href="#/users">Users</a></li> -->
					<li><a href="#/new_login">Log In</a></li>
					<li><a href="#/signupstudent">Sign Up staff</a></li>
					<li><a href="#/signupguardian">Guardian sign up </a></li>
					<li><a href="#/admindashboard">Admin Dashboard </a></li>
					<li><a ng-click="logout()" href>Logout</a></li>
					
					
					<li><a ng-click="getuserRoles()" href>User Roles</a></li>
					<li><a ng-click="getAllCampus()" href>All Campuses</a></li>
					
					
					<li><a ng-click="getUserById()" href>Get User Id 3</a></li>
					
					<li><a ng-click="getUserLoginByEmail()" href>Get UserLogin user1</a></li>
					
					<li><a ng-click="getUserContextById()" href>Get User Context</a></li>
					
					<li><a ng-click="getContextById()" href>Get Context</a></li>
					
					<li><a ng-click="getStaffDetails()" href>Get Staff Details</a></li>
					
					
					<li><a ng-click="getStudentDetails()" href>Get Student Details</a></li>
					
					<li><a ng-click="getGuardianDetails()" href>Get Guardian Details</a></li>
					
					<li><a href="#/dashboard">Dashboard</a></li>
					<li><a href="#/Guardiandashboard">Guardian Dashboard</a></li>
					<li><a href="#/admindashboard/1">Admin Dashboard</a></li>
					
					<li><a href="#/staffdashboard/1">Staff Dashboard</a></li>
					<li><a href="#/getstaff">userlist</a></li>
					<li><a href="#/staffdashboard">Staff Dashboard</a></li>
					<li><a href="#/getreddash">red dashboard</a></li>
					
				</ul>
				
			</div>
		</nav>
	</div>
	
	<!-- /container -->
	<div ui-view="organisationtab" ng-show="$state.includes('top.organisation')" class="col-sm-8"></div>
    <div ui-view="parenttab"    ng-show="$state.includes('top.parent')"    class="col-sm-8"></div>
    <div ui-view="stafftab"   ng-show="$state.includes('top.staff')"   class="col-sm-8"></div>

	<footer>
		<hr />
		<div>
			<span>&copy; MindsSolvit 2015</span>
		</div>
		<div>
			<span app-version></span>
		</div>
	</footer>
</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jan 14 15:35:01 IST 2016
                  SOURCE: D:/mindsproject/MindsEls/app/views/index.scala.html
                  HASH: f53bc3b1cc407f0d7243a3cfcabc792073e0db9b
                  MATRIX: 580->0|885->279|899->285|953->319|1016->355|1031->361|1097->406|1158->440|1173->446|1249->501|1310->535|1325->541|1406->601|1584->752|1599->758|1679->816|1756->866|1771->872|1830->910|1907->960|1922->966|1981->1004|2058->1054|2073->1060|2141->1107|2218->1157|2233->1163|2296->1205|2373->1255|2388->1261|2460->1312|2537->1362|2552->1368|2621->1416|2698->1466|2713->1472|2786->1524|2863->1574|2878->1580|2950->1631|3027->1681|3042->1687|3107->1731|3184->1781|3199->1787|3275->1842|3359->1899|3374->1905|3453->1962|3530->2012|3545->2018|3631->2082|3716->2140|3731->2146|3784->2178|3861->2228|3876->2234|3935->2272|4012->2322|4027->2328|4088->2368|4165->2418|4180->2424|4240->2463|4318->2514|4333->2520|4391->2557|4469->2608|4484->2614|4562->2670|4641->2722|4656->2728|4728->2779|4805->2829|4820->2835|4896->2890|4973->2940|4988->2946|5058->2995|5135->3045|5150->3051|5223->3103|5306->3159|5321->3165|5393->3216|5470->3266|5485->3272|5564->3329|5641->3379|5656->3385|5725->3433|5802->3483|5817->3489|5885->3536|5962->3586|5977->3592|6051->3645|6128->3695|6143->3701|6222->3758|6299->3808|6314->3814|6394->3872|6471->3922|6486->3928|6558->3979|6635->4029|6650->4035|6722->4086|6799->4136|6814->4142|6883->4190|6960->4240|6975->4246|7048->4298|7133->4356|7148->4362|7220->4413|7337->4503|7352->4509|7445->4580|7522->4630|7537->4636|7626->4703|7703->4753|7718->4759|7807->4826|7886->4878|7901->4884|7992->4953|8069->5003|8084->5009|8174->5077|8251->5127|8266->5133|8361->5206|8438->5256|8453->5262|8556->5343|8633->5393|8648->5399|8740->5469|8817->5519|8832->5525|8922->5593|8999->5643|9014->5649|9102->5715|9784->6370|9799->6376|9851->6407
                  LINES: 22->1|29->8|29->8|29->8|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|42->21|42->21|42->21|43->22|43->22|43->22|44->23|44->23|44->23|45->24|45->24|45->24|46->25|46->25|46->25|48->27|48->27|48->27|49->28|49->28|49->28|52->31|52->31|52->31|53->32|53->32|53->32|54->33|54->33|54->33|55->34|55->34|55->34|56->35|56->35|56->35|57->36|57->36|57->36|59->38|59->38|59->38|60->39|60->39|60->39|61->40|61->40|61->40|62->41|62->41|62->41|66->45|66->45|66->45|67->46|67->46|67->46|68->47|68->47|68->47|69->48|69->48|69->48|70->49|70->49|70->49|71->50|71->50|71->50|72->51|72->51|72->51|73->52|73->52|73->52|74->53|74->53|74->53|75->54|75->54|75->54|76->55|76->55|76->55|81->60|81->60|81->60|85->64|85->64|85->64|86->65|86->65|86->65|87->66|87->66|87->66|89->68|89->68|89->68|90->69|90->69|90->69|91->70|91->70|91->70|92->71|92->71|92->71|93->72|93->72|93->72|94->73|94->73|94->73|95->74|95->74|95->74|115->94|115->94|115->94
                  -- GENERATED --
              */
          