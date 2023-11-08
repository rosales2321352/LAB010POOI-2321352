import classes.Direccion;
import classes.EstudianteTemporal;
import classes.EstudianteUniversitario;
import classes.NumeroCelular;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<EstudianteUniversitario> estudianteUniversitarioList = Arrays.asList(
                new EstudianteUniversitario("Juan Ramon","Marti Mateu",65,"Ing. Software",new Direccion("07764","Pasaje San Isidro 75","Madrid","Navarra"),Arrays.asList(new NumeroCelular("652306669"),new NumeroCelular("696383593"))),
                new EstudianteUniversitario("Maria Belen","Benitez Ibañez",64,"Administración",new Direccion("25035","Avenida San Miguel 207","Lanzarote","Segovia"),Arrays.asList(new NumeroCelular("695043731"),new NumeroCelular("695043731"))),
                new EstudianteUniversitario("Candido","Solano Escobar",65,"Ing. Software",new Direccion("77878","Calle Antonio Machado 744","Cáceres","Valladolid"),Arrays.asList(new NumeroCelular("634144005"),new NumeroCelular("634144005"))),
                new EstudianteUniversitario("Andrea","Flores Araujo",34,"Administración",new Direccion("17817","Carrera Miguel de Cervantes 93","La Rioja","Cantabria"),Arrays.asList(new NumeroCelular("612992126"),new NumeroCelular("612992126"))),
                new EstudianteUniversitario("Maria Esther","Ferreira Leal",51,"Ing. Software",new Direccion("53647","Avenida Doctor Fleming 746","León","Tarragona"),Arrays.asList(new NumeroCelular("696383593"),new NumeroCelular("696383593"))),
                new EstudianteUniversitario("Eugenia","Guerrero Carrasco",36,"Ing. Software",new Direccion("92138","Corredera Fuente 296","A coruña","Barcelona"),Arrays.asList(new NumeroCelular("696383593"),new NumeroCelular("699114381"))),
                new EstudianteUniversitario("Amparo","Canovas Soria",39,"Ing. Software",new Direccion("70124","Corredera Diego Velázquez 966","La Rioja","Castellón/Castelló"),Arrays.asList(new NumeroCelular("672303198"),new NumeroCelular("672303198"))),
                new EstudianteUniversitario("Javier","Contreras Vela",81,"Diseño Grafico",new Direccion("09769","Carrera Manuel de Falla 22","Cáceres","Tarragona"),Arrays.asList(new NumeroCelular("696383593"),new NumeroCelular("625008468"))),
                new EstudianteUniversitario("Olivia","Jimenez Cruz",55,"Diseño Grafico",new Direccion("55016","Ronda Rafael Murillo 881","Melilla","Sevilla"),Arrays.asList(new NumeroCelular("601788984"),new NumeroCelular("696383593"))),
                new EstudianteUniversitario("Luis Maria","Cano Tomas",21,"Ing. Industrial",new Direccion("73456","Travesía Miguel de Cervantes 623","Navarra","Rioja, La"),Arrays.asList(new NumeroCelular("696383593"),new NumeroCelular("666732606"))),
                new EstudianteUniversitario("Lorena","Cardenas Barreiro",48,"Ing. Software",new Direccion("24669","Camino Clara Campoamor 202","Bilbao","Salamanca"),Arrays.asList(new NumeroCelular("653686143"),new NumeroCelular("653686143"))),
                new EstudianteUniversitario("Saray","Estevez Alonso",39,"Ing. Software",new Direccion("19185","Vereda Catalunya 961","Sevilla","Valencia/València"),Arrays.asList(new NumeroCelular("626959904"),new NumeroCelular("626959904"))),
                new EstudianteUniversitario("Carles Alonso ","Aragon",23,"Administración",new Direccion("11998","Avenida Ramón y Cajal 918","Lanzarote","Huesca"),Arrays.asList(new NumeroCelular("637240405"),new NumeroCelular("637240405"))),
                new EstudianteUniversitario("Sheila","Ferrer Escudero",47,"Diseño Grafico",new Direccion("16005","Cuesta Nueva 85","Mallorca","Tarragona"),Arrays.asList(new NumeroCelular("622769827"),new NumeroCelular("622769827"))),
                new EstudianteUniversitario("Esther","Aguado Requena",26,"Ing. Software",new Direccion("74023","Camino Clara Campoamor 902","Sevilla","Ceuta"),Arrays.asList(new NumeroCelular("730413740"),new NumeroCelular("730413740")))
        );

        String nombre = "Luis Maria";
        String apellidos = "Cano Tomas";
        EstudianteUniversitario getEstudianteNombre = estudianteUniversitarioList.stream()
                .filter(x -> x.getNombre().equals(nombre) && x.getApellidos().equals(apellidos))
                .findFirst().get();
        System.out.println(getEstudianteNombre.getNombre());

        Direccion direccion = new Direccion("09769","Carrera Manuel de Falla 22","Cáceres","Tarragona");
        EstudianteUniversitario getEstudianteDireccion = estudianteUniversitarioList.stream()
                .filter(x -> x.getDireccion().getZipcode().equals(direccion.getZipcode())
                    && x.getDireccion().getCalle().equals(direccion.getCalle())
                    && x.getDireccion().getDistrito().equals(direccion.getDistrito())
                    && x.getDireccion().getProvincia().equals(direccion.getProvincia())
                )
                .findFirst().get();
        System.out.println(getEstudianteDireccion.getNombre());

        String numero_ = "696383593";

        List<EstudianteUniversitario> estudiantesConNumero = estudianteUniversitarioList.stream()
                .filter(estudiante -> estudiante.getNumeros().stream().anyMatch(numero -> numero.getNumero().equals(numero_)))
                .toList();

        estudiantesConNumero.forEach(x -> System.out.println(x.getNombre()));


        List<EstudianteTemporal> estudianteTemporalList = estudianteUniversitarioList.stream()
                .map(x -> new EstudianteTemporal(x.getNombre()+" "+x.getApellidos(),x.getEdad(),x.getDireccion(),x.getNumeros()))
                .toList();
        estudianteTemporalList.forEach(x -> System.out.println(x.getName()));

        List<String> listadoNombres = estudianteTemporalList.stream()
                .map(EstudianteTemporal::getName)
                .toList();
        System.out.println(listadoNombres);

        List<String> listadoNombresMayusculas = estudianteTemporalList.stream()
                .map(x -> x.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(listadoNombresMayusculas);

        Optional<List<String>> listadoNombresConR = listadoNombresMayusculas.stream()
                .filter(x -> x.startsWith("R"))
                .collect(Collectors.collectingAndThen(Collectors.toList(), Optional::of));
        System.out.println(listadoNombresConR);
    }


}