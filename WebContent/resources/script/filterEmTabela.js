var app = angular.module('lojax', ['ngRoute']);

app.controller("filterController2", function($scope) {
	$scope.friends = [
		{
		name: "Mario",
		lastname: "Souza",
		age: 20,
		},
		
		{
		name: "Maria",
		lastname: "Quermina",
		age: 89,
		},

		{
		name: "Paulo",
		lastname: "Matos",
		age: 52,
		},
		
		{
			name: "Joaquim",
			lastname: "Luzia",
			age: 33,
		},
	];
	
});
