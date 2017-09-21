var app = angular.module('Loja1' , []);

app.run(function($rootScope){
	$rootScope.quant = 99;
	$rootScope.frutas=['banana','manga','pera'];
});
