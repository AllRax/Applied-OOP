package com.AitaRyan;

public class staticVariables {
        static String UniversityName="IUEA";
        String studentName;

        public staticVariables(String studentName) {
            this.studentName=studentName;
        }
        public void display(){
            System.out.println("My name is: " +studentName+"\n" + "I study at: "+UniversityName );
        }
        public static void show(){
            System.out.println("Static Variable:"+UniversityName);
        }
        public static void main(String[] args) {
            staticVariables student1=new staticVariables("Aita Ryan");
            student1.display();
            student1.show();
        }
    }
