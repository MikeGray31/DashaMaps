package DashaMaps;

public class DashaMap {

    Node[] nodes;
    long[] sizes;
    String[] beginningLetters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};


    public DashaMap(){
        nodes = new Node[26];
        sizes = new long[26];
        for(int i = 0; i < beginningLetters.length; i++){
            nodes[i] = new Node(beginningLetters[i], null);
            nodes[i].setThisIsFirst(true);
            nodes[i].setLastNode(nodes[i]);
            sizes[i] = 0;
        }
    }

    public Integer findBucketIndex(String input){
        for(int i = 0; i < beginningLetters.length; i++){
            if(beginningLetters[i].equals(String.valueOf(input.charAt(0)))){
                return i;
            }
        }
        return null;
    }

    public Node findNode(String key, String input){
        int i = findBucketIndex(input);
        Node currentNode = this.nodes[i];
        while(currentNode.hasNext()){
            if(currentNode.getKey().equals(key)){
                return currentNode;
            }
        }
        return null;
    }

    public void performSet(String key, Integer value, String input) {
        int i = findBucketIndex(input);
        Node currentNode = this.nodes[i];
        while(currentNode.hasNext()){
            currentNode = currentNode.getNext();
            if(currentNode.getKey().equals(key)){
                currentNode.setValue(value);
                return;
            }
        }
        Node newNode = new Node(key, value);
        addNodeToBucket(i, newNode);
    }

    public void addNodeToBucket(int bucketIndex, Node newNode){
        Node lastNode = nodes[bucketIndex].getLastNode();
        nodes[bucketIndex].setLastNode(newNode);
        sizes[bucketIndex]++;
        newNode.setThisIsLast(true);
        lastNode.setThisIsLast(false);
        newNode.setPrev(lastNode);
        lastNode.setNext(newNode);
    }

    public String performDelete(String key, String input) {
        Node deleteThis = findNode(key, input);
        if (deleteThis.getThisIsFirst() == null){
            return null;
        }
        else if(deleteThis.getThisIsLast()){
            nodes[findBucketIndex(input)].setLastNode(deleteThis.getPrev());
            deleteThis.getPrev().setThisIsLast(true);
            deleteThis.getPrev().setNext(null);
            sizes[findBucketIndex(input)]--;

        }
        else{
            deleteThis.getPrev().setNext(deleteThis.getNext());
            deleteThis.getNext().setPrev(deleteThis.getPrev());
        }
        return null;
    }

    public Integer performGet(String key, String input) {
        return findNode(key, input).getValue();
    }

    public boolean isThisEmpty() {
        for(long l : this.sizes){
            if(l != 0){
                return false;
            }
        }
        return true;
    }

    public long getSize() {
        long size = 0;
        for(long l : sizes){
            size += l;
        }
        return size;
    }

    public long getBucketSize(String input) {
        return sizes[findBucketIndex(input)];
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i =0; i < nodes.length; i++) {
            Node node = nodes[i];
            output.append(beginningLetters[i] + ":\n");
            while(node.hasNext()){
                node = node.getNext();
                output.append("   " + node.getKey() + " : " + node.getValue() + "\n");
            }
        }
        return output.toString();
    }
}
