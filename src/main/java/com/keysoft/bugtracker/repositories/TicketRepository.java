package com.keysoft.bugtracker.repositories;

import java.util.List;
import java.util.Optional;

import com.keysoft.bugtracker.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    @RestResource(path = "findByTitleIgnoreCaseContaining", rel = "findByTitleIgnoreCaseContaining")
    List<Ticket> findByTitleIgnoreCaseContaining(@Param("title") String title);

    @RestResource(path = "findByDescriptionIgnoreCaseContaining", rel = "findByDescriptionIgnoreCaseContaining")
    List<Ticket> findByDescriptionIgnoreCaseContaining(@Param("description") String description);

    @RestResource(path = "findByAppId", rel = "findByAppId")
    List<Ticket> findByAppId(@Param("appId") Integer appId);

}