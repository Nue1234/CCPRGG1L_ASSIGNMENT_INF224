public class Exercise {
    public static void main(String[] args) throws Exception {
  
        char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};
        
        // WORD 1
        
        System.out.println("1. WORD 1");
        // Outer loop
        for (int Row = 0; Row < 1; Row++){
            System.out.print(" ");
            // Inner loop

            for (int Column = 0; Column < 4; Column++){
                System.out.print(mdArray[Row][Column]);

            }
                
        }
        
        // WORD 2
        System.out.println("");
        System.out.println("2. WORD 2");
        for (int Row = 1; Row < 2; Row++){
            System.out.print(" ");
            // Inner loop

            for (int Column = 0; Column < 4; Column++){
                System.out.print(mdArray[Row][Column]);

            }
                
        }
        
        // WORD 3
        System.out.println("");
        System.out.println("3. WORD 3");

        for (int Row = 2; Row < 3; Row++){
            System.out.print(" ");
            // Inner loop

            for (int Column = 0; Column < 4; Column++){
                System.out.print(mdArray[Row][Column]);

            }
                
        }
        
        // WORD 4
        System.out.println("");
        System.out.println("4. WORD 4");

        for (int Row = 3; Row < 4; Row++){
            System.out.print(" ");
            // Inner loop

            for (int Column = 0; Column < 4; Column++){
                System.out.print(mdArray[Row][Column]);

            }
                
        }
        
        // WORD 5
        System.out.println("");
        System.out.println("5. WORD 5");
        for (int Row = 0; Row < 4; Row++){
            System.out.print(" ");
            // Inner loop

            for (int Column = 0; Column < 1; Column++){
                System.out.println(mdArray[Row][Column]);

            }
                
        }
      
        // WORD 6
        System.out.println("");
        System.out.println("6. WORD 6");
        for (int Row = 0; Row < 4; Row++){
            System.out.print(" ");
            // Inner loop

            for (int Column = 1; Column < 2; Column++){
                System.out.println(mdArray[Row][Column]);

            }
                
        }
        
        // WORD 7
        System.out.println("");
        System.out.println("7. WORD 7");
        for (int Row = 0; Row < 4; Row++){
            System.out.print(" ");
            // Inner loop

            for (int Column = 2; Column < 3; Column++){
                System.out.println(mdArray[Row][Column]);

            }
                
        }
        
        // WORD 8
        System.out.println("");
        System.out.println("8. WORD 8");
        
        for (int Row = 0; Row < 4; Row++){
            System.out.print(" ");
            // Inner loop

            for (int Column = 3; Column < 4; Column++){
                System.out.println(mdArray[Row][Column]);

            }
                
        }
        // WORD 9
        System.out.println("");
        System.out.println("9. WORD 9");
        for (int Row = 0; Row < mdArray.length; Row++){
            System.out.println(" ");
            for (int Column = 0; Column < mdArray.length; Column++){

            if (Row == 1 && (Column == 1 || Column == 2)){
            System.out.print(" ");
            }
            else if (Row == 2 && (Column == 1 || Column == 2)){
            System.out.print(" ");
            }
            else{
                System.out.print(mdArray[Row][Column]);
            }


            }
        }

        // WORD 10
        System.out.println("");
        System.out.println("10. WORD 10");
        for (int Row = 0; Row < mdArray.length; Row++){
            System.out.println(" ");
            for (int Column = 0; Column < mdArray.length; Column++){

            if (Row == 0 && (Column == 1 || Column == 2)){
            System.out.print(" ");
            }
            else if (Row == 1 && (Column == 0 || Column == 3)){
            System.out.print(" ");
            }
            else if (Row == 3 && (Column == 1 || Column == 2)){
                System.out.print(" ");
            }
            else if (Row == 2 && (Column == 0 || Column == 3)){
                System.out.print(" ");
            }    
            else{
                System.out.print(mdArray[Row][Column]);
            }


            }
        }




    }
}
    
  
  
