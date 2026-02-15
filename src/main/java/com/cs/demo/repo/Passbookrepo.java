package com.cs.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cs.demo.entity.Rdpassbook;
import com.cs.demo.pdto.UserPassbookDTO;
public interface Passbookrepo extends JpaRepository<Rdpassbook, Integer> {
	@Query(value = "SELECT SUM(rdamt) fROM rdpassbook", nativeQuery = true)
    Long getTotalAMT();


@Query(value = "SELECT * FROM rdpassbook WHERE rid = :rid", nativeQuery = true)
List<Rdpassbook> getAllByRid(@Param("rid") int rid);

@Query(value = """
SELECT 
    u.name,
    u.acno,
    p.rdamt,
    p.rddate
FROM rduser u
JOIN rdpassbook p
 ON u.rid = p.rid
""", nativeQuery = true)
List<Object[]> getUserPassbookDetails();

@Query(value = """
SELECT 
    u.name,
    u.acno,
    p.rdamt,
    p.rddate
FROM rduser u
JOIN rdpassbook p
 ON u.rid = p.rid
""", nativeQuery = true)
List<UserPassbookDTO> getUserPassbookDetail();

@Query(value = """
SELECT 
    u.name   AS name,
    u.acno   AS acno,
    p.rdamt  AS rdamt,
    p.rddate AS rddate
FROM rduser u
JOIN rdpassbook p
ON u.rid = p.rid
WHERE p.rid = :rid
""", nativeQuery = true)
List<UserPassbookDTO> getUserPassbookByRid(@Param("rid") int rid);

}
	