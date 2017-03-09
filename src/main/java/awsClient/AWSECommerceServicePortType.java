
package awsClient;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AWSECommerceServicePortType", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AWSECommerceServicePortType {


    /**
     * 
     * @param shared
     * @param operationRequest
     * @param xmlEscaping
     * @param items
     * @param marketplaceDomain
     * @param request
     * @param awsAccessKeyId
     * @param validate
     * @param associateTag
     */
    @WebMethod(operationName = "ItemSearch", action = "http://soap.amazon.com/ItemSearch")
    @RequestWrapper(localName = "ItemSearch", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.ItemSearch")
    @ResponseWrapper(localName = "ItemSearchResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.ItemSearchResponse")
    public void itemSearch(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        ItemSearchRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<ItemSearchRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Items", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Items>> items);

    /**
     * 
     * @param shared
     * @param operationRequest
     * @param xmlEscaping
     * @param items
     * @param marketplaceDomain
     * @param request
     * @param awsAccessKeyId
     * @param validate
     * @param associateTag
     */
    @WebMethod(operationName = "ItemLookup", action = "http://soap.amazon.com/ItemLookup")
    @RequestWrapper(localName = "ItemLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.ItemLookup")
    @ResponseWrapper(localName = "ItemLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.ItemLookupResponse")
    public void itemLookup(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        ItemLookupRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<ItemLookupRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Items", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Items>> items);

    /**
     * 
     * @param shared
     * @param operationRequest
     * @param xmlEscaping
     * @param marketplaceDomain
     * @param request
     * @param awsAccessKeyId
     * @param browseNodes
     * @param validate
     * @param associateTag
     */
    @WebMethod(operationName = "BrowseNodeLookup", action = "http://soap.amazon.com/BrowseNodeLookup")
    @RequestWrapper(localName = "BrowseNodeLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.BrowseNodeLookup")
    @ResponseWrapper(localName = "BrowseNodeLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.BrowseNodeLookupResponse")
    public void browseNodeLookup(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        BrowseNodeLookupRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<BrowseNodeLookupRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "BrowseNodes", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<BrowseNodes>> browseNodes);

    /**
     * 
     * @param shared
     * @param operationRequest
     * @param xmlEscaping
     * @param items
     * @param marketplaceDomain
     * @param request
     * @param awsAccessKeyId
     * @param validate
     * @param associateTag
     */
    @WebMethod(operationName = "SimilarityLookup", action = "http://soap.amazon.com/SimilarityLookup")
    @RequestWrapper(localName = "SimilarityLookup", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.SimilarityLookup")
    @ResponseWrapper(localName = "SimilarityLookupResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.SimilarityLookupResponse")
    public void similarityLookup(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        SimilarityLookupRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<SimilarityLookupRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Items", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Items>> items);

    /**
     * 
     * @param shared
     * @param operationRequest
     * @param xmlEscaping
     * @param marketplaceDomain
     * @param request
     * @param awsAccessKeyId
     * @param cart
     * @param validate
     * @param associateTag
     */
    @WebMethod(operationName = "CartGet", action = "http://soap.amazon.com/CartGet")
    @RequestWrapper(localName = "CartGet", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.CartGet")
    @ResponseWrapper(localName = "CartGetResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.CartGetResponse")
    public void cartGet(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        CartGetRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<CartGetRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Cart", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Cart>> cart);

    /**
     * 
     * @param shared
     * @param operationRequest
     * @param xmlEscaping
     * @param marketplaceDomain
     * @param request
     * @param awsAccessKeyId
     * @param cart
     * @param validate
     * @param associateTag
     */
    @WebMethod(operationName = "CartCreate", action = "http://soap.amazon.com/CartCreate")
    @RequestWrapper(localName = "CartCreate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.CartCreate")
    @ResponseWrapper(localName = "CartCreateResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.CartCreateResponse")
    public void cartCreate(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        CartCreateRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<CartCreateRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Cart", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Cart>> cart);

    /**
     * 
     * @param shared
     * @param operationRequest
     * @param xmlEscaping
     * @param marketplaceDomain
     * @param request
     * @param awsAccessKeyId
     * @param cart
     * @param validate
     * @param associateTag
     */
    @WebMethod(operationName = "CartAdd", action = "http://soap.amazon.com/CartAdd")
    @RequestWrapper(localName = "CartAdd", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.CartAdd")
    @ResponseWrapper(localName = "CartAddResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.CartAddResponse")
    public void cartAdd(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        CartAddRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<CartAddRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Cart", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Cart>> cart);

    /**
     * 
     * @param shared
     * @param operationRequest
     * @param xmlEscaping
     * @param marketplaceDomain
     * @param request
     * @param awsAccessKeyId
     * @param cart
     * @param validate
     * @param associateTag
     */
    @WebMethod(operationName = "CartModify", action = "http://soap.amazon.com/CartModify")
    @RequestWrapper(localName = "CartModify", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.CartModify")
    @ResponseWrapper(localName = "CartModifyResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.CartModifyResponse")
    public void cartModify(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        CartModifyRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<CartModifyRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Cart", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Cart>> cart);

    /**
     * 
     * @param shared
     * @param operationRequest
     * @param xmlEscaping
     * @param marketplaceDomain
     * @param request
     * @param awsAccessKeyId
     * @param cart
     * @param validate
     * @param associateTag
     */
    @WebMethod(operationName = "CartClear", action = "http://soap.amazon.com/CartClear")
    @RequestWrapper(localName = "CartClear", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.CartClear")
    @ResponseWrapper(localName = "CartClearResponse", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", className = "awsClient.CartClearResponse")
    public void cartClear(
        @WebParam(name = "MarketplaceDomain", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String marketplaceDomain,
        @WebParam(name = "AWSAccessKeyId", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String awsAccessKeyId,
        @WebParam(name = "AssociateTag", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String associateTag,
        @WebParam(name = "Validate", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String validate,
        @WebParam(name = "XMLEscaping", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        String xmlEscaping,
        @WebParam(name = "Shared", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        CartClearRequest shared,
        @WebParam(name = "Request", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
        List<CartClearRequest> request,
        @WebParam(name = "OperationRequest", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<OperationRequest> operationRequest,
        @WebParam(name = "Cart", targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01", mode = WebParam.Mode.OUT)
        Holder<List<Cart>> cart);

}
