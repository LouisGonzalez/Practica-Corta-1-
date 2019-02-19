import java.io.IOException; //Para usar el System.in.read();
import java.util.Scanner;  //Para poder leer las variables de todo tipo

public class PracticaCorta {

    public static void main(String[] args) throws IOException {
        int menuJuegos=0;
        while (menuJuegos!=5) {                                         //Mientras el menu no tenga el valor de 5 el programa seguira ejecutando 
            Scanner scanner= new Scanner(System.in);
            System.out.println("Bienvenido al menu de juegos");
            System.out.println("1. Ahorcado");
            System.out.println("2. Basquetball");
            System.out.println("3. Juego de Cartas");
            System.out.println("4. Torres de Hanoi");
            System.out.println("5. Salir del juego");
            System.out.println("Porfavor eliga un juego de entre nuestra seleccion");
            menuJuegos = scanner.nextInt();
            limpiarPantalla();
            switch (menuJuegos){
                case 1:
                    ahorcado();
                     break;
                case 2:
                    basquetball();
                    break;
                case 3: 
                    cartas();
                    break;
                case 4: 
                    hanoi();
                    break;
            } 
          
        } 
    }
    
    //-----------------------------------------------------------------------------METODOS PARA EL JUEGO DE AHORCADO
    public static void ahorcado() throws IOException {  //Empezamos ahorcado :D
		int repetirJuego=1;
                while (repetirJuego==1){   //Mientras repetirJuego tenga el valor de 1 el juego se repite
                Scanner scanner = new Scanner(System.in);
                String aux;
                int i;
		String a[] = new String[10];
		String b[] = new String[10];
		a[0] = "-";
		a[1] = "-";
		a[2] = "-";
		a[3] = "-";
		a[4] = "-";
		a[5] = "-";
		a[6] = "-";
		a[7] = "-";
		a[8] = "-";
		a[9] = "-";
		int intentos = 10;
                System.out.println("Bienvenido a AHORCADO");
                System.out.println("Presiona ENTER para continuar");
                System.in.read();
                limpiarPantalla();
                System.out.println("El juego es simple, el anfitrion ingresara una palabra para que al instante el jugador");
                System.out.println("intente adivinar que palabra escribio pero OJO! por cada error que tengas se ira formando");
                System.out.println("un ahorcado y si se termina de armar....GAME OVER :( ");
                System.out.println("Presiona ENTER para comenzar");
                System.in.read();
                limpiarPantalla();
		System.out.println("Anfitrion ingrese palabra a escribir (maximo 10 letras)");
		System.out.println("Despues de escribir la palabra teclea ENTER para iniciar");
		String palabraAsignada = scanner.nextLine();
                limpiarPantalla();
		int cantidad = palabraAsignada.length(); //Cuenta la cantidad de letras en la palabra escrita
		while (cantidad<1 || cantidad>10){   //Rango de las palabras
                    System.out.println("La palabra debe estar dentro del rango establecido, intentalo otra vez");
                    palabraAsignada = scanner.nextLine();
                    cantidad = palabraAsignada.length();
                    limpiarPantalla();
                }
                	System.out.println("");
			for (i=1;i<=cantidad;i++) { //La palabra que escriba el anfitrion pasa al vector b[]
				b[i-1] = palabraAsignada.substring(i-1,i);
			}
                        String palabraTotal="-";
                        while (!palabraAsignada.equals(palabraTotal) & intentos>0) {
				System.out.println("Ingrese la letra que desea conveniente");
				System.out.println("PISTA, es una palabra de "+cantidad+" letras");
				String letraAsignada = scanner.nextLine();
				if (letraAsignada.equals(b[0]) || letraAsignada.equals(b[1]) || letraAsignada.equals(b[2]) || letraAsignada.equals(b[3]) || letraAsignada.equals(b[4]) || letraAsignada.equals(b[5]) || letraAsignada.equals(b[6]) || letraAsignada.equals(b[7]) || letraAsignada.equals(b[8]) || letraAsignada.equals(b[9])) {
					for (i=1;i<=10;i++) {
						if (letraAsignada.equals(b[i-1])) {
							aux = a[i-1]; //La letra que escriba el jugador se traslada a la posicion del vector a[] si hay coincidencia con las letras del vector b[]
							a[i-1] = b[i-1];
							b[i-1] = aux;
							System.out.println("");
						}
                                        	limpiarPantalla(); 
					}
                                        if (cantidad==1){       //Para la palabra desde si tiene una letra hasta 10
                                            palabraTotal=a[0];
                                        }
                                        if (cantidad==2){
                                            palabraTotal=a[0]+a[1];
                                        }
                                        if (cantidad==3){
                                            palabraTotal=a[0]+a[1]+a[2];
                                        }
                                        if (cantidad==4){
                                            palabraTotal=a[0]+a[1]+a[2]+a[3];
                                        }
                                        if (cantidad==5){
                                            palabraTotal=a[0]+a[1]+a[2]+a[3]+a[4];
                                        }
                                        if (cantidad==6){
                                            palabraTotal=a[0]+a[1]+a[2]+a[3]+a[4]+a[5];
                                        }
                                        if (cantidad==7){
                                            palabraTotal=a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6];
                                        }
                                        if (cantidad==8){
                                            palabraTotal=a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7];
                                        }
                                        if (cantidad==9){
                                            palabraTotal=a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8];
                                        }
                                        if (cantidad==10){
                                            palabraTotal=a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9];
                                        }
				} else {
					intentos = intentos-1;
					for (int mostrar=1;mostrar<=1;mostrar++) {  //Ciclo para limpiar pantalla si la letra es incorrecta
						limpiarPantalla();
					}
				}
				System.out.println(palabraTotal);
				System.out.println("");
				System.out.println("");
				if (intentos==9) {
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("|");
					System.out.println("|");
				}
				if (intentos==8) {
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");
				}
				if (intentos==7) {
					System.out.println("|------");
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");
				}
				if (intentos==6) {
					System.out.println("|------|");
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");
				}
				if (intentos==5) {
					System.out.println("|------|");
					System.out.println("|      O");
					System.out.println("|");
					System.out.println("|");
				}
				if (intentos==4) {
					System.out.println("|------|");
					System.out.println("|      O");
					System.out.println("|      |");
					System.out.println("|");
				}
				if (intentos==3) {
					System.out.println("|------|");
					System.out.println("|      O");
					System.out.println("|     /|\\");
					System.out.println("|");
				}
				if (intentos==2) {
					System.out.println("|------|");
					System.out.println("|      O");
					System.out.println("|     /|\\");
					System.out.println("|     /");
				}
				if (intentos==1) {
					System.out.println("|------|");
					System.out.println("|      O");
					System.out.println("|     /|\\");
					System.out.println("|     / ");
				}
                                
			}
                       
			if (intentos==0) {
				System.out.println("|------|");
				System.out.println("|      O");
				System.out.println("|     /|\\");
				System.out.println("|     / \\");
                                System.out.println("");
				System.out.println("Has perdido :(, la palabra correcta era ***"+palabraAsignada+"***");
			} else { 
                            
                            if(palabraAsignada.equals(palabraTotal)){
				System.out.println("Has ganado el juego FELICIDADES! :D");
                                System.out.println("Presiona ENTER para continuar");
                            }
                        }
		System.in.read(); 
		limpiarPantalla();
                    System.out.println("Desea jugar otra vez?  1. SI    Cualquier otro numero. Volver al menu"); 
                    repetirJuego = scanner.nextInt();
                    limpiarPantalla();
                } 
              
	
         }

    //------------------------------------------------------------------------------------------------------------
    
    
    public static void basquetball() throws IOException {
		Scanner scanner = new Scanner(System.in);
                int opcionAtaque;
                int opcionDefensa;
		int resultado=0;
		int resultado2=0;
                int repetirPrograma = 1;
		while (repetirPrograma==1) { //Mientras repetirPrograma sea igual a 1 el programa repetira al finalizar 
		int primerTurno = (int)(Math.random()*100)+1;  //random para definir quien empieza el juego 
			System.out.println("Bienvenido a BASQUETBALL");
                        System.out.println("Presiona ENTER para continuar");
                        System.in.read();
                        limpiarPantalla();
                        System.out.println("El juego consiste en una simulacion de un partido de basquetball para 2 jugadores,");
                        System.out.println("una vez iniciado el juego a cada jugador se le daran dos opciones respectivamente,");
                        System.out.println("el primero tendra las opciones de ataque, una vez elegida la opcion sera el turno ");
                        System.out.println("del siguiente jugador que tendra opciones de defensa, despues de ello la computadora");
                        System.out.println("mediante un algoritmo definira si el tiro del primer jugador encesta o no, seguido a esto");
                        System.out.println("el jugador que defendio le tocara atacar y al que ataco en el turno anterior sera su ");
                        System.out.println("turno de defender, el juego termina cuando se llegue a la cantidad de turnos que se eligio");
                        System.out.println("Asi que suerte y que el mejor equipo gane! :D");
                        System.out.println("");
                        System.out.println("Porfavor presione ENTER para iniciar");
                        System.in.read();
                        limpiarPantalla();
			System.out.println("Porfavor jugador 1 escriba el nombre de su equipo");
			String jugador1 = scanner.nextLine();  //Pide el nombre del jugador 1 
			System.out.println("Porfavor jugador 2 escriba el nombre de su equipo");
			String jugador2 = scanner.nextLine();  //Pide el nombre del jugador 2 
			limpiarPantalla();
			System.out.println("Bienvenidos "+jugador1+" , "+jugador2); //Muestra en pantalla los nombres mencionados
			System.out.println("Defina el numero de turnos del partido(rango entre 5 a 20)");
			int numTurnos = scanner.nextInt();
			limpiarPantalla();
			while (numTurnos<5 || numTurnos>20) { //Mientras numTurnos no este en el rango preasignado el programa tira este mensaje
                            System.out.println("El numero de rangos debe de estar dentro de los parametros asignados");
                            numTurnos = scanner.nextInt();
                        limpiarPantalla();
                        }
				System.out.println("A continuacion se elegira al azar el jugador que iniciara");
				System.out.println("Presione ENTER para continuar");
				System.in.read(); 
				limpiarPantalla();
				for (int contadorTurnos=1;contadorTurnos<=numTurnos;contadorTurnos++) {
					if (primerTurno<=50) {  //Se designan los parametros para que inicie primero el jugador 1 
						System.out.println("Turno de "+jugador1);
						System.out.println("Presione ENTER para continuar");
						System.in.read(); 
						limpiarPantalla();
						System.out.println("Eliga una de las opciones de ataque que se le presentan a continuacion"); //Inicio de la eleccion para atacar 
						System.out.println("1. Salto Largo (3 pts y 65% probabilidad de anotar)");
						System.out.println("2. Salto Corto (2 pts y 80% probabilidad de anotar)");
						opcionAtaque = scanner.nextInt();
						limpiarPantalla();
						if (opcionAtaque==1) {
							System.out.println("A elegido Salto Largo");
							System.out.println("Presione ENTER para saber su resultado");
						} else {
							if (opcionAtaque==2) {
								System.out.println("A elegido Salto Corto");
								System.out.println("Presione ENTER para saber su resultado");
							}
						} // Hasta que el jugador 2 no eliga sus opciones de defensa no se definira si el ataque a acertado en la red o no 
						System.in.read(); 
						limpiarPantalla(); 
						System.out.println("Turno de "+jugador2); //Luego del turno del jugador 1 es hora que el jugador 2 defienda
						System.out.println("Presione ENTER para continuar"); 
						System.in.read();
						limpiarPantalla(); 
						System.out.println("Eliga una de las opciones de defensa que se le presentan a continuacion");
						System.out.println("1. Defensa cuerpo a cuerpo (reduce la posibilidad de anotar en un 15% y da un 35% de posibilidad de cometer falta");
						System.out.println("2. Defensa fuerte (reduce la posibilidad de anotar en un 30% y da un 65% de probabilidad de cometer falta");
						opcionDefensa = scanner.nextInt();
						limpiarPantalla();
						if (opcionDefensa==1) {
							System.out.println("A elegido defensa cuerpo a cuerpo");
							System.out.println("Presione cualquier tecla para saber su resultado");
						} else {
							if (opcionDefensa==2) {
								System.out.println("A elegido defensa fuerte");
								System.out.println("Presione ENTER para saber su resultado");
							}
						}
						System.in.read(); 
						limpiarPantalla();
						if (opcionAtaque==1 && opcionDefensa==1) {
							resultado = resultado+saltoLargoDefensaCuerpoaCuerpo(); //la variable resultado es el contador para el numero de anotaciones 
							System.out.println("Los "+jugador1+" lleva "+resultado+" puntos en total"); //dependiendo las variables que se eligan se definira el resultado del marcador en este turno
						}
						if (opcionAtaque==1 && opcionDefensa==2) {
							resultado = resultado+saltoLargoDefensaFuerte(); //resultado es la variable para los puntos del jugador 1 
							System.out.println("Los "+jugador1+" lleva "+resultado+" puntos en total");
						}
						if (opcionAtaque==2 && opcionDefensa==1) {
							resultado = resultado+saltoCortoDefensaCuerpoaCuerpo();
							System.out.println("Los "+jugador1+" lleva "+resultado+" puntos en total");
						}
						if (opcionAtaque==2 && opcionDefensa==2) {
							resultado = resultado+saltoCortoDefensaFuerte();
							System.out.println("Los "+jugador1+" lleva "+resultado+" puntos en total");
						}
                                                System.out.println("Presione ENTER para continuar");
						System.in.read(); 
						limpiarPantalla();
						System.out.println("Turno de "+jugador2);  //Turno de que el jugador 2 ataque para que asi de inicio el siguienteturno
						System.out.println("Presione ENTER para continuar");
						System.in.read(); 
						limpiarPantalla();
						System.out.println("Eliga una de las opciones de ataque que se le presentan a continuacion");
						System.out.println("1. Salto Largo (3 pts y 65% probabilidad de anotar)");
						System.out.println("2. Salto Corto (2 pts y 80% probabilidad de anotar)");
						opcionAtaque = scanner.nextInt();
						limpiarPantalla();
						if (opcionAtaque==1) {
							System.out.println("A elegido Salto Largo");
							System.out.println("Presione ENTER para saber su resultado");
						} else {
							if (opcionAtaque==2) {
								System.out.println("A elegido Salto Corto");
								System.out.println("Presione ENTER para saber su resultado");
							}
						}
						System.in.read();
						limpiarPantalla();
						System.out.println("Turno de "+jugador1);
						System.out.println("Presione ENTER para continuar");
						System.in.read(); 
						limpiarPantalla();
						System.out.println("Eliga una de las opciones de defensa que se le presentan a continuacion");
						System.out.println("1. Defensa cuerpo a cuerpo (reduce la posibilidad de anotar en un 15% y da un 35% de posibilidad de cometer falta");
						System.out.println("2. Defensa fuerte (reduce la posibilidad de anotar en un 30% y da un 65% de probabilidad de cometer falta");
						opcionDefensa = scanner.nextInt();
						limpiarPantalla(); 
						if (opcionDefensa==1) {
							System.out.println("A elegido defensa cuerpo a cuerpo");
							System.out.println("Presione ENTER para saber su resultado");
						} else {
							if (opcionDefensa==2) {
								System.out.println("A elegido defensa fuerte");
								System.out.println("Presione ENTER para saber su resultado");
							}
						}
						System.in.read(); 
						limpiarPantalla();
						if (opcionAtaque==1 && opcionDefensa==1) {
							resultado2 = resultado2+saltoLargoDefensaCuerpoaCuerpo(); //Muestra en pantalla el resultado del marcador en este turno
							System.out.println("Los "+jugador2+" lleva "+resultado2+" puntos en total");
						}
						if (opcionAtaque==1 && opcionDefensa==2) {
							resultado2 = resultado2+saltoLargoDefensaFuerte(); // resultado 2 es la variable para los puntos del jugador 2 
							System.out.println("Los "+jugador2+" lleva "+resultado2+" puntos en total");
						}
						if (opcionAtaque==2 && opcionDefensa==1) {
							resultado2 = resultado2+saltoCortoDefensaCuerpoaCuerpo();
							System.out.println("Los "+jugador2+" lleva "+resultado2+" puntos en total");
						}
						if (opcionAtaque==2 && opcionDefensa==2) {
							resultado2 = resultado2+saltoCortoDefensaFuerte();
							System.out.println("Los "+jugador2+" lleva "+resultado2+" puntos en total");
						}
                                                System.out.println("Presione ENTER para continuar");
						System.in.read(); 
						limpiarPantalla();
					} else {
						if (primerTurno>50) { //Se definen los parametros para que quien inicie primero el partido sea el jugador 2 
							// ------------------------------------------------------------------------------------------------------
							System.out.println("Turno de "+jugador2);
							System.out.println("Presione ENTER para continuar");
							System.in.read(); 
							limpiarPantalla(); 
							System.out.println("Eliga una de las opciones de ataque que se le presentan a continuacion");
							System.out.println("1. Salto Largo (3 pts y 65% probabilidad de anotar)");
							System.out.println("2. Salto Corto (2 pts y 80% probabilidad de anotar)");
							opcionAtaque = scanner.nextInt();
							limpiarPantalla(); 
							if (opcionAtaque==1) {
								System.out.println("A elegido Salto Largo");
								System.out.println("Presione ENTER para saber su resultado");
							} else {
								if (opcionAtaque==2) {
									System.out.println("A elegido Salto Corto");
									System.out.println("Presione ENTER para saber su resultado");
								}
							}
							System.in.read(); 
							limpiarPantalla(); 
							System.out.println("Turno del "+jugador1);
							System.out.println("Presione ENTER para continuar");
							System.in.read(); 
							limpiarPantalla();
							System.out.println("Eliga una de las opciones de defensa que se le presentan a continuacion");
							System.out.println("1. Defensa cuerpo a cuerpo (reduce la posibilidad de anotar en un 15% y da un 35% de posibilidad de cometer falta");
							System.out.println("2. Defensa fuerte (reduce la posibilidad de anotar en un 30% y da un 65% de probabilidad de cometer falta");
							opcionDefensa = scanner.nextInt();
							limpiarPantalla();
							if (opcionDefensa==1) {
								System.out.println("A elegido defensa cuerpo a cuerpo");
								System.out.println("Presione ENTER para saber su resultado");
							} else {
								if (opcionDefensa==2) {
									System.out.println("A elegido defensa fuerte");
									System.out.println("Presione ENTER para saber su resultado");
								}
							}
							System.in.read(); 
							limpiarPantalla();
							if (opcionAtaque==1 && opcionDefensa==1) {
								resultado2 = resultado2+saltoLargoDefensaCuerpoaCuerpo();
								System.out.println("Los "+jugador2+" lleva "+resultado2+" puntos en total");
							}
							if (opcionAtaque==1 && opcionDefensa==2) {
								resultado2 = resultado2+saltoLargoDefensaFuerte();
								System.out.println("Los "+jugador2+" lleva "+resultado2+" puntos en total");
							}
							if (opcionAtaque==2 && opcionDefensa==1) {
								resultado2 = resultado2+saltoCortoDefensaCuerpoaCuerpo();
								System.out.println("Los "+jugador2+" lleva "+resultado2+" puntos en total");
							}
							if (opcionAtaque==2 && opcionDefensa==2) {
								resultado2 = resultado2+saltoCortoDefensaFuerte();
								System.out.println("Los "+jugador2+" lleva "+resultado2+" puntos en total");
							}
                                                        System.out.println("Presiona ENTER para continuar");
							System.in.read(); 
							limpiarPantalla();
							System.out.println("Turno del "+jugador1);
							System.out.println("Presione ENTER para continuar");
							System.in.read(); 
                                                        limpiarPantalla();
							System.out.println("Eliga una de las opciones de ataque que se le presentan a continuacion");
							System.out.println("1. Salto Largo (3 pts y 65% probabilidad de anotar)");
							System.out.println("2. Salto Corto (2 pts y 80% probabilidad de anotar)");
							opcionAtaque = scanner.nextInt();
							limpiarPantalla();
							if (opcionAtaque==1) {
								System.out.println("A elegido Salto Largo");
								System.out.println("Presione ENTER para saber su resultado");
							} else {
								if (opcionAtaque==2) {
									System.out.println("A elegido Salto Corto");
									System.out.println("Presione ENTER para saber su resultado");
								}
							}
							System.in.read(); 
							limpiarPantalla();
							System.out.println("Turno del "+jugador2);
							System.out.println("Presione ENTER para continuar");
							System.in.read(); 
							limpiarPantalla();
							System.out.println("Eliga una de las opciones de defensa que se le presentan a continuacion");
							System.out.println("1. Defensa cuerpo a cuerpo (reduce la posibilidad de anotar en un 15% y da un 35% de posibilidad de cometer falta");
							System.out.println("2. Defensa fuerte (reduce la posibilidad de anotar en un 30% y da un 65% de probabilidad de cometer falta");
							opcionDefensa = scanner.nextInt();
							limpiarPantalla();
							if (opcionDefensa==1) {
								System.out.println("A elegido defensa cuerpo a cuerpo");
								System.out.println("Presione ENTER para saber su resultado");
							} else {
								if (opcionDefensa==2) {
									System.out.println("A elegido defensa fuerte");
									System.out.println("Presione ENTER para saber su resultado");
								}
							}
							System.in.read(); 
							limpiarPantalla(); 
							if (opcionAtaque==1 && opcionDefensa==1) {
								resultado = resultado+saltoLargoDefensaCuerpoaCuerpo();
								System.out.println("Los "+jugador1+" lleva "+resultado+" puntos en total");
							}
							if (opcionAtaque==1 && opcionDefensa==2) {
								resultado = resultado+saltoLargoDefensaFuerte();
								System.out.println("Los "+jugador1+" lleva "+resultado+" puntos en total");
							}
							if (opcionAtaque==2 && opcionDefensa==1) {
								resultado = resultado+saltoCortoDefensaCuerpoaCuerpo();
								System.out.println("Los "+jugador1+" lleva "+resultado+" puntos en total");
							}
							if (opcionAtaque==2 && opcionDefensa==2) {
								resultado = resultado+saltoCortoDefensaFuerte();
								System.out.println("Los "+jugador1+" lleva "+resultado+" puntos en total");
							}
                                                        System.out.println("Presiona ENTER para continuar");
							System.in.read(); 
                                                        limpiarPantalla();
							// -------------------------------------------------------------------------------------------------------
						}
					}
				}
				if (resultado>resultado2) {
					System.out.println("Felicidades "+jugador1+" han ganado el partido"); //si la variable resultado es mayor a resultado2 se muestra en pantalla al ganador (jugador1)
				}
				if (resultado<resultado2) {
					System.out.println("Felicidades "+jugador2+" han ganado el partido"); //La misma situacion con el jugador 2 si llega a tener mas puntos
				}
				if (resultado==resultado2) {
					System.out.println("Han quedado empates"); //Que el partido quede empate tambien es una opcion 
				}
			
			
			System.out.println("Desea jugar de nuevo?  1. SI    Cualquier otro numero. No");
			repetirPrograma = scanner.nextInt();
			limpiarPantalla();
		}
	}
        //Turno de los metodos que se usaron en este juego, cada metodo representa cada posibilidad que elijan ya sea jugador 1 y 2 
    
	public static int faltaTiroLibre() throws IOException { //Metodo que define la posibilidad de anotacion de los tiros libres 
		int total=0;
		int tiroLibre = (int)(Math.random()*100)+1;
		int anotacionFalta = 2;
		System.out.println("Has cometido una falta");
		System.out.println("Contrincante porfavor presiona ENTER para hacer tu tiro");
		System.in.read(); 
		System.out.println(""); 
		if (tiroLibre<=90) { //si tiro libre<90 la anotacion se dara
			System.out.println("Has anotado "+anotacionFalta);
			total = total+anotacionFalta;
		} else {
			if (tiroLibre>90) {
				System.out.println("Has fallado");
			}
		}
		return total;
	}

	public static int saltoLargoDefensaCuerpoaCuerpo() throws IOException { //metodo que muestra lo que hace si se elige salto largo y defensa cuerpo a cuerpo en el mismo turno
		int falta;
                int total2=0;
		int anotacionSaltoLargo = 3;
		int tiroSaltoLargo = (int)(Math.random()*100)+1;
		int faltaCuerpoaCuerpo = (int)(Math.random()*100)+1;
		if (faltaCuerpoaCuerpo>35) {
			if (tiroSaltoLargo<=50) {
				System.out.println("Has anotado "+anotacionSaltoLargo);
				total2 = total2+anotacionSaltoLargo;
			} else {
				if (tiroSaltoLargo>50) {
					System.out.println("Has fallado");
				}
			}
		} else {
			if (faltaCuerpoaCuerpo<=35) {
				falta = faltaTiroLibre();
				System.out.println(falta);
				total2 = total2+falta;
			}
		}
		return total2;
	}

	public static int saltoLargoDefensaFuerte() throws IOException { //metodo que da los resultados si se elije salto largo y defensa fuerte en el mismo turno 
		int falta2;
		int total3=0;
		int anotacionSaltoLargo = 3;
		int tiroSaltoLargo2 = (int)(Math.random()*100)+1;
		int faltaFuerte = (int)(Math.random()*100)+1;
		if (faltaFuerte>65) {
			if (tiroSaltoLargo2<=35) {
				System.out.println("Has anotado "+anotacionSaltoLargo);
				total3 = total3+anotacionSaltoLargo;
			} else {
				if (tiroSaltoLargo2>35) {
					System.out.println("Has fallado");
				}
			}
		} else {
			if (faltaFuerte<=65) {
				falta2 = faltaTiroLibre();
				System.out.println(falta2);
				total3 = total3+falta2;
			}
		}
		return total3;
	}

	public static int saltoCortoDefensaCuerpoaCuerpo() throws IOException { //si en el mismo turno se elije salto corto y defensa cuerpo a cuerpo este metodo da las instrucciones a lo que debe suceder
		int falta3;
		int total4=0;
		int anotacionSaltoCorto = 2;
		int tiroSaltoCorto = (int)(Math.random()*100)+1;
		int faltaCuerpoaCuerpo2 = (int)(Math.random()*100)+1;
		if (faltaCuerpoaCuerpo2>35) {
			if (tiroSaltoCorto<=65) {
				System.out.println("Has anotado "+anotacionSaltoCorto);
				total4 = total4+anotacionSaltoCorto;
			} else {
				if (tiroSaltoCorto>65) {
					System.out.println("Has fallado");
				}
			}
		} else {
			if (faltaCuerpoaCuerpo2<=35) {
				falta3 = faltaTiroLibre();
				System.out.println(falta3);
				total4 = total4+falta3;
			}
		}
		return total4;
	}

	public static int saltoCortoDefensaFuerte() throws IOException { //Metodo que demuestra lo que sucede si se elije salto corto y defensa fuerte
		int falta4;
                int total5=0;
		int anotacionSaltoCorto = 2;
		int tiroSaltoCorto2 = (int)(Math.random()*100)+1;
		int faltaFuerte2 = (int)(Math.random()*100)+1;
		if (faltaFuerte2>65) {
			if (tiroSaltoCorto2<=50) {
				System.out.println("Has anotado "+anotacionSaltoCorto);
				total5 = total5+anotacionSaltoCorto;
			} else {
				if (tiroSaltoCorto2>50) {
					System.out.println("Has fallado");
				}
			}
		} else {
			if (faltaFuerte2<=65) {
				falta4 = faltaTiroLibre();
				System.out.println(falta4);
				total5 = total5+falta4;
			}
		}
		return total5;
	}

