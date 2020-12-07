class Main{  
    public void finalize(){System.out.println("object is garbage collected");}  
    public static void main(String args[]){  
     Main sujith=new Main();  
     Main Sujith_Kumar_A=new Main();  
     sujith=null;  
     Sujith_Kumar_A=null;  
     System.gc();  
    }  
   }