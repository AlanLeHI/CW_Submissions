public String doubleChar(String str) {
  String tempKey = "";
  for (int i = 0; i != str.length(); i++)
  {
    
    tempKey +=(str.charAt(i));
    tempKey += (str.charAt(i));
  }
  return tempKey;
}
