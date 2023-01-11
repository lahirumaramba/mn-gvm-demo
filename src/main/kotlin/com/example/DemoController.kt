package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.multitenancy.Tenant
import org.apache.commons.lang3.RandomStringUtils

@Controller("/demo")
class DemoController {

    @Get(uri="/", produces=["text/plain"])
    fun index(): String {
        return "Example Response"
    }

    @Get("/fb")
    fun fb(): String {
        return FirebaseAuth.getInstance(FirebaseManager.firebaseApp).tenantManager.createTenant(
            Tenant.CreateRequest()
                .setDisplayName(RandomStringUtils.randomAlphabetic(20))
                .setPasswordSignInAllowed(true)
        ).tenantId
    }
}