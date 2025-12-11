package Lect12;

class YouTube{
    private   String ChannelName;
    private   int    SubscriberCount;

    public YouTube(String ChannelName) {
        this.ChannelName=ChannelName;
        this.SubscriberCount=0;
    }
    public  void getName(int pin){
        if(pin==123){
            System.out.println(ChannelName);

        }


    }
    public  void getSubscriberCount(){
        System.out.println(SubscriberCount);

    }
    public void setSubscriberCount(){
        SubscriberCount++;

    }
    public void setunSubscriberCount(){
        if(SubscriberCount>0){
            SubscriberCount--;

        }else{
            System.out.println("ye sahi nhi hai ham aapko bata rhe hai..??");
        }


    }





}
class hello{
    public static void main(String[] args) {
        YouTube s1=new YouTube("globalJs");
        s1.getSubscriberCount();
        s1.setSubscriberCount();
        s1.setSubscriberCount();
        s1.setSubscriberCount();
        s1.setSubscriberCount();
        s1.getSubscriberCount();
        s1.setunSubscriberCount();
        s1.setunSubscriberCount();
        s1.getSubscriberCount();



    }
}