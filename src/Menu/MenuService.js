var express = require('express')();
var menus = require('../../data/menu');
var bodyParser = require('body-parser');

// parse application/json
express.use(bodyParser.json());
express.use(bodyParser.urlencoded({
    extended: true
}));

// Get All Category
exports.getAllCategory = function (req, res) {
    // var category = ['ต้ม', 'ผัด', 'แกง', 'ทอด'];

    res.send('ต้ม ผัด แกง ทอด');
};

//Get Menu By Category
exports.getMenuByCategory = function (req, res) {
    var response = [];

    for (var i = 0; i < menus.length; i++) {
        if (menus[i].category == req.params.category){
            response.push(menus[i]);
        }
    }
    res.send(response)
};