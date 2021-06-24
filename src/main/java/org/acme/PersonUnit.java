package org.acme;

import org.acme.domain.Person; 
import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore; 
import org.kie.kogito.rules.RuleUnitData;

public class PersonUnit implements RuleUnitData {

    private DataStore <Person> persons = DataSource.createStore(); 

    private int adultAge; 

    public PersonUnit() {

    }

    public DataStore<Person> getPersons() { return persons; }

    public void setPersons(DataStore<Person> persons) {
    this.persons = persons;
    }

    public int getAdultAge() {      return adultAge;  }  public void setAdultAge(int adultAge) {      this.adultAge = adultAge;  }
} 