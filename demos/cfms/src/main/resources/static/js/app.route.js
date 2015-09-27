/*
 * Configures the UI-Router states and their associated URL routes and views
 * Also adds "state-change" reporting for debugging during development
 */
(function(  ) {
    'use strict';
    
    angular.module("app")
        .config(['$httpProvider','$stateProvider', '$urlRouterProvider','$compileProvider', configureStates]);
    /////////////////////
    function configureStates( $httpProvider,$stateProvider, $urlRouterProvider,$compileProvider) {

        //$locationProvider.html5Mode({
        //    enabled: true,
        //        requireBase: false
        //    });

        $compileProvider.debugInfoEnabled(false);

        $urlRouterProvider.otherwise('/login');       // Return to the login ordering screen

        $stateProvider
            .state('login',
            {
                url: '/login',
                templateUrl: 'js/login/login.html',
                controller: 'LoginController',
                controllerAs: 'vm'

            })

            .state('app',
            {
                abstract: true,
                url: '',
                templateUrl: 'js/dashboard/dashboard.html'
            })


        $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';


        //Disabling Debug Data
        //myApp.config(['$compileProvider', function ($compileProvider) {
        //    $compileProvider.debugInfoEnabled(false);
        //}]);


    }

}());