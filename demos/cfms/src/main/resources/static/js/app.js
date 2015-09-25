///*
// * Defines the AngularJS application module and initializes it
// */
//
//(function( angular  ) {
//    var app = angular.module( "app", [
//        'ui.router'
//        ] );
//
//    app.run( [ '$rootScope', '$state', '$stateParams','appStart','auth',
//        function ( $rootScope,   $state,   $stateParams,appStart,auth ) {
//        // It's very handy to add references to $state and $stateParams to the $rootScope
//        // so that you can access them from any scope within your applications.For example,
//        // <li ng-class="{ active: $state.includes('contacts.list') }"> will set the <li>
//        // to active whenever 'contacts.list' or one of its decendents is active.
//        $rootScope.$state = $state;
//        $rootScope.$stateParams = $stateParams;
//
//        appStart.start();
//        // Initialize auth module with the home page and login/logout path
//        // respectively
//        auth.init('/home', '/login', '/logout');
//    }]);
//})( this.angular );
