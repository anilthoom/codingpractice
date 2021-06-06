var app = require('express')();
var http = require('http').Server(app);
var io = require('socket.io')(http);

app.get('/', function(req, res){
    res.sendfile('index.html');
});

io.on('connection', function(socket){
    console.log('User connected');

    socket.on('disconnect', function(){
        console.log('User disconnected');
    });
});

http.listen(3000, function(){
    console.log('Listening..');
});