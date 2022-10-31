class email{
    public static void email_verify(String mail){
        boolean beforeAt,At,afterAt,dot,dotAfter,qd;
        beforeAt=At=afterAt=dot=dotAfter=qd=false;
        int mover=0;
        if (!Character.isDigit(mail.charAt(mover))
            && !Character.isLetter(mail.charAt(mover))
            && !Character.isWhitespace(mail.charAt(mover))) {
                qd=true;
                System.out.println("Death state reached");
                return;
        }else{
            beforeAt=true;
            mover+=1;
        }
        //At symbol
        while(qd==false && At==false && mover<mail.length()){
            if(mail.charAt(mover)=='@'){
                At=true;
                mover+=1;
                break;
            }
            if (!Character.isDigit(mail.charAt(mover))
            && !Character.isLetter(mail.charAt(mover))
            && !Character.isWhitespace(mail.charAt(mover))) {
                if(mail.charAt(mover)=='_'){
                }else{
                    qd=true;
                    System.out.println("Death state reached");
                    return;
                }
            }
            mover+=1;
        }
        //After at
        if (qd==false && Character.isLetter(mail.charAt(mover))) {
            afterAt=true;
            mover+=1;
        }else{
            qd=true;
            System.out.println("Death state reached");
            return;
        }
        //dot
        while(qd==false && dot==false && mover<mail.length()){
            if(mail.charAt(mover)=='@'){
                System.out.println("Death State reached");
                qd=true;
                return;
            }
            if(mail.charAt(mover)=='.'){
                dot=true;
                mover+=1;
                break;
            }
            mover+=1;
        }
        //dotAfter
        char value=mail.charAt(mover);
        Boolean checker=Character.isLetter(mail.charAt(mover));
        if(qd==false && Character.isLetter(mail.charAt(mover))){
            dotAfter=true;
            mover+=1;
        }
        while(qd==false&& mover<mail.length()){
            if(Character.isDigit(mail.charAt(mover))
                && Character.isWhitespace(mail.charAt(mover))){
                    qd=true;
                    System.out.println("Death state reached");
                    return;
            }else if(!Character.isLetter(mail.charAt(mover))
                && !Character.isDigit(mail.charAt(mover))
                && !Character.isWhitespace(mail.charAt(mover))){
                    qd=true;
                    System.out.println("Death state reached");
                    return;
            }
            mover+=1;
        }
        if(qd==false && beforeAt==true && At==true && afterAt==true && dot==true && dotAfter==true){
            System.out.println("The system is a DFA");
        }
    }
    public static void main(String[] args) {
        String mail="@adad@@gmail.com";
        email_verify(mail);
    }
}
