package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.domain.Person;

public abstract class Rules49F42D626E9988546A3691D6941DC956 implements org.drools.model.Model {

    public final static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER = java.time.format.DateTimeFormatter.ofPattern(org.drools.core.util.DateUtils.getDateFormatMask(),
                                                                                                                              java.util.Locale.ENGLISH);

    @Override
    public String getName() {
        return "org.acme";
    }

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Arrays.asList(D.entryPoint("persons"));
    }

    @Override
    public java.util.List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public java.util.List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    public static final org.drools.model.Global<org.kie.kogito.rules.DataStore> var_persons = D.globalOf(org.kie.kogito.rules.DataStore.class,
                                                                                                         "org.acme",
                                                                                                         "persons");

    public static final org.drools.model.Global<Integer> var_adultAge = D.globalOf(Integer.class,
                                                                                   "org.acme",
                                                                                   "adultAge");

    public static final org.drools.model.Query0Def queryDef_adult = D.query("org.acme",
                                                                            "adult");

    java.util.List<org.drools.model.Global> globals = new java.util.ArrayList<>();

    java.util.List<org.drools.model.TypeMetaData> typeMetaDatas = java.util.Collections.emptyList();

    {
        globals.add(var_persons);
        globals.add(var_adultAge);
    }
}
