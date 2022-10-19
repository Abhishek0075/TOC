class email{
    public static void email_verify(String mail){
        boolean q0,q1,q2,q3,q4,qd;
        q0=q1=q2=q3=q4=qd=false;
        int mover=0;
        while(q1==false && mover<mail.length()){
            q0=true;
            if(mail.charAt(mover)=='@'){
                q1=true;
                mover+=1;
                break;
            }
            mover+=1;
        }
        while(qd!=true && q2==false && mover<mail.length()){
            if(mail.charAt(mover)=='@'){
                qd=true;
            }
            if(mail.charAt(mover)=='.'){
                q2=true;
            }
            mover+=1;
        }
    }
}
