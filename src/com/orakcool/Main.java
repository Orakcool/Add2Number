package com.orakcool;

public class Main {

   static public void main(String[] args) {
       try {
           int arg1 = Integer.parseInt(args[0]);
           int arg2 = Integer.parseInt(args[1]);
           String arg3 = args[2].toUpperCase();

           System.out.println(Operation.valueOf(arg3).action(arg1, arg2));
       }catch (Exception e){
           System.out.println("Please, enter 2 variables and operation (sum/sub/mult/div). Exception: \""+e.getMessage()+"\"");
       }
       System.out.println("End of my program");
    }
}
