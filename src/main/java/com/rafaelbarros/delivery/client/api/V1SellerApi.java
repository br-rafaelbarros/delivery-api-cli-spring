package com.rafaelbarros.delivery.client.api;

import com.rafaelbarros.delivery.client.invoker.ApiClient;

import com.rafaelbarros.delivery.client.model.Product;
import com.rafaelbarros.delivery.client.model.User;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-05T18:44:41.758-03:00[America/Sao_Paulo]")
@Component("com.rafaelbarros.delivery.client.api.V1SellerApi")
public class V1SellerApi {
    private ApiClient apiClient;

    public V1SellerApi() {
        this(new ApiClient());
    }

    @Autowired
    public V1SellerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add product to delivery
     * Use to request to make available product
     * <p><b>405</b> - Invalid input
     * @param user List of user object (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addProduct(List<User> user) throws RestClientException {
        addProductWithHttpInfo(user);
    }

    /**
     * Add product to delivery
     * Use to request to make available product
     * <p><b>405</b> - Invalid input
     * @param user List of user object (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addProductWithHttpInfo(List<User> user) throws RestClientException {
        Object postBody = user;
        
        String path = apiClient.expandPath("/product", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "delivery_auth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a product
     * use to delete a product
     * <p><b>400</b> - Invalid product value
     * @param productId  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteProduct(String productId) throws RestClientException {
        deleteProductWithHttpInfo(productId);
    }

    /**
     * Delete a product
     * use to delete a product
     * <p><b>400</b> - Invalid product value
     * @param productId  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteProductWithHttpInfo(String productId) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/product", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (productId != null)
        headerParams.add("product-id", apiClient.parameterToString(productId));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "delivery_auth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Finds Product by status
     * Multiple status values can be provided with comma separated strings
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid status value
     * @param status Status values that need to be considered for filter (required)
     * @param offset The number of items to skip before starting to collect the result set (optional, default to 0)
     * @param limit The numbers of items to return (optional, default to 0)
     * @return List&lt;Product&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Product> findProductByStatus(List<String> status, Integer offset, Integer limit) throws RestClientException {
        return findProductByStatusWithHttpInfo(status, offset, limit).getBody();
    }

    /**
     * Finds Product by status
     * Multiple status values can be provided with comma separated strings
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid status value
     * @param status Status values that need to be considered for filter (required)
     * @param offset The number of items to skip before starting to collect the result set (optional, default to 0)
     * @param limit The numbers of items to return (optional, default to 0)
     * @return ResponseEntity&lt;List&lt;Product&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Product>> findProductByStatusWithHttpInfo(List<String> status, Integer offset, Integer limit) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'status' is set
        if (status == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'status' when calling findProductByStatus");
        }
        
        String path = apiClient.expandPath("/product/findByStatus", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "delivery_auth" };

        ParameterizedTypeReference<List<Product>> returnType = new ParameterizedTypeReference<List<Product>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Find product by ID
     * Returns a product by ID
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Product not found
     * @param productId ID of product that needs to be fetched (required)
     * @return Product
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Product getProductById(Integer productId) throws RestClientException {
        return getProductByIdWithHttpInfo(productId).getBody();
    }

    /**
     * Find product by ID
     * Returns a product by ID
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Product not found
     * @param productId ID of product that needs to be fetched (required)
     * @return ResponseEntity&lt;Product&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Product> getProductByIdWithHttpInfo(Integer productId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling getProductById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("productId", productId);
        String path = apiClient.expandPath("/product/{productId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth", "delivery_auth" };

        ParameterizedTypeReference<Product> returnType = new ParameterizedTypeReference<Product>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update registry of products
     * Use to update products
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Product not found
     * <p><b>405</b> - Validation exception
     * @param user List of user object (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateProduct(List<User> user) throws RestClientException {
        updateProductWithHttpInfo(user);
    }

    /**
     * Update registry of products
     * Use to update products
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Product not found
     * <p><b>405</b> - Validation exception
     * @param user List of user object (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateProductWithHttpInfo(List<User> user) throws RestClientException {
        Object postBody = user;
        
        String path = apiClient.expandPath("/product", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "delivery_auth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
