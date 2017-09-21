var app = angular.module('Loja3' , ['ngRoute']);

app.directive("w3TestDirective", function(){
	return{
		template: "Fui feito em um construtor de diretriz!"		
	};
});
