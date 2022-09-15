import com.sample.Docker

def call(String name) {
    print "Hello ${name}"
    sh libraryResource('hello.sh')
    print "VARS Docker.Path: ${Docker.Path}"
    print "VARS Docker.Version: ${Docker.Version}"
    print "VARS Docker.ImageName: ${Docker.ImageName}"

    def d = new Docker()
    d.run()
}