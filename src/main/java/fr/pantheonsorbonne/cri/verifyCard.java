package fr.pantheonsorbonne.cri;

import fr.pantheonsorbonne.cri.enums.CardValue;
import fr.pantheonsorbonne.cri.game.Card;

import java.util.ArrayList;

import fr.pantheonsorbonne.cri.game.pile;

public class verifyCard {

    private pile pile;
    private boolean revolution =false;
    private boolean valide = false;
    private Card dernièreCarte;
    private ArrayList<Card> cartes;
    private boolean pileReset = false;

    public verifyCard(Card dernièreCard, ArrayList<Card> cartes){
        this.dernièreCarte= dernièreCard;
        this.cartes=cartes;
        this.pile=pile;

    }

    public void verify(boolean revolution){
        int prevCarteIndex = this.pile.getCartes().size() - 1;
        
        if (this.pile.getCartes().size() > 0) {
            if (revolutionEnCours ? this.isInferieure() : this.isSuperieure()) {
                if (this.dernièreCarte == null || this.pile.getCartes().size() == 1 || !this.pile.getCartes().get(prevCarteIndex).getValue().equals(this.pile.getCartes().get(prevCarteIndex - 1).getValue())) {
					this.valide = true;
					if (revolutionEnCours) {
						this.verifierTrois();
					} else {
						this.verifierDeux();
					}
                }
            } else if (this.isEgale()) {
				this.valide = true;

                if (this.pile.getCartes().size() >= 3 && this.pile.getCartes().get(prevCarteIndex).getValue().equals(this.pile.getCartes().get(prevCarteIndex - 1).getValue()) && this.pile.getCartes().get(prevCarteIndex).getValue().equals(this.pile.getCartes().get(prevCarteIndex - 2).getValue())) {
					this.pileReset = true;
				}
            }
            else {
                this.valide = true;
                if (revolutionEnCours) {
                    this.verifierTrois();
                } else {
                    this.verifierDeux();
                }
            }
        }

    }

    private boolean isInferieure() {
		return this.cartes.get(0).getValue().compareTo(this.pile.getCartes().get(this.pile.getCartes().size() - 1).getValue()) < 0;
	}

    private boolean isSuperieure() {
		return this.cartes.get(0).getValue().compareTo(this.pile.getCartes().get(this.pile.getCartes().size() - 1).getValue()) > 0;
	}

    private boolean isEgale() {
		return this.cartes.get(0).getValue().compareTo(this.pile.getCartes().get(this.pile.getCartes().size() - 1).getValue()) == 0;
	}

    private void verifierDeux() {
		if (this.cartes.get(0).getValue().equals(CardValue.TWO)) {
			this.pileReset = true;
		}
	}

    private void verifierTrois() {
		if (this.cartes.get(0).getValue().equals(CardValue.THREE)) {
			this.pileReset = true;
		}
	}

    public boolean isValide() {
		return this.valide;
	}
	
	public boolean isPileReset() {
		return this.pileReset;
	}
	
	public boolean isRevolution() {
		return this.revolution;
	}


    
    
}
