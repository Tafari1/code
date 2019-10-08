/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechallengeforloop;

/**
 *
 * @author TafAl
 */
public class CodeChallengeForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=2; i<9; i++){
           System.out.println("The amount is" + calculateInterest(10000,i));
            
        }
      for(int i=8; i>=2; i--){
            System.out.println("The amount is" + calculateInterest(10000,i));  
    }
    }
       public static double calculateInterest(double amount, double interestRate){
            return(amount * (interestRate/100));
        }
}
