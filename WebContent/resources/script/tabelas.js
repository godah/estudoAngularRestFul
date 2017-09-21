var app = angular.module('tabela',['ngRoute']);

app.controller('pegarRespostaTabela', function($scope, $http) {
	$http.get("pegarRespostaTabela").then(function(response){
		$scope.lista = response.data;
	});
});

