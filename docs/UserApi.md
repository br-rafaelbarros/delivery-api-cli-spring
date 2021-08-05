# UserApi

All URIs are relative to *http://delivery-api.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createUser) | **POST** /user | Create user
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /user/{username} | Delete user
[**getUserByName**](UserApi.md#getUserByName) | **GET** /user/{username} | Get user by user name
[**loginUser**](UserApi.md#loginUser) | **GET** /user/login | Logs user into the system
[**logoutUser**](UserApi.md#logoutUser) | **GET** /user/logout | Logs out current logged in user session
[**updateUser**](UserApi.md#updateUser) | **PUT** /user/{username} | Updated user



## createUser

> createUser(user)

Create user

This can only be done by the logged in user.

### Example

```java
// Import classes:
import com.rafaelbarros.delivery.client.invoker.ApiClient;
import com.rafaelbarros.delivery.client.invoker.ApiException;
import com.rafaelbarros.delivery.client.invoker.Configuration;
import com.rafaelbarros.delivery.client.invoker.models.*;
import com.rafaelbarros.delivery.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://delivery-api.com");

        UserApi apiInstance = new UserApi(defaultClient);
        User user = new User(); // User | Created user object
        try {
            apiInstance.createUser(user);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createUser");
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
 **user** | [**User**](User.md)| Created user object | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## deleteUser

> deleteUser(username)

Delete user

This can only be done by the logged in user.

### Example

```java
// Import classes:
import com.rafaelbarros.delivery.client.invoker.ApiClient;
import com.rafaelbarros.delivery.client.invoker.ApiException;
import com.rafaelbarros.delivery.client.invoker.Configuration;
import com.rafaelbarros.delivery.client.invoker.models.*;
import com.rafaelbarros.delivery.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://delivery-api.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String username = "username_example"; // String | The name that needs to be deleted
        try {
            apiInstance.deleteUser(username);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#deleteUser");
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
 **username** | **String**| The name that needs to be deleted |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid username supplied |  -  |
| **404** | User not found |  -  |


## getUserByName

> User getUserByName(username)

Get user by user name

### Example

```java
// Import classes:
import com.rafaelbarros.delivery.client.invoker.ApiClient;
import com.rafaelbarros.delivery.client.invoker.ApiException;
import com.rafaelbarros.delivery.client.invoker.Configuration;
import com.rafaelbarros.delivery.client.invoker.models.*;
import com.rafaelbarros.delivery.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://delivery-api.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String username = "username_example"; // String | The name that needs to be fetched. Use user1 for testing. 
        try {
            User result = apiInstance.getUserByName(username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUserByName");
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
 **username** | **String**| The name that needs to be fetched. Use user1 for testing.  |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid username supplied |  -  |
| **404** | User not found |  -  |


## loginUser

> String loginUser(username, password)

Logs user into the system

### Example

```java
// Import classes:
import com.rafaelbarros.delivery.client.invoker.ApiClient;
import com.rafaelbarros.delivery.client.invoker.ApiException;
import com.rafaelbarros.delivery.client.invoker.Configuration;
import com.rafaelbarros.delivery.client.invoker.models.*;
import com.rafaelbarros.delivery.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://delivery-api.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String username = "username_example"; // String | The user name for login
        String password = "password_example"; // String | The password for login in clear text
        try {
            String result = apiInstance.loginUser(username, password);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#loginUser");
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
 **username** | **String**| The user name for login | [optional]
 **password** | **String**| The password for login in clear text | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid username/password supplied |  -  |


## logoutUser

> logoutUser()

Logs out current logged in user session

### Example

```java
// Import classes:
import com.rafaelbarros.delivery.client.invoker.ApiClient;
import com.rafaelbarros.delivery.client.invoker.ApiException;
import com.rafaelbarros.delivery.client.invoker.Configuration;
import com.rafaelbarros.delivery.client.invoker.models.*;
import com.rafaelbarros.delivery.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://delivery-api.com");

        UserApi apiInstance = new UserApi(defaultClient);
        try {
            apiInstance.logoutUser();
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#logoutUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## updateUser

> updateUser(username, user)

Updated user

This can only be done by the logged in user.

### Example

```java
// Import classes:
import com.rafaelbarros.delivery.client.invoker.ApiClient;
import com.rafaelbarros.delivery.client.invoker.ApiException;
import com.rafaelbarros.delivery.client.invoker.Configuration;
import com.rafaelbarros.delivery.client.invoker.models.*;
import com.rafaelbarros.delivery.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://delivery-api.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String username = "username_example"; // String | name that need to be deleted
        User user = new User(); // User | Updated user object
        try {
            apiInstance.updateUser(username, user);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#updateUser");
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
 **username** | **String**| name that need to be deleted |
 **user** | [**User**](User.md)| Updated user object | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid user supplied |  -  |
| **404** | User not found |  -  |

