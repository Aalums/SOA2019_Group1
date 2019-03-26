var express = require('express');
var router = express.Router();
var menuService = require('./MenuService');
var bodyParser = require('body-parser');


// parse application/json
router.use(bodyParser.json());
router.use(bodyParser.urlencoded({
    extended: true
}));

// API GET/category/
router.get('/', menuService.getAllCategory);

// API GET/category/:category
router.get('/:category', menuService.getMenuByCategory);


module.exports = router;