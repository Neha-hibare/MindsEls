//StaffController
(function() {
	'use strict';




	angular
			.module('theApp')
			.controller(
					'AdminStaffEditController',
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
							 console.log("inside AdminStaffEditController calling AdminPostService.getStaffByStaffId");
							 $scope.staffProfileDetails;
								  AdminPostService.getStaffByStaffId($scope.staffId,function(response){
						       	  	        $scope.staffProfileDetails = response;
						       	  	       return response;
						       	  	        });				
								 
							console.log("staff"+$scope.staffProfileDetails);
   						
							
							} ]);
})();

