package web4.web4wap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web4.web4wap.domain.Member;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{ //member, id

    //JPQL select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
