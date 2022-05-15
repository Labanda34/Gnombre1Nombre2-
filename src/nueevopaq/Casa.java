package nueevopaq;
import java.util.Scanner;
public class Casa {
Scanner teclado=new Scanner (System.in);
String calle;
int num,cp;

Casa(){
	
}

void Direccion () {
System.out.println("teclea nombre la calle");
calle=teclado.next();
System.out.println("teclea en numero de la calle");
num=teclado.nextInt();
System.out.println("teclea el codigo postal");
cp=teclado.nextInt();
}

void Busqueda() {
if(cp==48610) {
System.out.println("usted pertenece a uribe costa");	
	
}else {
	
System.out.println("usted pertenece al gran bilbao");	
}
	
	
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
Casa obj=new Casa();
obj.Direccion();
obj.Busqueda();
		
		

	}

}
