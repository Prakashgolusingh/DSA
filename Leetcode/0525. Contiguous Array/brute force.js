/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {
    let z = 0;
    let o = 0;
    for(let i of nums)
    {
        if(i == 0)
            z++;
        else
            o++;
    }
    if(z == o)
        return z+o;
    let rz = z;
    let ro = o;
    for(let i=nums.length-1; i>=0; i--)
    {
        if(nums[i] ==0)
            rz--;
        else
            ro--;
        z = rz;
        o = ro;
        if(o ==z)
            return o+z;
        //console.log(`${z} ${o}`);
        for(let j=i; j<nums.length; j++)
        {
            if(nums[j]==0)
                z++;
            else
                o++;
            if(nums[j-i] == 0)
                z--;
            else
                o--;
            if(z==o)
                return z+o;
            //console.log(`${z} ${o}`);
        }
    }
    return z+o;
};
