/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unimap;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 *
 * @author usuariolocal
 */
public class Loader {
    
    Auditorio a;
    AreaRecreativa ar;
    Biblioteca bi;
    Coordinacion coo;
    Papeleria pp;
    PuestoDeComida pc;
    
    ArrayList <String> data = new ArrayList<>();
        
    HashMap<String, Auditorio> auditorio = new HashMap<>();
    HashMap<String, AreaRecreativa> areaRecreativa = new HashMap<>();
    HashMap<String, Biblioteca> bibliotecas = new HashMap<>();
    HashMap<String, Coordinacion> coordinacion = new HashMap<>();
    HashMap<String, Papeleria> papeleria = new HashMap<>();
    HashMap<String, PuestoDeComida> puestoDeComida = new HashMap<>();
    int n; 
    
    private ArrayList<String> readFile(String dato) {
        ArrayList<String> l = new ArrayList<>();
        try {
            InputStream in = getClass().getResourceAsStream(dato);
            BufferedReader bufferde = new BufferedReader(new
            InputStreamReader(in));
            
            String linea = "";
            
            for (linea = bufferde.readLine(); linea != null; linea = bufferde.readLine()){
                l.add(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return l;
    }
    
    public Loader(){
        ArrayList <String> dir = new ArrayList<>();
        ArrayList <String> f = new ArrayList<>();
        
        n = 0;
        try{
            CodeSource src = getClass().getProtectionDomain().getCodeSource();
            if (src != null){
                URL jar = src.getLocation();
                ZipInputStream zip = new ZipInputStream(jar.openStream());
                while(true){
                    ZipEntry e = zip.getNextEntry();
                    if(e == null)
                        break;
                    String name = e.getName();
                    if (name.endsWith(".TXT")){
                        dir.add(e.getName());
                    }else
                    if (e.isDirectory() && e.getName().startsWith("info/")){
                        f.add(e.getName());
                    }
                }
            }
        }catch(IOException ioe){
            System.out.println(ioe);
        }
        for (int i = 0; i < dir.size(); i++) {
            String ruta = f.get(i+1).replace(f.get(0),"");
            if (dir.get(i).endsWith(".TXT")){
                ArrayList<String> linea = readFile("/"+dir.get(i));
                int Tamaño = linea.size();
                    n = 0;
                    do{
                        if (Tamaño > n+1){
                            int m = linea.size();
                            String[] lista = linea.get(n).split(",");
                            switch(ruta.replace("/","")){
                                case "aud":
                                    a = new Auditorio();
                                    a.nombre = lista[0];
                                    a.departamento = lista[1];
                                    a.comoLlegar = lista[2];
                                    a.imagen = lista[3];
                                    a.imagen2 = lista[4];
                                    auditorio.put(n+"aud", a);
                                    break;
                                case "bi":
                                    bi = new Biblioteca();
                                    bi.carrera = lista[0];
                                    bi.horario = lista[1];
                                    bi.encargado = lista[2];
                                    bi.localizacion = lista[3];
                                    bi.web = lista[4];
                                    bi.comoLlegar = lista[5];
                                    bi.imagen = lista[6];
                                    bi.imagen2 = lista[7];
                                    bibliotecas.put(n+"bi", bi);
                                    break;
                                case "pc":
                                    pc = new PuestoDeComida();
                                    if (lista[0].startsWith("Caffenio")){
                                        pc.nombre = lista[0];
                                        pc.localizacion = lista[1];
                                        pc.MenuGeneral = "";
                                        pc.imagen = lista[2];
                                        pc.imagen2 = lista[3];
                                    }
                                    else{
                                        pc.nombre = lista[0];
                                        pc.localizacion = lista[1];
                                        String sustitucion = lista[2].replace(".", ",");
                                        pc.MenuGeneral = sustitucion;
                                        pc.imagen = lista[3];
                                        pc.imagen2 = lista[4];
                                    }
                                    puestoDeComida.put(n+"pc", pc);
                                    break;
                                case "coo":
                                    coo = new Coordinacion();
                                    coo.carrera = lista[0];
                                    coo.localizacion = lista[1];
                                    coo.horario = lista[2];
                                    coo.nombreCoordinador = lista[3];
                                    coo.correoCoordinador = lista[4];
                                    coo.telefonoCoordinador = lista[5];
                                    coo.imagen = lista[6];
                                    coo.imagen2 = lista[7];
                                    coordinacion.put(n+"coo", coo);
                                    break;
                                case "pint":
                                    ar = new AreaRecreativa();
                                    ar.nombre = lista[0];
                                    ar.comoLlegar = lista[1];
                                    ar.imagen = lista[2];
                                    ar.imagen2 = lista[3];
                                    areaRecreativa.put(n+"pint", ar);
                                    break;
                                case "pp":
                                    pp = new Papeleria();
                                    pp.nombre = lista[0];
                                    pp.comoLlegar = lista[1];
                                    pp.imagen = lista[2];
                                    pp.imagen2 = lista[3];
                                    papeleria.put(n+"pp", pp);
                                    break;
                            }

                        }else
                            break;
                        n++;
                    }while(true);
//                    }
            }
        }
//        }catch(FileNotFoundException fnfe){
//            System.out.println("Archivo no encontrado");
//        }catch(IOException ioe){
//            System.out.println(ioe.getMessage());
//        }
        
    }
    
    public String LoadBibliotecas(String dato){
        String carrera = "Nombre: " + bibliotecas.get(dato).carrera + "\n";
        String horario = "Horario: " + bibliotecas.get(dato).horario + "\n";
        String encargado = "Encargado: " + bibliotecas.get(dato).encargado + "\n";
        String localizacion = "Localización: " + bibliotecas.get(dato).localizacion + "\n";
        String web = "WEB: " + bibliotecas.get(dato).web + "\n";
        String comollegar = "Dirección: " + bibliotecas.get(dato).comoLlegar + "\n";
        String image = "image:" + bibliotecas.get(dato).imagen;
        String image2 = " image:" + bibliotecas.get(dato).imagen2;
        dato = carrera + horario + encargado + localizacion + web + comollegar + image + image2;
        return dato;
    }
    
    public String LoadPuestosDeComida(String dato){
        String nombre = "", loca = "", menu = "", image = "", image2 = "";
        if (puestoDeComida.get(dato).nombre.startsWith("Caffenio")){
            nombre = "Nombre: " + puestoDeComida.get(dato).nombre + "\n";
            loca = "Dirección: " + puestoDeComida.get(dato).localizacion + "\n";
            image = "image:" + puestoDeComida.get(dato).imagen;
            image2 = " image:" + puestoDeComida.get(dato).imagen2;
            dato = nombre + loca + image + image2;
        }else{
            nombre = "Nombre: " + puestoDeComida.get(dato).nombre + "\n";
            loca = "Dirección: " + puestoDeComida.get(dato).localizacion + "\n";
            menu = "Menú: " + puestoDeComida.get(dato).MenuGeneral + "\n";
            image = "image:" + puestoDeComida.get(dato).imagen;
            image2 = " image:" + puestoDeComida.get(dato).imagen2;
            dato = nombre + loca + menu + image + image2;
        }
        return dato;
    }
    
    public String LoadPapelerias(String dato){
        String lugar = "Nombre: " + papeleria.get(dato).nombre + "\n";
        String comollegar = "Dirección: " + papeleria.get(dato).comoLlegar + "\n";
        String image = "image:" + papeleria.get(dato).imagen;
        String image2 = " image:" + papeleria.get(dato).imagen2;
        dato = lugar + comollegar + image + image2;
        return dato;
    }
    
    public String LoadAreasReacreativas(String dato){
        String nombre = "Nombre: " + areaRecreativa.get(dato).nombre + "\n";
        String dir = "Dirección: " + areaRecreativa.get(dato).comoLlegar + "\n";
        String image = "image:" + areaRecreativa.get(dato).imagen;
        String image2 = " image:" + areaRecreativa.get(dato).imagen2;
        dato = nombre + dir + image + image2;
        return dato;
    }
    
    public String LoadCoordinaciones(String dato){
        String carrera = "Carrera: " + coordinacion.get(dato).carrera + "\n";
        String localizacion = "Dirección: " + coordinacion.get(dato).localizacion + "\n";
        String horario = "Horario: " + coordinacion.get(dato).horario + "\n";
        String nombre = "Nombre del Coord.: " + coordinacion.get(dato).nombreCoordinador + "\n";
        String correo = "Correo del Coord.: " + coordinacion.get(dato).correoCoordinador + "\n";
        String telefono = "Telefono: " + coordinacion.get(dato).telefonoCoordinador + "\n";
        String image = "image:" + coordinacion.get(dato).imagen;
        String image2 = " image:" + coordinacion.get(dato).imagen2;
        dato = carrera + localizacion + horario + nombre + correo + telefono + image + image2;
        return dato;
    }
    
    public String LoadAuditorios(String dato){
        String nombre = "Nombre: " + auditorio.get(dato).nombre + "\n";
        String departamento = "Departamento: " + auditorio.get(dato).departamento  + "\n";
        String comoLlegar = "Dirección: " + auditorio.get(dato).comoLlegar  + "\n";
        String image = "image:" + auditorio.get(dato).imagen;
        String image2 = " image:" + auditorio.get(dato).imagen2;
        dato = nombre + departamento + comoLlegar + image + image2;
        return dato;
    }
    
}
