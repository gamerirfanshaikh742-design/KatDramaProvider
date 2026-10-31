package com.lagradost.cloudstream3.katdramaprovider

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class KatDramaPlugin : Plugin() {
    override fun load() {
        registerMainAPI(KatDramaProvider())
    }
}
