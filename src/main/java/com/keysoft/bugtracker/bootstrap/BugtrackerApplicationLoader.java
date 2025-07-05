package com.keysoft.bugtracker.bootstrap;

import com.keysoft.bugtracker.repositories.TicketRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.keysoft.bugtracker.domain.Ticket;


@Component
public class BugtrackerApplicationLoader implements ApplicationListener<ContextRefreshedEvent> {

    private TicketRepository ticketRepository;

    private static final Logger log = LogManager.getLogger(BugtrackerApplicationLoader.class);

    @Autowired
    public void setTicketRepository(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Ticket tick1 = new Ticket("1 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick2 = new Ticket("2 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick3 = new Ticket("3 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick4 = new Ticket("4 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick5 = new Ticket("5 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick6 = new Ticket("6 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick7 = new Ticket("7 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick8 = new Ticket("8 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick9 = new Ticket("9 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick10 = new Ticket("10 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick11 = new Ticket("11 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick12 = new Ticket("12 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick13 = new Ticket("13 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick14 = new Ticket("14 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick15 = new Ticket("15 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick16 = new Ticket("16 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick17 = new Ticket("1 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick18 = new Ticket("2 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick19 = new Ticket("3 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick20 = new Ticket("4 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick21 = new Ticket("5 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick22 = new Ticket("6 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick23 = new Ticket("7 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick24 = new Ticket("8 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick25 = new Ticket("9 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick26 = new Ticket("10 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick27 = new Ticket("11 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick28 = new Ticket("12 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick29 = new Ticket("13 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick30 = new Ticket("14 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);
        Ticket tick31 = new Ticket("15 Add the ability to sort by release date", "The users need this new feature", 1, 2);
        Ticket tick32 = new Ticket("16 Updates are not saved correctly to task name", "This is a bug impacting this feature in production", 1, 2);

        ticketRepository.save(tick1);
        ticketRepository.save(tick2);
        ticketRepository.save(tick3);
        ticketRepository.save(tick4);
        ticketRepository.save(tick5);
        ticketRepository.save(tick6);
        ticketRepository.save(tick7);
        ticketRepository.save(tick8);
        ticketRepository.save(tick9);
        ticketRepository.save(tick10);
        ticketRepository.save(tick11);
        ticketRepository.save(tick12);
        ticketRepository.save(tick13);
        ticketRepository.save(tick14);
        ticketRepository.save(tick15);
        ticketRepository.save(tick16);

        ticketRepository.save(tick17);
        ticketRepository.save(tick18);
        ticketRepository.save(tick19);
        ticketRepository.save(tick20);
        ticketRepository.save(tick21);
        ticketRepository.save(tick22);
        ticketRepository.save(tick23);
        ticketRepository.save(tick24);
        ticketRepository.save(tick25);
        ticketRepository.save(tick26);
        ticketRepository.save(tick27);
        ticketRepository.save(tick28);
        ticketRepository.save(tick29);
        ticketRepository.save(tick30);
        ticketRepository.save(tick31);
        ticketRepository.save(tick32);

        log.info("Saved Ticket id: " + tick1.getId());
        log.info("Saved Ticket id: " + tick2.getId());
    }
}
