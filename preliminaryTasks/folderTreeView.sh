tabulator="  "
startPath=$1

echoInBlue() {
    tput bold
    tput setaf 4 
    echo "$1"
    tput sgr0
}

iterateThroughDirectory() {
    for fileName in $(ls $1); do
        filePath="$1/$fileName"
        stringToShow="$2$fileName"
        if [[ -d $filePath ]]; then
            echoInBlue "$stringToShow/" 
            iterateThroughDirectory "$filePath" "$2$tabulator"
        else
            echo "$stringToShow"
        fi
    done
}

iterateThroughDirectory "$startPath" ""

