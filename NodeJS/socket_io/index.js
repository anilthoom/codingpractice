var app = require('express')();
var http = require('http').Server(app);
var io = require('socket.io')(http);

app.get('/', function(req, res){
    //res.sendfile('index.html');
    res.sendFile('index.html', {root: __dirname});
});

io.on('connection', function(socket){
    console.log('User connected');

    setTimeout(function(){
        //socket.send('Welcome bro!!!');
        socket.emit('customEvent', {description: 'This is a custom event'});
    }, 4000);

    socket.on('disconnect', function(){
        console.log('User disconnected');
    });
});

http.listen(3000, function(){
    console.log('Listening..');
});