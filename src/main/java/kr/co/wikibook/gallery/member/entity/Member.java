package kr.co.wikibook.gallery.member.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "members")
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false, unique = true)
    private String loginId;

    @Column(length = 100, nullable = false)
    private String loginPw;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime created;


    public Member(String loginId, String name, String loginPw) {
        this.loginId = loginId;
        this.name = name;
        this.loginPw = loginPw;
    }
}
