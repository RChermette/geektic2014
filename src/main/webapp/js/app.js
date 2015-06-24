var app = angular.module("geektic", ['ngRoute']);
app.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/', {
                templateUrl: '/includes/home.html',
                controller: 'CentreInteret'
            }).
            when('/geeks/:sexe/:centreInteret'
            , { templateUrl: '/includes/search.html',
            controller: 'Geek'
            })
            .otherwise({
                redirectTo: '/'
            });
    }]);

app.controller('CentreInteret', function($scope, $http, $routeParams) {
    $http({
        url: '/ci',
        method: 'GET'
    }).success(function(CentreInterets) {
        $scope.CentreInterets = CentreInterets;
    });
})

app.controller('Geek', function($scope, $http, $routeParams) {
    $http({
        url: '/geeks/'+ $routeParams.sexe + '/'+$routeParams.centreInteret,
        method: 'GET'
    }).success(function(Geeks) {
        $scope.Geeks = Geeks;
    });
})




