public String alarmClock(int day, boolean vacation) {
  if (vacation)
  {
    if (day == 0 || day == 6)
    {
      return ("off");
    }
    else
    {
      return ("10:00");
    }
  }
  if (day == 0 || day == 6)
  {
    return ("10:00");
  }
  return ("7:00");
}


public boolean in1To10(int n, boolean outsideMode) {
  if (outsideMode)
  {
    if (n>= 10 || n<=1)
    {
      return true;
    }
    else
    {
      return false;
    }
}
  if (n >= 1 && n<= 10)
    {
      return true;
    }
    return false;
}


public boolean old35(int n) {
  if (n%5 ==0 && n%3 ==0)
  {
    return false;
  }
  if (n%5 ==0  || n%3 ==0)
  {
    return true;
  }
  return false;
}
