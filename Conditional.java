class Conditional {
    public static void main(String[] args) {
        int age =13;
        if(age>=18){
           System.out.println("adult: can vote"); 
        }

        if(age>13 && age<18){
            System.out.println("teenager"); 
         }

        else{
            System.out.println("not adult: can't vote"); 
        }
       
        
    }
}
