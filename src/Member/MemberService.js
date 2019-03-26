var express = require('express')();
var users = require('../../data/user');
var bodyParser = require('body-parser');

// parse application/json
express.use(bodyParser.json());
express.use(bodyParser.urlencoded({
    extended: true
}));

// Get All User
exports.getAllUser = function(req, res) {
    res.send(users);
};

// Get User by username
exports.getUserById = function(req, res) {
    for (var i = 0; i < users.length; i++) {
        if (users[i].username == req.params.memberId)
            res.send(users[i]);
    }
};

// Post User (Register)
exports.postUser = function(req, res) {

};