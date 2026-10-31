version = 1

cloudstream {
    description = "KatDrama - Korean, Chinese, Japanese, Thai dramas with Hindi dubbed"
    authors = listOf("YourName")

    /**
    * Status int as the following:
    * 0: Down
    * 1: Ok 
    * 2: Slow
    * 3: Beta only
    * */
    sttatus = 1 // will be 3 if unspecified

    tvTypes = listOf(
        "TvSeries",
        "Movie",
        "Anime",
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=katdrama.org&sz=%size%"
    }
