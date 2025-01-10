package MUI.sample_test.Interview;

/*
  Given a String and a character return, how many times the given character is present in that string
*/
public class CharacterCount {

    public static void main(String[] args){
        String value = "Hello world";
        char target = 'l';

        System.out.println("Character "+ target + " appears :" + getCountCharacter(value, target));

    }

    private static int getCountCharacter(String value, char target ){
        int count = 0;
        for(int i=0; i<value.length(); i++){
            if(value.charAt(i) == target)
                count++;
        }
        return count;
    }


}