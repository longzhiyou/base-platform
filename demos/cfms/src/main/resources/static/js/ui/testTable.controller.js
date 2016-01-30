
(function(angular) {
    'use strict';

    angular.module("app.ui" ).controller( 'TestGridController', TestGridController);

    TestGridController.$inject = ['$state'];

    /////////////////////
    function TestGridController( $state ) {

        var vm = this;

        vm.myData = [
            {
                "name": "lzy",
                "gender": "男"
            },{
                "name": "long",
                "gender": "女"
            }]


    }

}( this.angular ));

