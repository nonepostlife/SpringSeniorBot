package ru.postlife.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.postlife.entity.RawData;

public interface RawDataDAO extends JpaRepository<RawData, Long> {
}
