package serviceimplements;

import entitie.Usuario;
import serviceinterfaces.IUsuarioService;

import java.util.List;

public class UsuarioServiceimplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;

    @Override
    public void insert(UsuarioServiceimplement usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public Usuario listarId(Long idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }
}

