API Versioning
- Why API versioning is required?

  - Requirements changes
  
     Changing the request/response format (e.g. from XML to JSON)

  - Change would break existing software

     Changing a property name (e.g. from name to productName) or data type on a property (e.g. from an integer to a float)

     Adding a required field on the request (e.g. a new required header or property in a request body)

  - Previously available data is removed

     Removing a property on the response (e.g. removing description from a product)

- Versioning Standard

    No versioning standards exist

    Companies set their own standards

- Versioning Strategy
   
    URI path versioning

    URL parameter versioning

    Content Negotiation

    Request Header


 - URI path versioning

    update a version number in URL pathhttp://localhost:9000/partners/v1/patient/

    http://localhost:9000/partners/v2/patient/

 - URL parameter versioning

    Version as a query string parameterhttp://localhost:9000/partners/patient?v=1.0

 - Content Negotiation

    Versioning with Content-type in the accept headerContent negotiation is the process of selecting one of the multiple possible representations to return to a client, based on client or server preferences.http://localhost:9000/partners/patientAccept:application/app.v1.patientAccept:application/app.v2.patient

 - Request Header

    Custom Header to version API call

    http://localhost:9000/partners/patient

    header - x-App-version : 1.0

Ref Docs - https://docs.micronaut.io/latest/guide/#apiVersioning
