phraseToFind=$1
startPath=$2

if [[ -z $startPath ]]; then
    $startPath="."
fi

find $startPath -type f -name "*$phraseToFind*" -printf "%f\n"
