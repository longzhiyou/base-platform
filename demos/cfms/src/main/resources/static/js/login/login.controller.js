
(function(angular) {
	'use strict';

	angular.module("app" ).controller( 'LoginController', ['$state','auth', LoginController]);

	/////////////////////
	function LoginController( $state,auth ) {

		var vm = this;
		vm.error     = false;
		vm.login       = login;
        //vm.logout = auth.clear;
		vm.credentials = {};

		vm.images = [
			'images/bg/18.jpg',
			'images/bg/19.jpg',
			'images/bg/7.jpg'
		];

		vm.authenticated = function() {
			return auth.authenticated;
		};

		function login() {
			auth.authenticate(vm.credentials, function(authenticated) {
				if (authenticated) {
					console.log("Login succeeded");
					vm.error = false;
                    $state.go('app.ui');
				} else {
					console.log("Login failed");
					vm.error = true;
				}
			})
		}


	}

}( this.angular ));

