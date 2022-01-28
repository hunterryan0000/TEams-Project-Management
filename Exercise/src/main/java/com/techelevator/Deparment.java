package com.techelevator;

public class Deparment {

        private int departmentId;
        private String name;

        public int getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentId(int departmentId) {
            this.departmentId = departmentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Deparment (int departmentId, String name){
            this.departmentId=departmentId;
            this.name=name;
            System.out.println("It works");
        }
}
