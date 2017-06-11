'use strict';

/**
 * @ngdoc overview
 * @name yapp
 * @description
 * # yapp
 *
 * Main module of the application.
 */
angular
  .module('yapp', [
    'ui.router',
    'ngAnimate'
  ])
  .config(function($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.when('/dashboard', '/dashboard/overview');
//    $urlRouterProvider.otherwise('/login');
    $urlRouterProvider.otherwise('/dashboard');

    $stateProvider
      .state('base', {
        abstract: true,
        url: '',
        templateUrl: './client/views/base.html'
      })
        .state('login', {
          url: '/login',
          parent: 'base',
          templateUrl: './client/views/login.html',
          controller: 'LoginCtrl'
        })
        .state('dashboard', {
          url: '/dashboard',
          parent: 'base',
          templateUrl: './client/views/dashboard.html',
          controller: 'DashboardCtrl'
        })
          .state('overview', {
            url: '/overview',
            parent: 'dashboard',
            templateUrl: './client/views/dashboard/overview.html'
          })
          .state('reports', {
            url: '/reports',
            parent: 'dashboard',
            templateUrl: './client/views/dashboard/reports.html'
          });

  });
