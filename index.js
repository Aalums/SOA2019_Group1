var app = require('express')();
var bodyParser = require("body-parser");
var port = process.env.PORT || 8080;

// parse application/json
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({
    extended: true
}));

/* Routing */
var memberController = require("./src/Member/MemberController");
app.use("/member", memberController);

/* run port 8080 */
app.listen(port, function() {
    console.log('Starting node.js on port ' + port);
});