#!/usr/bin/groovy
package com.sample

class Docker {
    static final String Path = "remote.url/path"
    static final String Version = "1.2.3"
    static final String ImageName = "${Path}:${Version}"

    def run() {
        print "Docker run"
    }
}