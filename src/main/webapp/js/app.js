var app = angular.module("geektic", ['ngRoute']);
app.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/', {
                templateUrl: '/includes/home.html'
            }).
            when('/geeks/:sexe/:centreInteret'
            , { templateUrl: '/includes/search.html',
            controller: 'Geek'
            })
            .otherwise({
                redirectTo: '/'
            });
    }]);

app.controller('Geek', function($scope, $http, $routeParams) {
    $http({
        url: '/geeks/'+ $routeParams.sexe + '/'+$routeParams.centreInteret,
        method: 'GET'
    }).success(function(Geeks) {
        $scope.Geeks = Geeks;
    });
})




