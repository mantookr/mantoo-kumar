const path=require('path');
const publicPath=path.join(__dirname + '/../public')
const express=require('express');
var app=express();
app.use(express.static(publicPath))
//console.log(__dirname + '/../public');
app.listen(3000,()=>{
    console.log("server is up on port 3000");
})
