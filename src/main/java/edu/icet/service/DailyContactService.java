package edu.icet.service;

import edu.icet.model.DailyContact;

import java.util.List;

public interface DailyContactService {
    void addContact(DailyContact dailyContact);
    void deleteContactByID(Long dailyContactID);
    List<DailyContact> getAllContact();
}
