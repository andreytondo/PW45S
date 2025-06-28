package br.edu.utfpr.pb.pw45s.projetofinal.shared;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;

/**
 * Abstract class that defines the basic operations for a controller.
 * @param <ID>
 * @param <E>
 * @param <D>
 */
public abstract class BaseController<ID extends Serializable, E  extends Identifiable<ID>, D> {

    private final DTOUtils<ID, E, D> dtoUtils;

    public BaseController(Class<E> entityClass, Class<D> dtoClass) {
        this.dtoUtils = new DTOUtils<>(entityClass, dtoClass);
        customizeMapping();
    }

    public ModelMapper getModelMapper() {
        return dtoUtils.getModelMapper();
    }

    public D toDto(E entity) {
        return dtoUtils.toDto(entity);
    }

    public E toEntity(D dto) {
        return dtoUtils.toEntity(dto);
    }

    public Page<D> toPageDTO(Page<E> page, Pageable pageable) {
        return dtoUtils.toPageDTO(page, pageable);
    }

    public void customizeMapping() {}
}