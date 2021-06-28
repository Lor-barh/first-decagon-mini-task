public class Company {
    public static void main(String [] args){
        //int applicantExperience;
        //Declaring
        Applicant applicant1= new Applicant();
        Applicant applicant2 = new Applicant();
        System.out.println(Applicant.applicantCount);

        //Declaring Ceo to hire applicant
        //applicantExperience= applicant1.setYears(5);
        //create an instance of Staff class
        Staff staff1= new Staff("Human resources",1105,60,10000);
        staff1.name="Tunde";
        System.out.println(staff1.markAttendance());
        //create an instance of Ceo class
        Ceo ceo1=new Ceo();
        System.out.println(ceo1.fireStaff(staff1));
        //create an instance of Accountant
        Accountant accountant= new Accountant();
        System.out.println(accountant.payStaff(staff1));
    }
}
