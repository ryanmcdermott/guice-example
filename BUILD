load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "tax_processor",
    srcs = ["src/main/java/com/example/guice/TaxProcessor.java"],
    deps = [],
)

java_library(
    name = "high_tax_payment_processor",
    srcs = ["src/main/java/com/example/guice/HighTaxProcessor.java"],
    deps = ["@maven//:com_google_inject_guice", ":tax_processor"],
)

java_library(
    name = "high_tax_payment_processor_module",
    srcs = ["src/main/java/com/example/guice/HighTaxProcessorModule.java"],
    deps = ["@maven//:com_google_inject_guice", ":high_tax_payment_processor", ":tax_processor"],
)

java_library(
    name = "low_tax_payment_processor",
    srcs = ["src/main/java/com/example/guice/LowTaxProcessor.java"],
    deps = ["@maven//:com_google_inject_guice", ":tax_processor"],
)

java_library(
    name = "low_tax_payment_processor_module",
    srcs = ["src/main/java/com/example/guice/LowTaxProcessorModule.java"],
    deps = ["@maven//:com_google_inject_guice", ":low_tax_payment_processor", ":tax_processor"],
)

java_library(
    name = "shopping_cart",
    srcs = ["src/main/java/com/example/guice/ShoppingCart.java"],
    deps = ["@maven//:com_google_inject_guice", ":tax_processor"],
)

java_library(
    name = "main",
    srcs = ["src/main/java/com/example/guice/Main.java"],
    deps = [
        ":shopping_cart",
        ":high_tax_payment_processor_module",
        ":low_tax_payment_processor_module",
        "@maven//:com_google_inject_guice"
    ],
)

java_binary(
    name = "guice_example_bin",
    main_class = "com.example.guice.Main",
    runtime_deps = [
        ":main",
        ":shopping_cart",
        ":high_tax_payment_processor_module",
        ":low_tax_payment_processor_module",
        "@maven//:com_google_inject_guice"
    ],
     jvm_flags = [
        # quiet warnings from com.google.protobuf.UnsafeUtil,
        # see: https://github.com/google/protobuf/issues/3781
        "-XX:+IgnoreUnrecognizedVMOptions",
        "--add-opens=java.base/java.nio=ALL-UNNAMED",
        "--add-opens=java.base/java.lang=ALL-UNNAMED",
    ],
)
