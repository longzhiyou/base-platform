/*
 * The application startup function, called in the app module's run block
 * Created apart from app.js so it can be easily stubbed out
 * during testing or tested independently
 */
(function( angular  ) {

    angular.module("app").factory('appStart',['$rootScope',factory]);

    function factory ($rootScope){

        var appStart = {
            reportStateChangesEnabled: false,
            start: start
        };
        return appStart;
        //////////////
        function start ( ) {

            console.log( "cfms is loaded and running on " );

        }

    }
})( this.angular );
