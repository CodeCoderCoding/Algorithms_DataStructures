package List;

public class CircularList {

    public class CLLNode {
        private int data;
        private CLLNode next;

        public CLLNode(int data) {
            this.data = data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setNext(CLLNode next) {
            this.next = next;
        }

        public CLLNode getNext() {
            return this.next;
        }
    }

    int CircularListLength(CLLNode headNode){
        int length=0;
        CLLNode currentNode=headNode;
        while(currentNode!=null){
            length++;
            currentNode=currentNode.getNext();
            if(currentNode==headNode){
                break;
            }
        }
        return length;
    }

    void PrintCircularListData(CLLNode headNode){
        CLLNode CLLNode=headNode;
        while(CLLNode!=null){
            System.out.print(CLLNode.getData()+"->");
            CLLNode=CLLNode.getNext();
            if(CLLNode==headNode){
                break;
            }
        }
        System.out.println("("+CLLNode.getData()+")headNode");
    }

    void InsertAtEndInCLL(CLLNode headNode, CLLNode nodeToInsert){
        CLLNode currentNode=headNode;
        while(currentNode.getNext()!=headNode){
            currentNode.setNext(currentNode.getNext());
        }
        nodeToInsert.setNext(nodeToInsert);
        if(headNode==null){
            headNode=nodeToInsert;
        }else{
            nodeToInsert.setNext(headNode);
            currentNode.setNext(nodeToInsert);
        }
    }

    void InsertAtBeginInCLL(CLLNode headNode, CLLNode nodeToInsert){
        CLLNode currentNode=headNode;
        while(currentNode.getNext()!=headNode){
            currentNode.setNext(currentNode.getNext());
        }
        nodeToInsert.setNext(nodeToInsert);
        if(headNode==null){
            headNode=nodeToInsert;
        }else{
            nodeToInsert.setNext(headNode);
            currentNode.setNext(nodeToInsert);
            headNode=nodeToInsert;
        }
    }

    void DeleteLastNodeFromCLL(CLLNode headNode){
        CLLNode temp=headNode;
        CLLNode currentNode=headNode;
        if(temp==null){
            System.out.println("List Empty");
            return;
        }
        while(currentNode.getNext()!=headNode){
            temp=currentNode;
            currentNode=currentNode.getNext();
        }
        temp.setNext(headNode);
        currentNode=null;
        return;
    }

    void DeleteFrontNodeFromCLL(CLLNode headNode){
        CLLNode temp=headNode;
        CLLNode currentNode=headNode;
        if(temp==null){
            System.out.println("List Empty");
            return;
        }
        while(currentNode.getNext()!=headNode){
            currentNode.setNext(currentNode.getNext());
        }
        while(currentNode.getNext()!=headNode){
            currentNode.setNext(currentNode.getNext());
        }
        currentNode.setNext(headNode.getNext());
        headNode=headNode.getNext();
        temp=null;
        return;
    }
}
