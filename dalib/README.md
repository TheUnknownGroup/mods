# Dalib
A library made for any mod made by the UnknownGroup.

## What does it do?
It helps ease the pain that is finding tutorials on how to make itemGroups, items, and blocks.

## Developing with Dalib
If you are using this library, do the following:

### Step 1: Adding a dependency
In your `build.gradle` write:
```groovy
// Under dependencies
dependencies {
    modImplementation("io.github.theunknownmaven:dalib:{version}")
    /* include("io.github.theunknownmaven:dalib:{version}") ; If you choose */
}

// Under repositories
repositories {
    mavenCentral()
}
```

### Step 2: Finding your version
You can use the tags on [github](https://github.com/TheUnknownGroup/Dalib/tags) to find the version that works with your mod.

```groovy
/* For example: */
dependencies {
    modImplementation("io.github.theunknownmaven:dalib:0.0.0+1.21.11+b.3")
    /* include("io.github.theunknownmaven:dalib:0.0.0+1.21.11+b.3") ; If you choose*/
}
```