var app = angular.module('combobox', ['ngRoute']);

app.controller('comboboxController', function($scope, $http) {
	$scope.names = ["Emil", "Tobias", "Linux"];
	
});

app.controller('comboboxControllerJson', function($scope, $http) {
	$http.get("pegarRespostaJson").then(function(response){
		$scope.lista = response.data;
	});
});