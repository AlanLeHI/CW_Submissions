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

//start1

public int start1(int[] a, int[] b) {
  int[] copyArr = new int[a.length];
  int[] copyArr2 = new int[b.length];
  int counter = 0;
  for (int i = 0; i < a.length; i++)
  {
    copyArr[i] = a[i];
  }
  for (int i = 0; i < b.length; i++)
  {
    copyArr2[i] = b[i];
  }
  
  if (a.length > 0 && a[0] == 1)
  {
    counter ++;
  }
  
  if (b.length > 0 && b[0] == 1)
  {
    counter ++;
  }
  return counter;
}

//biggerTwo
public int[] biggerTwo(int[] a, int[] b) {
  int[] copyArr = new int[a.length];
  int[] copyArr2 = new int[b.length];
  int sumA = 0;
  int sumB = 0;
  for (int i = 0; i < a.length; i++)
  {
    sumA += a[i];
    copyArr[i] = a[i];
  }
  for (int i = 0; i < b.length; i++)
  {
    sumB += b[i];
    copyArr2[i] = b[i];
  }
  
  if (sumA < sumB)
  {
    return b;
  }
  return a;
}

//okay this one is just makeMiddle but I misread the instructions and made an array containing all the middle elements not just the 2 in the middle
//which is arguably cooler so I'm still adding this one
public int[] makeMiddle(int[] nums) {
  int arrLength = 0;
  if (nums.length != 2)
  {
  arrLength = nums.length - 2;
  }
  else if (nums.length == 2)
  {
    return new int[]{nums[0], nums[1]};
  }
  int[] copyArr = new int[arrLength];
  for (int i = 1; i < arrLength + 1; i++)
  {
    copyArr[i - 1] = nums[i];
  }
  return copyArr;
}

//makeMiddle
public int[] makeMiddle(int[] nums) {
  int arrMiddle = (nums.length/2) - 1;
  return new int[]{nums[arrMiddle], nums[arrMiddle + 1]};
}

//plus2
public int[] plusTwo(int[] a, int[] b) {
  int[] c = new int[a.length + b.length];
  for (int i = 0; i < a.length ; i++)
  {
    c[i] = a[i];
  }
  int t = b.length;
  for (int i = a.length ; t < (a.length + b.length); i++)
  {
    c[i] = b[i - a.length];
    t++;
  }
  return c;
}

