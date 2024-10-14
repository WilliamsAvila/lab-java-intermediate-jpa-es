package org.amazon.lab3_06.Repository;

import org.amazon.lab3_06.Model.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternalTaskRepository extends JpaRepository<InternalTask, Long> {
}
