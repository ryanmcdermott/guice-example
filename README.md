# guice-example

## What is this?

This project is a simple starter example for a Java project that uses the [Bazel build system](https://www.bazel.build/) and Guice injections.

## Installation

First, ensure that you have [installed Bazel](https://docs.bazel.build/versions/3.2.0/install.html). Then run the following:

```
export JAVA_HOME="$(dirname $(dirname $(realpath $(which javac))))"
git clone https://github.com/ryanmcdermott/guice-example
```

## Running

### Main

```
bazel run :guice_example_bin
```