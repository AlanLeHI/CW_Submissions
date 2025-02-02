//has23
public boolean has23(int[] nums) {
  if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3)
  {
    return true;
  }
  return false;
}

//no23
public boolean no23(int[] nums) {
  if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3)
  {
    return false;
  }
  return true;
}

//makeLast
public int[] makeLast(int[] nums) {
  int[] copyArr = new int[nums.length];
  int[] intArr = new int[nums.length * 2];
  intArr[intArr.length - 1] = nums[nums.length - 1];
  return intArr;
}

//double23
public boolean double23(int[] nums) {
  int[] copyArr = new int[nums.length];
  for (int i = 0; i < nums.length; i++)
  {
    copyArr[i] = nums[i];
  }
  int count2 = 0;
  int count3 = 0;
  for (int i = 0; i <nums.length ; i++)
  {
    if (copyArr[0] == 2 || copyArr[0] == 3 || copyArr[1] == 2 || copyArr[1] == 3)
  {
    if (copyArr[i] == 2)
    {
      count2++;
    }
    if (copyArr[i] == 3)
    {
      count3++;
    }
    if (count2 == 2 || count3 ==2)
    {
      return true;
    }
  }
  }
  return false;
}

//fix23
public int[] fix23(int[] nums) {
  int[] copyArr = new int[nums.length];
  String test = "hi";
  for (int i = 0; i < nums.length; i++)
  {
    test += nums[i];
    copyArr[i] = nums[i];
  }
  if (test.indexOf("23") > -1)
  {
    copyArr[test.indexOf("23") - 1] = 0;
  }
  return copyArr;
}

