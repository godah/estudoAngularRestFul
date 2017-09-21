var app = angular.module('loja' , []);

app.config(function($routeProvider){
	$routeProvider
		.when("/", {controller: "listController", templateUrl: "list.html"})//listar
		.when("/edit/:name", {controller: "editController", templateUrl: "form.html"})//editar
		.when("/new",{controller: "newController", template: "form.html"})//novo
		.otherwise({redirectTo: "/"});
});

//Registro de trabalho que deve ser realizado quando o injetor é feito carregado todos os módulos

app.run(function($rootScope){
	$rootScope.frutas = ['banana', 'melancia', 'pera'];
});


app.controller('listController', ['$scope', function($scope){
	
}]);

//$scope é o escopo da aplicação html
//$location redirecionamento entre rotas
//$routeParams são os parametros repassador pela url
app.controller('editController', ['$scope', function editController($scope, $location, $routeParams){
	$scope.title = 'Editar frutas';//adicionando titulo a pagina
	$scope.fruta = $routeParams.name;//pegando o nome da fruta
	$scope.frutaIndex = $scope.frutas.indexOf($scope.fruta);//pegando a furta dentro da lista
	
	$scope.salvar = function(){
		$scope.frutas[$scope.frutasIndex] = $scope.fruta;//pega o novo nome da fruta editada
		$location.path('/');//volta para o index
	};
}]);

app.controller('newController', ['$scope','$routeParams','$rootScope','$route','$location',
	function newController($scope, $routeParams, $rootScope,$route,$location){
		$scope.title = 'Nova Fruta';
		$scope.fruta = '';
		
		scope.salvar = function(){
			$scope.frutas.push($scope.fruta);//add nova fruta.
			$location.path('/');//volta para o index
		};
}]);



