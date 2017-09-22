var app = angular.module('event', ['ngRoute','ngLocale']);

app.controller('controllerClickme', function($scope){
	$scope.showMe = false;
	$scope.myFunc = function(){
		$scope.showMe = !$scope.showMe;
	};
});

app.controller('controllerCordinates', function($scope){
	$scope.myFunc = function(myE){
		$scope.x = myE.clientX;
		$scope.y = myE.clientY;
	};
});