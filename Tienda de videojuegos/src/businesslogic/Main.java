package businesslogic;

import data.Videojuegos;
import data.indies;
import data.Arcades;
import data.estrategia;
import data.Aventura;
import data.Plataformas;
import data.Bullethell;
import data.militar;
import data.Gestion;
import data.Fantastica;
import data.historica;
import data.AAA;
import data.MundoAbierto;
import data.Deportes;
import data.Carreras;
import data.Lucha;
import data.Seccionado;
import data.Unico;
import data.Simulacion;
import data.EstiloLibre;
import data.Automovil;
import data.NoAutomovil;
import data.OneVsOne;
import data.OneVsAll;
import data.PvE;
import data.PvPRoyale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] las4 = {"nintendo", "xbox","playstation","PC"};
		String[] las3 = {"xbox","playstation","pc"};
		String[] xpc = {"xbox","PC"};
		String[] obstaculos = {"a", "b", "c"};
		String[] enemigos = {"caballero","monstruo","mas"};
		String[] nin= {"nintendo"};
		String[] xbox= {"xbox"};
		String[] pc = {"pc"};
		String[] par = {"proteger","sobrevivir","derrotar"};
		String[] map = {"selva","ruinas","desierto","ciudad"};
		String[] sourc= {"piedra"};
		String[] arm= {"pistola","metra","espada"};
		String[] edificios = {"carpa","asedio","forja","castillo","casa"};
		String[] nada = {"nada"};
		String[] car= {"sprint", "circuito","contrarreloj","drift", "carro vs avion"};
		String[] mkx= {"alien","mortal kombat","depredador","jason","Leatherface"};
		String[] dif= {"facil","normal","dificil","heroica","legendaria"};
 	Plataformas deadcells =new Plataformas (las4 ,false,true,true,360,9.5,3,11,500000, "lo que sea que signifique ludonarratividad",25,"isometrica 3d", 100, 3,obstaculos, enemigos) ;
	
	Bullethell cuphead = new Bullethell(xpc ,false,true,true,0,9.5,7,11,500000, "lo que sea que signifique ludonarratividad",25,"2d", 100, "retro", obstaculos, enemigos);
	
	militar commandandconquer = new militar(las4, true,true,false,360,9.0,12,20,100000,"lo que sea ",par, map,sourc, arm, enemigos,edificios);
	
	Gestion civilizationII = new Gestion(las4, true,true,false,360,9.0,12,20,100000,"lo que sea ",par, map,sourc, arm, 1000,edificios);
	
	Fantastica unravel = new Fantastica(xpc,false,true,true,360,9.5,7,11,500000, "lo que sea que signifique ludonarratividad","naaaada","suecia", enemigos, nada, obstaculos, arm);
	
	historica neveralone = new historica(las4,false,true,false,220,9.4,7,15,30000,"xd","par","artico",nada,nada,"2000's",nada);
	
	Seccionado dishonored = new Seccionado(las4,true,true,false,195,9.0,15,"ubisoft","unreal engine 4",nada,25,500,500,edificios,30,8);
	
	Unico gtaV = new Unico(las3, true,true,false,160,9.9,18,"rockstar games","no se",nada,60,400,1000,map,1000,arm);
	
	Simulacion fifa19 = new Simulacion(las4,true,true,true,360,8.0,3,"EA spors cheneke", "frosbite",nada,"futbolito",5000,nada,nada,nada,2018);
	
	EstiloLibre supermariostricker = new EstiloLibre(las3,true,true,true,360,9.0,3,"nextlevel", "no se",nada,"futbolito",16,map,nada,nada,nada);
	
	Automovil forzamotorsport7 = new Automovil(xpc,true,true,false,170,9.0,3,"turn 10 studios", "forza tech", nada, nada,false,car, 700,nada,nada);
	
	NoAutomovil mariokart = new NoAutomovil(nin,true,true,true,170,9.0,3,"nintendo", "no se", nada, nada,false,car,5,nada,nada);
	
	OneVsOne mortalkombatx = new OneVsOne(las4,true,true,true,360,9.0,18," NetherRealm Studios","unreal engine",mkx,20,10,nada,50,nada,"ahjsdfma");
	
	PvE halo = new PvE(xpc,true,true,true,150,9.0,15,"343 y bungie","no se",nada,20,10,nada,300,52,arm,30,dif,nada);
	
	PvPRoyale fortnite = new PvPRoyale(las4,true,true,false,150,9.0,7,"epic games","no se",nada,20,10,nada,100,52,arm,25,"no se como se llama",nada);
	}
}
