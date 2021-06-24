package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.domain.Person;
import static org.acme.Rules49F42D626E9988546A3691D6941DC956.*;

public class Rules49F42D626E9988546A3691D6941DC956_PersonUnitRuleMethods0 {

    /**
     * Rule name: Is Adult
     */
    public static org.drools.model.Rule rule_Is_32Adult() {
        final org.drools.model.Variable<org.acme.domain.Person> var_$p = D.declarationOf(org.acme.domain.Person.class,
                                                                                         DomainClassesMetadata49F42D626E9988546A3691D6941DC956.org_acme_domain_Person_Metadata_INSTANCE,
                                                                                         "$p",
                                                                                         D.entryPoint("persons"));
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Is Adult").unit(org.acme.PersonUnit.class)
                                                       .build(D.pattern(var_$p).expr("E32E79531D42D7473A41852F10DE4858",
                                                                                     org.acme.P5C.LambdaPredicate5C8E418CC6C3008DA1AF8FFEF63B5D2E.INSTANCE,
                                                                                     D.alphaIndexedBy(int.class,
                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                      DomainClassesMetadata49F42D626E9988546A3691D6941DC956.org_acme_domain_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                      org.acme.P2B.LambdaExtractor2B142CE2572E4C5154CCF82420A39D71.INSTANCE,
                                                                                                      18),
                                                                                     D.reactOn("age")),
                                                              D.on(var_$p).execute(org.acme.P2F.LambdaConsequence2FAD9AD3242B1FA773C5D44BE1320989.INSTANCE));
        return rule;
    }
}
