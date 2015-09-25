/*
 * Configures the UI-Router states and their associated URL routes and views
 * Also adds "state-change" reporting for debugging during development
 */
(function(  ) {
    'use strict';
    
    angular.module("app")
        .config(['$httpProvider','$stateProvider', '$urlRouterProvider', configureStates]);
    /////////////////////
    function configureStates( $httpProvider,$stateProvider, $urlRouterProvider) {

        //$locationProvider.html5Mode(true);
        $urlRouterProvider.otherwise('/login');       // Return to the login ordering screen

        $stateProvider
            .state('login',
            {
                url: '/login',
                templateUrl: 'js/login/login.html'
            })

            .state('dashboard',
            {
                url: '/dashboard',
                templateUrl: 'js/dashboard/dashboard.html'
            })
                .state('dashboard.home',
                {
                    url: '/home',
                    templateUrl: 'js/home/home.html'
                })
                .state('dashboard.content',
                {
                    url: '/content',
                    templateUrl: 'js/dashboard/content.html'
                });

        $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';

    }

}());
