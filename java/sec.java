class sec{

    public static void main(String argument[ ]){

    int sum=0;
 
    for (int x1=0; x1<=6; x1++)
       for (int x2=2; x2<=3; x2++)
         for (int x3=0; x3<=6; x3++)
           for (int x4=0; x4<=6; x4++)
             for (int x5=0; x5<=6; x5++)
               {
               if (x1+x2+x3+x4+x5==6)
                 sum=sum+1;
                }
     System.out.println("There are " + sum+ " such numbers.");
  }
}