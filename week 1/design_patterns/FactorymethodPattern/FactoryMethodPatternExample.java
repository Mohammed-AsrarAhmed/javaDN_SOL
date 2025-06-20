public class FactoryMethodPatternExample {
       public static void main(String[] args) {
           documentfactory ref=new documentfactory();
           document obj=ref.getinstance("pdf");
           obj.createdocument();
       }            
}


interface document {
                  void createdocument() ;
}

class wordDocument implements document{
public void createdocument () {
System.out.println("word document created");
}
}

class pdfDocument implements document{
public void createdocument () {
System.out.println("pdf document created");
}
}
class excelDocument implements document{
public void createdocument () {
System.out.println("excel document created");
}
}


class documentfactory {
                   public document getinstance(String str) {
                                      if (str.equals("word")) {
                                                         return new wordDocument();
                                      }
                                      else if (str.equals("excel")) {
                                                         return new excelDocument();
                                      }
                                      else 
                                      return new pdfDocument();

                   }
}
