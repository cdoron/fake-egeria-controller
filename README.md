# fake-egeria-controller

This fake controller currently only supports getAssetInfo requests.

To experiment with this controller, run `main()` from `src/main/java/org/openapitools/OpenAPI2SpringBoot.java`. Then:
```bash
curl -X POST localhost:8080/getAssetInfo -d '{"assetID": "AssetID", "operationType": "read"}' -H "Content-type: application/json"   -H "X-Request-Datacatalog-Cred: QQQ"
```
