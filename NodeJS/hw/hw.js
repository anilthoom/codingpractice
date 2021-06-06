var express = require('express');
var app = express();
var things = require('./things.js');

//Middleware function
app.use('/things',function(req, res, next){
    console.log('New request recieved at '+ Date.now());
    next();
});

app.use('/things', things);

app.get('/:id', function(req, res){
    res.send('The id is '+req.params.id);
});

app.listen(3000);