"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var CricketCoach_1 = require("./CricketCoach");
var GolfCoach_1 = require("./GolfCoach");
var cricketPracticeTip = new CricketCoach_1.CricketCoach();
var golfPracticeTip = new GolfCoach_1.GolfCoach();
var coachingTips = [];
coachingTips.push(cricketPracticeTip);
coachingTips.push(golfPracticeTip);
coachingTips.forEach(function (tip) {
    console.log(tip.getDailyWorkout());
});