//-----------------------------------------------------------------------------------------------------------------    
    
//------------------------------------------------------------------------------METODOS PARA EL JUEGO DE CARTAS
	public static void cartas() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int cartaApuesta;
		int repetirPrograma = 1;
		while (repetirPrograma==1) {
			System.out.println("Bienvenido al Juego de Cartas");
                        System.out.println("Presiona ENTER para continuar");
                        System.in.read();
                        limpiarPantalla();
                        System.out.println("Este juego se trata de apostar usando numeros de cartas");
                        System.out.println("En cada turno el casino presenta el numero de dos cartas y usted apostara dinero");
                        System.out.println("dependiendo de las probabilidades que usted crea que tenga de ganar.");
                        System.out.println("Si el casino presenta el numero de dos cartas iguales el turno se invalida.");
                        System.out.println("Si el casino presenta dos cartas seguidas el turno se invalida.");
                        System.out.println("Si la carta que a usted le sale es igual a las que el casino presenta, el turno se invalida.");
                        System.out.println("Si el turno se invalida por cualquiera de estas razones usted no pierde dinero.");
                        System.out.println("");
                        System.out.println("Porfavor presione Enter para continuar");
                        System.in.read();
                        limpiarPantalla();
			System.out.println("Porfavor ingrese el monto con el que iniciara"); //Pide el monto con el que se iniciara
			int montoInicial = scanner.nextInt();
                        limpiarPantalla();
			while (montoInicial>0) {
				int carta1 = cartaMenor();  //incova al metodo cartamenor() y las instrucciones que en el estan
				int carta2 = cartaMayor();  //Invoca al metodo cartamayor() y las instrucciones que en el estan
				int cartaAnt = carta1-1;    //Esta variable es para que si en las dos cartas aleatorias, ambas son seguidas, marque error 
				int cartaAnt2 = carta2-1;   
				System.out.println(carta1+"-"+carta2);
				System.out.println("Ingrese la cantidad que desea apostar");
				int apuesta = scanner.nextInt();
				if (apuesta>montoInicial) { //Si la cantidad a apostar es mayor al capital inicial entonces no se permite la jugada
					System.out.println("No posees esa cantidad, intenta otra vez");
                                        System.out.println("Presiona ENTER para apostar otra vez");
					System.in.read(); 
                                        limpiarPantalla();                    
				} else {
					cartaApuesta = (int)(Math.random()*13)+1;   //Carta aleatoria a mostrar
					System.out.println("La carta que salio es: "+cartaApuesta);
					if (carta1>carta2 && carta2!=cartaAnt) {
						if (cartaApuesta>carta2 && cartaApuesta<carta1) {
							montoInicial = montoInicial+apuesta;    //variable para contabilizar cuanto lleva ganando o perdiendo el jugador 
							System.out.println(montoInicial);
                                                        System.out.println("Presiona ENTER para continuar");
							System.in.read(); 
							limpiarPantalla();
						}
						if (cartaApuesta<carta2 || cartaApuesta>carta1) {
							montoInicial = montoInicial-apuesta;
							System.out.println(montoInicial);
                                                        System.out.println("Presiona ENTER para continuar");
							System.in.read(); 
							limpiarPantalla();
						}
						if (cartaApuesta==carta1 || cartaApuesta==carta2) { // sentencias o ciclos para detectar errores como por ejemplo si las cartas que saca el casino ambas son iguales
							System.out.println("Cartas invalidas por ser iguales a la que se acaba de sacar"); 
							System.out.println("presiona cualquier tecla para seguir");
							System.in.read(); 
                                                        limpiarPantalla();
						}
					}
					if (carta2==cartaAnt) { //if para detectar errores
						System.out.println("Ronda invalida porque ambas cartas estan seguidas");
						System.out.println("Presiona cualquier tecla para seguir");
						System.in.read(); 
                                                limpiarPantalla();
					}
					if (carta2>carta1 && carta1!=cartaAnt2) { // si no hay errores, el juego prosigue segun las reglas
						if (cartaApuesta>carta1 && cartaApuesta<carta2) {
							montoInicial = montoInicial+apuesta;
							System.out.println(montoInicial);
                                                        System.out.println("Presiona ENTER para continuar");
							System.in.read(); 
							limpiarPantalla(); 
						}
						if (cartaApuesta<carta1 || cartaApuesta>carta2) {
							montoInicial = montoInicial-apuesta;
							System.out.println(montoInicial);
                                                        System.out.println("Presiona ENTER para continuar");
							System.in.read(); 
							limpiarPantalla(); 
						}
						if (cartaApuesta==carta1 || cartaApuesta==carta2) {
							System.out.println("Cartas invalidas por ser iguales a la que se acaba de sacar");
							System.out.println("presiona ENTER tecla para seguir");
							System.in.read(); 
                                                        limpiarPantalla();
						}
					}
					if (carta1==cartaAnt2) {
						System.out.println("Ronda invalida porque ambas cartas estan seguidas");
						System.out.println("Presiona ENTER para seguir");
						System.in.read();
                                                limpiarPantalla();
					}
					if (carta2==carta1) {
						System.out.println("Ronda invalida por igualdad en cartas");
                                                System.out.println("Presiona ENTER para continuar");
						System.in.read(); 
                                                limpiarPantalla();
					}
				}
			}
			if (montoInicial<=0) {
				System.out.println("Te has quedado sin dinero, el juego a terminado");
			}
			System.in.read(); 
			System.out.println(""); 
			System.out.println("Desea jugar otra vez??   1.Si    Cualquier otro numero=volver al MENU");
			repetirPrograma = scanner.nextInt();
                        limpiarPantalla();
		}
        }

	public static int cartaMenor() { //metodo que se encarga de sacar la carta aleatoria menor de las dos 
		int cartaaleatoria1 = (int)(Math.random()*13)+1;
		int resultado = cartaaleatoria1;
		return resultado;
	}

	public static int cartaMayor() { //metodo que se encarga de sacar la carta aleatoria mayor de las dos 
		int cartaaleatoria2 = (int)(Math.random()*13)+1;
		int resultado2 = cartaaleatoria2;
		return resultado2;
	}
