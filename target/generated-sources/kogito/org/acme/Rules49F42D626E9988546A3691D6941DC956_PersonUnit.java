package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.domain.Person;
import static org.acme.Rules49F42D626E9988546A3691D6941DC956.*;
import org.drools.model.Query;

public class Rules49F42D626E9988546A3691D6941DC956_PersonUnit extends Rules49F42D626E9988546A3691D6941DC956 {

    @Override
    public String getName() {
        return super.getName() + ".PersonUnit";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@1c65961
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(Rules49F42D626E9988546A3691D6941DC956_PersonUnitRuleMethods0.rule_Is_32Adult());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_adult = query_adult();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_adult() {
        final org.drools.model.Variable<org.acme.domain.Person> var_$p = D.declarationOf(org.acme.domain.Person.class,
                                                                                         DomainClassesMetadata49F42D626E9988546A3691D6941DC956.org_acme_domain_Person_Metadata_INSTANCE,
                                                                                         "$p",
                                                                                         D.entryPoint("persons"));
        org.drools.model.Query adult_build = queryDef_adult.build(D.pattern(var_$p,
                                                                            D.entryPoint("persons")));
        return adult_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_adult);
    }
}
