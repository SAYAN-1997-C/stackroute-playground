function findPercent(score,subjectcount) 
{

        if (score<0)
        return -1;
    
        else

        return score/subjectcount;


}

let ans=findPercent(580,6)
console.log("Percentage is " + ans)