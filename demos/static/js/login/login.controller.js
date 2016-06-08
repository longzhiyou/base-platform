
(function(angular) {
	'use strict';

	angular.module("app" ).controller( 'LoginController', LoginController);

    LoginController.$inject = ['$log','$http','$state','auth'];

	/////////////////////
	function LoginController($log,$http, $state,auth ) {

		var vm = this;
		vm.error     = false;
		vm.login       = login;
        vm.greeting = greeting;

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
                    // $state.go('app.profile');
                    // greeting();
				} else {
					console.log("Login failed");
					vm.error = true;
				}
			})
		}

        function greeting() {
            // $http.get('http://192.168.1.11:10010/api/products').success(function(data) {
            //     $log.log(data);
            //
            //
            // }).error(function() {
            //     $log.log("error");
            //
            // });
            $http.get('http://localhost:8089/greeting').success(function(data) {
                $log.log("greeting success");


            }).error(function() {
                $log.log("error");

            });
        }


	}

}( this.angular ));

