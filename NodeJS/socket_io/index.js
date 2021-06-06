var app = require('express')();
var http = require('http').Server(app);
var io = require('socket.io')(http);

app.get('/', function(req, res){
    //res.sendfile('index.html');
    res.sendFile('index.html', {root: __dirname});
});

var clients = 0;
io.on('connection', function(socket){
    clients++;
    console.log('User connected');

    io.sockets.emit('broadcast',{description: clients + ' clients connected!'})
    /*setTimeout(function(){
        //socket.send('Welcome bro!!!');
        socket.emit('customEvent', {description: 'This is a custom event'});
    }, 4000);*/

    socket.on('disconnect', function(){
        clients--;
        io.sockets.emit('broadcast', {description: clients + 'clients connected!'})
        console.log('User disconnected');
    });
});

http.listen(3000, function(){
    console.log('Listening..');
});