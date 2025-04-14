import java.lang.String;

public class DeTu {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    public static void main(String[] args) {
        String str = "Toi muon hoc java tu co ban den nang cao";
        System.out.print("So tu cua chuoi da cho la: " + countWords(str));
        System.out.print("");

    }
    public static int countWords(String input){
        if(input == null){
            return -1;
        }
        int count = 0;
        int size = input.length();
        boolean notCounted = true;
        for(int i = 0; i < size; i++){
            if(input.charAt(i) != TAB && input.charAt(i) != SPACE){
                notCounted = false;
            }
        }
        if(notCounted){
            count++;
        }
        return count;
    }
}
