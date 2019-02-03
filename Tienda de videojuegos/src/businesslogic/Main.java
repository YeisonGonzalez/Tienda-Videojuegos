package businesslogic;

import data.Videojuegos;
import data.indies;
import data.Arcades;
import data.estrategia;
import data.Aventura;
import data.Plataformas;
import data.Bullethell;
import data.AAA;
import data.MundoAbierto;
import data.Deportes;
import data.Carreras;
import data.Lucha;
import data.Simulacion;
import data.EstiloLibre;
import data.OneVsOne;
import data.OneVsAll;
import data.PvE;
import data.PvPRoyale;
import java.util.Scanner;

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
	
	Simulacion fifa19 = new Simulacion(las4,true,true,true,360,8.0,3,"EA spors cheneke", "frosbite",nada,"futbolito",5000,nada,nada,nada,2018);
	
	EstiloLibre supermariostricker = new EstiloLibre(las3,true,true,true,360,9.0,3,"nextlevel", "no se",nada,"futbolito",16,map,nada,nada,nada);
	
	OneVsOne mortalkombatx = new OneVsOne(las4,true,true,true,360,9.0,18," NetherRealm Studios","unreal engine",mkx,20,10,nada,50,nada,"ahjsdfma");
	
	PvE halo = new PvE(xpc,true,true,true,150,9.0,15,"343 y bungie","no se",nada,20,10,nada,300,52,arm,30,dif,nada);
	
	PvPRoyale fortnite = new PvPRoyale(las4,true,true,false,150,9.0,7,"epic games","no se",nada,20,10,nada,100,52,arm,25,"no se como se llama",nada);
	
	System.out.println("Bienvenido, seleccione el tipo de juego quieres comprar:");
	System.out.println("1-Indie"+"\n"+"2-AAA");
	
	int elegido=0;
	
		Scanner opcion1= new Scanner(System.in);
		elegido=opcion1.nextInt();
		switch(elegido) {
		case 1:
			System.out.println("Seleccione el tipo de juego indie que desea:");
			System.out.println("1-Arcades"+"\n"+"2-Estrategia"+"\n"+"3-Aventura");
			elegido=opcion1.nextInt();
			switch(elegido) {
			case 1:
				System.out.println("Seleccione el tipo de juego Arcade que desea:");
				System.out.println("1-Plataformas"+"\n"+"2-Bullethell");
				elegido=opcion1.nextInt();
				switch(elegido) {
				case 1:
					System.out.println("Los juegos de tipo Plataformas que tenemos son: ");
					break;
				case 2:
					System.out.println("Los juegos de tipo Bullethell que tenemos son: ");
					break;
				default:
					System.out.println("Esa no es una opcion valida");	
				}
				break;
			case 2:
				System.out.println("Los juegos de tipo Estrategia que tenemos son: ");
				break;
			case 3:
				System.out.println("Los juegos de tipo Aventura que tenemos son: ");
				break;
			default:
				System.out.println("Esa no es una opcion valida");
			}
			break;
		case 2:
			System.out.println("Seleccione el tipo de juego AAA que desea:");
			System.out.println("1-Mundo Abierto"+"\n"+"2-Deportes"+"\n"+"3-Carreras"+"\n"+"4-Lucha");
			elegido=opcion1.nextInt();
			switch(elegido) {
			case 1:
				System.out.println("Los juegos de tipo Mundo Abierto que tenemos son: ");
				break;
			case 2:
				System.out.println("Seleccione el tipo de juego de Deportes que desea:");
				System.out.println("1-Simulaciones"+"\n"+"2-Estilo Libre");
				elegido=opcion1.nextInt();
				switch(elegido) {
				case 1:
					System.out.println("Los juegos de tipo Simulaciones que tenemos son: ");
					break;
				case 2:
					System.out.println("Los juegos de tipo Estilo Libre que tenemos son: ");
					break;
				}
				break;
			case 3:
				System.out.println("Los juegos de tipo Carreras que tenemos son: ");
				break;
			case 4:
				System.out.println("Seleccione el tipo de juego de Lucha que desea:");
				System.out.println("1-1vs1"+"\n"+"2-1vsAll");
				elegido=opcion1.nextInt();
				switch(elegido) {
				case 1:
					System.out.println("Los juegos de tipo 1vs1 que tenemos son: ");
					break;
				case 2:
					System.out.println("Seleccione el tipo de juego de 1vsAll que desea:");
					System.out.println("1-PVE"+"\n"+"2-PVPRoyale");
					elegido=opcion1.nextInt();
					switch(elegido) {
					case 1:
						System.out.println("Los juegos de tipo PVE que tenemos son: ");
						break;
					case 2:
						System.out.println("Los juegos de tipo PVPRoyale que tenemos son: ");
						break;
					default:
						System.out.println("Esa no es una opcion valida");
					}
					break;
				default:
					System.out.println("Esa no es una opcion valida");
				}
				break;
			default:
				System.out.println("Esa no es una opcion valida");
			}
			break;
		default:
			System.out.println("Esa no es una opcion valida");
		}
		
	}
}

