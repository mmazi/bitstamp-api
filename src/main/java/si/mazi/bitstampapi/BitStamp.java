package si.mazi.bitstampapi;

import si.mazi.bitstampapi.model.*;

import javax.ws.rs.*;
import java.util.List;

/**
 * @author Matija Mazi <br/>
 * @created 4/20/12 5:53 PM
 */
@Path("api")
@Produces("application/json")
public interface BitStamp {

    @GET
    @Path("order_book/")
    @Produces("application/json")
    public OrderBook getOrderBook();

    @GET
    @Path("ticker/")
    @Produces("application/json")
    public Ticker getTicker();

    @GET
    @Path("transactions/")
    @Produces("application/json")
    public List<Transaction> getTransactions();

    @GET
    @Path("transactions/")
    @Produces("application/json")
    public List<Transaction> getTransactions(@QueryParam("timedelta") long timedeltaSec);

    @POST
    @Path("cancel_order/")
    @Produces("application/json")
    public Object cancelOrder(@FormParam("user") String user, @FormParam("password") String password, @FormParam("id") int orderId);

    @POST
    @Path("balance/")
    @Produces("application/json")
    public Balance getBalance(@FormParam("user") String user, @FormParam("password") String password);

    @POST
    @Path("user_transactions/")
    @Produces("application/json")
    public List<UserTransaction> getUserTransactions(@FormParam("user") String user, @FormParam("password") String password, @QueryParam("timedelta") long timedeltaSec);

    @POST
    @Path("user_transactions/")
    @Produces("application/json")
    public List<UserTransaction> getUserTransactions(@FormParam("user") String user, @FormParam("password") String password);

    @POST
    @Path("open_orders/")
    @Produces("application/json")
    public List<Order> getOpenOrders(@FormParam("user") String user, @FormParam("password") String password);

    @POST
    @Path("buy/")
    @Produces("application/json")
    public Order buy(@FormParam("user") String user, @FormParam("password") String password, @FormParam("amount") double amount, @FormParam("price") double price);

    @POST
    @Path("sell/")
    @Produces("application/json")
    public Order sell(@FormParam("user") String user, @FormParam("password") String password, @FormParam("amount") double amount, @FormParam("price") double price);


}
