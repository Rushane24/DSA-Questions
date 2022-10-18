package POD_Qs;

public class pangram {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        int [] freq = new int[26];
        
        //Loop iterate over all the characters
        for(int i=0;i<26;i++){
            freq[i]=0;
        }//Initially all the indexes of character is marked with 0.
        
        //Loop Iterate over the String 
        for(int i=0;i<n;i++){
            if(sentence.charAt(i)!=' '){
                //subtract 'a' from the character at the specified index and increment the frequency by 1.
                //This means the character is marked.
                freq[sentence.charAt(i)-'a']++;
            }
        }
        
        int temp=0;
        for(int i=0;i<26;i++){
            if(freq[i]==0){ //If frequence is 0, it means the character is unmarked.
                temp=1;
                break;
            }
        }
        if(temp==1) return false;
        else return true;
        
    }
}
