package org.acme.P5C;

import static org.acme.Rules49F42D626E9988546A3691D6941DC956.*;
import org.acme.domain.Person;
import org.acme.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate5C8E418CC6C3008DA1AF8FFEF63B5D2E implements org.drools.model.functions.Predicate1<org.acme.domain.Person>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "A845989C08F7829B7ADE8067326862FD";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.domain.Person _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getAge(), 18);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("age >= 18", "Is Adult", "/Users/damianlezcano/enablement/adult-service/src/main/resources/org/acme/PersonUnit.drl");
    }
}
