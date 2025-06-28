package br.edu.utfpr.pb.pw45s.projetofinal.repository;

import br.edu.utfpr.pb.pw45s.projetofinal.model.User;
import br.edu.utfpr.pb.pw45s.projetofinal.shared.CrudRepository;

public interface UserRepository extends CrudRepository<Long, User> {

    User findByUsername(String username);
}
