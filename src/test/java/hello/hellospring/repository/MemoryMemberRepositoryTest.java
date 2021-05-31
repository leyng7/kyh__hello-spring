package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    void save() {
        // Given
        Member member = new Member();
        member.setName("spring");

        // When
        repository.save(member);

        // Then
        Member result = repository.findById(member.getId()).get();
        assertThat(member).isEqualTo(result);
    }

    @Test
    void findById() {
        // Given
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        // When
        Member result = repository.findById(member1.getId()).get();

        // Then
        assertThat(member1).isEqualTo(result);
    }

    @Test
    void findByName() {
        // Given
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        // When
        Member result = repository.findByName("spring1").get();

        // Then
        assertThat(member1).isEqualTo(result);
    }

    @Test
    void findAll() {
        // Given
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        // When
        List<Member> result = repository.findAll();

        // Then
        assertThat(result.size()).isEqualTo(2);
    }
}
