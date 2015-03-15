# gaia-bpms
Light BPMS based on Activiti, Vaadin and JEE
Run with Wildfly 8.2

## Explore internal h2 database.
If you want explore h2 database please download h2console from 
```
https://github.com/wildfly/quickstart/tree/master/h2-console
```
put url on your web browser "http://localhost:8080/h2console/"
and configure connection:
```
jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
```
