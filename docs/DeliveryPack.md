

# DeliveryPack


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**address** | [**Address**](Address.md) |  | 
**products** | [**Product**](Product.md) |  | 
**searchCode** | **String** |  |  [optional]
**shipDate** | **OffsetDateTime** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Order Status |  [optional]
**complete** | **Boolean** |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PLACED | &quot;placed&quot;
APPROVED | &quot;approved&quot;
DELIVERED | &quot;delivered&quot;



