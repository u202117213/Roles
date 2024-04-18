package serviceimplements;

import entitie.Roles;
import entitie.Usuario;

import java.util.List;

public class RolesServiceImplement implements UsuarioServiceimplement{
    @Autowired
    private RolesRepository rR;

    @Override
    public void insert(Roles rol) {
        rR.save(rol);
    }

    @Override
    public List<Roles> list() {
        return rR.findAll();
    }

    @Override
    public void delete(Long idRol) {
        rR.deleteById(idRol);
    }

    @Override
    public Usuario listarId(Long idRol) {
        return rR.findById(idRol).orElse(new Roles());
    }
}
