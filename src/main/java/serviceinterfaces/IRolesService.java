package serviceinterfaces;

import entitie.Roles;

import java.util.List;

public interface IRolesService {
    public void insert(Roles rol);

    public List<Roles> list();

    public void delete(Long idRol);

    public Roles listarId(Long idRol);
}
