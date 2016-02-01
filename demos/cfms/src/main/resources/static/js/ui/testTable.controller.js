
(function(angular) {
    'use strict';

    angular.module("app.ui" ).controller( 'TestGridController', TestGridController);

    TestGridController.$inject = ['$state','$resource'];

    /////////////////////
    function TestGridController( $state,$resource ) {

        var vm = this;
        vm.search       = search;
        vm.myData = [
            {
                "name": "lzy",
                "gender": "男"
            },{
                "name": "long",
                "gender": "女"
            }];

        function search(){
            var peopleResource = $resource('/party/people');
            var data = peopleResource.query();
            vm.myData = data;
        }

    }

}( this.angular ));

