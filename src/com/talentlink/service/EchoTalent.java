package com.talentlink.service;

import com.talentlink.service.objects.EchoTalentIn;
import com.talentlink.service.objects.EchoTalentOut;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * This is a test service file.
 */
@Path("/talent")
public class EchoTalent {

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response makeMeTalent(EchoTalentIn echoTalentIn){
        EchoTalentOut echoTalentOut = new EchoTalentOut();
        echoTalentOut.talentName = "Talent " + echoTalentIn.getName();
        echoTalentOut.talentId = 1;

        return Response.ok(echoTalentOut).status(201).build();
    }
}
