/*
 * header viewmodel associated with the header.html view
 * at the top of the shell.
 * It displays navigation among the main app 'pages'
 */

(function(angular) {
    'use strict';

    angular.module( "app" ).directive( 'header', header);

    /////////////////////
    function header() {
        var directive = {
            restrict: "A",
            templateUrl: "js/dashboard/header.html"
        }
        return directive;
    }

}( this.angular ));
