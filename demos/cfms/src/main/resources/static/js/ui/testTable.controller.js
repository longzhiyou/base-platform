
(function(angular) {
    'use strict';

    angular.module("app.ui" ).controller( 'TestGridController', TestGridController);

    TestGridController.$inject = ['$rootScope','$scope','$resource'];

    /////////////////////
    function TestGridController( $rootScope,$scope,$resource ) {

        //$scope.lang = $rootScope.lang;
        var vm = this;
        vm.description='NAME';
        vm.search       = search;
        //vm.myData = [
        //    {
        //        "name": "lzy",
        //        "gender": "男"
        //    },{
        //        "name": "long",
        //        "gender": "女"
        //    }];

        //$scope.highlightFilteredHeader = function( row, rowRenderIndex, col, colRenderIndex ) {
        //    if( col.filters[0].term ){
        //        return 'header-filtered';
        //    } else {
        //        return '';
        //    }
        //};


        //var translate = "headerCellFilter: 'translate'";
        //, displayName: 'GENDER'

        //{field: 'name', displayName: '姓名',headerCellClass: $scope.highlightFilteredHeader },
        $scope.gridOptions = {
            enableFiltering: true,
            columnDefs: [
                {field: 'partyId'},
                {field: 'name'},
                {field: 'gender'},
                {field: 'height'},
                //{field: 'company', enableSorting: false  },
                {name: 'edit', displayName: '编辑', cellTemplate: '<button id="editBtn" type="button" class="btn-small" ng-click="edit(row.entity)" >Edit</button> '}
            ]
        };

        var len = $scope.gridOptions.columnDefs.length;
        for( var i=0;i<len;i++){

          var col = $scope.gridOptions.columnDefs[i];
            col.displayName = col.field;
            col.headerCellFilter ='translate';

        }



        function search(){
            var peopleResource = $resource('/party/people');
            var data = peopleResource.query();
            $scope.gridOptions.data = data;
            //vm.myData = data;
        }

    }

}( this.angular ));

