package List;

/**
 * 循环链表
 */
public class CircularList {

    /**
     * 循环链表的节点
     */
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

    /**
     * 计算循环链表的长度
     * @param headNode
     * @return
     */
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

    /**
     * 打印循环链表的数据
     * @param headNode
     */
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

    /**
     * 在循环链表的尾部插入节点
     * @param headNode
     * @param nodeToInsert
     */
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

    /**
     * 在循环链表的头部插入节点
     * @param headNode
     * @param nodeToInsert
     */
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

    /**
     * 在循环链表的尾部删除节点
     * @param headNode
     */
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

    /**
     * 在循环链表的头部删除节点
     * @param headNode
     */
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
