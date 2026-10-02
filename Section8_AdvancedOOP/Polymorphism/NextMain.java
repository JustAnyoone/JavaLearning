package Section8_AdvancedOOP.Polymorphism;

public class NextMain {
    public static void main(String[] args) {

            Movie movie = Movie.getMovie("A", "Jaws");
            movie.watchMovie();

            Adventure jaws = (Adventure)Movie.getMovie("A", "Jaws");
            jaws.watchMovie();

            Object comedy = Movie.getMovie("C", "Airplane");
            Comedy comedyMovie = (Comedy) comedy;
            comedyMovie.watchMovie();
            
            var airplane = Movie.getMovie("C", "Airplane");
            airplane.watchMovie();

            var plane = new Comedy("Airplane");
            plane.watchComedy();

            Object unkownObject = Movie.getMovie("S", "Star wars");
            if (unkownObject.getClass().getSimpleName() == "Comedy") {
                Comedy c = (Comedy) unkownObject;
                c.watchComedy();
            } else if (unkownObject instanceof Adventure) {
                ((Adventure)unkownObject).watchAdventure();
            } else if (unkownObject instanceof ScienceFiction syfy) {
                syfy.watchScienceFiction();
            }
    }
}
