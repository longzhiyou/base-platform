/*
 * Configures the UI-Router states and their associated URL routes and views
 * Also adds "state-change" reporting for debugging during development
 */
(function(  ) {
    'use strict';
    
    angular.module("app")
        .config(['$stateProvider', '$urlRouterProvider', configureStates]);
    /////////////////////
    function configureStates($stateProvider, $urlRouterProvider) {

        $urlRouterProvider
            .otherwise('/login');       // Return to the main ordering screen

        $stateProvider
            .state('login',
            {
                url: '/login',
                templateUrl: 'js/login/login.html'
            })

            .state('dashboard',
            {
                url: '/dashboard',
                templateUrl: 'js/dashboard/main.html'
            })
                .state('dashboard.home',
                {
                    url: '/home',
                    templateUrl: 'js/home/home.html'
                })
                .state('dashboard.content',
                {
                    url: '/content',
                    templateUrl: 'js/dashboard/content1.html'
                })

        ;

    }

}());
