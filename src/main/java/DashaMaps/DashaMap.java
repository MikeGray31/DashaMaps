package DashaMaps;

public class DashaMap implements DashaMapX {

    Node[] nodes;

    public DashaMap(){
        nodes = new Node[26];
        String[] beginningLetters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(int i = 0; i < beginningLetters.length; i++){
            nodes[i] = new Node();
            nodes[i].setKey(beginningLetters[i]);
        }
    }

    private String HashFunctionOne(String input) {
        if (input.length() > 0) {
            return String.valueOf(input.charAt(0)).toLowerCase();
        }
        return null;
    }

//    private String HashFunctionTwo(String input) {
//        if (input.length() > 0) {
//            return "" + input.toLowerCase().charAt(1);
//        }
//        return null;
//    }
//
//    private String HashFunctionThree(String input) {
//        if (input.length() > 1) {
//            return "" + input.toLowerCase().charAt(0) + input.toLowerCase().charAt(1);
//        }
//        return null;
//    }

    @Override
    public void set(String key, String value) {

    }

    @Override
    public String delete(String key) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }
}
