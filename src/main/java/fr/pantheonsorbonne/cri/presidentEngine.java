package fr.pantheonsorbonne.cri;

public abstract class presidentEngine {

    protected final Card[] cards;
    private final static int NBR_PAIRE=2;
    private final static int NBR_BRELON=2;
    private final static int NBR_CARREE=2;
    public boolean pairCombinaison(){
        
        for(int i=0; i<this.cards.length;i++){
            int count =1;
            for (int j=i+1; j<this.cards.length;j++){

                if(cards[i].getValue()==cards[j].getValue()){
                    count++;
                    

            }
            
            }

            if (count==NBR_PAIRE){
                return true;
            }
        

        }

        return false;
    }
        
    }
    

