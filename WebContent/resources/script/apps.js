var app = angular.module('apps', ['ngRoute', 'ngResource', 'ngAnimate']);

app.config(function($routeProvider, $provide, $httpProvider, $locationProvider){
	$routeProvider.when("/clienteList",{
		controller : "clientController",
		templateUrl: "cliente/list.html"
	})//listar
	
	.when("/cliente/:id",{
		controller : "clienteController",
		templateUrl: "cliente/cadastro.html"
	})//editar
	
	.when("/cliente/cadastro",{
		controller: "clienteController",
		templateUrl: "cliente/cadastro.html"
	})//novo
	
	.otherwise({
		redirectTo: "/"
	});
	
});

app.controller("clienteController", function($scope, $http){
	
	$scope.listarClientes = function(){
		$http.get("cliente/listar", function(response){
			$scope.data = response.data;
		});
	};
	
});