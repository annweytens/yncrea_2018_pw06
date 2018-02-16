var angularApp = angular.module('tp06', ['ui.calendar', 'ngResource']);

angularApp.factory('CalEventsWS', ['$resource', function ($resource) {
    return $resource('api/calevents/:id', null,
        {
            'update': {method: 'PUT'}
        });
}]);


