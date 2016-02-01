(function() {
    'use strict';

    angular.module('app.core', [
        /*
         * Angular modules
         */
        'ui.router',        // Routing

        'ngResource',
        /*
         * Our reusable cross app code modules
         */

        /*
         * 3rd Party modules
         */

        'oc.lazyLoad',                  // ocLazyLoad
        'angular-logger-max'
    ]);
})();
