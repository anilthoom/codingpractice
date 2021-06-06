var app = require('express')();
var http = require('http').Server(app);
var io = require('socket.io')(http);

app.get('/', function(req, res){
    res.sendFile('index.html', {root: __dirname});
});

users = [];
io.on('connection', function(socket){
    console.log('User connected!');
    socket.on('setUserName', function(data){
        console.log("ANIL   "+users.indexOf(data));
        if(users.indexOf(data) == -1){
            users.push(data);
            socket.emit('userSet', {username: data});
        }
        else{
            socket.emit('userExists', data + ' username is taken! Try some other name.');
        }
    })
});

http.listen(3000, function(){
    console.log('Listening on 3000');
});