# Change Log
All notable changes to this project will be documented in this file.
This project does its best to adhere to [Semantic Versioning](http://semver.org/).


--------
### [0.5.2](N/A) - 2019-03-21
#### Changed
* Removed 'lombok' dependency (added manual getters to JNumericType, JPrimitiveType, PrimitiveOrString)


--------
### [0.5.1](https://github.com/TeamworkGuy2/JSimpleTypes/commit/5347a944a1229c6b09c24236fe1114a90a08ab44) - 2017-12-30
#### Added
* Added `getType()` to PrimitiveOrString enum

#### Changed
* Upgrade to Java 9
* Upgrade to JUnit 5


--------
### [0.5.0](https://github.com/TeamworkGuy2/JSimpleTypes/commit/d4e4bfaa456bf5a2c6b5d417f7964c40c8a9f281) - 2016-08-17
#### Changed
* Renamed/moved twg2.primitiveIoTypes -> twg2.simpleTypes.ioPrimitives

#### Removed
* EnumLike (moved to the JInterfaces project)


--------
### [0.4.0](https://github.com/TeamworkGuy2/JSimpleTypes/commit/9159b3e2622fb4f0a354a5c7820bc149f769b302) - 2016-01-10
#### Added
* Added some JUnit tests

#### Changed
* Cleaned up some bugs with JNumericType and JPrimitiveType from*Type() and tryFrom*Type() methods


--------
### [0.3.0](https://github.com/TeamworkGuy2/JSimpleTypes/commit/4dabed523151962929a313972bb395986e5a17ad) - 2015-10-04
#### Added
* Added JNumericType and .from...() functions for JPrimitiveType and PrimitiveOrString to convert back and forth between all 3.

#### Changed
* Refactored JavaPrimitive to JPrimitive type.


--------
### [0.2.0](https://github.com/TeamworkGuy2/JSimpleTypes/commit/31aa0855b34c27b72172101d6e54292506dc91f4) - 2015-09-07
#### Changed
* Renamed JavaPrimitives -> JavaPrimitive
* Moved files to common twg2 package used across other projects.


--------
### [0.1.0](https://github.com/TeamworkGuy2/JSimpleTypes/commit/673d3cb963a57fd4a53fb6524dd302626a33cd87) - 2015-07-15
#### Added
* Versioning of existing code. Enums for Java primitive types and commonly serializable types.
