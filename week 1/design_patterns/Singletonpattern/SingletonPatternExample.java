class SingletonPatternExample {
                   public static void main (String args[]) {
                                      Logger obj=Logger.getinstance();
                                      Logger obj1=Logger.getinstance();
                                      if (obj==obj1)
                                      System.out.println("singleton pattern implemented");
                                      else 
                                      System.out.println("singleton isnt implemented");

                   }
}
class Logger {
                   static Logger l=new Logger();
                   private Logger(){

                   }
                   public static Logger getinstance() {
                                      return l;
                   }
}

