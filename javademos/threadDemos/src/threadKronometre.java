public class threadKronometre implements Runnable{
   private Thread T;
   private String ThreadName;

   public threadKronometre(String Threadname){
       this.ThreadName=Threadname;
       System.out.println("Olusturuluyor: "+Threadname);
   }
    @Override
    public void run() {
      System.out.println("Calistiriliyor: "+ThreadName);

          try {
              for (int i = 1; i < 11; i++) {
                  System.out.println(ThreadName + " i");
                  Thread.sleep(1000); //yaz ve 1000 milisaniye bekle
              }
          }catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          System.out.println("Thread sonlandı: "+ThreadName);

    }
}
