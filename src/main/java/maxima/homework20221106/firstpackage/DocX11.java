package maxima.homework20221106.firstpackage;

public class DocX11 extends DocX{
    public DocX11(){
        super();
    }

    public DocX11(String _name, String _path){
        super(_name, _path);
    }

    @Override
    public void companyVerification() {
        System.out.println("       DocX11::DocX new verification");
        //super.companyVerification();
    }

    @Override
    public int hashCode() {
        return (super.hashCode() + 12345);
    }

    public void companyVerificationByType(int verificationType){
        // TODO something
    }
}
