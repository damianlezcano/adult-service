/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme;

import java.util.List;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.kie.kogito.rules.RuleUnit;
import org.kie.kogito.rules.RuleUnitInstance;
import static java.util.stream.Collectors.toList;

@Path("/adult")
public class PersonUnitQueryAdultEndpoint {

    @javax.inject.Inject
    RuleUnit<org.acme.PersonUnit> ruleUnit;

    public PersonUnitQueryAdultEndpoint() {
    }

    public PersonUnitQueryAdultEndpoint(RuleUnit<org.acme.PersonUnit> ruleUnit) {
        this.ruleUnit = ruleUnit;
    }

    @POST()
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<org.acme.domain.Person> executeQuery(org.acme.PersonUnit unitDTO) {
        RuleUnitInstance<org.acme.PersonUnit> instance = ruleUnit.createInstance(unitDTO);
        // Do not return the result directly to allow post execution codegen (like monitoring)
        List<org.acme.domain.Person> response = instance.executeQuery(PersonUnitQueryAdult.class);
        return response;
    }

    @POST()
    @Path("/first")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public org.acme.domain.Person executeQueryFirst(org.acme.PersonUnit unitDTO) {
        List<org.acme.domain.Person> results = executeQuery(unitDTO);
        org.acme.domain.Person response = results.isEmpty() ? null : results.get(0);
        return response;
    }
}
