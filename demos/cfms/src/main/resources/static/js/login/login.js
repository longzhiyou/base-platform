
(function(angular) {
	'use strict';

	angular.module( "app" ).controller( 'login', ['$location','auth', controller]);

	function controller( $location,auth ) {

		var vm = this;
		vm.error     = false;
		vm.login       = login;
        //vm.logout = auth.clear;
		vm.credentials = {};

		vm.authenticated = function() {
			return auth.authenticated;
		};

		function login() {
			auth.authenticate(vm.credentials, function(authenticated) {
				if (authenticated) {
					console.log("Login succeeded");
					vm.error = false;
				} else {
					console.log("Login failed");
					vm.error = true;
				}
			})
		}


	}

}( this.angular ));

