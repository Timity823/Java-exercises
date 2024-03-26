package myownlinkedlist;

public class MyOwnLinkedList {
    private LinkNode firstLink;
    private LinkNode lastLink;

    public void add(int number){
        LinkNode linkNode = new LinkNode(number);
        if(firstLink==null){
            firstLink= linkNode;
            lastLink = firstLink;
        }else {
            lastLink.setNext(linkNode);
            lastLink =linkNode;
        }
    }

        public void print(){
            while (firstLink!=null){
                System.out.println(firstLink.getValue());
                firstLink=firstLink.getNext();
            }
        }

}
