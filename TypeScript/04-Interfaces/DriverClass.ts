import { Coach } from "./Coach";
import { CricketCoach } from "./CricketCoach";
import { GolfCoach } from "./GolfCoach";

let cricketPracticeTip = new CricketCoach();
let golfPracticeTip = new GolfCoach();

let coachingTips: Coach[] = [];
coachingTips.forEach(tip => {
    console.log(tip.getDailyWorkout());
});