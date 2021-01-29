package List;

public class LinkedList {

    /**
     * 链表的节点
     */
    public class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        public ListNode getNext() {
            return this.next;
        }
    }

    /**
     * 计算链表的长度
     * @param headNode
     * @return
     */
    int listLength(ListNode headNode){
        int length=0;
        ListNode currentNode=headNode;
        while(currentNode!=null){
            length++;
            currentNode=currentNode.getNext();
        }
        return length;
    }

    /**
     * 插入操作
     * @param headNode
     * @param insertNode
     * @param position
     * @return
     */
    ListNode insertLinkedList(ListNode headNode,ListNode insertNode,int position){
        if(headNode==null){return insertNode;}
        int size=listLength(headNode);
        if(position>size+1||position<1){
            System.out.println("待插入结点位置无效，有效的插入位置为1到"+(size+1));
            return headNode;
        }
        if(position==1){//在表开头插入
            insertNode.setNext(headNode);
            return insertNode;
        }else{//在表中间或末尾插入
            ListNode previousNode=headNode;
            int count=1;
            while(count<position-1){
                previousNode=previousNode.getNext();
                count++;
            }
            ListNode currentNode=previousNode.getNext();
            insertNode.setNext(currentNode);
            previousNode.setNext(insertNode);
        }
        return headNode;
    }

    /**
     * 删除链表节点
     * @param headNode
     * @param position
     * @return
     */
    ListNode deleteNodeFromLinkedList(ListNode headNode,int position){
        int size=listLength(headNode);
        if(position>size||position<1){
            System.out.println("待结点结点位置无效，有效的删除位置为1到"+(size));
            return headNode;
        }
        if(position==1){//删除单向链表的表头结点
            ListNode currentNode=headNode.getNext();
            headNode=null;
            return currentNode;
        }else{//删除中间或表尾结点
            ListNode previousNode=headNode;
            int count=1;
            while(count<position){
                previousNode=previousNode.getNext();
                count++;
            }
            ListNode currentNode=previousNode.getNext();
            previousNode.setNext(currentNode.getNext());
            currentNode=null;;
        }
        return headNode;
    }

    /**
     * 删除链表
     * @param headNode
     */
    void deleteLinkedList(ListNode headNode){
        ListNode auxilaryNode,iterator=headNode;
        while(iterator!=null){
            auxilaryNode=iterator.getNext();
            iterator=null;//在Java中，垃圾回收器将自动处理
            iterator=auxilaryNode;//在实际应用中，不需要实现该内容
        }
    }

}

