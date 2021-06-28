public class Person {
    String name;
    int age;
    String maritalStatus;
    //create a constructor
    public Person(){
//default constructor
    }
    public Person(String name,int age,String maritalStatus){
        this.name=name;
        this.age=age;
        this.maritalStatus=maritalStatus;
    }
}
class Ceo extends Person{
   //create hire method for ceo
   public String hireStaff(Applicant applicant1){
       if(applicant1.getYears()<3){
         return "Not hired";
       }
        return "hired";
   }
   //create fire method
    public String fireStaff(Staff staff1){
       if(staff1.daysPresent<15){
           return "You're Fired!";
       }
       else if(staff1.daysPresent>=15&&staff1.daysPresent<30){
           return "more efforts!";
       }
       else{
           return "Good job.Your salary is increased to " + staff1.salary*2;
       }
    }
}
class Staff extends Person{
    //Declare fields for Staff
    String department;
    int staffId;
    int daysPresent;
    float salary;
    //create constructor
    public Staff(){
//default constructor
    }
    public  Staff(String department,int staffId,int daysPresent,float salary){
        this.department=department;
        this.daysPresent=daysPresent;
        this.staffId=staffId;
        this.salary=salary;
    }

// create an attendance method for staff
    public String markAttendance(){
        if(this.daysPresent>30){
            return "Employee present!";
        }
        else{
            return "Not present!";
        }
    }
}
// create Accountant classes
class Accountant extends Staff{
    //create pay staff method
    public String payStaff(Staff staff1){
        if(staff1.daysPresent>30){
            return "pay staff";
        }
        else{
            return "Don't pay staff";
        }
    }
}

//create an applicant class
 class Applicant{
    static int applicantCount;
    String name;
    int age;
    private int yearsOfExperience;

    public Applicant() {
        applicantCount++;
    }


    //getting years of experience
    int getYears(){
        return yearsOfExperience;
    }
    // use of setters
    public int setYears(int yearsOfExperience){
        this.yearsOfExperience= yearsOfExperience;
        return this.yearsOfExperience;
    }
}