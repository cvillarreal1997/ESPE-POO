#include<iostream>
#include<stdlib.h>
#include<fstream>
#include<string.h>
using namespace std;
struct datos{
	char nombreacargo[20];
	char dia[20];
	string hora;
	int codigo=0;
	int clave;
	int piso;
string aula;
	
	
	
};

datos asignacion;
void menu();
void ingreso(datos asig );
void visualizar(datos asig );
void modificaciones(datos asig );



int main (){	
	menu();
	
	
}
//menu de opciones
void menu(){
		int op;
	do{
		cout<<"-----------Menu-----------"<<endl;
		cout<<"1.-Agregar reservacion"<<endl;
		cout<<"2.-Visualizar Reservaciones"<<endl;
		cout<<"3.-Modificaciones"<<endl;
		cout<<"4.-Salir"<<endl;
		cout<<"\nEliga una opcion:";
		cin>>op;
		system("cls");
		switch(op){
			case 1:
			ingreso(asignacion);
				break;
			case 2:
				system("cls");
			visualizar(asignacion );
			system("pause");
				break;
			case 3:
				system("cls");
				modificaciones(asignacion);
				break;
			case 4:
				break;
				}
	}while(op!=4); 
	}
	//ingreso de datos al archivo
	
	
	void ingreso(datos asig){
	bool valordeverdad=false;
	ofstream arch_reserv;
	ifstream originalidad;
	int cod=0;
	char op;
	arch_reserv.open("reservar.txt",ios::out|ios::app);
	originalidad.open("reservar.txt",ios::in);
	if (arch_reserv.is_open() && originalidad.is_open()){
		cout<<"                            INGRESO DE DATOS"<<endl<<endl<<endl;
		cout<<"Codigo: "<<endl;
		cin>>cod;
		originalidad>>asig.clave;
	while(!originalidad.eof()){
	//originalidad>>asig.nombreacargo>>asig.dia>>asig.hora>>asig.piso>>asig.aula;
	if(cod==asig.clave){
		cout<<"Ya existe un registro con esa clave"<<endl;
		valordeverdad=true;
		system("pause");
		system("cls");
		break;
	}
	originalidad>>asig.clave;
}

if(valordeverdad==false){
cout<<"Nombre de la persona a cargo"<<endl;
		fflush(stdin);
		cin.getline(asig.nombreacargo,20,'\n');
		cout<<"Dia: "<<endl;
		fflush(stdin);
		cin.getline(asig.dia,20,'\n');
		system("cls");
		int reserv_hor;
	cout<<"--------------Lista de Horario--------------"<<endl;
		cout<<"1.- 7:15 - 9:15"<<endl;
		cout<<"2.- 9:30 - 11:30"<<endl;
		cout<<"3.- 12:00 - 14:00"<<endl;
		cout<<"4.- 15:00 - 17:00"<<endl;
		cout<<"5.- 17:15 - 19:15"<<endl;
		cout<<"6.- 19:30 - 21:30"<<endl;
		cout<<"7.- Regresar al menu "<<endl;
		cout<<"---------------------------------------------"<<endl;
	    cout<<"Escoga el horario que requiera realizar la Reservacion: ";
		cin>>reserv_hor;
		system("cls");
		switch(reserv_hor){
			case 1: 
			asig.hora="7:15 - 9:15";
			break;
			case 2:
			asig.hora=" 9:30 - 11:30";
			break;
			case 3:
			asig.hora=" 12:00 - 14:00";
			break;
			case 4:
	     	asig.hora="15:00 - 17:00";
			break;
			case 5:
			asig.hora="17:15 - 19:15";
			break;
			case 6:
			asig.hora="19:30 - 21:30";
			break;
			case 7:
			menu();	
			break;
			
		}
		cout<<"Numero de Piso"<<endl;
		cin>>asig.piso;
		system("cls");
		cout<<"Seleccione bloque [G/H] :";
	cin>>op;
	system("cls");
	cout<<"    Escoja Aula"<<endl;
    int op2;
    cout<<"1."<<op<<"01"<<endl;
    cout<<"2."<<op<<"02"<<endl;
    cout<<"3."<<op<<"03"<<endl;
    cout<<"4."<<op<<"04"<<endl;
    cout<<"5."<<op<<"05"<<endl;
    cout<<"6."<<op<<"06"<<endl;
    cin>>op2;
    system("cls");
    switch(op2){
    	case 1:
    		asig.aula="01";
			break;
    	case 2:
    	    asig.aula="02";break;
    	case 3:
         	asig.aula="03";break;
    	case 4:
         	asig.aula="04";break;
    	case 5:
    	    asig.aula="05";break;
    	case 6:
    		 asig.aula="06";break;						
    				
	}	
	arch_reserv<<cod<<"      "<<asig.nombreacargo<<"       "<<asig.dia<<"        "<<asig.hora<<"       "<<asig.piso<<"       "<<op<<asig.aula<<endl;
		}
	     
	
			
	}else{
		cout<<"El archivo no existe"<<endl;
	}
	arch_reserv.close();
	originalidad.close();
	
	
}
void visualizar(datos asig ){
	ifstream lectura;
	string copy;
	lectura.open("reservar.txt",ios::in);
	 cout<<"COD       Nombre       Dias             Hora            Piso     Aula"<<endl;
	 cout<<"--------------------------------------------------------"<<endl;
	if(lectura.is_open()){
		while(!lectura.eof()){
	getline(lectura,copy);
	   
	
		cout<<copy<<endl;
     cout<<"---------------------------------------------------------"<<endl;	
					
			
			
		}
	
		
		
		
	}else{
		cout<<"El Archivo no Existe"<<endl;
		exit(1);
	}	
	
		lectura.close();
	
	
}	
//modificaciones
void modificaciones(datos asig ){
	ofstream aux;
	visualizar(asignacion);
	int num;
	ifstream consulta;
    aux.open("reservar.txt",ios::out);
    consulta.open("reservar.txt",ios::in);
    
    if(aux.is_open() && consulta.is_open()){
	cout<<"Ingrese COD del registro: "<<endl,
	cin>>num;
	consulta>>asig.clave;
	while(!consulta.eof()){
		consulta>>asig.nombreacargo>>asig.dia>>asig.hora>>asig.piso>>asig.aula;
		if(num==asig.clave){
		cout<<"Nombre de la persona a cargo: "<<asig.nombreacargo<<endl;
		cout<<"Dia de la reservacion       : "<<asig.dia<<endl;
		cout<<"Hora asignada:                "<<asig.hora;
	    cout<<"Piso         :                "<<asig.piso<<endl;
	    cout<<"Aula        :                 "<<asig.aula<<endl;
		break;
		
		}
		
	consulta>>asig.clave;	
	}
	
	
	
		}else{
			cout<<"El registro no existe"<<endl;
		}


aux.close();
consulta.close();


}
		
				
		
		
		
		
	
	

	
	
	
	
	
	

