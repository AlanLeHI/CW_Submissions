//I see you're awake at 11PM too

//firstLast6
public boolean firstLast6(int[] nums) {
  int num1 = 0;
  int num2 = nums.length - 1;
  if (nums[0] == 6 || nums[num2] == 6)
  {
    return true;
  }
  return false;
}

//sameFirstLast
public boolean sameFirstLast(int[] nums) {
  if (nums.length >= 1 && (nums[0] == nums[nums.length-1]))
  {
    return true;
  }
  return false;
}

//make pi
public int[] makePi() {
  int[] pi = {3, 1, 4};
  return pi;
}

//commonEnd
public boolean commonEnd(int[] a, int[] b) {
  if ((a[0] == b[0]) || (a[a.length-1] == b[b.length-1])) 
  {
    return true;
  }
  return false;
}

//sum3
public int sum3(int[] nums) {
   int timer = nums.length-1;
   int total = 0;
   while (timer>= 0)
   {
     total += nums[timer];
     timer --;
   }
   return total;
}
