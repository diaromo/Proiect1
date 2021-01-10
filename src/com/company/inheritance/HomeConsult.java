package com.company.inheritance;

public class HomeConsult extends Vet{

        public String getConsultType1() {
            return consultType1;
        }

        public void setConsultType1(String consultType1) {
            this.consultType1 = consultType1;
        }

        private String consultType1 = "Take temperature";
        void stayStill() {System.out.println("I am a good pet");}
}
