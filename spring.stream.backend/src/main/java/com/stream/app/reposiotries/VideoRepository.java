package com.stream.app.reposiotries;

import com.stream.app.entities.Video;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional
public interface VideoRepository extends JpaRepository<Video,String > {

    Optional<Video> findByTitle(String title);

    //query methods

    //native

    //criteria api
}
