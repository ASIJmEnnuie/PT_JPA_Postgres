package org.jug.algeria.repository;

import org.jug.algeria.domain.Evenement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvenementRepository extends CrudRepository<Evenement,Long>{
}
