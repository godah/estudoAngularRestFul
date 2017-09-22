var app = angular.module('ajax', ['ngRoute', 'ngResource']);

app.controller('ajaxController', function($scope) {
	$scope.names = ["Emil", "Tobias", "Linus"];
});

app.controller('controllerPessoa', function($scope, $resource) {
	//com Spring Framework RestFUl
	//pessoas = $resource("/pessoas/:codPessoa");
	
	//com Servlet
	pessoas = $resource("/zero_angularjs_spring_mvc/pessoas/?codPessoa=:codPessoa");
	
	//busca por codPessoa
	$scope.getPorId = function(){
		pessoas.get({codPessoa: $scope.codPessoa}, function(data) {
			$scope.objetoPessoa = data;
		});
	};
	
	//busca por todos
	$scope.getPorTodos = function(){
		pessoas.query(function(data) {
			$scope.objetoPessoa = data;
		});
	};
	
	//salvar pessoas
	$scope.salvarPessoas = function(){
		p = new pessoas();
		p.numero = '87678';
		p.$save();
	};
	
	//deletar pessoa
	$scope.deletarPessoa = function(){
		pessoas.$delete({codPessoa:"60"});
	};
	
});