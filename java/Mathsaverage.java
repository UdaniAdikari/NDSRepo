class Mathsaverage{     

    public static void main(String arg[])  {   

        int sum;    
        double av;
        sum=Integer.parseInt(arg[0])+Integer.parseInt(arg[1])+Integer.parseInt(arg[2]);       

        av = sum/3;           

        System.out.println("The sum of the three numbers is "+ sum + ".");   

        System.out.println("The average of the three numbers is "+ av + "."); 

    }
}