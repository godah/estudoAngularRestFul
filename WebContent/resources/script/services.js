var app = angular.module('services', ['ngRoute']);

app.controller('localizacao', function($scope, $location) {
	$scope.myUrl = $location.absUrl();
	//$scope.myUrl = $location.port();
});

app.controller('controllerTimeOut', function($scope, $timeout) {
	$scope.timermsg = "Oi!";
	$timeout(function(){
		$scope.timermsg = "Oi depois de 3 segundos";
	}, 3000);
});

app.controller('controllerIntervalo', function($scope, $interval) {
	$scope.intervalo = new Date().toLocaleTimeString();
	$interval(function(){
		$scope.intervalo = new Date().toLocaleTimeString();
	}, 1000);
	
});
