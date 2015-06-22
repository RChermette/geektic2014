var app = angular.module("geektic", ['ngRoute']);
app.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/', {
                templateUrl: '/includes/home.html'
            }).
            when('/geeks/:name'
            , { templateUrl: '/includes/search.html', controller: CMSController })
            .otherwise({
                redirectTo: '/'
            });
    }]);

var searchController = angular.module('searchController',[]);

function CMSController($scope, $route, $routeParams) {
    $route.current.templateUrl = '/pages/' + $routeParams.name + ".html";
    alert($route.current.templateUrl);
}