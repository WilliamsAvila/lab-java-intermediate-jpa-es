package org.amazon.lab3_06.Repository;

import org.amazon.lab3_06.Model.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillableTaskRepository extends JpaRepository<BillableTask, Long> {
}
