package school.cesar.eta.unit;

public class MyApplication {
    private MessageService service = new MessageService();

    public void setService(MessageService svc){
        this.service = svc;
    }

    public boolean processMessage(String msg, String rec){
        return service.send(msg, rec);
    }
}