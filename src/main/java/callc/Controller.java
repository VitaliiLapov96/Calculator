package callc;
public class Controller {
    static int sum(Model m){
        return m.x + m.y;
    }
    static int riz(Model m){
        return m.x - m.y;
    }
    static int dob(Model m){
        return m.x * m.y;
    }
    static double dil(Model m){
        return (double)m.x / m.y;
    }
}
