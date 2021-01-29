package List;

public class DLLList {

    public class DLLNode{
        private int data;
        private DLLNode next;
        private DLLNode previous;
        public DLLNode(int data){this.data=data;}
        public void setData(int data){this.data=data;}
        public int getData(){return data;}
        public void setNext(DLLNode next){this.next=next;}
        public DLLNode getNext(){return this.next;}
        public void setPrevious(DLLNode previous){this.previous=previous;}
        public DLLNode getPrevious(){return this.previous;}
    }

    int getDLLLength(DLLNode headNode){
        return 0;
    }

    DLLNode insertLinkedList(DLLNode headNode,DLLNode insertNode,int position){
        if(headNode==null){return insertNode;}
        int size=getDLLLength(headNode);
        if(position>size+1||position<1){
            System.out.println("待插入结点位置无效，有效的插入位置为1到"+(size+1));
            return headNode;
        }
        if(position==1){//在表开头插入
            insertNode.setNext(headNode);
            return insertNode;
        }else{//在表中间或末尾插入
            DLLNode previousNode=headNode;
            int count=1;
            while(count<position-1){
                previousNode=previousNode.getNext();
                count++;
            }
            DLLNode currentNode=previousNode.getNext();
            insertNode.setNext(currentNode);
            if(currentNode!=null){currentNode.setPrevious(insertNode);}
            previousNode.setNext(insertNode);
            insertNode.setPrevious(previousNode);
        }
        return headNode;
    }

    DLLNode deleteNodeFromLinkedList(DLLNode headNode,int position){
        int size=getDLLLength(headNode);
        if(position>size||position<1){
            System.out.println("待结点结点位置无效，有效的删除位置为1到"+(size));
            return headNode;
        }
        if(position==1){//删除单向链表的表头结点
            DLLNode currentNode=headNode.getNext();
            headNode=null;
            currentNode.setPrevious(null);
            return currentNode;
        }else{//删除中间或表尾结点
            DLLNode previousNode=headNode;
            int count=1;
            while(count<position-1){
                previousNode=previousNode.getNext();
                count++;
            }
            DLLNode currentNode=previousNode.getNext();
            DLLNode laterNode=currentNode.getNext();
            previousNode.setNext(laterNode);
            if(laterNode!=null){laterNode.setPrevious(previousNode);}
            currentNode=null;;
        }
        return headNode;
    }
}
