

# User


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**username** | **String** |  |  [optional]
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**password** | **String** |  |  [optional]
**phone** | **String** |  |  [optional]
**userStatus** | [**UserStatusEnum**](#UserStatusEnum) | User Status |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | User Status |  [optional]



## Enum: UserStatusEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
UNACTIVE | &quot;unactive&quot;



## Enum: RoleEnum

Name | Value
---- | -----
SELLER | &quot;seller&quot;
POSTMAN | &quot;postman&quot;
AMINISTRATOR | &quot;aministrator&quot;



