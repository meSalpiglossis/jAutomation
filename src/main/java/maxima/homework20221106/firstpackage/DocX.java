package src.main.java.maxima.homework20221106.firstpackage;

public class DocX extends Document{

    public DocX(){
        super();
    }

    public DocX(String _name, String _path){
       super(_name, _path);
       // Some additional actions
    }

    private final String extension = "docx";

    @Override
    public void companyVerification() {
        System.out.println("   DocX::companyVerification");
        super.companyVerification();
    }

    public String toString(){
        return this.path + "+" + this.name + "+" + extension;
    }

    @Override
    public void companyVerification(String verificationPattern) {
        System.out.println("   DocX::companyVerification" + verificationPattern);
        super.companyVerification(verificationPattern);
    }
}
