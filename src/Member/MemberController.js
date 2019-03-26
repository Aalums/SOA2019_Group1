var express = require('express');
var router = express.Router();
var memberService = require('./MemberService');
var bodyParser = require('body-parser');

// parse application/json
router.use(bodyParser.json());
router.use(bodyParser.urlencoded({
    extended: true
}));

// API GET/member/
router.get('/', memberService.getAllUser);

// API GET/member/:memberId
router.get('/:memberId', memberService.getUserById);

// API POST/member/register
router.post('/register', memberService.postUser);

module.exports = router;