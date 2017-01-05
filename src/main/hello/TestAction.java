import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2017/1/5.
 */
public class TestAction extends ActionSupport{

    public static final String MESSAGE = "Struts is up and running ......";

    public String execute() throws Exception {
        setMessage(MESSAGE);
        return SUCCESS;
    }

    private String message;

    public String getYes() {
        return yes;
    }

    public void setYes(String yes) {
        this.yes = yes;
    }

    private String yes;

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public String sayYes() throws  Exception{
       setYes("hello,say a word yes !");
        return  SUCCESS;
    }
}
