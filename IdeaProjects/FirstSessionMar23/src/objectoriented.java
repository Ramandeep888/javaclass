public class objectoriented {
  public static void main(String[] args) {


  //  int a = 5;
//    IfElse sam = new IfElse();
//    IfElse peter = new IfElse();
//    IfElse tom = new IfElse();
//    IfElse harry = new IfElse();

//    sam.firstname = "sam";
//    sam.lastname = "ahuja";
//    sam.age = 24;
//    sam.school = "harvard";
//    sam.id = 567;

//    sam.study();
    IfElse emp1 = new IfElse();
    IfElse emp2 = new IfElse("harry");
    IfElse emp3 = new IfElse("harry","potter");
    IfElse emp4 = new IfElse("harry","potter",120000);

    System.out.println(emp1.firstname + " " + emp1.lastname + "is earning" + emp1.salary + ".");
    System.out.println(emp2.firstname + " " + emp2.lastname + "is earning" + emp2.salary + ".");
    System.out.println(emp3.firstname + " " + emp3.lastname + "is earning" + emp3.salary + ".");
    System.out.println(emp4.firstname + " " + emp4.lastname + "is earning" + emp4.salary + ".");
          //emp1.work();

  }
}
