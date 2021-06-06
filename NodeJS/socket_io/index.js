var app = require('express')();
var http = require('http').Server(app);
var io = require('socket.io')(http);

app.get('/', function(req, res){
    //res.sendfile('index.html');
    res.sendFile('index.html', {root: __dirname});
});

var roomno = 1;
io.on('connection', function(socket){
    if(io.nsps['/'].adapter.rooms["room-"+roomno] && io.nsps['/'].adapter.rooms["room-"+roomno].length > 1) roomno++;
    socket.join("room-"+roomno);

    io.sockets.in("room-"+roomno).emit('connectToRoom', "You are in room no. "+roomno);
});

http.listen(3000, function(){
    console.log('Listening..');
});