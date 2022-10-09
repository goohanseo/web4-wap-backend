package web4.web4wap.domain;

import javax.persistence.*;

@Entity //jpa가 관리하는 entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)//db가 알아서 생성해
    private Long id; //고객이 아닌 시스템이 정한 id

    @Column(name ="username")
    private String name; //이름

    public Long getId() {
        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
