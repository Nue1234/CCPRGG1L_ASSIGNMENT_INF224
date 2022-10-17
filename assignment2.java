public class App {
    public static void main(String[] args) throws Exception {
       firstwhileloop();

       seconddowhileloop();

       thirdforloop();

       fourthchararrayforloop();

       fifthreverseforloopchararray();
       
    }

    // 1.) Use a while loop to print your FIRSTNAME three times.    
        public static void firstwhileloop(){
            int a = 1;

        while(a < 4) {
            System.out.println(a + ".) Sean");
            a++;

        }
        }


    // 2.) Use a do-while loop to print your MIDDLENAME four times.
        public static void seconddowhileloop(){
            int a = 1, b = 4;
        
        do {
            System.out.println(a + ".) Vidal");
            a++;

        } while(a <= b);
    }


    // 3.) Use a for loop to print your SURNAME five times.
        public static void thirdforloop(){
            
        
            for(int a = 1; a < 6; a++){
                System.out.println(a + ".) Gumarao");

            }

        }

        
    // 4.) Create a char array that consists all of the characters of your FIRSTNAME and use a for loop to print each character of your FIRSTNAME.
        public static void fourthchararrayforloop(){

            char[] fn = {'S', 'E', 'A', 'N'};
            for (int x = 0; x < fn.length; x++) {
                System.out.print(fn[x]);
            }
            System.out.println();
        }

    // 5.) Use a for loop to print char array of your FIRSTNAME in REVERSE order.
        public static void fifthreverseforloopchararray(){
    char[] rfn = {'S', 'E', 'A', 'N'};

    for (int x = rfn.length - 1; x >= 0; x--) {
        System.out.print(rfn[x]);
        }
    }
}
