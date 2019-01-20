# ElasticSearch

Implemented Full Text Search over Shakespeare's works.

## Prerequisites

Install Elastic from (https://www.elastic.co/downloads/elasticsearch).
Mine is Elasticsearch-6.5.4

It should be running on `localhost` on port `9200`.

## Download Data

https://download.elastic.co/demos/kibana/gettingstarted/shakespeare_6.0.json

## Load into Elastic

curl -H 'Content-Type: application/x-ndjson' -XPOST 'localhost:9200/shakespeare/doc/_bulk?pretty' --data-binary @shakespeare_6.0.json

## How to Start

After establishing the Elastic Search connection on 'http://localhost:9200/', you can just use 
```mvn spring-boot:run``` to start the application.

## Start Querying

For Line Number - 1.1.50
```
curl -X GET \
  http://localhost:8080/shakespeare/find/1.1.50 '
 ```

For Text as 'Macbeth' and/or Speaker as 'Banquo' 
```
curl -X GET \
  'http://localhost:8080/shakespeare/find?text=Macbeth&speaker=Banquo' 
```

