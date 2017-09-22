var app = angular.module('inject', ['ngRoute','ngResource']);

app.factory("UserService",function(){
	var users = ["Ivete","Alex","Paulo"];
	
	return{
		all: function(){
			return users;
		},
		primeiro: function(){
			return users[0];
		}
	};
});

//criação do controller
primeiroUserController = app.controller("primeiroUserController", function($scope, UserService){
	$scope.primeiro = UserService.primeiro();
	
});

//ativando injeção de dependencia
primeiroUserController.$inject = ["$scope", "UserService"];

//segundo controller
todosUserController = app.controller("todosUserController", function($scope, UserService) {
	$scope.todos = UserService.all();
});

//ativando a injeção de dependencia
todosUserController.$inject = ["$scope","UserService"];
 