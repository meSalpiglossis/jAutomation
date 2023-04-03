package src.main.java.maxima.homework20221106.firstpackage;

public class DocX10 extends DocX{
    public DocX10(){
        super();
    }

    public DocX10(String _name, String _path){
        super(_name, _path);
    }

    @Override
    public void companyVerification() {
        System.out.println("       DocX10::DocX");
        super.companyVerification();
    }
}
