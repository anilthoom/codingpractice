var express = require('express');
var router = express.Router();

router.get('/', function(req, res){
    res.send("Get router");
});

router.post('/', function(req, res){
    res.send('Post router');
});

//export this router to use in hw.js
module.exports = router;