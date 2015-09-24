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
            // Trigger initial loading of data from server
            // The app may appear to be more responsive if loading happens in background
            // while the app launches on a splash page that doesn't actually need data.
            reportStateChanges();
        }

        // report to console when UI-Router state changes
        function reportStateChanges(){

                appStart.reportStateChangesEnabled = true;
                $rootScope.$on('$stateChangeStart',
                    function(event, toState, toParams, fromState){
                        console.log("stateChangeStart: from '"+fromState.name + "' to '"+ toState.name+"'");
                    });

                $rootScope.$on('$stateChangeError',
                    function(event, toState, toParams, fromState, fromParams, error){
                        console.log("stateChangeError: from '"+fromState.name + "' to '"+ toState.name+"' with error: "+error);
                    });

                $rootScope.$on('$stateChangeSuccess',
                    function(event, toState, toParams, fromState){
                        console.log("stateChangeSuccess: from '"+fromState.name + "' to '"+ toState.name+"' with params " +
                            JSON.stringify(toParams));
                    });

        }
    }
})( this.angular );
