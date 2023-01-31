package main.Homework4;

import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectory {
    private final List<Record> Contacts = new ArrayList<>();

    public void add(Record list) {

        Contacts.add(list);

    }

    public Record find(String name) {
        for (Record list : Contacts) {
            if (list.getName().equals(name)) {
                return list;
            }

        }
        return null;

    }
    public List<Record> findAll(String name){
        List<Record> sortByName = new ArrayList<>();
        for (Record list:Contacts) {
            if(list.getName().equals(name)){
                sortByName.add(list);
            }

        }
        if (sortByName.isEmpty()){
            return null;
        }else {
            return sortByName;
        }
    }
}
