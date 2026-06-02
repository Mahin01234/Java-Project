import java.util.Scanner  ;





public class Random_Number 



{



    public static void main(String[] args) 
    
    
    {




        Scanner sc = new Scanner(System.in) ;



        int myNumber = (int)(Math.random() * 100) + 1 ;



        int userNumber = 0;




        do 
        
        {



            System.out.print("Enter the Guess Number (1 to 100): ") ;


            userNumber = sc.nextInt() ;



            if (userNumber == myNumber) 
            {

                System.out.println("WOOHOO! CORRECT NUMBER") ;
                break ; 


            }
            
            
            
            else if (userNumber > myNumber) 
            {

                System.out.println("Your number is too large") ;

            }
            
            
            
            else 
            {

                System.out.println("Your number is too small")  ;
            }

        } 
        
        
        
        while (true) ;





        System.out.println("My number is: " + myNumber)  ;





        sc.close() ;


        
    }

    
}
