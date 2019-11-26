package DashaMaps;

import java.util.LinkedList;

public class Node {

        private String key;
        private Integer value;
        private Node prev;
        private Node next;
        private Boolean thisIsFirst;
        private Boolean thisIsLast;
        private Node lastNode;

        public Node(String key, Integer value) {
                this.key = key;
                this.value = value;
                this.thisIsFirst = false;
        }

        public Boolean hasNext(){
                return this.next != null;
        }

        public String getKey() {
                return key;
        }

        public void setKey(String key) {
                this.key = key;
        }

        public Integer getValue() {
                return value;
        }

        public void setValue(Integer value) {
                this.value = value;
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

        public Boolean getThisIsFirst() {
                return thisIsFirst;
        }

        public void setThisIsFirst(Boolean thisIsFirst) {
                this.thisIsFirst = thisIsFirst;
        }

        public Boolean getThisIsLast() {
                return thisIsLast;
        }

        public void setThisIsLast(Boolean thisIsLast) {
                this.thisIsLast = thisIsLast;
        }

        public Node getLastNode() {
                return lastNode;
        }

        public void setLastNode(Node lastNode) {
                this.lastNode = lastNode;
        }
}
