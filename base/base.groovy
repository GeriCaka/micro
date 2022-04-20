def base() {
    stages {
        stage("Hello world!") {
            steps {
                echo "Hello World!"
            }
        }
    }
}

base()
