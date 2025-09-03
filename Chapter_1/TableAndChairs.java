public class TableAndChairs {

    public static void main(String[] args) {
        String[] pattern = {
                "X                      X",
                "X                      X",
                "X      XXXXXXXXXX      X",
                "XXXXX  X        X  XXXXX",
                "X   X  X        X  X   X",
                "X   X  X        X  X   X"
        };

        for (int i = 0; i < pattern.length; i++) {
            System.out.println(pattern[i]);
        }
    }
}