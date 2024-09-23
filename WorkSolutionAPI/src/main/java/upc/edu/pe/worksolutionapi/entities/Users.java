package upc.edu.pe.worksolutionapi.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "users")//la tabla en postgres se debe llamar 'users' para evitar problemas
public class Users implements Serializable {
    @Id
    //el id de los usuario se generará de manera incremental automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name = "apellido", nullable = false, length = 100)
    private String apellido;
    @Column(name = "dni", nullable = false, length = 15)
    private String dni;
    @Column(name = "fechaNacimiento", nullable = false, length = 100)
    private LocalDate fechaNacimiento;
    @Column(name = "correo", nullable = false, length = 100)
    private String correo;
    @Column(name="username", length = 30, unique = true)
    private String username;
    @Column(name="password", length = 200, nullable = false)
    private String password;

    //para indicar si la cuenta del usuario esta activado
    @Column(name = "enabled", nullable = false)
    private Boolean enabled;

    //como se manejará que cada usuario tiene un rol para ingresar a ciertos
    //endpoints por ello se usará la anotación ManyToOne
    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Role role;

    //Todos los atributos mencionados arriba son necesarios para poder realizar
    //la carga de usuario en el controller JwtAuthenticationController
    // y son caragados en el servicio JwtUserDetailsService

    //Constructores
    public Users() {
    }

    public Users(Long id, String nombre, String apellido, String dni, LocalDate fechaNacimiento, String correo, String username, String password, Boolean enabled, Role role) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

