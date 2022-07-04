class Mathsbreakup {

    public static void main(String arg[]) {   

       String x="12345223";

       int y= Integer.parseInt(x);

       for (int i=1; i< x.length()+1 ; i++)

       { 

          System.out.println(" Digit  " + i + " is = " + y % 10);

          y=y/10;

       }      

   }   

}