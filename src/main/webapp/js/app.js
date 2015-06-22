var app = angular.module("geektic", ['ngRoute']);
app.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/', {
                templateUrl: '/includes/home.html'
            }).
            when('/new', {
                templateUrl: '/includes/newUser.html'
            }).
            otherwise({
                redirectTo: '/'
            });
    }]);

