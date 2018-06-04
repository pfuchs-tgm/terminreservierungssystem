package trs.controller;

import example.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import trs.data.Poll;
import trs.data.User;
import trs.data.Event;
import trs.repositories.PollRepository;

import java.util.Date;

public class EventController {

    private Controller controller;

    public EventController(Controller controller) {
        this.controller = controller;
    }

	public void createEvent(User organisator, Date[] dates, User[] teilnehmer) {
		Event evt = new Poll();

	}

	public void invitePeople(Event evt, User[] teilnehmer) {
        for (User aTeilnehmer : teilnehmer)
            evt.addTeilnehmer(aTeilnehmer);
        this.controller.getPollRepo().save((Poll) evt);
	}

	public void removePeople(Event evt, User teilnehmer) {
		evt.remTeilnehmer(teilnehmer);
		this.controller.getPollRepo().save((Poll) evt);
	}

	public void sendNotification(Event evt) {
    	evt.notifyTeilnehmer();
	}

	public void addDescription(Poll evt, String description) {
		evt.setDescripition(description);
		this.controller.getPollRepo().save((Poll) evt);
	}

	public void addLocation(Poll evt, String location) {
		evt.setLocation(location);
		this.controller.getPollRepo().save((Poll) evt);
	}

	public void setDate(Poll evt, Date date) {
		evt.setDate(date);
		this.controller.getPollRepo().save((Poll) evt);
	}

}
