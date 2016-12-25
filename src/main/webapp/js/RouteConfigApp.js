if (typeof angular === 'undefined') {
    throw new Error('requires angular');
}

var routeConfig = function($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'view/home.html',
            controller: 'HomeController'
        })
        .when('/client', {
            templateUrl: 'view/client.html',
            controller: 'ClientController'
        })
        .when('/transaction', {
            templateUrl: 'view/transaction.html',
            controller: 'TransactionController'
        })
        .when('/report', {
            templateUrl: 'view/report.html',
            controller: 'ReportController'
        })
        .otherwise({redirectTo: '/'});
};

var RouteConfigApp = angular.module('RouteConfigApp',['ngRoute'] ).config(routeConfig);