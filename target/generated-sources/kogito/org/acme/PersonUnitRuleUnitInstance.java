package org.acme;

public class PersonUnitRuleUnitInstance extends org.kie.kogito.rules.units.AbstractRuleUnitInstance<org.acme.PersonUnit> {

    public PersonUnitRuleUnitInstance(org.kie.kogito.rules.RuleUnit<org.acme.PersonUnit> unit, org.acme.PersonUnit value, org.kie.api.runtime.KieSession session) {
        super(unit, value, session);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession runtime, org.acme.PersonUnit value) {
        if (value.getPersons() == null) {
            value.setPersons(org.kie.kogito.rules.DataSource.createStore());
        }
        value.getPersons().subscribe(new org.kie.kogito.rules.units.EntryPointDataProcessor(runtime.getEntryPoint("persons")));
        runtime.setGlobal("persons", value.getPersons());
        runtime.setGlobal("adultAge", value.getAdultAge());
    }

    @Override()
    protected <Q> org.kie.kogito.rules.RuleUnitQuery<Q> createRuleUnitQuery(Class<? extends org.kie.kogito.rules.RuleUnitQuery<Q>> query) {
        if (PersonUnitQueryAdult.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new PersonUnitQueryAdult(this);
        throw new IllegalArgumentException("Unknown query: " + query.getCanonicalName());
    }
}
