class Solution {
    
    majorityElement(a, size)
    {
        const obj = {};
        for(let i of a)
        {
            if(i in obj)
                obj[i] = obj[i]+1;
            else
                obj[i] = 1;
        }
        let s = size/2;
        for(let key in obj)
        {
            if(obj[key]>s)
                return key
        }
        //console.log(obj);
        return -1;
    }
}
