package com.AitaRyan;

public class localVariables {
        public void showAge(){

            //Local Variable
            String Name="Aita Ryan";
            //Local Variable
            int Age=21;
            System.out.println("My Name is: " + Name);
            System.out.println("Age: " + Age);
        }
        public int calcAge(){
            int age=21;
            return age;
        }
        public static void main(String[] args) {
            localVariables person=new localVariables();
            person.showAge();
            person.calcAge();
        }

    }
