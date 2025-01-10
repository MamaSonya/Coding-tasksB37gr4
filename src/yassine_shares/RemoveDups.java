package yassine_shares;

/*

    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
*/

//Vira is volunteer*/

public class RemoveDups {



    public static String removedups(String st) {

        StringBuilder refinedString = new StringBuilder();

        for (char c : st.toCharArray()) {

            if (refinedString.indexOf(String.valueOf(c)) == -1) {
                refinedString.append(c);
            }
        }
        return refinedString.toString();
    }

    public static void main(String[] args) {
        System.out.println(removedups("AABBCCDD"));
    }
}
