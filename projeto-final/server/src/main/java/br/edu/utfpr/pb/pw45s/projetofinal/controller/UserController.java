package br.edu.utfpr.pb.pw45s.projetofinal.controller;

import br.edu.utfpr.pb.pw45s.projetofinal.dto.UserDTO;
import br.edu.utfpr.pb.pw45s.projetofinal.model.User;
import br.edu.utfpr.pb.pw45s.projetofinal.repository.UserRepository;
import br.edu.utfpr.pb.pw45s.projetofinal.service.UserService;
import br.edu.utfpr.pb.pw45s.projetofinal.shared.CrudController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController extends CrudController<Long, User, UserDTO, UserRepository, UserService> {

    public UserController() {
        super(User.class, UserDTO.class);
    }

    @Override
    public UserDTO toDto(User entity) {
        entity.setPassword(null);
        return super.toDto(entity);
    }

    @GetMapping("/me")
    public UserDTO getCurrentUser(@AuthenticationPrincipal User user) {
        if (user == null) {
            return null; // ou lançar um erro 401
        }
        user.setPassword(null);
        return super.toDto(user);
    }

    @PutMapping("/me")
    public UserDTO updateCurrentUser(@AuthenticationPrincipal User currentUser, @RequestBody UserDTO dto) {
        currentUser.setUsername(dto.getUsername());
        currentUser.setEmail(dto.getEmail());
        currentUser.setInstitution(dto.getInstitution());
        currentUser.setCountry(dto.getCountry());
        currentUser.setState(dto.getState());
        currentUser.setCity(dto.getCity());

        User saved = service.save(currentUser);
        saved.setPassword(null);
        return super.toDto(saved);
    }
}