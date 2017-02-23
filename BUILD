package(default_visibility=["//visibility:public"])

filegroup(
    name="srcs",
    srcs=glob(["src/main/java/**/*.java"]),
)

java_binary(
    name="bin",
    main_class="test.Main",
    srcs=[
        ":srcs",
    ],
)

