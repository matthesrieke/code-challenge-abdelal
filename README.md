# Coding Challenge 52°North

The aim of this coding challenge is to create a console program
which outputs current weather information for the city of Münster.

In this challenge, the following technologies play a central role:

* [Apache Maven](https://maven.apache.org/)
* [OpenWeatherMap](http://openweathermap.org/api)

The evergreen IDEs for Java (Eclipse, Netbeans, IntelliJ IDEA) all
ship with built-in support for Maven. This repository already provides
the basic project structure (`pom.xml`, folder structure) on which the
solution of the challenge shall build upon.

## Tasks

### 1. Setup

* Clone / download this repository to your local computer
* Open the project in your favourite Java IDE
* Run the `OwmApplication.java` class and assess the console output

The output shall look similar to the following (or at least contain
a similar line):

```log
14:36:45.865 [main] INFO  org.n52.challenge.OwmApplication - OwmApplication started
```

### 2. Retrieving Data from OpenWeatherMap

The OpenWeatherMap (OWM) provides an API which can be used to retrieve
weather information. To access the API, an API key is required.
It can be retrieved from the Website (under "API Keys" menu entry) after
creating a user account.

Accessing the OWM API from Java can be achieved with a specific library
(`dependency` in Maven language):

* https://bitbucket.org/aksinghnet/owm-japis

1. Add this library to the project (directly in the `pom.xml` or with the
tools provided by the IDE) and use the documentation of the library to
access the weather data.
1. Output `temperature`, `wind` and `rain` data for Münster on the
console (using the `LOG` object). The outputs shall look similar to the following:

```log
13:54:40.470 [main] INFO  org.n52.challenge.OwmApplication - Current weather in Münster: 18.5°C, 5.1 wind speed, no rain in last three hours
```


### 3. Output as JSON

Now the results should be output in a more structured way. JSON is a
lightweight data format that suites well for this kind of information.

Use [Jackson's](https://github.com/FasterXML/jackson) `ObjectMapper` (hint: it is contained in the library `jackson-databind`) to create
a JSON output and add it to the console log. The overall logs shall look
similar to the following:

```log
13:03:07.413 [main] INFO  org.n52.challenge.OwmApplication - Current weather in Münster: 18.5°C, 5.1 wind speed, no rain in last three hours
13:03:07.539 [main] INFO  org.n52.challenge.OwmApplication - Weather as JSON:
{
  "data" : {
    "rain" : 0.0,
    "temperature" : 18.5,
    "windspeed" : 5.1
  },
  "city" : "Münster",
  "time" : "Fri Aug 02 13:03:07 CEST 2019"
}
```

### 4. Hand-In Your Results

There are two options for handing in your results.

1. Fork the original repository and commit your results (i.e. changes to the project) - basic knowledge of Git and GitHub is required for this. Send in the link to the forked repository via email
1. Create a ZIP archive of your work and send it in via email
