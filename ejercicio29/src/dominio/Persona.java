package dominio;
import dominio.Localidad;
public class Persona{
String nombre;
Localidad lugarDeNacimiento;
public String getNombre(){
return nombre;
}
public void setNombre(String nombre){
this.nombre = nombre;
}
public Localidad getLugarDeNacimiento(){
return lugarDeNacimiento;
}
public void setLugarDeNacimiento(Localidad
localidad){
lugarDeNacimiento = localidad;
}
public String toString(){
return nombre + ", " + lugarDeNacimiento;
}
}
