
(function(angular) {
	'use strict';

	angular.module( "app" ).controller( 'login', ['$location','auth', controller]);

	function controller( $location ) {

		var vm = this;
		vm.error     = 'dashboard.home';
		vm.isSelected   = isSelected;
		vm.login       = login;
		vm.credentials = {};

		vm.authenticated = function() {
			return auth.authenticated;
		}

		function login() {
			auth.authenticate(vm.credentials, function(authenticated) {
				if (authenticated) {
					console.log("Login succeeded")
					vm.error = false;
				} else {
					console.log("Login failed")
					vm.error = true;
				}
			})
		};

		vm.logout = auth.clear;

	};

}( this.angular ));

