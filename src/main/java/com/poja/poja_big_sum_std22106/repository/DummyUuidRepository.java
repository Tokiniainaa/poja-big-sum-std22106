package com.poja.poja_big_sum_std22106.repository;

import com.poja.poja_big_sum_std22106.PojaGenerated;
import com.poja.poja_big_sum_std22106.repository.model.DummyUuid;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@PojaGenerated
@Repository
public interface DummyUuidRepository extends JpaRepository<DummyUuid, String> {

  @Override
  Optional<DummyUuid> findById(String id);
}
