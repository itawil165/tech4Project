package whiteboard_mock3;

public class _43_Remove_Extra_Spaces_In_A_String {

    public static String removeExtraSpace (String sentence) {

        return sentence.trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {

        System.out.println(removeExtraSpace("     Java     is     fun     "));
    }
}
