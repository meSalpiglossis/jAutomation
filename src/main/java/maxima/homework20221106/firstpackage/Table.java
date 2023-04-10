package maxima.homework20221106.firstpackage;

public class Table extends Document{

    public Table(){
        super();
    }

    public Table(String _name, String _path){
        super(_name, _path);
    }

    private final String extension = "xlsx";

    @Override
    public void companyVerification() {
        super.companyVerification();
        System.out.println("   Table::companyVerification");
    }

    public String toString(){
        return super.toString() + "+" + extension;
    }

    @Override
    public void companyVerification(String verificationPattern) {
        super.companyVerification(verificationPattern);
        System.out.println("   Table::companyVerification" + verificationPattern);
    }
}
