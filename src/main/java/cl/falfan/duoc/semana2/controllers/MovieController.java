package cl.falfan.duoc.semana2.controllers;

import cl.falfan.duoc.semana2.models.MovieModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {

    private List<MovieModel> dummyData = new ArrayList<>();

    public MovieController() {
        dummyData.add(new MovieModel(1, "Mononoke Hime", 1997, "Hayao Miyazaki", "Fantasia, Drama",
                "Ambientada en " + "un" + " Japón del período Muromachi, se centra en la lucha entre los guardianes " +
                        "sobrenaturales de un" + " bosque" + " y los humanos que profanan sus recursos, visto por el " +
                        "forastero Ashitaka. En realidad, " + "Mononoke " + "(物の怪（もののけ）?) no es un nombre, sino una " +
                        "descripción que puede ser traducida en este " + "contexto como " + "«espíritu vengador»; por" +
                        " lo que el título de la película literalmente podría " + "traducirse como La " + "princesa " +
                        "de los espíritus vengadores. "));

        dummyData.add(new MovieModel(2, "Kill Bill", 2003, "Quentin Tarantino",
                "acción, película de violación y venganza, artes marciales y cine gore",
                "En Kill Bill: Volumen 1, una mujer embarazada, identificada como la Novia, es masacrada y tiroteada " +
                        "en la cabeza, en el ensayo de su boda en una pequeña iglesia al sur de Texas, por sus " +
                        "antiguos camaradas del Escuadrón Asesino Víbora Letal, un grupo de asesinos profesionales " +
                        "que trabajan para el mejor postor, venganza, guerra de bandas de traficantes de drogas y " +
                        "asesinatos políticos. Por la venganza de su exnovio Bill, que fue abandonado por la Novia y " +
                        "trataba de alejarse de la banda, para iniciar una nueva vida alejada de la violencia. "));

        dummyData.add(new MovieModel(3, "Kizumonogatari III: Reiketsu-hen", 2017, "Akiyuki Shinbo, Tatsuya Oishi",
                "Psicológico, Acción, Comedia, Misterio",
                "Koyomi y Meme finalmente logran restaurar completamente Kiss-shot. Koyomi espera que Kiss-Shot lo " +
                        "vuelva a convertir en humano. Pero antes de eso, Kiss-shot y Koyomi pasan una noche en una " +
                        "azotea, donde Kiss-shot recuerda a su esbirro anterior, un samurái que decidió suicidarse " +
                        "cuando Kiss-shot no pudo restaurar su humanidad. Koyomi se va a comprar comida, pero cuando " +
                        "regresa se encuentra con Kiss-shot comiéndose el cadáver eviscerado de Guillotine Cutter. " +
                        "Está horrorizado al darse cuenta de que Kiss-Shot ahora cazará humanos nuevamente, y que él " +
                        "mismo querrá cazar también."));

        dummyData.add(new MovieModel(4, "Ghost in the Shell", 1995, "Mamoru Oshii", "Cyberpunk, Acción",
                "En el transcurso del año 2029, el planeta se recupera de una tercera guerra mundial nuclear. El " +
                        "plano geopolítico se ha transformado sustancialmente y una de las superpotencias más " +
                        "destacadas de esta nueva realidad es Japón. Una nueva guerra fría emerge, convirtiendo a la " +
                        "política internacional en una enrevesada lucha de intereses maquiavélicos, enfrentados a la " +
                        "delincuencia tecnológica y al terrorismo cibernético, trayendo como consecuencia que los " +
                        "delitos electrónicos sean un objetivo primordial para la seguridad internacional de todos " +
                        "los países."));


        dummyData.add(new MovieModel(5, "El Señor de los Anillos: el retorno del Rey", 2003, "Peter Jackson",
                "Aventuras, Fantasía épica",
                "La historia comienza con un recuerdo de cómo el hobbit Smeágol llegó a poseer el Anillo de Poder, " +
                        "tras matar a su amigo Déagol, quien lo había encontrado en el fondo de un río (donde cayó " +
                        "muchos años antes, como se vio en la primera película, cuando unos orcos asesinaron a " +
                        "Isildur, quien había cortado el dedo a Sauron en el Sitio de Barad-dûr, que concluyó la " +
                        "Guerra de la Última Alianza, y había conservado el Anillo a pesar de las advertencias de " +
                        "Elrond). A partir de entonces continúa el relato en donde se dejó mientras Gollum lleva a " +
                        "Frodo y Sam a través de la entrada cercana a Minas Morgul, en donde ven a sus ejércitos " +
                        "partir a la guerra."));

    }


    @GetMapping(value = "/peliculas/{id}")
    public @ResponseBody MovieModel getMovieById(@PathVariable(value = "id") int idMovie) {
        MovieModel toReturn = new MovieModel();
        for (MovieModel element : this.dummyData) {
            if (element.getId() == idMovie) {
                toReturn = element;
            }
        }
        return toReturn;
    }

    @GetMapping(value = "/peliculas")
    public @ResponseBody List<MovieModel> getMovies() {
        return this.dummyData;
    }
}
