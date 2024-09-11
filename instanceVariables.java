package com.AitaRyan;

public class instanceVariables {

    class groupF{
        String Name;
        String courseName;
        String regNo;
        public groupF(String name, String courseName, String regNo) {
            Name = name;
            this.courseName = courseName;
            this.regNo = regNo;
        }
        public void displayInfo(){
            System.out.println("NAME: "+Name+"\n"+
                    "COURSE: "+courseName+"\n"+
                    "regNo: "+ regNo);
        }
    }
    public class instanceVariable {
        public void main(String[] args) {
            groupF[] members={
                    new groupF("Aita Ryan","BSSE-S","23/UG/890/BSSE-S"),
                    new groupF("Drew","BSSE-S","23/UG/444/BSSE-S"),
                    new groupF("Captain","BIT","23/UG/555/BIT"),
                    new groupF("Printer","BIT","23/UG/777/BIT"),
                    new groupF("Wont","BSCS","23/UG/12/BSCS"),
                    new groupF("Fiver","BSCS","23/UG/51/BSCS"),
            };
            for (groupF member:members){
                System.out.println("\n STUDENT");
                System.out.println("\n");
                member.displayInfo();
            }
        }

    }
}
