var app = angular.module('ajax', ['ngRoute', 'ngResource']);

app.controller('ajaxController', function($scope) {
	$scope.names = ["Emil", "Tobias", "Linus"];
});

app.controller('controllerPessoa', function($scope, $resource) {
	//com Spring Framework RestFUl
	//pessoas = $resource("/pessoas/:codPessoa");
	
	//com Servlet
	pessoas = $resource("/zero_angularjs_spring_mvc/pessoas/?codPessoa=:codPessoa");
	
	$scope.getPorId = function(){
		pessoas.get({codPessoa: $scope.codPessoa}, function(data) {
			$scope.objetoPessoa = data;
		});
n	};
});