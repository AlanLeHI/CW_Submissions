//fibinacci or whatever I have no idea how mu solution worked
public int fibonacci(int n) {
  if(n == 0)
  {
    return 0;
  }
  if(n ==1)
  {
    return 1;
  }
  int x = 0;
  int y = 1;
  int fib = 0;
  for (int i = 0; i < n; i++)
  {
    fib+= x + y;
    x += fib;
  }
  return fibonacci(n-1) + fibonacci(n-2);
}
