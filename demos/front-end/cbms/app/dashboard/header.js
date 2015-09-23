/*
 * header viewmodel associated with the header.html view
 * at the top of the shell.
 * It displays navigation among the main app 'pages'
 */

(function(angular) {
    'use strict';

    angular.module( "app" ).controller( 'header', ['$location', controller]);

    function controller( $location ) {

        var headerStates = [
            { label: 'Home',     link: 'dashboard.home',  children: [
                { label: 'Home.children1', link: 'dashboard.home',children:[
                    {label: 'Home.children1.children', link: 'dashboard.home'}]
                },
                { label: 'Home.children', link: 'dashboard.content'}]
            },
            { label: 'Content',  link: 'dashboard.content'}

        ];



        var vm = this;
            vm.homeSref     = 'dashboard.home';
            vm.isSelected   = isSelected;
            vm.states       = headerStates;
            vm.selectState = selectState;
        function isSelected( state ){
            //var path = $location.path().toLowerCase() || '/home';
            //var roots = state.roots;
            //if (roots){
            //    for (var i = roots.length; i--;){
            //        if (-1 < path.indexOf(roots[i])){return true;}
            //    }
            //}
            return true;
        }
        function selectState( state ){
            console.log(state);
        }

    };

}( this.angular ));
