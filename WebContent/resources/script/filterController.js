var app = angular.module('filter' , ['ngRoute']);

app.controller('personCtrl', function($scope){
	$scope.firtName = "John";
	$scope.lastName = "Doe";
	
});

app.controller('namesCtrl', function($scope){
	$scope.names = [
		{name: 'Jani',country:'Norway'},
		{name: 'Carl',country:'EUA'},
		{name: 'Margareti',country:'Brazil'},
		{name: 'James',country:'Urugay'},
		{name: 'John',country:'Philipns'},
		{name: 'Dany',country:'Bolivia'},
		{name: 'Tommy',country:'Norway'},
		{name: 'Jimmy',country:'Japan'}
	];
		
});

app.controller('costCtrl', function($scope) {
	$scope.price = 58;
	
});

app.controller('namesCtrl2', function($scope) {
	$scope.names = [
		'Jani',
		'Carl',
		'Margareth',
		'Hege',
		'Joe',
		'Gustav',
		'Mary',
		'Kai'
	];
});

app.controller('namesCtrl3', function($scope) {
	$scope.names = [
		'Jani',
		'Carl',
		'Margareth',
		'Hege',
		'Joe',
		'Gustav',
		'Mary',
		'Kai'
	];
});


app.controller('namesCtrl4', function($scope){
	$scope.names = [
		{name: 'Jani',country:'Norway'},
		{name: 'Carl',country:'EUA'},
		{name: 'Margareti',country:'Brazil'},
		{name: 'James',country:'Urugay'},
		{name: 'John',country:'Philipns'},
		{name: 'Dany',country:'Bolivia'},
		{name: 'Tommy',country:'Norway'},
		{name: 'Jimmy',country:'Japan'}
	];
	$scope.orderByMe = function(x){
		$scope.myOrderBy = x;
	};
});











