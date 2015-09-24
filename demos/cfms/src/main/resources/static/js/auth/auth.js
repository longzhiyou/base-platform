(function( angular  ) {
	angular.module('app').factory('auth',['$rootScope', '$http', '$location','$state',factory]);

		function factory ($rootScope, $http, $location,$state) {

			var auth = {
				authenticated : false,
				loginPath : '/login',
				logoutPath : '/logout',
				homePath : '/',
				path : $location.path(),

				init:init,
				authenticate: authenticate,
				clear:clear
			};
			return auth;
			//////////////

			function init(homePath, loginPath, logoutPath){
				auth.homePath = homePath;
				auth.loginPath = loginPath;
				auth.logoutPath = logoutPath;

				auth.authenticate({}, function(authenticated) {
					if (authenticated) {
						$location.path(auth.path);
					}
				})
			};

			function authenticate(credentials, callback){

				var headers = credentials && credentials.username ? {
					authorization : "Basic "
					+ btoa(credentials.username + ":"
						+ credentials.password)
				} : {};

				$http.get('user', {
					headers : headers
				}).success(function(data) {
					if (data.name) {
						auth.authenticated = true;
					} else {
						auth.authenticated = false;
					}
					callback && callback(auth.authenticated);
					$location.path(auth.path==auth.loginPath ? auth.homePath : auth.path);
				}).error(function() {
					auth.authenticated = false;
					callback && callback(false);
				});

			};

			function clear(){

				$location.path(auth.loginPath);
				auth.authenticated = false;
				$http.post(auth.logoutPath, {}).success(function() {
					console.log("Logout succeeded");
				}).error(function(data) {
					console.log("Logout failed");
				});

			};


		}


})( this.angular );