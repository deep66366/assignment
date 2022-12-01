class myclass extends Thread
{
 int n, t;
 char c;
 myclass(char x, int y, int z)
 {
  c=x;
  n=y;
  t=z;
 }
 public void run()
 {
  for(int i=0; i<n; i++)
  {
   System.out.println(Thread.currentThread().getName() + ": " + c);
   try
   {
    sleep(t);
   }
   catch(InterruptedException e){}
  }
 }
}
class mythread
{
 public static void main(String args[])
 {
  myclass t1=new myclass('A',10,2000);
  myclass t2=new myclass('B',20,1000);
  t1.start();
  t2.start();
 }
}