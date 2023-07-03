package com.joseph.rest.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    //URL Versioning
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson() {
        return new PersonV1("Joseph Sagwe");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson() {
        return new PersonV2("Joseph", "Sagwe");
    }

    //Request Parameter Versioning
    @GetMapping(path = "/person", params = "version1")
    public PersonV1 getFirstVersionOfPersonRequestParameter() {
        return new PersonV1("Joseph Sagwe");
    }

    @GetMapping(path ="person" , params = "version2")
    public PersonV2 getSecondVersionOfPersonRequestParameter() {
        return new PersonV2("Joseph", "Sagwe");
    }

    //Header Versioning
    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonHeader() {
        return new PersonV1("Joseph Sagwe");
    }

    @GetMapping(path ="person/header" , headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonHeader() {
        return new PersonV2("Joseph", "Sagwe");
    }

    //MediaType Versioning
    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getFirstVersionOfPersonAcceptHeader() {
        return new PersonV1("Joseph Sagwe");
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getSecondVersionOfPersonAcceptHeader() {
        return new PersonV2("Joseph", "Sagwe");
    }



}
