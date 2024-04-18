package serviceinterfaces;

import entitie.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario usuario);

    public List<Usuario> list();

    public void delete(Long idUsuario);

    public Usuario listarId(Long idUsuario);
}
