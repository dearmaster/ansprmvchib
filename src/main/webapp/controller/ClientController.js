RouteConfigApp.controller('ClientController', function ($scope, $http) {

    var actionUrl = 'mvc/client/load';

    $scope.orderByMe = function(x) {
        $scope.orderByKey = x;
    }

    $scope.deleteClient = function(obj) {
        var index = $scope.clients.indexOf(obj);
        $http({
            method:'post',
            url:'mvc/client/delete',
            data:obj
        }).success(function (req) {
            console.log(req);
        });
        $scope.clients.splice(index, 1);
        console.log('after delete: ' + $scope.clients.length);
        if($scope.clients.length == 0) {
            console.log('$scope.hasModels = true');
            $scope.hasModels = false;
        }
    }

    $scope.editClient = function() {
        alert('edit');
    }

    $http.get(actionUrl)
        .then(function(response) {
            if(response.data!=null && response.data.length > 0) {
                $scope.hasModels = true;
                $scope.clients = response.data;
            }
        });
});