/*
 * Configures the UI-Router states and their associated URL routes and views
 * Also adds "state-change" reporting for debugging during development
 */
(function(  ) {
    'use strict';
    
    angular.module("app")
        .config(['$stateProvider', configureStates]);

    /////////////////////
    function configureStates($stateProvider) {
        $stateProvider
            .state('app.ui',
            {
                url: '/ui',
                templateUrl: 'js/ui/ui.html'
            })
            .state('app.profile',
            {
                url: '/ui/profile',
                templateUrl: 'js/ui/profile.html',
                resolve: {
                    loadPlugin: function ($ocLazyLoad) {
                        return $ocLazyLoad.load([
                            {
                                files: ['js/ui/profile.controller.js']
                            }
                        ]);
                    }
                }
            })
            .state('app.FontAwesome',
            {
                url: '/ui/FontAwesome',
                templateUrl: 'js/ui/FontAwesome.html'
            })
            .state('app.TestTable',
            {
                url: '/ui/TestTable',
                templateUrl: 'js/ui/TestTable.html',
                controller: 'TestGridController',
                controllerAs: 'vm',
                resolve: {
                    loadPlugin: function ($ocLazyLoad) {
                        return $ocLazyLoad.load([
                            {
                                files: ['js/ui/testTable.controller.js']
                            }
                        ]);
                    }
            }
            })
              ;

    }

}());

