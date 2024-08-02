# Define the mapping of chapter numbers to the transformed names
$chapterMap = @{
    "Chapter01" = "1-text-blocks-locales-math"
    "Chapter02" = "2-objects-immutability-pattern-matching"
    "Chapter03" = "3-date-time"
    "Chapter04" = "4-records-record-patterns"
    "Chapter05" = "5-arrays-collections-data-structures"
    "Chapter06" = "6-java-io-deserialization-filters"
    "Chapter07" = "7-foreign-memory-api"
    "Chapter08" = "8-sealed-hidden-classes"
    "Chapter09" = "9-functional-style-programming"
    "Chapter10" = "10-concurrency-virtual-threads"
    "Chapter11" = "11-concurrency-diving-deeper"
    "Chapter12" = "12-garbage-collectors-cds-archives"
    "Chapter13" = "13-socket-api-web-server"
}

# Path to the main folder containing the chapter folders
$mainFolderPath = "D:\Working\1.PROJECT\Development-Toolkit\java\core\Java-Coding-Problems"

# Loop through each mapping and rename the corresponding folders
foreach ($chapter in $chapterMap.Keys) {
    $oldFolderPath = Join-Path $mainFolderPath $chapter
    $newFolderPath = Join-Path $mainFolderPath $chapterMap[$chapter]

    # Check if the old folder exists
    if (Test-Path $oldFolderPath) {
        # Rename the folder
        Rename-Item -Path $oldFolderPath -NewName $chapterMap[$chapter] -Force
        Write-Output "Renamed '$oldFolderPath' to '$newFolderPath'"
    } else {
        Write-Output "Folder '$oldFolderPath' does not exist"
    }
}
