package whiteboard_mock3;

public class _06_Remove_Spaces_From_String {

    public static String noSpaces (String str) {

        return str.replaceAll("[ ]", "");
    }

    public static void main(String[] args) {
        System.out.println(noSpaces("Java is fun"));
    }
}