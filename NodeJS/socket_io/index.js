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
    socket.emit('newclientconnect', {description: 'Hello Welcome!'});
    socket.broadcast.emit('newclientconnect', {description: clients + ' clients connected!'});

    //io.sockets.emit('broadcast',{description: clients + ' clients connected!'})
    /*setTimeout(function(){
        //socket.send('Welcome bro!!!');
        socket.emit('customEvent', {description: 'This is a custom event'});
    }, 4000);*/

    socket.on('disconnect', function(){
        clients--;
        //io.sockets.emit('broadcast', {description: clients + 'clients connected!'});
        socket.broadcast.emit('newclientconnect', {description: clients + ' clients connected!'});
    });
});

http.listen(3000, function(){
    console.log('Listening..');
});