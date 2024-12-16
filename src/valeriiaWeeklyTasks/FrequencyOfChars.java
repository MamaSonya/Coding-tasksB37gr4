package valeriiaWeeklyTasks;

public class FrequencyOfChars {
    /*

    Write function that can find the frequency of characters

    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

*/


        public static void main(String[] args) {
            String str = "AAABBCDD";
            int[] freq = new int[str.length()];
            int i, j;

            //Converts given string into character array
            char string[] = str.toCharArray();

            for(i = 0; i <str.length(); i++) {
                freq[i] = 1;
                for(j = i+1; j <str.length(); j++) {
                    if(string[i] == string[j]) {
                        freq[i]++;

                        //Set string[j] to 0 to avoid printing visited character
                        string[j] = '0';
                    }
                }
            }

            //Displays each character and their corresponding frequency
            for(i = 0; i <freq.length; i++) {
                if(string[i] != ' ' && string[i] != '0')
                    System.out.print(string[i] + "" + freq[i]);
            }
        }
    }

