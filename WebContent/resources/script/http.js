var app = angular.module('http',['ngRoute']);

//inicio angular http

app.controller('pegarResposta', function($scope, $http) {
	$scope.pegarResposta = function(){
		$http.get("pegarResposta")
		.then(function(response){
			document.getElementById("resposta").value = ""+response.data;
		});
	};
});

app.controller('pegarResposta2', function($scope, $http) {
	$scope.pegarResposta2 = function(){
		$http.get("pegarResposta")
		.then(function(response){
			document.getElementById("resposta2").value = ""+response.data;
			document.getElementById("resposta3").value = ""+response.status;
			document.getElementById("resposta4").value = ""+response.statusText;
		});
	};
});

app.controller('pegarRespostaErro', function($scope, $http) {
	$scope.pegarRespostaErro = function(){
		$http.get("pegarRespostaErro")
		.then(function(response){
			document.getElementById("respostaerro").value = ""+response.status;
		}, function(response){
			document.getElementById("respostaerro").value = ""+response.status;
		});
	};
});

app.controller('pegarRespostaJson', function($scope, $http) {
	$http.get("pegarRespostaJson")
	.then(function(response){
		$scope.lista = response.data;
	});	
});