//-----------------------------------------------------------------------------------------------------------------------

//-----------------------------------------------------------------------------------METODOS PARA HANOI
        public static void hanoi() throws IOException {
                 Scanner scanner = new Scanner(System.in); 
		String falla="Movimiento erroneo, porfavor intente otra vez";   //Variable que se usara para mostrar en los errores
		int numDiscos[][] = new int[3][10]; //matriz para la cantidad maxima de discos (10) en las torres (3)
		int torre[] = new int[3];   //variable para dibujar las 3 torres
		int repetirPrograma = 1;
		while (repetirPrograma==1) { //mientras repetirPrograma sea 1 el juego vuelve a iniciar una vez terminado
			System.out.println("Bienvenido a Las torres de Hanoi");
                        System.out.println("Presiona ENTER para continuar");
                        System.in.read();
                        limpiarPantalla();
                        System.out.println("El juego consiste en el clasico desafio de las TORRES DE HANOI, las reglas son simples,");
                        System.out.println("debes mover la cantidad de discos de la torre 1 a la torre 3 en el orden que se te presentan");
                        System.out.println("no se permite mover un disco encima de uno de menor longitud, la cantidad de oportunidades ");
                        System.out.println("es ilimitada y por si eres curioso al finalizar el juego veras cuantas oportunidades te ");
                        System.out.println("hiciste en total asi que...A JUGAR!!  (Presiona ENTER para continuar)");
                        System.in.read();
                        limpiarPantalla();
                        System.out.println("Ingrese la cantidad de discos con los que jugara");
			System.out.println("Minimo 2, Maximo 10");
			int cantDiscos = scanner.nextInt();
                        limpiarPantalla();
			while (cantDiscos<2 || cantDiscos>10) { //si la cantidad de discos ingresada no esta en el rango mostrar error
				System.out.println("El numero que ingreso esta fuera de los parametros");
				cantDiscos = scanner.nextInt();
                                limpiarPantalla();
			}
			torre[0] = cantDiscos; //Inicializacion de los datos para que al principio los discos se coloquen en la torre 1 
			torre[1] = 0;
			torre[2] = 0;
			for (int contadorY=1;contadorY<=cantDiscos;contadorY++) {
				numDiscos[0][contadorY-1] = cantDiscos-contadorY+1; //ciclo for para ir contando los discos y disminuyendolos a paso -1 
			}
                        int cantTiros=0;
			while (torre[2]!=cantDiscos) { //mientras todos los discos no esten en la torre 3 seguir 
				System.out.println(""); 
				for (int posicionX=1;posicionX<=3;posicionX++) {
					System.out.println("torre: "+posicionX);
					for (int posicionY=torre[posicionX-1];posicionY>=1;posicionY--) {  //ciclo para denotar la posicion de los discos 
						switch (numDiscos[posicionX-1][posicionY-1]) { //switch para cuando el jugador ingrese la cantidad de discos y asi dibujarlos
						case 1:
							System.out.println("            z");
							break;
						case 2:
							System.out.println("           zzz");
							break;
						case 3:
							System.out.println("          zzzzz");
							break;
						case 4:
							System.out.println("         zzzzzzz");
							break;
						case 5:
							System.out.println("        zzzzzzzzz");
							break;
						case 6:
							System.out.println("       zzzzzzzzzzz");
							break;
						case 7:
							System.out.println("      zzzzzzzzzzzzz");
							break;
						case 8:
							System.out.println("     zzzzzzzzzzzzzzzz");
							break;
						case 9:
							System.out.println("    zzzzzzzzzzzzzzzzzz");
							break;
						case 10:
							System.out.println("   zzzzzzzzzzzzzzzzzzzz");
							break;
						}
					}
					System.out.println("------------------------------");
					System.out.println("");
					System.out.println("");
				}
				System.out.println("Numero de la torre desde donde desea mover ");  //Empieza el juego pidiendo movimiento desde la torre x
				int disco1 = scanner.nextInt();
				System.out.println("Numero de la torre a donde desea mover "); //para luego mover ese disco a la torre y
				int disco2 = scanner.nextInt();
				if (disco1<1 || disco1>3 || disco2<1 || disco2>3) { //si los discos estan fuera de los parametros asignados marcar error
					System.out.println(falla);
					System.in.read(); 
				} else {
					if (torre[disco1-1]==0) { //si se quiere mover un disco en una torre donde en ese momento noo hay ningun disco, marcar error
						System.out.println(falla);
						System.in.read(); 
					} else {
						int discoMover = numDiscos[disco1-1][torre[disco1-1]-1]; //discoMover es la variable que denota el disco que se movera 
						boolean siPuede = true; //booleano para saber cuando es posible o no el movimiento
						if (torre[disco2-1]!=0) {
							if (discoMover>numDiscos[disco2-1][torre[disco2-1]-1]) {
								siPuede = false; //falso si el disco a mover es mayor al disco que se encuentra en la torre a la que se quiere mover 
							}
						}
						if (siPuede==true) { // si el boleano es verdadero, empiezan las instrucciones para como mover el disco
                                                        cantTiros=cantTiros+1;  //contador para luego escribir la cantidad de oportunidades que el jugador se llevo 
							torre[disco2-1] = torre[disco2-1]+1;    //movimiento del disco
							numDiscos[disco2-1][torre[disco2-1]-1] = discoMover;
							torre[disco1-1] = torre[disco1-1]-1;
						} else {
							System.out.println(falla);
							System.in.read(); 
						}
					}
				}
                                        limpiarPantalla();
                                
			}
			System.out.println("Felicidades, has ganado el juego");
                        System.out.println("Y lo lograste en "+cantTiros+" movimientos!!!");
			System.out.println("Porfavor presiona ENTER para continuar");
			System.in.read(); 
			System.out.println(""); 
			System.out.println("Deseas jugar de nuevo?  1. SI  Cualquier otro numero. Volver al menu");
			repetirPrograma = scanner.nextInt();
                        limpiarPantalla();
                        
		}
	}
//--------------------------------------------------------------------------------------------Metodo para limpiar pantalla en cada juego        
public static void limpiarPantalla(){
    for (int limpiarPantalla=0; limpiarPantalla<=40; limpiarPantalla++){
        System.out.println("");
    }
}

}


    




