package maxima.homework20221106.firstpackage;

import javax.print.Doc;
import java.net.StandardSocketOptions;

public class Document {

    public Document(){
        name = "";
        path = "";
    }

    public Document(String _name, String _path){
        name = _name;
        path = _path;
    }

    public String toString(){
        return path + "+" + name;
    }

    public void companyVerification(){
        // TODO: Add some logic
        System.out.println("Document::companyVerification");
    }

    public void companyVerification(String verificationPattern){
        // TODO: Add some logic
        System.out.println("Document::companyVerification" + verificationPattern);
    }

    protected String name;
    protected String path;
}
