# V1SellerApi

All URIs are relative to *http://delivery-api.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProduct**](V1SellerApi.md#addProduct) | **POST** /product | Add product to delivery
[**deleteProduct**](V1SellerApi.md#deleteProduct) | **DELETE** /product | Delete a product
[**findProductByStatus**](V1SellerApi.md#findProductByStatus) | **GET** /product/findByStatus | Finds Product by status
[**getProductById**](V1SellerApi.md#getProductById) | **GET** /product/{productId} | Find product by ID
[**updateProduct**](V1SellerApi.md#updateProduct) | **PUT** /product | Update registry of products



## addProduct

> addProduct(user)

Add product to delivery

Use to request to make available product

### Example

```java
// Import classes:
import com.rafaelbarros.delivery.client.invoker.ApiClient;
import com.rafaelbarros.delivery.client.invoker.ApiException;
import com.rafaelbarros.delivery.client.invoker.Configuration;
import com.rafaelbarros.delivery.client.invoker.auth.*;
import com.rafaelbarros.delivery.client.invoker.models.*;
import com.rafaelbarros.delivery.client.api.V1SellerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://delivery-api.com");
        
        // Configure OAuth2 access token for authorization: delivery_auth
        OAuth delivery_auth = (OAuth) defaultClient.getAuthentication("delivery_auth");
        delivery_auth.setAccessToken("YOUR ACCESS TOKEN");

        V1SellerApi apiInstance = new V1SellerApi(defaultClient);
        List<User> user = Arrays.asList(); // List<User> | List of user object
        try {
            apiInstance.addProduct(user);
        } catch (ApiException e) {
            System.err.println("Exception when calling V1SellerApi#addProduct");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**List&lt;User&gt;**](User.md)| List of user object | [optional]

### Return type

null (empty response body)

### Authorization

[delivery_auth](../README.md#delivery_auth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **405** | Invalid input |  -  |


## deleteProduct

> deleteProduct(productId)

Delete a product

use to delete a product

### Example

```java
// Import classes:
import com.rafaelbarros.delivery.client.invoker.ApiClient;
import com.rafaelbarros.delivery.client.invoker.ApiException;
import com.rafaelbarros.delivery.client.invoker.Configuration;
import com.rafaelbarros.delivery.client.invoker.auth.*;
import com.rafaelbarros.delivery.client.invoker.models.*;
import com.rafaelbarros.delivery.client.api.V1SellerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://delivery-api.com");
        
        // Configure OAuth2 access token for authorization: delivery_auth
        OAuth delivery_auth = (OAuth) defaultClient.getAuthentication("delivery_auth");
        delivery_auth.setAccessToken("YOUR ACCESS TOKEN");

        V1SellerApi apiInstance = new V1SellerApi(defaultClient);
        String productId = "productId_example"; // String | 
        try {
            apiInstance.deleteProduct(productId);
        } catch (ApiException e) {
            System.err.println("Exception when calling V1SellerApi#deleteProduct");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[delivery_auth](../README.md#delivery_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid product value |  -  |


## findProductByStatus

> List&lt;Product&gt; findProductByStatus(status, offset, limit)

Finds Product by status

Multiple status values can be provided with comma separated strings

### Example

```java
// Import classes:
import com.rafaelbarros.delivery.client.invoker.ApiClient;
import com.rafaelbarros.delivery.client.invoker.ApiException;
import com.rafaelbarros.delivery.client.invoker.Configuration;
import com.rafaelbarros.delivery.client.invoker.auth.*;
import com.rafaelbarros.delivery.client.invoker.models.*;
import com.rafaelbarros.delivery.client.api.V1SellerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://delivery-api.com");
        
        // Configure OAuth2 access token for authorization: delivery_auth
        OAuth delivery_auth = (OAuth) defaultClient.getAuthentication("delivery_auth");
        delivery_auth.setAccessToken("YOUR ACCESS TOKEN");

        V1SellerApi apiInstance = new V1SellerApi(defaultClient);
        List<String> status = Arrays.asList(); // List<String> | Status values that need to be considered for filter
        Integer offset = 0; // Integer | The number of items to skip before starting to collect the result set
        Integer limit = 0; // Integer | The numbers of items to return
        try {
            List<Product> result = apiInstance.findProductByStatus(status, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling V1SellerApi#findProductByStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**List&lt;String&gt;**](String.md)| Status values that need to be considered for filter | [enum: available, onCourse, delivered]
 **offset** | **Integer**| The number of items to skip before starting to collect the result set | [optional] [default to 0]
 **limit** | **Integer**| The numbers of items to return | [optional] [default to 0]

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

[delivery_auth](../README.md#delivery_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid status value |  -  |


## getProductById

> Product getProductById(productId)

Find product by ID

Returns a product by ID

### Example

```java
// Import classes:
import com.rafaelbarros.delivery.client.invoker.ApiClient;
import com.rafaelbarros.delivery.client.invoker.ApiException;
import com.rafaelbarros.delivery.client.invoker.Configuration;
import com.rafaelbarros.delivery.client.invoker.auth.*;
import com.rafaelbarros.delivery.client.invoker.models.*;
import com.rafaelbarros.delivery.client.api.V1SellerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://delivery-api.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: delivery_auth
        OAuth delivery_auth = (OAuth) defaultClient.getAuthentication("delivery_auth");
        delivery_auth.setAccessToken("YOUR ACCESS TOKEN");

        V1SellerApi apiInstance = new V1SellerApi(defaultClient);
        Integer productId = 56; // Integer | ID of product that needs to be fetched
        try {
            Product result = apiInstance.getProductById(productId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling V1SellerApi#getProductById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Integer**| ID of product that needs to be fetched |

### Return type

[**Product**](Product.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [delivery_auth](../README.md#delivery_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Product not found |  -  |


## updateProduct

> updateProduct(user)

Update registry of products

Use to update products

### Example

```java
// Import classes:
import com.rafaelbarros.delivery.client.invoker.ApiClient;
import com.rafaelbarros.delivery.client.invoker.ApiException;
import com.rafaelbarros.delivery.client.invoker.Configuration;
import com.rafaelbarros.delivery.client.invoker.auth.*;
import com.rafaelbarros.delivery.client.invoker.models.*;
import com.rafaelbarros.delivery.client.api.V1SellerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://delivery-api.com");
        
        // Configure OAuth2 access token for authorization: delivery_auth
        OAuth delivery_auth = (OAuth) defaultClient.getAuthentication("delivery_auth");
        delivery_auth.setAccessToken("YOUR ACCESS TOKEN");

        V1SellerApi apiInstance = new V1SellerApi(defaultClient);
        List<User> user = Arrays.asList(); // List<User> | List of user object
        try {
            apiInstance.updateProduct(user);
        } catch (ApiException e) {
            System.err.println("Exception when calling V1SellerApi#updateProduct");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**List&lt;User&gt;**](User.md)| List of user object | [optional]

### Return type

null (empty response body)

### Authorization

[delivery_auth](../README.md#delivery_auth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid ID supplied |  -  |
| **404** | Product not found |  -  |
| **405** | Validation exception |  -  |

