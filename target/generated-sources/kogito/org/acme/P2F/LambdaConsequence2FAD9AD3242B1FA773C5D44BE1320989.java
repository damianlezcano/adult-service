package org.acme.P2F;

import static org.acme.Rules49F42D626E9988546A3691D6941DC956.*;
import org.acme.domain.Person;
import org.acme.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence2FAD9AD3242B1FA773C5D44BE1320989 implements org.drools.model.functions.Block1<org.acme.domain.Person>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "2587192FBD7377CB11D602D5DD6831E8";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.acme.domain.Person $p) throws java.lang.Exception {
        {
            $p.setAdult(true);
        }
    }
}
