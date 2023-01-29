package chapter15;

public class Exercise2 {
    public static void main(String[] args) {
        String folder;
        String file;
    }

    public String concatPath(String folder, String file) {
        if(!folder.endsWith("¥¥")) {
            folder += "¥¥";
        }
        return folder + file;
    }
}
