## DebugHandler

This is a minecraft mod for managing debug logs and getting information to a mod dev easily from a player that had a
problem without requiring much technical knowledge.

## What does it do?

Let's say you're a player and something broke. Most of the time, the player may not have the technical knowledge or
getting the logs to you is a PITA. This helps fix that. All the player has to do is go to the DebugHandler.cfg file,
change debug to true, and start up minecraft. They then go through the steps of what the problem was and when they
leave the world they will get a popup box with a URL. This is an example of what it looks like http://hastebin.com/xokacerato

## How to use it!

Simple! Download the deobf jar from the releases https://github.com/HeisenBugDev/DebugHandler/releases and set this up
as a jar dependency.

Once you've set that up go to your mod's main class. It doesn't _have_ to be here, but I prefer it that way.

``` java
public static LogHandler logHandler = new LogHandler("MyAwesomeMod");

public void preInit(FMLPreInitializationEvent event) {
    DebugRegistry.addLogHandler(logHandler);
}
```

Then, wherever you would put a println for debugging, now put:

``` java
MyFancyModClass.logHandler.debugPrint("I can do a string");
MyFancyModClass.logHandler.debugPrint(TileEntityAwesome, "This will give the coords for the block and this string");
MyFancyModClass.logHandler.debugPrint(MyFancyObject);
```