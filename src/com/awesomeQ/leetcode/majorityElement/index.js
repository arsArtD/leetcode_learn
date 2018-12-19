/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    
    var major=nums[0], count = 1;
    var num_length = nums.length;
    for(var i=1; i<num_length;i++){
        if(count==0){
            count++;
            major=nums[i];
        }else if(major==nums[i]){
            count++;
        }else count--;
        console.log(nums[i]+'========='+count);
        if (count > num_length -i -1) return nums[i]
    }
    return major;


};


var major = majorityElement([1,2,1,2,2,3,1,2,2]);
console.log('major is.....' + major);