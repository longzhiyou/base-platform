(function() {
    'use strict';

    angular.module('app.core', [
        /*
         * Angular modules
         */
        'ui.router',        // Routing
        'ui.grid',
        'ui.grid.edit',
        'ui.grid.selection',
        'ngResource',
        'ngAnimate',
        'pascalprecht.translate',
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
