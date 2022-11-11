package fr.pantheonsorbonne.cri;

import fr.pantheonsorbonne.cri.enums.Role;

public class RolePlayer {	
	private static final Role[] DEUX_JOUEURS = {Role.PRESIDENT, Role.TROUDUCUL};
	private static final Role[] TROIS_JOUEURS = {Role.PRESIDENT, Role.TROUDUCUL};
	private static final Role[] QUATRE_JOUEURS = {Role.PRESIDENT, Role.VICE_PRESIDENT, Role.VICE_TROUDUCUL, Role.TROUDUCUL};
	
	
	public static final Role[][] REPARTITION_ROLES = {DEUX_JOUEURS, TROIS_JOUEURS, QUATRE_JOUEURS};

}