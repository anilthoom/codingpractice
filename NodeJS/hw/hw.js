var express = require('express');
var app = express();

app.get('/', function (req, res){
    res.send('Hi Anil Thoom');
});

app.get('/hw', function (req, res){
    res.send('Hello World');
});

app.listen(3000);