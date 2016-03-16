package ${package};

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Extreamly Dummy MireDot Class just to make sure that we can generate ONE request in the documentation.
 */
@Path("/dummy/silly-request")
@Produces("application/vnd.acme.dummy.silly-0.0+json")
public class SillyRequestResource {

    public SillyRequestResource() {

    }

    //@formatter:off

    /**
     * <p>
     * Logs out an already logged in user . Deletes any non-expired access token and also removes client session.
     * </p>
     *
     * @param accessToken  Current non-expired access token of the logged in user
     * @param username     logged in user's username
     * @param refreshToken Current non-expired refresh token of the logged in user
     * @param redirectTo   redirect url
     * @return If logout is performed successfully, http response status OK is returned
     * @throws IOException Signals that an I/O exception of some sort has occurred.
     * @statuscode 200 User logs out successfully
     * @statuscode 404 token data for user not found
     * @servicetag Version 1.2
     * @title Logout user
     */
    //@formatter:on
    @GET
    public Response logout(@QueryParam("access-token") String accessToken,
                           @QueryParam("refresh-token") String refreshToken,
                           @QueryParam("username") String username,
                           @QueryParam("location") String redirectTo,
                           @Context HttpServletRequest request) throws IOException {
        return null;
    }

    //@formatter:off

    /**
     * <p>
     * Logs out an already logged in user . Deletes any non-expired access token and also removes client session.
     * </p>
     *
     * @param accessToken  Current non-expired access token of the logged in user
     * @param username     logged in user's username
     * @param refreshToken Current non-expired refresh token of the logged in user
     * @return If logout is performed successfully, http response status CREATED is returned
     * @throws IOException Signals that an I/O exception of some sort has occurred.
     * @statuscode 201 User logs out successfully
     * @statuscode 404 token data for user not found
     * @servicetag Version 1.2
     * @title Logout user
     */
    //@formatter:on
    @POST
    public Response logout(@QueryParam("access-token") String accessToken,
                           @QueryParam("refresh-token") String refreshToken,
                           @QueryParam("username") String username,
                           @Context HttpServletRequest request) throws IOException {
        return null;
    }
}
