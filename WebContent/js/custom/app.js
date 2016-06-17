var app = angular.module('app', ['ngRoute']);
app.config(function($routeProvider) {
	$routeProvider
	.when('/main',{
		templateUrl:'tcs/view/home'
		//controller: 'displayController'
	})
	.when('/emp',{
		templateUrl:'../view/empl'
		//controller: 'displayController'
	})
	.otherwise({
		redirectTo: '/'
	});
});

app.controller('my',function($scope){
	$scope.hara = "hara";
	
});