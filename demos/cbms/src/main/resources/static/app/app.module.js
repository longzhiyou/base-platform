(function() {
    'use strict';

    angular.module('app', [
        /*
         * Order is not important. Angular makes a
         * pass to register all of the modules listed
         * and then when app.dashboard tries to use app.data,
         * its components are available.
         */

        /*
         * Everybody has access to these.
         * We could place these under every feature area,
         * but this is easier to maintain.
         */
        'app.core'

        //'app.widgets',

        /*
         * Feature areas
         */
        //'app.avengers',
        //'app.dashboard',
        //'app.layout'
    ])
        .run(
        [          '$rootScope', '$state', '$stateParams','auth',
            function ($rootScope,   $state,   $stateParams,auth) {

                // It's very handy to add references to $state and $stateParams to the $rootScope
                // so that you can access them from any scope within your applications.For example,
                // <li ng-class="{ active: $state.includes('contacts.list') }"> will set the <li>
                // to active whenever 'contacts.list' or one of its decendents is active.
                $rootScope.$state = $state;
                $rootScope.$stateParams = $stateParams;

                // Initialize auth module with the home page and login/logout path
                // respectively
                auth.init('/home', '/login', '/logout');

            }
        ]
    );

})();
