package maxima.homework20221026;

public class Student {
  private String firstName;
  private String middleName;
  private String lastName;
  private int age;
  private String education;
  private String hobby;

  public Student(String firstName, String middleName, String lastName, int age, String education, String hobby) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.age = age;
    this.education = education;
    this.hobby = hobby;
  }

  @Override
  public String toString() {
    return "STUDENT INFO\n" +
        "First name: " + firstName + '\n' +
        "Middle name: " + middleName + '\n' +
        "Last name: " + lastName + '\n' +
        "Age: " + age + '\n' +
        "Education: " + education + '\n' +
        "Hobby: " + hobby + '\n';
  }

  public static void main(String[] args) {

    Student student = new Student("Aleksei", "V", "Kazantsev", 43, "Self education", "Programming");
    System.out.println(student);
  }
}
