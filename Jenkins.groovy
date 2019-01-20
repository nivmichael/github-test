node {
    stage("My Stage") {
        echo "HELLO MICHAEL TEST"
        git 'https://github.com/nivmichael/github-test.git'
    }
}