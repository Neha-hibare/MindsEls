//StaffController
(function() {
	'use strict';




	angular
			.module('theApp')
			.controller(
					'AdminStaffUpdateController',
					[
						'$location',
						'$rootScope',
						'$scope',
						'$http',
						'$stateParams','AdminPostService',
						function($location, $rootScope, $scope, $http, $stateParams, AdminPostService) {
									
						//	 $scope.campusId=$stateParams.campusID;
							 $scope.staffId=$stateParams.staffID;
							 console.log("$stateParams.staffId   "+$stateParams.staffID);
							 console.log("inside AdminStaffUpdateController calling AdminPostService.getStaffByStaffId");
							 $scope.staffProfileDetails;
								  AdminPostService.getStaffByStaffId($scope.staffId,function(response){
						       	  	        $scope.staffProfileDetails = response;
						       	  	       return response;
						       	  	        });				
								 
							console.log("staff"+$scope.staffProfileDetails);
   						
							
							} ]);
})();

