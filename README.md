## picocontainer-example

How to use [PicoContainer](http://picocontainer.codehaus.org/) with dynamically-created dependencies

[PicoContainer](http://picocontainer.codehaus.org/) is a [dependency-injection](http://www.martinfowler.com/articles/injection.html)
framework focused on simplicity.  It emphasizes constructor injection and has a simple configuration mechanism that does not require
annotations, in contrast to the popular alternative, [Guice](https://code.google.com/p/google-guice/).

One shortcoming of PicoContainer is that it does not provide clear documentation about how to approach writing code that needs to
dynamically create instances.  In Guice, this would be accomplished by injecting a `Provider<T>` of the type you needed to dynamically
instantiate.

This project shows an example of a good pattern of doing this with PicoContainer.  The solution used here is to explicitly create a provider
class with has a `PicoContainer` injected into it.  If you follow this pattern, you should take care not to allow your non-provider classes to
inject the PicoContainer.

This project also demonstrated the flexible and loosely-coupled architecture that results from refactoring code to use constructor injection
in place of the `new` operator.  Notably `MainWindow` depends only on `ShowInfoWindowButton`: and as a result,
`ShowInfoWindowAction`, `InfoWindow`,  and `InfoWindowProvider` are completely hidden from it.

[Link to the relevant source folder](src/main/java/net/avh4/scratch/picocontainerexample)
