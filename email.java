class email{
    public static void email_verify(String mail){
        boolean q0,q1,q2,q3,q4,qd;
        q0=q1=q2=q3=q4=qd=false; 
        int mover=0;
        if(mail.charAt(mover)=='@' || mail.charAt(mover)=='.'){
            System.out.println("Death State reached !!");
            return;
        }
        while(q1==false && mover<mail.length()){
            if(mail.charAt(mover)=='@'){
                q1=true;
                mover+=1;
                break;
            }
            mover+=1;
        }
        while(q2==false && mover<mail.length()){
            if(mail.charAt(mover)=='@'){
                System.out.println("Death State reached !!");
                return;
            }
            if(mail.charAt(mover)=='.'){
                q2=true;
            }
            mover+=1;
        }
    }
}
