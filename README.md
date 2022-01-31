# Restsuite

This is ambitious project, which made to be alternative of [Postman](https://www.postman.com/)
, [Insomnia](https://insomnia.rest/), [Ready API / Soap UI](https://smartbear.com/)
, [Hoppscotch](https://hoppscotch.io/), the different with this tool is that it will remain free and open source
forever, but of course to keep this project alive considering donation.

For company who really want Enterprise Edition also will be coming soon, in order to get Enterprise Support.

Open Source people also get support, but only from the community.

And this repository is a reworking project from previous [Restsuite](https://github.com/supanadit/restsuite), which is
the first version of Restsuite.

## Technology Behind Restsuite

- Kotlin
- Compose Multiplatform by JetBrains ( Interoperability with Swing )
- Flatlaf
- Dagger 2

## In Progress Feature

- Rest API Testing
- Socket IO Testing
- Websocket Testing
- SSE Testing

## Coming Soon Feature

- Custom Proxy
- Environment Variable
- Collection
- Beautifier
- CI / CD Integration
- Intercept
- GraphQL Support
- Message Broker Testing
    - Kafka
    - MQTT
    - etc
- gRPC Testing
- Generate documentation for swagger format

## Run Application

```bash
./gradlew run
```

## Build Application

```bash
./gradlew package
```

package native distribution into `build/compose/binaries`
