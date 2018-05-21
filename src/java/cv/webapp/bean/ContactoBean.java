package cv.webapp.bean;
/**
 *
 * @author odiaz
 */
public class ContactoBean {
    private String nombre;
    private String email;
    private String msg;

    public ContactoBean() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
        
}
