/*
 * Configures the UI-Router states and their associated URL routes and views
 * Also adds "state-change" reporting for debugging during development
 */
(function(  ) {
    'use strict';
    
    angular.module("app.ui")
        .config(['$stateProvider','$ocLazyLoadProvider', configureStates]);

    /////////////////////
    function configureStates($stateProvider,$ocLazyLoadProvider) {
        $stateProvider
            .state('app.ui',
            {
                url: '/ui',
                templateUrl: 'js/ui/ui.html'
            })
            .state('app.profile',
            {
                url: '/ui/profile',
                templateUrl: 'js/ui/profile.html'
            })
              ;

    }

}());

