//rotateLeft3
public int[] rotateLeft3(int[] nums) {
  int temp = nums[0];
  int temp2 = nums[1];
  nums[1] = nums[2];
  nums[0] = temp2;
  nums[2] = temp;
  return nums;
}
//reverse3
public int[] reverse3(int[] nums) {
  int temp = nums[2];
  nums[2] = nums[0];
  nums[0] = temp;
  return nums;
  
}

//maxEnd3
public int[] maxEnd3(int[] nums) {
  if (nums[2] > nums[0])
  {
    nums[1] = nums[2];
    nums[0] = nums[2];
  }
  else
  {
    nums[1] = nums[0];
    nums[2] = nums[0];
  }
  return nums;
}

//sum2
public int sum2(int[] nums) {
  int sum = 0;
  if (nums.length >= 2)
  {
    sum = nums[0] + nums[1];
  }
  else if (nums.length == 1)
  {
    sum = nums[0];
  }
  else
  {
    return 0;
  }
  return sum;
}

//middleway
public int[] middleWay(int[] a, int[] b) {
  int[] Idislikecodingbat = {a[1], b[1]};
  return Idislikecodingbat;

}

//makeEnds
public int[] makeEnds(int[] nums) {
  int[] ends = {nums[0], nums[nums.length-1]};
  return ends;
}

