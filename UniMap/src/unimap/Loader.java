/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unimap;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author usuariolocal
 */
public class Loader {
    
    Gimnasio Gimnasio;
    Nutricion Nutricion;
    Tesoreria Tesoreria;
    Psicologia Psicologia;
    Informatica Informatica;
    Caffenio CaffenioNorte, CaffenioSur;
    ModuloCredencial Credenciales;
    ConsultaMedica Medico;
    Auditorio a;
    AreaRecreativa ar;
    Biblioteca bi;
    Coordinacion coo;
    Papeleria p;
    PuestoDeComida pc;
    ServiciosEscolares se;
    
//    HashMap<String, Auditorio> auditorio = new HashMap();
//    HashMap<String, AreaRecreativa> areaRecreativa = new HashMap();
//    HashMap<String, Biblioteca> bibliotecas = new HashMap();
//    HashMap<String, Coordinacion> coordinacion = new HashMap();
//    HashMap<String, Papeleria> papeleria = new HashMap();
//    HashMap<String, PuestoDeComida> puestoDeComida = new HashMap();
    
    public Loader(){
        String camino = "src\\unimap\\info\\";
        List <String> dir = new ArrayList(), txt = new ArrayList();
        String archivo = "";
        
        try{
            Files.walk(Paths.get(camino)).forEach(ruta-> {
                if (Files.isDirectory(ruta))
                    dir.add(ruta.toString());
                else if (Files.isRegularFile(ruta))
                    txt.add(ruta.toString());
            }); 
            
            for (int p = 0; p < dir.size(); p++) {
                if (dir.get(p).endsWith(".TXT")){
                    File file = new File(dir.get(p));
                    FileReader fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr);
                    String linea = "";
                    do{
                       linea = br.readLine();
                       String []lista = linea.split(",");
                       switch(archivo){
                           case "aud":
                               a = new Auditorio();
                               a.nombre = lista[0];
                               a.departamento = lista[1];
                               a.imagen = lista[2];
                               a.comoLlegar = lista[3];
                               break;
                           case "biblio":
                               bi = new Biblioteca();
                               bi.carrera = lista[0];
                               bi.horario = lista[1];
                               bi.encargado = lista[2];
                               bi.localizacion = lista[3];
                               bi.telefono = lista[4];
                               bi.web = lista[5];
                               bi.comoLlegar = lista[6];
                               bi.imagen = lista[7];
                               bi.servicios = lista[8];
                               break;
                           case "comida":
                               pc = new PuestoDeComida();
                               pc.horario = lista[0];
                               pc.nombre = lista[1];
                               pc.localizacion = lista[2];
                               pc.imagen = lista[3];
                               pc.MenuGeneral = lista[4];
                               break;
                           case "coord":
                               coo = new Coordinacion();
                               coo.localizacion = lista[0];
                               coo.horario = lista[1];
                               coo.nombreCoordinador = lista[2];
                               coo.correoCoordinador = lista[3];
                               coo.telefonoCoordinador = lista[4];
                               break;
                           case "pint":
                               ar = new AreaRecreativa();
                               break;
                           case "serv":
                               se = new ServiciosEscolares();
                               break;
                       }
                    }while(linea.equals(null));
                    br.close();
                }else{
                    if (dir.get(p).length() >= camino.length())
                        archivo = dir.get(p).substring(camino.length());
                }
            }
            
        }catch(FileNotFoundException fnfe){
            System.out.println("Archivo no encontrado");
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        
    }
    
    public Object LoadBibliotecas(){
        Object dato = "";
        return dato;
    }
    
    public Object LoadPuestosDeComida(){
        Object dato = "";
        return dato;
    }
    
    public Object LoadPapelerias(){
        Object dato = "";
        return dato;
    }
    
    public Object LoadAreasReacreativas(){
        Object dato = "";
        return dato;
    }
    
    public Object LoadCoordinaciones(){
        Object dato = "";
        return dato;
    }
    
    public Object LoadAuditorios(){
        Object dato = "";
        return dato;
    }
    
    public Object ShowData(){
        
        Object dato = "";
        return dato;
    }

    
}
