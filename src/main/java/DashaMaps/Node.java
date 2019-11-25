package DashaMaps;

import java.util.LinkedList;

public class Node<K,V> {

        private String key;
        private Node prev;
        private Node next;

        public String getKey() {
                return key;
        }

        public void setKey(String key) {
                this.key = key;
        }

        public Node getPrev() {
                return prev;
        }

        public void setPrev(Node prev) {
                this.prev = prev;
        }

        public Node getNext() {
                return next;
        }

        public void setNext(Node next) {
                this.next = next;
        }
}
