package org.acme.P2B;

import static org.acme.Rules49F42D626E9988546A3691D6941DC956.*;
import org.acme.domain.Person;
import org.acme.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor2B142CE2572E4C5154CCF82420A39D71 implements org.drools.model.functions.Function1<org.acme.domain.Person, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "088942CF6416409D5EB293E4B7D151C4";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.acme.domain.Person _this) {
        return _this.getAge();
    }
}
