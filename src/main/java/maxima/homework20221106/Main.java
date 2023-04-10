package maxima.homework20221106;

import maxima.homework20221106.firstpackage.*;

import java.io.FileNotFoundException;

public class Main {

    private static Shape[] generateShapes(){
        Shape[] shapes = new Shape[15];

        // Initialization
        for(int i = 0; i < shapes.length / 3; ++i){
            shapes[i] = new Cicle(5 + i);
        } // 1-5

        for(int i = shapes.length / 3; i < (2 * shapes.length / 3); ++i){
            shapes[i] = new Square(10 + i);
        } // 5-10

        for(int i = (2 * shapes.length / 3); i < (3 * shapes.length / 3); ++i){
            shapes[i] = new Rectangle(5 + i, 15 + i);
        } // 10 - 15

        // TODO: Add 2 new Shapes

        return shapes;
    }

    private void complicatedMethod()
    {
        try{
            // TODO: add source code

        }
        // TODO: Add specific Exception types
        catch(Exception ex){
            System.out.println("Some exception");
        }
    }

    public static void main(String[] args){

        try {

            {
                NoStateClass noStateObj = new NoStateClass();
                if (noStateObj.doSomething1()) {
                    if (noStateObj.doSomething2()) {
                        noStateObj.doSomething3();
                    }
                }
            }

            {
                if (StaticClass.doSomething1()) {
                    if (StaticClass.doSomething2()) {
                        StaticClass.doSomething3();
                    }
                }
            }

            StaticClass.checkFile("Tralala");
        }
        catch(FileNotFoundException ex){
            System.out.println(ex);
        }
        catch(Exception ex){
            System.out.println(ex);
        }

        /*
        Scanner scanner = new Scanner(System.in);
        String enteredString = scanner.nextLine();
        System.out.println(enteredString);
        */

        /*
        int[] intArray = new int[10];
        String[] stringArray = new String[10];
        FirstClass[] fcArray = new FirstClass[10];
        Shape[] shapes = new Shape[10];

        // Read \ Write
        for(int i=0; i<fcArray.length; ++i){
            FirstClass ret = fcArray[i];
            String asString = fcArray[i].toString();
            fcArray[i].setName("New Default name");
        }

        // Read only
        for(FirstClass fc: fcArray){
            fc.setName("New Default name");
        }
        */

        /*
        // Calculation
        double cumulativeArea = 0;
        for(Shape shape: generateShapes()){
            cumulativeArea += shape.getArea();
        }
        System.out.println(cumulativeArea);

         */

        Document[] documents = new Document[10];

        try {
            //documents[5].companyVerification();


            documents[15].companyVerification();
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        catch(Exception ex){
            System.out.println("We have caught undefined exception!");
        }

        documents[0] = new DocX("name 1", "c:");
        documents[1] = new Table("name 2", "c:");
        documents[2] = new DocX("name 3", "d:");
        documents[3] = new Table("name 4", "d:");
        documents[4] = new Table("name 5", "d:");
        documents[5] = new DocX10("name 6", "f:");
        documents[6] = new DocX11("name 7", "f:");
        documents[7] = new DocX10("name 8", "f:");
        documents[8] = new DocX11("name 9", "f:");
        documents[9] = new DocX10("name 10", "f:");

        for(Document document: documents){
            System.out.print(document.toString());
            System.out.println();

            System.out.println(document.hashCode()); // 12345

            document.companyVerification();
            document.companyVerification("New verification pattern");

            //document.companyVerification(123);
        }
        /*
        Shape[] shapes = generateShapes();
        for(int i = 0; i< shapes.length; ++i){
            Shape shape = shapes[i];
            shape.getArea();
            cumulativeArea += shapes[i].getArea();
        }
         */

        ThirdClass thirdClass = new ThirdClass();
        FirstClass firstClassObj = new FirstClass();

        double calculationResult = firstClassObj.someCalculation();
        System.out.println(calculationResult);

        calculationResult = firstClassObj.someCalculation(5);
        System.out.println(calculationResult);

        String myFistObjString = firstClassObj.toString();
        System.out.println(myFistObjString);

        FirstClass firstClassObj02 = new FirstClass("New user name");
        System.out.print(firstClassObj02);
        System.out.println();

        calculationResult = firstClassObj02.simpleCalculation(1.1, 2.2);
        System.out.print(calculationResult);
        System.out.println();

        calculationResult = FirstClass.simpleCalculation(1.1, 2.2);
        System.out.print(calculationResult);

        FirstClass[] firstClassArray = new FirstClass[5];

        for(int i=0; i<firstClassArray.length; ++i){
            firstClassArray[i] = new FirstClass();
            firstClassArray[i].setName("New name");
        }

        for(FirstClass item: firstClassArray){
            if(!item.isAdult()){
                System.out.println("Alarm!");
                break;
            }
            item.setName("Add new mame");
            //System.out.print(item);
            //System.out.println();
        }

        for(FirstClass item: firstClassArray){
            System.out.print(item);
            System.out.println();
        }


        // This is a state when we are talking about initialization
        for(FirstClass item: firstClassArray){
            item = new FirstClass();
            item.setName("New name");
            System.out.println(item.someCalculation());
        }

        for(FirstClass item: firstClassArray){
            if(!item.isAdult()){
                System.out.println("Alarm!");
                break;
            }
            System.out.print(item);
            System.out.println();
        }

        String someData = "Some data string";
        someData.toLowerCase();
        someData.toUpperCase();
        System.out.println(someData);

        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }

        for (String item: args){
            System.out.println(item);
        }

        String[][] string2DArray = {{"String item 1 1", "String item 1 2", "String item 1 3"},{"String item 2 1", "String item 2 2"},{"String item 3 1"}};

        for(int i = 0; i < string2DArray.length; ++i){
            for(int j = 0; j < string2DArray[i].length; ++j){
                System.out.println(string2DArray[i][j]);
                string2DArray[i][j] += " additional data";
            }
        }

        for(String[] arrayString: string2DArray){
            for(String item: arrayString){
                System.out.println(item);
                item += " new additional data";
            }
        }

        for(String[] arrayString: string2DArray){
            for(String item: arrayString){
                System.out.println(item);
            }
        }

    }
}
