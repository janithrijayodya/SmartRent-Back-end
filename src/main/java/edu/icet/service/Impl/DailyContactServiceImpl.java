package edu.icet.service.Impl;

import edu.icet.dao.CustomerDao;
import edu.icet.dao.DailyContactDao;
import edu.icet.entity.DailyContactEntity;
import edu.icet.model.Customer;
import edu.icet.model.DailyContact;
import edu.icet.service.DailyContactService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DailyContactServiceImpl implements DailyContactService {

    private final DailyContactDao dailyContactDao;
    private final ModelMapper mapper;

    @Override
    public void addContact(DailyContact dailyContact) {
        dailyContactDao.save(mapper.map(dailyContact, DailyContactEntity.class));
    }

    @Override
    public void deleteContactByID(Long dailyContactID) {
        dailyContactDao.deleteById(dailyContactID);
    }

    @Override
    public List<DailyContact> getAllContact() {
        List<DailyContact> dailyContactArrayList = new ArrayList<>();
        dailyContactDao.findAll().forEach(dailyContactEntity -> {
            dailyContactArrayList.add(mapper.map(dailyContactEntity, DailyContact.class));
        });
        return dailyContactArrayList;
    }
}
