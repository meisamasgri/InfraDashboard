package ir.mci.infradashboard.db.repo;


import ir.mci.infradashboard.db.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}
